package utp.misiontic2022.c2.p54.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p54.reto4.modelo.vo.Compras_3;
import utp.misiontic2022.c2.p54.reto4.util.JDBCUtilities;

public class Compras_3Dao {
    
    Connection conexion;

    public Compras_3Dao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public ArrayList<Compras_3> comprasaño() throws SQLException {
        ArrayList <Compras_3> lista = new ArrayList <Compras_3>();
        String sql = "SELECT ID_Proyecto ,STRFTIME('%Y',Fecha ) FROM Compra c WHERE Pagado = 'Parcialmente' AND Fecha LIKE '%-02-%'";
        Statement stmt = conexion.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);    
        while(resultado.next()){
            Compras_3 compra = new Compras_3();
            compra.setID_Proyecto(resultado.getInt(1));
            compra.setFecha(resultado.getString(2));
            lista.add(compra);
        }
        return lista;
    }
}