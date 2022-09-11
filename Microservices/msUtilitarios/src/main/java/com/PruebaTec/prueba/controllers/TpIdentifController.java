package com.PruebaTec.prueba.controllers;
import com.PruebaTec.prueba.dao.PlanDao;
import com.PruebaTec.prueba.dao.TpIdentifDao;
import com.PruebaTec.prueba.models.PlanMP;
import com.PruebaTec.prueba.models.TipIdentif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class TpIdentifController {
    @Autowired
    private TpIdentifDao tpIdDao;

    @RequestMapping (value = "api/tpIdentificacion", method = RequestMethod.GET)
    public List<TipIdentif> getTpIdentif() {
        return tpIdDao.getTpIdentif();
    }
}

/*


 */