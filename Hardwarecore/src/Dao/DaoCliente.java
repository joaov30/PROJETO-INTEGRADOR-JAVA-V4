package Dao;

import Classes.Cliente;
import conexao.conexao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class DaoCliente {
    
    private Connection con;
    private ResultSet rs;
    
    
    
    public DaoCliente(){
        this.con=new conexao().getConnection();
    }
   
    
    public void cadastrar(Cliente cli) {
        try {
            PreparedStatement p = con.prepareStatement("insert into cliente(nome,telefone,cep,numero,complemento,email)values(?,?,?,?,?,?)");

            p.setString(1, cli.getNome());
            p.setString(2, cli.getTelefone());
            p.setString(3, cli.getCep());
            p.setInt(4, cli.getNumero());
            p.setString(5, cli.getComplemento());
            p.setString(6, cli.getEmail());
            p.execute();
            p.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }
    
    public void editar(Cliente cli) {
        try {

            PreparedStatement p = con.prepareStatement("update cliente set nome=?,telefone=?,cep=?,numero=?,complemento=?, email=? where idcliente='" + cli.getIdcliente() + "';");
            p.setString(1, cli.getNome());
            p.setString(2, cli.getTelefone());
            p.setString(3, cli.getCep());
            p.setInt(4, cli.getNumero());
            p.setString(5, cli.getComplemento());
            p.setString(6, cli.getEmail());
            p.executeUpdate();
            p.close();
        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.", erro);
        }

    }

    public void buscarcod(Cliente cli) {

        try {

            PreparedStatement p = con.prepareStatement("select * from cliente where idcliente='" + cli.getIdcliente() + "';");

            rs = p.executeQuery();

            if (rs.first()) {
                cli.setIdcliente(rs.getInt("idcliente"));
                cli.setNome(rs.getString("nome"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setCep(rs.getString("cep"));
                cli.setNumero(rs.getInt("numero"));
                cli.setComplemento(rs.getString("complemento"));
                cli.setEmail(rs.getString("email"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Cliente inexistente!");
            }
            p.close();

        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.", erro);
        }

    }

    public void buscarnome(Cliente cli) {

        try {

            PreparedStatement p = con.prepareStatement("select * from cliente where nome= '" + cli.getNome() + "';");

            rs = p.executeQuery();

            if (rs.first()) {
                cli.setIdcliente(rs.getInt("idcliente"));
                cli.setNome(rs.getString("nome"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setCep(rs.getString("cep"));
                cli.setNumero(rs.getInt("numero"));
                cli.setComplemento(rs.getString("complemento"));
                cli.setEmail(rs.getString("email"));               
                
            } else {
                JOptionPane.showMessageDialog(null, "Cliente inexistente!");
            }
            p.close();

        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.", erro);
        }

    }
    
    public List<Cliente> listacli(){
 try{
    List<Cliente>clientes = new ArrayList<Cliente>();
    PreparedStatement p=con.prepareStatement("select * from cliente");
    rs=p.executeQuery();
    
    while(rs.next()){
        Cliente cli=new Cliente();
        cli.setIdcliente(rs.getInt("idcliente"));
        cli.setNome(rs.getString("nome"));
        cli.setTelefone(rs.getString("telefone"));
        cli.setCep(rs.getString("cep"));
        cli.setNumero(rs.getInt("numero"));
        cli.setComplemento(rs.getString("complemento"));
        cli.setEmail(rs.getString("email")); 
       clientes.add(cli);
    }
    return clientes;     
     
 }
 catch(SQLException erro){
     throw new RuntimeException(erro);
 }    
}

    
    
    
    
}
