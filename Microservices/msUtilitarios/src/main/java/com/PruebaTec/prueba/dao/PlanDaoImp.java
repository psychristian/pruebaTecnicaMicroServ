package com.PruebaTec.prueba.dao;
import com.PruebaTec.prueba.models.PlanMP;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class PlanDaoImp implements  PlanDao{
    @PersistenceContext
    EntityManager entityManager;
    @Override

    public List<PlanMP> getPlanes() {
        String query ="FROM PlanMP";
        List<PlanMP> resultado=entityManager.createQuery(query).getResultList();
        return resultado;
    }
}
