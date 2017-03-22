/******************************************************************/
/* Autor: Edgar Alexander Aguilar Bolaños
/* Fecha de Creación: 21/03/2017
/* Propósito: Clase encargada del manejo de archivos
/* Notas especiales:
/******************************************************************/
package uniandes.ecos.psp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;


/**
 * Clase encargada del manejo de archivos
 * @author edgaguil
 */
public class ManejadorArchivo
{
    /***
     * Metodo encargado de obtener un listado de numeros reales a partir de un archivo de texto plano
     * @param rutaArchivo
     * @return Listado de numeros reales
     * @throws FileNotFoundException
     * @throws IOException
     * @throws Exception
     */
    public LinkedList<Double> obtenerDatosArchivo(String rutaArchivo) throws FileNotFoundException, IOException, Exception
    {
        LinkedList<Double> listaDatos = new LinkedList<Double>();

        File f = new File(rutaArchivo);

        if (f.exists() && !f.isDirectory())
        {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

            try
            {
                String line = br.readLine();

                while (line != null)
                {
                    listaDatos.add(Double.parseDouble(line));
                    line = br.readLine();
                }
            }
            finally
            {
                br.close();
            }
        }
        else
        {
            throw new Exception("No existe un archivo en la ruta especificada");
        }

        return listaDatos;
    }
}
