package repositiries;

import entity.Movieentity;
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
}
