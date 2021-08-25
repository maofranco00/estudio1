package utp.misiontic2022.c2.p54.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p54.reto4.modelo.vo.Compras_1;
import utp.misiontic2022.c2.p54.reto4.util.JDBCUtilities;



public class Compras_1Dao {

    Connection conexion;

    public Compras_1Dao(){

        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }

    public ArrayList<Compras_1> comprasNoPagadas() throws SQLException {
        ArrayList <Compras_1> lista = new ArrayList <Compras_1>();
        String sql = "SELECT c.ID_Compra, c.ID_Proyecto FROM Compra c WHERE c.Pagado = 'No' and Proveedor = 'JUMBO'";
        Statement stmt = conexion.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);    
        while(resultado.next()){
            Compras_1 compra = new Compras_1();
            compra.setID_Compra(resultado.getInt(1));
            compra.setID_Proyecto(resultado.getInt(2));
            lista.add(compra);
            
        }
        return lista;
    }   
}