/******************************************************************/
/* Autor: Edgar Alexander Aguilar Bolaños
/* Fecha de Creación: 21/03/2017
/* Propósito: Clase encargada de solicitar los datos de entrada
/* Notas especiales:
/******************************************************************/
package uniandes.ecos.psp;

/**
 * Clase encargada de solicitar los datos de entrada
 * @author edgaguil
 */
public class VistaEntrada
{

    /***
     * Metod encargado de capturar la ruta del archivo que contiene el listado de numeros reales
     * @return
     */
    public String solicitarRutaArchivo()
    {
        System.out.println("Programa para el Calculo de Media y Desviacion Estandar - PSP0");
        System.out.println("********************************************************");
        System.out.println("Estimado usuario, por favor ingrese la ruta del archivo que contiene el listado de numeros reales (separados por saldo de linea) sobre los cuales se va a calcular la media y desviacion estandar.");
        System.out.println("Ruta:");
        //String rutaArchivo = System.console().readLine();
        String rutaArchivo = "C:\\Users\\edgaguil\\Dropbox\\Alex\\ECOS\\Conceptos Avanzados de SW\\Tareas\\Program1\\Data3.txt";
        return rutaArchivo;
    }
}
