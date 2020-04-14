package repositiries;

import entity.AlotMovieentity;
import entity.Movieentity;
import entity.Multiplexentity;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.function.Function;

public class AlotMoviesrepo {

    @Inject
    private JPAApi jpaApi;

    public <T> T wrap(Function<EntityManager, T> function) { return  this.jpaApi.withTransaction(function);}

    public AlotMovieentity to_create(AlotMovieentity alotMovieentity)
    {
        return wrap(entityManager -> {entityManager.persist(alotMovieentity); return alotMovieentity;});
    }

    public AlotMovieentity delete_rec(AlotMovieentity alotMovieentity) {
        return this.wrap(entityManager ->
        {entityManager.remove(entityManager.contains(alotMovieentity) ? alotMovieentity : entityManager.merge(alotMovieentity));
            return alotMovieentity;});
    }

    public List<AlotMovieentity> filtering_id(Integer id) {
        return this.wrap(entityManager ->
        {
            List<AlotMovieentity> alotMovieentities = entityManager.createQuery("select alm from AlotMovieentity alm where alm.multiplex_id = :multiplex_id")
                    .setParameter("mutiplex_id", id).getResultList();
            return  alotMovieentities;
        });
    }

    public List<AlotMovieentity> filtering_id_screens(Integer id) {
        return this.wrap(entityManager ->
        {
            List<AlotMovieentity> alotMovieentities =
                    entityManager.createQuery("select alm from AlotMovieentity alm where alm.screen_no = :screen_num")
                    .setParameter("screen_num", id).getResultList();
            return alotMovieentities;
        });
    }

    public List<AlotMovieentity> check_rec(Integer screen_num, String timing, int multiplex_id, String value) {
        return this.wrap(entityManager ->
        {
            //List<AlotMovieentity> alotMovieentities =
            TypedQuery<AlotMovieentity> query = entityManager.createQuery("select alm from AlotMovieentity alm where alm.screen_no = :screen_num and alm.mutiplex_id = :mutiplex_id and alm.timerange = :timing and alm.aloted_or_not = :aloted_or_not", AlotMovieentity.class);
                    //entityManager.createQuery("select alm from AlotMovieentity alm where alm.screen_no = :screen_num and alm.mutiplex_id = :mutiplex_id and alm.timerange = :timing and alm.aloted_or_not = No", AlotMovieentity.class)
                      query.setParameter("screen_num", screen_num);
                       query.setParameter("mutiplex_id", multiplex_id);
                       query.setParameter("timing", timing);
                       query.setParameter("aloted_or_not", value);
            List<AlotMovieentity> alotMovieentities = query.getResultList();
            return alotMovieentities;
        });
    }

    public AlotMovieentity update_rec(AlotMovieentity alotMovieentity) {
        return this.wrap(entityManager -> { entityManager.merge(alotMovieentity); return alotMovieentity;});
    }

    public List<AlotMovieentity> filtering_id_movie_alloc_id(Integer id) {
        return this.wrap(entityManager ->
        {
            List<AlotMovieentity> alotMovieentities = entityManager.createQuery("select alm from AlotMovieentity alm where alm.movieallocation_id = :movie_alloc_id")
                    .setParameter("movie_alloc_id", id).getResultList();
            return  alotMovieentities;
        });
    }

    public List<AlotMovieentity> to_list(String value) {
        return  wrap(entityManager -> {
            List<AlotMovieentity> alotMovieentities = entityManager.createQuery
                    ("Select alm from AlotMovieentity alm where aloted_or_not = :aloted_or_not", AlotMovieentity.class )
                    .setParameter("aloted_or_not", value).getResultList();
            return alotMovieentities;});
    }

    public Integer get_search_result(int movie_id) {
        return this.wrap(entityManager ->
                entityManager.createQuery("select alm.mutiplex_id from AlotMovieentity alm where alm.movie_id = :movie_id and alm.aloted_or_not = :aloted_or_not")
                        .setParameter("movie_id", movie_id).setParameter("aloted_or_not", "yes")
                        .getFirstResult());
    }

    public List<AlotMovieentity> get_screen_time_range(Integer movie_id) {
         return this.wrap(entityManager ->
            entityManager.createQuery("select alm.screen_no, alm.timerange from AlotMovieentity alm where alm.movie_id = :movie_id and alm.aloted_or_not = :aloted_or_not")
            .setParameter("movie_id", movie_id).setParameter("aloted_or_not", "yes")
                        .getResultList());
    }
}
