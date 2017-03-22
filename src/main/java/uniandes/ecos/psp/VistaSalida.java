/******************************************************************/
/* Autor: Edgar Alexander Aguilar Bolaños
/* Fecha de Creación: 21/03/2017
/* Propósito: Clase encargada de mostrar los resultados de los calculos
/* Notas especiales:
/******************************************************************/
package uniandes.ecos.psp;

/**
 * Clase encargada de mostrar los resultados de los calculos
 * @author edgaguil
 */
public class VistaSalida
{
    /***
     * Metodo encargado de mostrar la informacion empleada para realizar el calculo, asi como los valores calculados
     * @param modeloCalculoEstadistico
     */
    public void mostrarResultado(ModeloCalculoEstadistico modeloCalculoEstadistico)
    {
        System.out.println("Datos de Entrada:");
        for (Double item : modeloCalculoEstadistico.getDatosEntrada())
        {
            System.out.println((double)item);
        }

        System.out.println("Media:" + modeloCalculoEstadistico.getValorMedia());
        System.out.println("Desviación Estandar:" + modeloCalculoEstadistico.getValorDesviacionEstandar());
    }

    /***
     * Metodo encargado de mostrar la informacion empleada para realizar el calculo, asi como los valores calculados
     * @param modeloTamanioRelativo
     */
    public void mostrarResultadoTamanioRelativo(ModeloTamanioRelativo modeloTamanioRelativo)
    {
        System.out.println();
        System.out.println("Datos de Entrada:");
        System.out.println("***********************************************");
        if (modeloTamanioRelativo.getDatosEntrada() != null)
        {
            for (Double item : modeloTamanioRelativo.getDatosEntrada())
            {
                System.out.println((double)item);
            }
        }

        System.out.println();
        System.out.println("Resultados Tamaño Relativo:");
        System.out.println("***********************************************");
        System.out.println("VS: " +  modeloTamanioRelativo.getTamanioVS());
        System.out.println("S : " +  modeloTamanioRelativo.getTamanioS());
        System.out.println("M : " + modeloTamanioRelativo.getTamanioM());
        System.out.println("L : " + modeloTamanioRelativo.getTamanioL());
        System.out.println("VL: " + modeloTamanioRelativo.getTamanioVL());
        System.out.println();
    }

}
