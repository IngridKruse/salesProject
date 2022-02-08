/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Fábio
 */
public class DaoVendedor {
    private Connection conn;
    
    public DaoVendedor(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO vendedor(CPF,Nome,Endereco,Cidade,CEP,UF,TelefoneDDD,TelefoneNumero,"+
                    "SalarioBase,Comissao) VALUES(?,?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getCidade());
            ps.setString(5, vendedor.getCep());
            ps.setString(6, vendedor.getUf());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
            ps.setDouble(9, vendedor.getSalarioBase());
            ps.setDouble(10, vendedor.getComissao());
                      
            if(!ps.execute())
                System.out.println("\nIncluido");
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE vendedor SET Nome = ?, Endereco = ?, Cidade = ?,CEP = ?, UF = ?,TelefoneDDD = ?,"+
                    " TelefoneNumero = ?, SalarioBase = ?, Comissao = ? where CPF = ?");
            
            ps.setString(10, vendedor.getCpf());
            ps.setString(1, vendedor.getNome());
            ps.setString(2, vendedor.getEndereco());
            ps.setString(3, vendedor.getCidade());
            ps.setString(4, vendedor.getCep());
            ps.setString(5, vendedor.getUf());
            ps.setString(6, vendedor.getDdd());
            ps.setString(7, vendedor.getTelefone());
            ps.setDouble(8, vendedor.getSalarioBase());
            ps.setDouble(9, vendedor.getComissao());
           
            if(!ps.execute()){
                System.out.println("\nAlterado");
            }
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public Vendedor consultar (String cpf) {
        Vendedor v = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from vendedor where CPF = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                v = new Vendedor (cpf, rs.getString("Nome"), rs.getDouble("SalarioBase"));
                v.setEndereco(rs.getString("Endereco"));
                v.setCidade(rs.getString("Cidade"));
                v.setCep(rs.getString("CEP"));
                v.setUf(rs.getString("UF"));
                v.setDdd(rs.getString("TelefoneDDD"));
                v.setTelefone(rs.getString("TelefoneNumero"));
                v.setComissao(rs.getDouble("Comissao"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (v);
    }    
     
     public void excluir(Vendedor vendedor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM vendedor where CPF = ?");
            
            ps.setString(1, vendedor.getCpf());
                      
            if(!ps.execute())
                System.out.println("\nExcluido");
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
