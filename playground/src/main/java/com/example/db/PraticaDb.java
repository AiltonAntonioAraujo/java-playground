package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PraticaDb {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost/postgres";
        String username = "postgres";
        String password = "postgres";

        /*
         * Carregar o driver
         */
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt =con.prepareStatement("SELECT * FROM cidade LIMIT 100");
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                System.out.println("Consultou!");
            } else{
                System.out.println("Não Consultou!");
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        /*
         * Criar a conexao
         */

        /*
         * realizar consulta
         */
    }

}
