package utp.misiontic2022.c2.p54.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p54.reto4.modelo.dao.Compras_1Dao;
import utp.misiontic2022.c2.p54.reto4.modelo.dao.Compras_2Dao;
import utp.misiontic2022.c2.p54.reto4.modelo.dao.Compras_3Dao;
import utp.misiontic2022.c2.p54.reto4.modelo.vo.Compras_1;
import utp.misiontic2022.c2.p54.reto4.modelo.vo.Compras_2;
import utp.misiontic2022.c2.p54.reto4.modelo.vo.Compras_3;


public class ControladorRequerimientos {
    Compras_1Dao dao1 = new Compras_1Dao();
    Compras_2Dao dao2 = new Compras_2Dao();
    Compras_3Dao dao3 = new Compras_3Dao();

    public ArrayList<Compras_1> consultarRequerimiento1() throws SQLException {
        return dao1.comprasNoPagadas();
    }

    public ArrayList<Compras_2> consultarRequerimiento2() throws SQLException {
        return dao2.comprasmateriales();
    }

    public ArrayList<Compras_3> consultarRequerimiento3() throws SQLException {
        return dao3.comprasaño();
    }
}
