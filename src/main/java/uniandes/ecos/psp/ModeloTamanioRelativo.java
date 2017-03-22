/******************************************************************/
/* Autor: Edgar Alexander Aguilar Bolaños
/* Fecha de Creación: 20/03/2017
/* Propósito: Clase contenedora de los datos sobre los que se realiza el calculo del tamaño relativo y los resultados de obtenidos
/* Notas especiales:
/******************************************************************/
package uniandes.ecos.psp;

import java.util.LinkedList;

/**
 * Clase contenedora de los datos sobre los que se realiza el calculo del tamaño relativo y los resultados de obtenidos
 * Created by edgaguil on 20/03/2017.
 */
public class ModeloTamanioRelativo
{

    // Valor relativo de tamaño Very Small
    private double tamanioVS;

    // Valor relativo de tamaño Small
    private double tamanioS;

    // Valor relativo de tamaño Medium
    private double tamanioM;

    // Valor relativo de tamaño Large
    private double tamanioL;

    // Valor relativo de tamaño Very Large
    private double tamanioVL;

    // Listado de datos sobre los cuales se realiza el calculo
    private LinkedList<Double> datosEntrada;

    /***
     * Obtiene el listado de datos de entrada
     * @return
     */
    public LinkedList<Double> getDatosEntrada()
    {
        return datosEntrada;
    }

    /***
     * Asigna la coleccion de datos de entrada
     * @param datosEntrada
     */
    public void setDatosEntrada(LinkedList<Double> datosEntrada)
    {
        this.datosEntrada = datosEntrada;
    }

    /***
     * Obtiene el valor relativo de tamaño Very Small
     * @return
     */
    public double getTamanioVS()
    {
        return tamanioVS;
    }

    /***
     * Asigna el valor relativo de tamaño Very Small
     * @param tamanioVS
     */
    public void setTamanioVS(double tamanioVS)
    {
        this.tamanioVS = tamanioVS;
    }

    /***
     * Obtiene el valor relativo de tamaño Small
     * @return
     */
    public double getTamanioS()
    {
        return tamanioS;
    }

    /***
     * Asigna el valor relativo de tamaño Small
     * @param tamanioS
     */
    public void setTamanioS(double tamanioS)
    {
        this.tamanioS = tamanioS;
    }

    /***
     * Obtiene el valor relativo de tamaño Medium
     * @return
     */
    public double getTamanioM()
    {
        return tamanioM;
    }

    /***
     * Asigna el valor relativo de tamaño Medium
     * @param tamanioM
     */
    public void setTamanioM(double tamanioM)
    {
        this.tamanioM = tamanioM;
    }

    /***
     * Obtiene el valor relativo de tamaño Large
     * @return
     */
    public double getTamanioL()
    {
        return tamanioL;
    }

    /***
     * Asigna el valor relativo de tamaño Large
     * @param tamanioL
     */
    public void setTamanioL(double tamanioL)
    {
        this.tamanioL = tamanioL;
    }

    /***
     * Obtiene el valor relativo de tamaño Very Large
     * @return
     */
    public double getTamanioVL()
    {
        return tamanioVL;
    }

    /***
     * Asigna el valor relativo de tamaño Very Large
     * @param tamanioVL
     */
    public void setTamanioVL(double tamanioVL)
    {
        this.tamanioVL = tamanioVL;
    }
}
