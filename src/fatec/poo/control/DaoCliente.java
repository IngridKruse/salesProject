/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Cliente;

/**
 *
 * @author Matheus
 */
public class DaoCliente {
    private Connection conn;
    
    public DaoCliente(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO Cliente(CPF,Nome,Endereco,Cidade,CEP,UF,TelefoneDDD,TelefoneNumero,"+
                    "LimiteCredito,LimiteDisponivel) VALUES(?,?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEndereco());
            ps.setString(4, cliente.getCidade());
            ps.setString(5, cliente.getCep());
            ps.setString(6, cliente.getUf());
            ps.setString(7, cliente.getDdd());
            ps.setString(8, cliente.getTelefone());
            ps.setDouble(9, cliente.getLimiteCred());
            ps.setDouble(10, cliente.getLimiteDisp());
                      
            if(!ps.execute())
                System.out.println("\nIncluido");
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Cliente SET Nome = ?, Endereco = ?, Cidade = ?,CEP = ?, UF = ?,TelefoneDDD = ?,"+
                    " TelefoneNumero = ?, LimiteCredito = ?, LimiteDisponivel = ? where CPF = ?");
            
            ps.setString(10, cliente.getCpf());
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEndereco());
            ps.setString(3, cliente.getCidade());
            ps.setString(4, cliente.getCep());
            ps.setString(5, cliente.getUf());
            ps.setString(6, cliente.getDdd());
            ps.setString(7, cliente.getTelefone());
            ps.setDouble(8, cliente.getLimiteCred());
            ps.setDouble(9, cliente.getLimiteDisp());
           
            if(!ps.execute()){
                System.out.println("\nAlterado");
            }
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public Cliente consultar (String cpf) {
        Cliente c = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from Cliente where CPF = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                c = new Cliente (cpf, rs.getString("Nome"), rs.getDouble("LimiteCredito"));
                c.setEndereco(rs.getString("Endereco"));
                c.setCidade(rs.getString("Cidade"));
                c.setCep(rs.getString("CEP"));
                c.setUf(rs.getString("UF"));
                c.setDdd(rs.getString("TelefoneDDD"));
                c.setTelefone(rs.getString("TelefoneNumero"));
                c.subLimite(rs.getDouble("LimiteCredito")-rs.getDouble("LimiteDisponivel"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (c);
    }    
     
     public void excluir(Cliente cliente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM cliente where CPF = ?");
            
            ps.setString(1, cliente.getCpf());
                      
            if(!ps.execute())
                System.out.println("\nExcluido");
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
