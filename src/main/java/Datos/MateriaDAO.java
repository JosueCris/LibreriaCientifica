package Datos;

import Modelo.Materia;

import java.sql.*;
import java.util.*;

public class MateriaDAO {
    Conexion con = new Conexion();
    private Connection connection;
    private PreparedStatement ps = null;
    private Statement stm = null;
    private ResultSet rs = null;
    private final List<Materia> lista = new ArrayList<>();

    public MateriaDAO(Connection connection) {
        this.connection = connection;
    }

    private static final String insertSQL = "INSERT INTO Materia VALUES (?, ?);";
    private static final String selectSQL = "SELECT * FROM Materia;";
    private static final String searchSQL = "SELECT * FROM Materia WHERE CodMateria = ?;";
    private static final String updateSQL = "UPDATE Materia SET Nombre_Materia=? WHERE CodMateria=?";


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

    public Materia getMateria(int codMateria) {
        Materia materia = null;
        try {
            ps = connection.prepareStatement(searchSQL);
            ps.setInt(1, codMateria);
            rs = ps.executeQuery();

            if (!rs.next()) {
                con.close(rs);
                con.close(ps);
                return null;
            }

            materia = new Materia(rs.getInt("CodMateria"),
                    rs.getString("Nombre_Materia"));
            con.close(rs);
            con.close(ps);
        }catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("CodMateria: " + materia.getCodMateria() + "\nNombre Materia: " + materia.getNombreMateria());

        return materia;
    }

    public int Actualizar(Materia materia) {
        int registros = 0;
        try {
            connection = con.getConnection();
            ps = connection.prepareStatement(updateSQL);
            ps.setInt(2, materia.getCodMateria());
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
