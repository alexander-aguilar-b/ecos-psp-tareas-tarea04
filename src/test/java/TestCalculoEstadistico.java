/******************************************************************/
/* Autor: Edgar Alexander Aguilar Bolaños
/* Fecha de Creación: 21/03/2017
/* Propósito: Clase encargada de las pruebas de la clase de calculos estadisticos
/* Notas especiales:
/******************************************************************/
import org.junit.Test;
import uniandes.ecos.psp.CalculoEstadistico;
import uniandes.ecos.psp.ModeloTamanioRelativo;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;


public class TestCalculoEstadistico
{
    /**
     * Metodo que realiza la prueba del calculo de la media
     */
    @Test
    public void testMedia()
    {
        LinkedList<Double> listaDatos = new LinkedList<Double>();
        listaDatos.add(Math.log(18/3));
        listaDatos.add(Math.log(18/3));
        listaDatos.add(Math.log(25/3));
        listaDatos.add(Math.log(31/3));
        listaDatos.add(Math.log(37/3));
        listaDatos.add(Math.log(82/5));
        listaDatos.add(Math.log(82/4));
        listaDatos.add(Math.log(87/4));
        listaDatos.add(Math.log(89/4));
        listaDatos.add(Math.log(230/10));
        listaDatos.add(Math.log(85/3));
        listaDatos.add(Math.log(87/3));
        listaDatos.add(Math.log(558/10));

        float media = CalculoEstadistico.calcularMedia(listaDatos);
        assertEquals(2.805, media, 0.1);
    }

    /**
     * Metodo que realiza la prueba del calculo de la desviacion estandar
     */
    @Test
    public void testDesviacionEstadar()
    {
        LinkedList<Double> listaDatos = new LinkedList<Double>();

        listaDatos.add(Math.log(18/3));
        listaDatos.add(Math.log(18/3));
        listaDatos.add(Math.log(25/3));
        listaDatos.add(Math.log(31/3));
        listaDatos.add(Math.log(37/3));
        listaDatos.add(Math.log(82/5));
        listaDatos.add(Math.log(82/4));
        listaDatos.add(Math.log(87/4));
        listaDatos.add(Math.log(89/4));
        listaDatos.add(Math.log(230/10));
        listaDatos.add(Math.log(85/3));
        listaDatos.add(Math.log(87/3));
        listaDatos.add(Math.log(558/10));

        double desviacionEstandar = CalculoEstadistico.calcularDesviacionEstandar(listaDatos);
        assertEquals(0.66049, desviacionEstandar, 0.01);
    }


    /**
     * Metodo que realiza la prueba del calculo del tamaño relativo
     */
    @Test
    public void testTamanioRelativo()
    {
        LinkedList<Double> listaDatos = new LinkedList<Double>();

        listaDatos.add((double)18/3);
        listaDatos.add((double)18/3);
        listaDatos.add((double)25/3);
        listaDatos.add((double)31/3);
        listaDatos.add((double)37/3);
        listaDatos.add((double)82/5);
        listaDatos.add((double)82/4);
        listaDatos.add((double)87/4);
        listaDatos.add((double)89/4);
        listaDatos.add((double)230/10);
        listaDatos.add((double)85/3);
        listaDatos.add((double)87/3);
        listaDatos.add((double)558/10);

        ModeloTamanioRelativo modeloTamanioRelativo = CalculoEstadistico.calcularTamanioRelativo(listaDatos);

        assertEquals(4.395269124, modeloTamanioRelativo.getTamanioVS(), 0.01);
        assertEquals(8.508138249, modeloTamanioRelativo.getTamanioS(), 0.01);
        assertEquals(16.46962095, modeloTamanioRelativo.getTamanioM(), 0.01);
        assertEquals(31.88105393, modeloTamanioRelativo.getTamanioL(), 0.01);
        assertEquals(61.71372143, modeloTamanioRelativo.getTamanioVL(), 0.01);
    }
}