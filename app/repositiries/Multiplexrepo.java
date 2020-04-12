package repositiries;

import entity.Movieentity;
import entity.Multiplexentity;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.function.Function;

@Singleton
@Transactional
public class Multiplexrepo {

    @Inject
    private JPAApi jpaApi;

    public <T> T wrap(Function<EntityManager, T> function) { return  this.jpaApi.withTransaction(function);}

    public Multiplexentity to_create(Multiplexentity multiplexentity)
    {
        return wrap(entityManager -> {entityManager.persist(multiplexentity); return multiplexentity;});
    }

    public List<Multiplexentity> to_list()
    {
        return  wrap(entityManager -> {
            List<Multiplexentity> multiplexentities = entityManager.createQuery
                    ("Select mp from Multiplexentity mp", Multiplexentity.class ).getResultList();
            return multiplexentities;});
    }

    public List<Multiplexentity> filtering_id(Integer id) {
        return this.wrap(entityManager ->
        {
            List<Multiplexentity> multiplexentities = entityManager.createQuery("select mp from Multiplexentity mp where mp.multiplex_id = :multiplex_id").setParameter("multiplex_id", id).getResultList();
            return  multiplexentities;
        });
    }

    public Multiplexentity update_rec(Multiplexentity multiplexentity) {
        return this.wrap(entityManager -> { entityManager.merge(multiplexentity); return multiplexentity;});
    }

    public Multiplexentity delete_rec(Multiplexentity multiplexentity) {
        return this.wrap(entityManager ->
        {entityManager.remove(entityManager.contains(multiplexentity) ? multiplexentity : entityManager.merge(multiplexentity));
            return multiplexentity;});
    }
}
