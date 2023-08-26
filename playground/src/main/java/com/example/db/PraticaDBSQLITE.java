package com.example.db;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PraticaDBSQLITE {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String url = "jdbc:sqlite:praticedb.db";
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS ALUNOS(  \n"
                +"id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n"
                +"NOME TEXT NOT NULL,\n"
                +"CURSO TEXT NOT NULL\n"
                +");");
            stmt.execute("INSERT INTO ALUNOS (NOME, CURSO) \n"
                        +"VALUES ('AILTON ANTONIO DE ARAUJO','PREPARATORIO SERPRO23');");

            pstmt = con.prepareStatement("SELECT ID, NOME,CURSO FROM ALUNOS;");
            rs = pstmt.executeQuery();
 
            while (rs.next()) {
                Integer id = rs.getInt("ID");
                String nome = rs.getString("NOME");

                System.out.println( id + " - " + nome);
            }

        }catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }catch (SQLException e) {
            
            e.printStackTrace();
        }
    }
}
