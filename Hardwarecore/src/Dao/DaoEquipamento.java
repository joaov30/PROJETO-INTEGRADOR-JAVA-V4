package Dao;

import Classes.Equipamento;
import conexao.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DaoEquipamento {
    
    
    private Connection con;
    private ResultSet rs;
    
    public DaoEquipamento() {
        this.con = new conexao().getConnection();
    }
    
    public void cadastrar(Equipamento eq) {
        try {
            PreparedStatement p = con.prepareStatement("insert into equipamento(nome,marca)values(?,?)");

            p.setString(1, eq.getNome());
            p.setString(2, eq.getMarca());
            p.execute();
            p.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }
    public void editar(Equipamento eq) {
        try {

            PreparedStatement p = con.prepareStatement("update equipamento set nome=?,marca=? where idequipamento='" + eq.getIdequipamento() + "';");
            p.setString(1, eq.getNome());
            p.setString(2, eq.getMarca());
            
            p.executeUpdate();
            p.close();
        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.", erro);
        }

    }

    public void buscarcod(Equipamento eq) {

        try {

            PreparedStatement p = con.prepareStatement("select * from equipamento where idequipamento='" + eq.getIdequipamento()+ "';");

            rs = p.executeQuery();

            if (rs.first()) {
                eq.setIdequipamento(rs.getInt("idequipamento"));
                eq.setNome(rs.getString("nome"));
                eq.setMarca(rs.getString("marca"));
                
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Equipamento inexistente!");
            }
            p.close();

        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.", erro);
        }

    }

    public void buscarnome(Equipamento eq) {

        try {

            PreparedStatement p = con.prepareStatement("select * from equipamento where nome= '" + eq.getNome() + "';");

            rs = p.executeQuery();

            if (rs.first()) {
                eq.setIdequipamento(rs.getInt("idequipamento"));
                eq.setNome(rs.getString("nome"));
                eq.setMarca(rs.getString("marca"));
            } else {
                JOptionPane.showMessageDialog(null, "Equipamento inexistente!");
            }
            p.close();

        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.", erro);
        }

    }
    
    public List<Equipamento> listaeq() {
        try {
            List<Equipamento> equipamentos = new ArrayList<Equipamento>();
            PreparedStatement p = con.prepareStatement("select * from equipamento");
            rs = p.executeQuery();

            while (rs.next()) {
                Equipamento eq = new Equipamento();
                eq.setIdequipamento(rs.getInt("idequipamento"));
                eq.setNome(rs.getString("nome"));
                eq.setMarca(rs.getString("marca"));
                
                equipamentos.add(eq);
            }
            return equipamentos;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
