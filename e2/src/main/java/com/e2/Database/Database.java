package com.e2.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.e2.Model.Guitarra;

public class Database {

    private static final String url = "jdbc:postgresql://localhost:5432/E2";
    private static final String user = "postgres";
    private static final String password = "root";
    
    private Connection conn;
    
    public Connection conectarBanco() {
        try {
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null){
                System.out.println("Conectado ao banco de dados");
                criarTabelaGuitarras();
            }else {
                System.out.println("Falha ao conectar ao banco de dados");
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        return conn;
    }

    private void criarTabelaGuitarras() {
        try {
            if (conn != null) {
                System.out.println("Tabela Guitarra");

                String sql = "CREATE TABLE IF NOT EXISTS Guitarra (" +
                "id SERIAL PRIMARY KEY," +
                "marcaG VARCHAR(255) NOT NULL," +
                "modeloG VARCHAR(255) NOT NULL," +
                "corG VARCHAR(255) NOT NULL," +
                "cordaG VARCHAR(255) NOT NULL" +
                ");";

                try (Statement stmt = conn.createStatement()) {
                    stmt.execute(sql);
                }

            } else {
                System.out.println("Falha ao conectar no banco!");
            }
        } catch (SQLException e) {
            System.err.format("Criar Tabela Guitarras SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }

    public void cadastrarGuitarraNoBanco(Guitarra guitarra) {
        String sql = "INSERT INTO guitarra (marcaG, modeloG, corG, cordaG) VALUES (?, ?, ?, ?)";
        try (Connection conn = conectarBanco();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            conn.setAutoCommit(false);
            pstmt.setString(1, guitarra.getMarcaG());
            pstmt.setString(2, guitarra.getModeloG());
            pstmt.setString(3, guitarra.getCorG());
            pstmt.setString(4, guitarra.getCordaG());
            pstmt.executeUpdate();
            conn.commit();
            System.err.println("Guitarra inserida com sucesso!");
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Guitarra> buscarGuitarrasNoBanco() {
        List<Guitarra> listaGuitarras = new ArrayList<>();
        String sql = "SELECT * FROM guitarra";
        try {
            conn = conectarBanco();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String marcaG = rs.getString("marcaG");
                String modeloG = rs.getString("modeloG");
                String corG = rs.getString("corG");
                String cordaG = rs.getString("cordaG");
                Guitarra guitarra = new Guitarra(id,marcaG, modeloG, corG, cordaG);
                listaGuitarras.add(guitarra);
            }
            conn.close();
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaGuitarras;
    }

    public void atualizarGuitarraNoBanco(Guitarra guitarra) throws SQLException {
        String sql = "UPDATE guitarra SET marcag = ?, modelog = ?, corg = ?, cordag = ? WHERE id = ?";

        System.out.println("id"+ guitarra.getId());

        try (Connection conn = conectarBanco();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, guitarra.getMarcaG());
            pstmt.setString(2, guitarra.getModeloG());
            pstmt.setString(3, guitarra.getCorG());
            pstmt.setString(4, guitarra.getCordaG());
            pstmt.setInt(5, Integer.parseInt(guitarra.getId()));
            pstmt.executeUpdate();
        }
    }

    public void deletarGuitarraNoBanco(Guitarra guitarra) {
        String sql = "DELETE FROM guitarra WHERE marcaG = ? AND modeloG = ? AND corG = ? AND cordaG = ?";
        try {
            conn = conectarBanco();
            conn.setAutoCommit(false);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, guitarra.getMarcaG());
            pstmt.setString(2, guitarra.getModeloG());
            pstmt.setString(3, guitarra.getCorG());
            pstmt.setString(4, guitarra.getCordaG());
            pstmt.executeUpdate();
            conn.commit();
            conn.close();
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fecharConexao() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.format("fecha conexao SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            }
        }
    }
}

