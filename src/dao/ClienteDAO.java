/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import factory.ConnectionFactory;
import modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Usuario
 */
public class ClienteDAO {
    private Connection connection;
    
    public ClienteDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Cliente cliente){
        String sql = "INSERT INTO cliente(cli_nome) VALUES(?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.execute();
            stmt.close();
        }
        catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
}
