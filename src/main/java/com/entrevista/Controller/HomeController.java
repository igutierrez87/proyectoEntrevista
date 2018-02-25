package com.entrevista.Controller;

import com.entrevista.modelo.*;
import org.springframework.stereotype.Controller;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<TipoVisita> homeController() {

        List<TipoVisita> TipoVisitaList = new ArrayList<TipoVisita>();

        TipoVisita tipo1 = new TipoVisita("Consultoría","");
        TipoVisita tipo2 = new TipoVisita("Simuladores","");
        TipoVisita tipo3 = new TipoVisita("Sist. de Gestion","");
        TipoVisita tipo4 = new TipoVisita("Otros","");


        TipoVisitaList.add(tipo1);
        TipoVisitaList.add(tipo2);
        TipoVisitaList.add(tipo3);
        TipoVisitaList.add(tipo4);

        return TipoVisitaList;
    }


    @RequestMapping(value = "/lala", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<tipoActividad> lala() {

        List<tipoActividad> tipos = new ArrayList<tipoActividad>();

        tipoActividad tipo1 = new tipoActividad("Prueba", "Detalle");

        tipos.add(tipo1);

        return tipos;
    }

}
