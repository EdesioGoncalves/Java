/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ordemservico.dal;

//Seção de imports
import java.sql.*;

/**
 * Descrição: Usado para estabelecer conexão com o banco de dados
 * @author Edésio Gonçalves
 * @since Criada em 20/04/2021
 */
public class ModuloConexao {
    
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //Chama o drive de conexão com o bando
        String driver = "com.mysql.jdbc.Driver";   
        //Armazena informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbordemservico";
        String usuario = "root";
        String senha = "123456";
        
        //Tenta estabelecer conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            return conexao;
        } catch (Exception e) {
            //descomentar para testar qual o erro retorna na conexão
            //System.out.println(e);
            return null;
        }
    }
}//fim da classe
