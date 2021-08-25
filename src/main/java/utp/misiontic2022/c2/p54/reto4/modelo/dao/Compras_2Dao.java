package utp.misiontic2022.c2.p54.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p54.reto4.modelo.vo.Compras_2;
import utp.misiontic2022.c2.p54.reto4.util.JDBCUtilities;


public class Compras_2Dao {

    Connection conexion;

    public Compras_2Dao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public ArrayList<Compras_2> comprasmateriales() throws SQLException {
        ArrayList <Compras_2> lista = new ArrayList <Compras_2>();
        String sql = "SELECT ID_Compra, c.Proveedor FROM Compra c Where ID_MaterialConstruccion in (SELECT ID_MaterialConstruccion FROM MaterialConstruccion mc WHERE Precio_Unidad < 1100)";
        Statement stmt = conexion.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);    
        while(resultado.next()){
            Compras_2 compra = new Compras_2();
            compra.setID_Compra(resultado.getInt(1));
            compra.setProveedor(resultado.getString(2));
            lista.add(compra);
        }
        return lista;
    }
}