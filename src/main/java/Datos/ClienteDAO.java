package Datos;

import Modelo.Cliente;

import java.sql.*;
import java.util.*;

public class ClienteDAO {
    private Conexion con;
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private List<Cliente> lista = new ArrayList<>();

    public ClienteDAO() {
        con = new Conexion();
        this.connection = con.getConnection();
    }


}
