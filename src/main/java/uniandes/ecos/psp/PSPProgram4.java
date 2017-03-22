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

        //port(9013);

        Map<String, Object> attributes = new HashMap<>();

        get("/psp4", (req, res) -> {

                    ArrayList<String> salida = new ArrayList<String>();

                        ControladorEstadistica controladorEstadistica = new ControladorEstadistica();
                        ModeloTamanioRelativo modeloTamanioRelativo = controladorEstadistica.calcularTamanioRelativo();

                        salida.add("***********************************************<br/>");
                        salida.add("Datos de Entrada<br/>");
                        salida.add("***********************************************<br/>");

                        if (modeloTamanioRelativo.getDatosEntrada() != null) {
                            for (Double item : modeloTamanioRelativo.getDatosEntrada()) {
                                salida.add(item.toString() + "<br/>");
                            }
                        }

                        salida.add("***********************************************<br/>");
                        salida.add("Resultados Tamaño Relativo:<br/>");
                        salida.add("***********************************************<br/>");
                        salida.add("VS: " + modeloTamanioRelativo.getTamanioVS() + "<br/>");
                        salida.add("S : " + modeloTamanioRelativo.getTamanioS() + "<br/>");
                        salida.add("M : " + modeloTamanioRelativo.getTamanioM() + "<br/>");
                        salida.add("L : " + modeloTamanioRelativo.getTamanioL() + "<br/>");
                        salida.add("VL: " + modeloTamanioRelativo.getTamanioVL() + "<br/>");

                        //attributes.put("results", salida);
                        //return new ModelAndView(attributes, "db.ftl");

                        return salida.toString();
                    }


        );

    }

}
