package com.generation.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/var")
public class PathVariableRestController {
    /**
     * capturar variables desde la ruta o path
     */

    //localhost:8080/var/anio/2022/mes/6/dia/13
    @RequestMapping("/anio/{a}/mes/{m}/dia/{d}")
    public String capturarVariablesPath(@PathVariable("a") String anio,
                                        @PathVariable("m") String mes,
                                        @PathVariable("d") String dia) {
        return "la fecha es: " + anio + "/" + mes + "/" + dia;

    }

    //localhost:8080/var/fecha/{anio}/{mes}/{dia}
    @RequestMapping("/fecha/{anio}/{mes}/{dia}")
    public String capturarVariablesCorta(@PathVariable("anio") String anio,
                                         @PathVariable("mes") String mes,
                                         @PathVariable("dia") String dia) {
        return "la fecha es: " + anio + "/" + mes + "/" + dia;

    }
}
