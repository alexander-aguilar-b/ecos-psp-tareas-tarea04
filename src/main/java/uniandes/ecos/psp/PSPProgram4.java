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

import static spark.SparkBase.port;


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
        //port(9027);
        port(Integer.valueOf(System.getenv("PORT")));

        get("/psp4/test1", (req, res) -> obtenerCalculoTamanioRelativo("Data.txt", "LOC/Metodos"), new FreeMarkerEngine());

        get("/psp4/test2", (req, res) -> obtenerCalculoTamanioRelativo("Data2.txt", "Pags/Capitulos") , new FreeMarkerEngine());
    }

    /**
     * Metodo que obtiene la vista con loos resultados del calculo de tamaño relativo
     * @param nombreArchivoDatos Nombre del archivo que se va a utilizar para realizar la prueba
     * @param etiquetaDatosEntrada Etiqueta de los datos de entrada
     * @return Vista con los resultados de los calculos
     */
    private static ModelAndView obtenerCalculoTamanioRelativo(String nombreArchivoDatos, String etiquetaDatosEntrada)
    {
        Map<String, Object> atributosSalida = new HashMap<>();

        try
        {
            ControladorEstadistica controladorEstadistica = new ControladorEstadistica();
            controladorEstadistica.setNombreArchivo(nombreArchivoDatos);
            ModeloTamanioRelativo modeloTamanioRelativo = controladorEstadistica.calcularTamanioRelativo();

            ArrayList<String> datosEntrada = new ArrayList<String>();

            if (modeloTamanioRelativo.getDatosEntrada() != null)
            {
                for (Double item : modeloTamanioRelativo.getDatosEntrada())
                {
                    datosEntrada.add(item.toString());
                }
            }

            atributosSalida.put("entradas", datosEntrada);
            atributosSalida.put("tamanioVS", modeloTamanioRelativo.getTamanioVS());
            atributosSalida.put("tamanioS", modeloTamanioRelativo.getTamanioS());
            atributosSalida.put("tamanioM", modeloTamanioRelativo.getTamanioM());
            atributosSalida.put("tamanioL", modeloTamanioRelativo.getTamanioL());
            atributosSalida.put("tamanioVL", modeloTamanioRelativo.getTamanioVL());
            atributosSalida.put("etiquetaDatosEntrada", etiquetaDatosEntrada);
        }
        catch (Exception e)
        {
            atributosSalida.put("message", "There was an error: " + e);
        }

        return new ModelAndView(atributosSalida, "psp4.ftl");
    }
}
