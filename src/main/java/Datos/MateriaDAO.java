package Datos;

import Modelo.Materia;

import java.sql.*;
import java.util.*;

public class MateriaDAO {
    private final Conexion con;
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<Materia> lista = new ArrayList<>();

    public MateriaDAO() {
        con = new Conexion();
        this.connection = con.getConnection();
    }

    private static final String insertSQL = "INSERT INTO Materia VALUES (?, ?);";
    private static final String selectSQL = "SELECT * FROM Materia;";
    private static final String updateSQL ="UPDATE Idioma SET Nombre_Materia=?";


    public void Insertar(Materia materia) {
        try {
            ps = connection.prepareStatement(insertSQL);
            ps.setInt(1, materia.getCodMateria());
            ps.setString(2, materia.getNombreMateria());

            ps.executeUpdate();
            System.out.println("Registro exitoso!!!");

            con.close(ps);
            con.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Materia> Consulta(Materia materia) {
        try {
            connection = con.getConnection();
            stm = connection.createStatement();
            rs = stm.executeQuery(selectSQL);
            while (rs.next()) {
                materia.setCodMateria(rs.getInt("CodMateria"));
                materia.setNombreMateria(rs.getString("Nombre_Materia"));

                lista.add(materia);
                materia = new Materia();
            }

            con.close(rs);
            con.close(stm);
            con.close(connection);

            lista.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public int Actualizar(Materia materia) {
        int registros = 0;
        try {
            connection = con.getConnection();
            ps = connection.prepareStatement(updateSQL);
            ps.setString(1, materia.getNombreMateria());

            registros = ps.executeUpdate();
            if (registros > 0)
                System.out.println("Registro Actualizado!!!");

            con.close(ps);
            con.close(connection);

        }catch (Exception e) {
            e.printStackTrace();
        }

        return registros;
    }
}
