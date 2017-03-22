/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.ecos.psp;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
/**
 *
 * @author edgaguil
 */
public class PSPProgram4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        //port(9010);

        Map<String, Object> attributes = new HashMap<>();


        get("/psp4", (req, res) -> {

                    ArrayList<String> salida = new ArrayList<String>();

                    try {

                        ControladorEstadistica controladorEstadistica = new ControladorEstadistica();
                        ModeloTamanioRelativo modeloTamanioRelativo = controladorEstadistica.calcularTamanioRelativo();

                        ArrayList<String> datosEntrada = new ArrayList<String>();
                        if (modeloTamanioRelativo.getDatosEntrada() != null) {
                            for (Double item : modeloTamanioRelativo.getDatosEntrada()) {
                                datosEntrada.add(item.toString());
                            }
                        }

                        attributes.put("entradas", datosEntrada);
                        attributes.put("tamanioVS", modeloTamanioRelativo.getTamanioVS());
                        attributes.put("tamanioS", modeloTamanioRelativo.getTamanioS());
                        attributes.put("tamanioM", modeloTamanioRelativo.getTamanioM());
                        attributes.put("tamanioL", modeloTamanioRelativo.getTamanioL());
                        attributes.put("tamanioVL", modeloTamanioRelativo.getTamanioVL());
                        return new ModelAndView(attributes, "psp4.ftl");

                    }
                    catch (Exception e) {
                        attributes.put("message", "There was an error: " + e);
                        return new ModelAndView(attributes, "error.ftl");
                    }

                }, new FreeMarkerEngine()
        );

    }

}
