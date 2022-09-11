package com.PruebaTec.prueba.dao;
import com.PruebaTec.prueba.models.TipIdentif;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class TpIdentifDaoImp implements TpIdentifDao{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<TipIdentif> getTpIdentif() {
        String query ="FROM TipIdentif";
        List<TipIdentif> resultado=entityManager.createQuery(query).getResultList();
        return resultado;
    }
}
