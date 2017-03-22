/******************************************************************/
/* Autor: Edgar Alexander Aguilar Bolaños
/* Fecha de Creación: 21/03/2017
/* Propósito: Clase encargada de realizar calculos estadisticos
/* Notas especiales:
/******************************************************************/
package uniandes.ecos.psp;

import java.util.LinkedList;

/**
 * Clase encargada de realizar calculos estadisticos
 * @author edgaguil
 */
public class CalculoEstadistico
{
    /***
     * Metodo que realiza el calculo de la media a partir del listado de datos de entrada
     * @param listadoDatos Listado de numeros reales
     * @return Valor de la media del listado de numeros ingresados
     */
    public static float calcularMedia(LinkedList<Double> listadoDatos)
    {
        float sumatoria = 0;
        float media = 0;

        for(double numero : listadoDatos)
        {
            sumatoria += numero;
        }

        if (listadoDatos.size() > 0)
        {
            media = sumatoria / listadoDatos.size();
        }

        return media;
    }

    /**
     * Metodo que realiza el calculo de la desviación estandar a partir del listado de datos de entrada
     * @param listadoDatos Listado de numeros reales
     * @return Valor de la desviacion estandar del listado de numeros ingresados
     */
    public static double calcularDesviacionEstandar(LinkedList<Double> listadoDatos)
    {
        double desviacionEstandar = 0;
        float media = calcularMedia(listadoDatos);
        float sumatoria = 0;


        if (listadoDatos.size() > 0)
        {
            for(double numero : listadoDatos)
            {
                sumatoria += Math.pow(numero - media, 2);
            }
            desviacionEstandar = Math.sqrt(sumatoria / (listadoDatos.size() - 1));
        }

        return desviacionEstandar;
    }


    /***
     * Metodo que realiza el calculo del tamaño relativo a partir del listado de datos de entrada
     * @param listadoDatos Listado de numeros reales
     * @return Objeto con los tamaños relativos calculados
     */
    public static ModeloTamanioRelativo calcularTamanioRelativo(LinkedList<Double> listadoDatos)
    {
        ModeloTamanioRelativo modeloTamanioRelativo = new ModeloTamanioRelativo();

        if (listadoDatos != null)
        {
            LinkedList<Double> listadoDatosLN = new LinkedList<Double>();

            for(double numero : listadoDatos)
            {
                listadoDatosLN.add(Math.log(numero));
            }

            float valorPromedio = calcularMedia(listadoDatosLN);
            double valorDesviacionEstandar = calcularDesviacionEstandar(listadoDatosLN);

            double lnVS = valorPromedio - (2*valorDesviacionEstandar);
            double lnS = valorPromedio - (valorDesviacionEstandar);
            double lnM = valorPromedio;
            double lnL = valorPromedio + (valorDesviacionEstandar);
            double lnVL = valorPromedio + (2*valorDesviacionEstandar);


            double tamanioVS = Math.exp(lnVS);
            double tamanioS = Math.exp(lnS);
            double tamanioM = Math.exp(lnM);
            double tamanioL = Math.exp(lnL);
            double tamanioVL = Math.exp(lnVL);

            modeloTamanioRelativo.setTamanioVS(tamanioVS);
            modeloTamanioRelativo.setTamanioS(tamanioS);
            modeloTamanioRelativo.setTamanioM(tamanioM);
            modeloTamanioRelativo.setTamanioL(tamanioL);
            modeloTamanioRelativo.setTamanioVL(tamanioVL);
            modeloTamanioRelativo.setDatosEntrada(listadoDatos);
        }

        return modeloTamanioRelativo;
    }
}
