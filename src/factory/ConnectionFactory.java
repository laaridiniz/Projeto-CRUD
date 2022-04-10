/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import java.sql.Connection;//conexão SQL para Java
import java.sql.DriverManager;//driver de conexão SQL para Java
import java.sql.SQLException;//classe para tratamento de exceções
/**
 *
 * @author Usuario
 */
public class ConnectionFactory {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/vendas","root","fatec");
        }
        catch(SQLException excecao){
            throw new RuntimeException(excecao);
        }
    }
}
