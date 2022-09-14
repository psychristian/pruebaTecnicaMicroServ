package com.PruebaTec.prueba.controllers;
import com.PruebaTec.prueba.dao.PlanDao;
import com.PruebaTec.prueba.models.PlanMP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class PlanesController {
    @Autowired
    private PlanDao planDao;

    @RequestMapping (value = "api/planesMP", method = RequestMethod.GET)
    public List<PlanMP> getPlan() {
        return planDao.getPlanes();
    }
}
