package Dao;

import Classes.OS;
import conexao.conexao;
 import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DaoOs {
    private Connection con;
    private ResultSet rs;
    
    public DaoOs(){
        this.con=new conexao().getConnection();
    }
    public void cadastrar(OS os) {
        try {
            PreparedStatement p = con.prepareStatement("insert into os(dataentrada,datasaida,descricao,idcliente,idtecnico,idequipamento)values(?,?,?,?,?,?)");

            p.setString(1, os.getDataentrada());
            p.setString(2, os.getDatasaida());
            p.setString(3, os.getDescricao());
            p.setInt(4, os.getIdcliente());
            p.setInt(5, os.getIdtecnico());
            p.setInt(6, os.getIdequipamento());
            p.execute();
            p.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }
    
    public void editar(OS os) {
        try {

            PreparedStatement p = con.prepareStatement("update os set dataEntrada=?,dataSaida=?,descricao=?,idcliente=?,idtecnico=?, idequipamento=? where idos='" + os.getIdos()+ "';");
            p.setString(1, os.getDataentrada());
            p.setString(2, os.getDatasaida());
            p.setString(3, os.getDescricao());
            p.setInt(4, os.getIdcliente());
            p.setInt(5, os.getIdtecnico());
            p.setInt(6, os.getIdequipamento());
            p.executeUpdate();
            p.close();
        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.", erro);
        }

    }

    public void buscarcod(OS os) {

        try {

            PreparedStatement p = con.prepareStatement("select * from os where idos='" + os.getIdos() + "';");

            rs = p.executeQuery();

            if (rs.first()) {
                os.setIdos(rs.getInt("idos"));
                os.setDataentrada(rs.getString("dataEntrda"));
                os.setDatasaida(rs.getString("dataSaida"));
                os.setDescricao(rs.getString("descricao"));
                os.setIdcliente(rs.getInt("idcliente"));
                os.setIdtecnico(rs.getInt("idtecnico"));
                os.setIdequipamento(rs.getInt("idequipamento"));
                
            } else {
                JOptionPane.showMessageDialog(null, "OS inexistente!");
            }
            p.close();

        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.", erro);
        }

    }

    public void buscarnome(OS os) {

        try {

            PreparedStatement p = con.prepareStatement("select * from os where dataEntrada= '" + os.getDataentrada() + "';");

            rs = p.executeQuery();

            if (rs.first()) {
                os.setIdos(rs.getInt("idos"));
                os.setDataentrada(rs.getString("dataEntrda"));
                os.setDatasaida(rs.getString("dataSaida"));
                os.setDescricao(rs.getString("descricao"));
                os.setIdcliente(rs.getInt("idcliente"));
                os.setIdtecnico(rs.getInt("idtecnico"));
                os.setIdequipamento(rs.getInt("idequipamento"));              
                
            } else {
                JOptionPane.showMessageDialog(null, "OS inexistente!");
            }
            p.close();

        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.", erro);
        }

    }
    
 /*   public List<OS> listaos(){
 try{
    List<OS>os = new ArrayList<OS>();
    PreparedStatement p=con.prepareStatement("select * from os");
    rs=p.executeQuery();
    
    while(rs.next()){
        OS os=new OS();
        os.setIdos(rs.getInt("idos"));
                os.setDataentrada(rs.getString("dataEntrda"));
                os.setDatasaida(rs.getString("dataSaida"));
                os.setDescricao(rs.getString("descricao"));
                os.setIdcliente(rs.getInt("idcliente"));
                os.setIdtecnico(rs.getInt("idtecnico"));
                os.setIdequipamento(rs.getInt("idequipamento"));
       os.add(os);
    }
    return os;     
     
 }
 catch(SQLException erro){
     throw new RuntimeException(erro);
 }    
}*/
}
