package utp.misiontic2022.c2.p54.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p54.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p54.reto4.modelo.vo.Compras_1;
import utp.misiontic2022.c2.p54.reto4.modelo.vo.Compras_2;
import utp.misiontic2022.c2.p54.reto4.modelo.vo.Compras_3;

public class VistaRequerimientosReto4 {

    public static ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            System.out.println("Conocer el id de las compras que si estén pagadas");
            System.out.println("ID_Compra");
            ArrayList <Compras_1> resultado = controlador.consultarRequerimiento1();
            for (Compras_1 compras_1:resultado){
                System.out.println(compras_1.getID_Compra());
                System.out.println(compras_1.getID_Proyecto());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            System.out.println("Conocer el id de todas las compras cuyo precio por unidad de su material de construcción sea inferior a 1100");
            System.out.println("ID_Compra");
            ArrayList <Compras_2> resultado = controlador.consultarRequerimiento2();
            for (Compras_2 compras_2:resultado){
                System.out.println(compras_2.getID_Compra());
                System.out.println(compras_2.getProveedor());
            }    
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            System.out.println("Obtener el id de la compra y el año de las compras pagadas parcialmente y en el mes '02'");
            System.out.println("ID_Proyecto Fecha");
            ArrayList <Compras_3> resultado = controlador.consultarRequerimiento3();
            for (Compras_3 compras_3:resultado){
                System.out.print(compras_3.getID_Proyecto()+ " ");
                System.out.println(compras_3.getFecha());
            }    
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
   }        
   
    

