package utp.misiontic2022.c2.p54.reto4;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import utp.misiontic2022.c2.p54.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p54.reto4.modelo.vo.Compras_1;
import utp.misiontic2022.c2.p54.reto4.modelo.vo.Compras_2;
import utp.misiontic2022.c2.p54.reto4.modelo.vo.Compras_3;
import utp.misiontic2022.c2.p54.reto4.vista.ModeloDatos;

/**     
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class App 
{

    public static ControladorRequerimientos controlador = new ControladorRequerimientos();
    public static void main( String[] args )
    {


        ModeloDatos modelo1 = new ModeloDatos();
                      
        

        /*System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();

        System.out.println("\nRequerimiento 2");
        VistaRequerimientos.requerimiento2();

        System.out.println("\nRequerimiento 3");
        VistaRequerimientos.requerimiento3();
        
        System.out.println("\nRequerimiento 4");
        VistaRequerimientos.requerimiento4();*/

        try {
            ArrayList <Compras_1> lista = controlador.consultarRequerimiento1();
            Object matriz1[][] =  new Object [lista.size()][2];
            for(int i = 0 ; i < lista.size();i++){
                matriz1[i][0] = lista.get(i).getID_Compra();
                matriz1[i][1] = lista.get(i).getID_Proyecto();
            }
            modelo1.datos = matriz1;
            JTable tabla1 = new JTable(modelo1);
            JScrollPane scroll1 = new JScrollPane(tabla1);
            JOptionPane.showMessageDialog(null, scroll1);

                      
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        ModeloDatos modelo2 = new ModeloDatos(); 
        try {
            ArrayList<Compras_2> lista2 = controlador.consultarRequerimiento2();
            Object matriz2[][] =  new Object [lista2.size()][2];
            for(int i = 0 ; i < lista2.size();i++){
                matriz2[i][0] = lista2.get(i).getID_Compra();
                matriz2[i][1] = lista2.get(i).getProveedor();
            }
            modelo2.datos = matriz2;
            JTable tabla2 = new JTable(modelo2);
            JScrollPane scroll2 = new JScrollPane(tabla2);
            JOptionPane.showMessageDialog(null, scroll2);
        }  catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
        ModeloDatos modelo3 = new ModeloDatos();
        try {
            ArrayList<Compras_3> lista3 = controlador.consultarRequerimiento3();
            Object matriz3[][] =  new Object [lista3.size()][2];
            for(int i = 0 ; i < lista3.size();i++){
                matriz3[i][0] = lista3.get(i).getID_Proyecto();
                matriz3[i][1] = lista3.get(i).getFecha();
            }
            modelo3.datos = matriz3;
            JTable tabla3 = new JTable(modelo3);
            JScrollPane scroll3 = new JScrollPane(tabla3);
            JOptionPane.showMessageDialog(null, scroll3);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
