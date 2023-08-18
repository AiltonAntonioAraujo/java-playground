package com.example.db;

import java.sql.DriverManager;
import java.sql.SQLException;

public class AppDb {
    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static void main(String[] args) {

        new AppDb();

    }

    public AppDb() {
        try {
            var conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            Class.forName("org.postgresql.Driver");

            System.out.println("Conexão com o banco realizada com sucesso.");

            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
            while (result.next()) {
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"),
                        result.getString("uf"));
            }
            System.out.println();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca para acesso ao banco de dados: " + e.getMessage());
        }

    }
}
