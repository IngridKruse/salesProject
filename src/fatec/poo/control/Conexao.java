package fatec.poo.control;

import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexao {    
    public static Connection connection;
    private static String caminho; 
    
    private static String usuario="";
    private static String senha="";
    private static String driver = "jdbc:ucanaccess://";

    public Conexao(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Connection conectar() {
        if (connection == null) {
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                System.out.println("Conexão Ok");
                connection = DriverManager.getConnection(driver + caminho, usuario, senha);
                return (connection); 
            } catch (Exception erro) {
                System.out.println("Falha na Conexão");                
            }
        }
        return connection;

    }

    public void fecharConexao() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    public void setCaminho(String caminho) {
         this.caminho=caminho;        
    }
}
