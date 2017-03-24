/******************************************************************/
/* Autor: Edgar Alexander Aguilar Bolaños
/* Fecha de Creación: 21/03/2017
/* Propósito: Controlador encargado de orquestar  el flujo del programa.
/* Notas especiales:
/******************************************************************/
package uniandes.ecos.psp;

import java.io.File;
import java.util.LinkedList;

/**
 * Clase que hace las veces de Controlador dentro de la aplicación
 * @author edgaguil
 */
public class ControladorEstadistica
{

    /***
     * ruta del archivo que contiene los datos
     */
    String rutaArchivo;
    String nombreArchivo;


    VistaEntrada vistaEntrada;
    VistaSalida vistaSalida;
    LinkedList<Double> datosEntrada;

    /***
     * Constructor de la clase
     */
    public ControladorEstadistica()
    {
        vistaEntrada = new VistaEntrada();
        vistaSalida = new VistaSalida();
    }

    public void setNombreArchivo(String nombreArchivo)
    {
        this.nombreArchivo = nombreArchivo;
    }

    /***
     * Metodo encargado de controlar la solicitud de calculo de media y desviación estandar
     * @throws Exception
     */
    public void CalcularMediaDesviacionEstandar() throws Exception
    {
        rutaArchivo = vistaEntrada.solicitarRutaArchivo();
        ManejadorArchivo manejadorArchivo = new ManejadorArchivo();
        datosEntrada = manejadorArchivo.obtenerDatosArchivo(rutaArchivo);

        ModeloCalculoEstadistico modeloCalculoEstadistico = new ModeloCalculoEstadistico();

        double desviacionEstandar = CalculoEstadistico.calcularDesviacionEstandar(datosEntrada);
        float media = CalculoEstadistico.calcularMedia(datosEntrada);

        modeloCalculoEstadistico.setDatosEntrada(datosEntrada);
        modeloCalculoEstadistico.setValorDesviacionEstandar(desviacionEstandar);
        modeloCalculoEstadistico.setValorMedia(media);

        vistaSalida.mostrarResultado(modeloCalculoEstadistico);
    }

    /***
     * Metodo encargado de controlar la solicitud de calculo de tamaño relativo
     * @throws Exception
     */
    public ModeloTamanioRelativo calcularTamanioRelativo() throws Exception
    {
        String rutaBase = new File("").getAbsolutePath();
        nombreArchivo = nombreArchivo.isEmpty() ? "Data.txt" : nombreArchivo;
        //rutaArchivo = rutaBase.concat("/resources/testdata/Data.txt");
        rutaArchivo = rutaBase.concat("/resources/testdata/" + nombreArchivo);
        System.out.println(rutaArchivo);
        ManejadorArchivo manejadorArchivo = new ManejadorArchivo();
        datosEntrada = manejadorArchivo.obtenerDatosArchivo(rutaArchivo);
        ModeloTamanioRelativo modeloTamanioRelativo = CalculoEstadistico.calcularTamanioRelativo(datosEntrada);
        //vistaSalida.mostrarResultadoTamanioRelativo(modeloTamanioRelativo);
        return modeloTamanioRelativo;
    }
}
