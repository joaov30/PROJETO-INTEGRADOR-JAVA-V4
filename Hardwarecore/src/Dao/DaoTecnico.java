package Dao;

import Classes.Tecnico;
import conexao.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DaoTecnico {

    private Connection con;
    private ResultSet rs;
    public int status;

    public DaoTecnico() {
        this.con = new conexao().getConnection();
    }

    public void cadastrar(Tecnico tec) {
        try {
            PreparedStatement p = con.prepareStatement("insert into tecnico(nome,cpf,rg,usuario,senha)values(?,?,?,?,?)");

            p.setString(1, tec.getNome());
            p.setString(2, tec.getCpf());
            p.setString(3, tec.getRg());
            p.setString(4, tec.getUsuario());
            p.setString(5, tec.getSenha());
            p.execute();
            p.close();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public void editar(Tecnico tec) {
        try {

            PreparedStatement p = con.prepareStatement("update tecnico set nome=?,cpf=?,rg=?,usuario=?, senha=? where idtecnico='" + tec.getIdtecnico() + "';");
            p.setString(1, tec.getNome());
            p.setString(2, tec.getCpf());
            p.setString(3, tec.getRg());
            p.setString(4, tec.getUsuario());
            p.setString(5, tec.getSenha());

            p.executeUpdate();
            p.close();
        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.", erro);
        }

    }

    public void buscarcod(Tecnico tec) {

        try {

            PreparedStatement p = con.prepareStatement("select * from tecnico where idtecnico='" + tec.getIdtecnico() + "';");

            rs = p.executeQuery();

            if (rs.first()) {
                tec.setIdtecnico(rs.getInt("idtecnico"));
                tec.setNome(rs.getString("nome"));
                tec.setCpf(rs.getString("cpf"));
                tec.setRg(rs.getString("rg"));
                tec.setUsuario(rs.getString("usuario"));
                tec.setSenha(rs.getString("senha"));

            } else {
                JOptionPane.showMessageDialog(null, "Tecnico inexistente!");
            }
            p.close();

        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.", erro);
        }

    }

    public void buscarnome(Tecnico tec) {

        try {

            PreparedStatement p = con.prepareStatement("select * from tecnico where nome= '" + tec.getNome() + "';");

            rs = p.executeQuery();

            if (rs.first()) {
                tec.setIdtecnico(rs.getInt("idtecnico"));
                tec.setNome(rs.getString("nome"));
                tec.setCpf(rs.getString("cpf"));
                tec.setRg(rs.getString("rg"));
                tec.setUsuario(rs.getString("usuario"));
                tec.setSenha(rs.getString("senha"));
            } else {
                JOptionPane.showMessageDialog(null, "Tecnico inexistente!");
            }
            p.close();

        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.", erro);
        }

    }

    public void login(Tecnico tec) {
        try {
            PreparedStatement p = con.prepareStatement("select * from tecnico where usuario='" + tec.getUsuario() + "' and senha='" + tec.getSenha() + "';");
            rs = p.executeQuery();

            if (rs.first()) {
                status = 1;
                /*    Frmprincipal princ = new Frmprincipal();
            princ.setVisible(true);*/
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha Invalido.");
            }
            p.close();
        } catch (SQLException erro) {
            throw new RuntimeException("Erro na conexão.", erro);
        }
    }

    public List<Tecnico> listatec() {
        try {
            List<Tecnico> tecnicos = new ArrayList<Tecnico>();
            PreparedStatement p = con.prepareStatement("select * from tecnico");
            rs = p.executeQuery();

            while (rs.next()) {
                Tecnico tec = new Tecnico();
                tec.setIdtecnico(rs.getInt("idtecnico"));
                tec.setNome(rs.getString("nome"));
                tec.setCpf(rs.getString("cpf"));
                tec.setRg(rs.getString("rg"));
                tec.setUsuario(rs.getString("usuario"));
                tec.setSenha(rs.getString("senha"));
                tecnicos.add(tec);
            }
            return tecnicos;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

}
