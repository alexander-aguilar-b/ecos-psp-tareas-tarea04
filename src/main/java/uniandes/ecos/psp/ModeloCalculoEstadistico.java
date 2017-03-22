/******************************************************************/
/* Autor: Edgar Alexander Aguilar Bolaños
/* Fecha de Creación: 20/03/2017
/* Propósito: Clase contenedora de los datos sobre los que se realiza el calculo de media y desviacion estandar
/* Notas especiales:
/******************************************************************/
package uniandes.ecos.psp;

import java.util.LinkedList;

/**
 * Clase que representa el modelo de salida de los calculos estadisticos
 * @author edgaguil
 */
public class ModeloCalculoEstadistico
{
    /***
     * Listado de numeros reales sobres los que se efectuo el calculo
     */
    LinkedList<Double> datosEntrada;

    /***
     * Valor calculado de la desviación estandar
     */
    double valorDesviacionEstandar;

    /***
     * Valor calculado de la media
     */
    float valorMedia;

    public LinkedList<Double> getDatosEntrada()
    {
        return datosEntrada;
    }

    public void setDatosEntrada(LinkedList<Double> datosEntrada)
    {
        this.datosEntrada = datosEntrada;
    }

    public double getValorDesviacionEstandar()
    {
        return valorDesviacionEstandar;
    }

    public void setValorDesviacionEstandar(double valorDesviacionEstandar)
    {
        this.valorDesviacionEstandar = valorDesviacionEstandar;
    }

    public float getValorMedia()
    {
        return valorMedia;
    }

    public void setValorMedia(float valorMedia)
    {
        this.valorMedia = valorMedia;
    }
}
