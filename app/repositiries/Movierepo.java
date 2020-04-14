package repositiries;

import entity.Movieentity;
import models.SearchMovieResult;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.function.Function;

@Singleton
@Transactional
public class Movierepo {

    @Inject
    public JPAApi jpaApi;

    private <T> T wrap(Function<EntityManager, T> function){
        return this.jpaApi.withTransaction(function);
    }

    public Movieentity insert(Movieentity movieentity)
    {
        return this.wrap(entityManager -> {entityManager.persist(movieentity);
        return movieentity;});
    }

    public List<Movieentity> getmovies()
    {
        return this.wrap(entityManager -> {
            List<Movieentity> movieentityList = entityManager.createQuery
                    ("Select m from Movieentity m", Movieentity.class).getResultList();
            return movieentityList;
        });
    }

    public  List<Movieentity> filtering_id(Integer id)
    {
        return this.wrap(entityManager ->
        {
            List<Movieentity> movieentity = entityManager.createQuery("select m from Movieentity m where m.id = :movie_id").setParameter("movie_id", id).getResultList();
            return  movieentity;
        });
    }

    public Movieentity update_rec(Movieentity movieentity)
    {
        return this.wrap(entityManager -> { entityManager.merge(movieentity); return movieentity;});
    }

    public Movieentity delete_rec(Movieentity movieentity)
    {
        return this.wrap(entityManager ->
        {entityManager.remove(entityManager.contains(movieentity) ? movieentity : entityManager.merge(movieentity));
        return movieentity;});
    }

    public List<SearchMovieResult> get_search_result(String search_value) {
        return  this.wrap(entityManager ->
                   entityManager.createQuery
                           ("select m, mp.Multiplexname, alm.screen_no, alm.timerange from Movieentity m, AlotMovieentity alm, " +
                                   "Multiplexentity mp where m.id = alm.movie_id and alm.mutiplex_id = mp.multiplex_id and " +
                                   "lower(m.name) = lower(:search_value)")
                    .setParameter("search_value", search_value).getResultList());
    }

    public List<SearchMovieResult> get_search_movie_only_result(String search_value) {
        return this.wrap(entityManager ->
        entityManager.createQuery("select m from Movieentity m where m.name= :search_value").setParameter("search_value", search_value).getResultList());
    }
    /*public List<Movieentity> get_search_result(String search_value) {
        return  this.wrap(entityManager ->
        {
            List<Movieentity> movieentityList = entityManager.createQuery("select m from Movieentity m where lower(m.name) = lower(:search_value)")
                    .setParameter("search_value", search_value).getResultList();
            return movieentityList;});
    }

    public Integer get_id(String search_value) {
        return  this.wrap(entityManager ->
        entityManager.createQuery("select m.id from Movieentity m where lower(m.name) = lower(:search_value)")
                    .setParameter("search_value", search_value).getFirstResult());
    }*/
}
