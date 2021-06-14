package br.ulbra.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ModeloDao {
    Connection con;
    
    public ModeloDao() throws SQLException{
        con = ConnectorSQL.getConnection();
    }
    
    // salvar modelo no banco de dados
    public void create(Modelo m){
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tbmodelo (id,"
                    + "modelo,marca,ano) VALUE "
                    + "(?,?,?,?)");
            stmt.setInt(1, m.getId());
            stmt.setString(2, m.getModelo());
            stmt.setString(3, m.getMarca());
            stmt.setInt(4, m.getAno());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modelo "+m.getModelo()
                    +" salvo com sucesso!");
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt);
        }
    }
     //listagem de modelos na tabela 
    
    public ArrayList<Modelo> read(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Modelo> modelos = new ArrayList<Modelo>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbmodelo");
            rs = stmt.executeQuery();
            while(rs.next()){
                Modelo modelo = new Modelo();
                modelo.setId(rs.getInt("id"));
                modelo.setModelo(rs.getString("modelo"));
                modelo.setMarca(rs.getString("marca"));
                modelo.setAno(rs.getInt("ano"));            
                modelos.add(modelo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Modelo>) modelos;
    }
    
    public ArrayList<Modelo> readPesq(int id){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Modelo> modelos = new ArrayList<Modelo>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbmodelo WHERE id LIKE ?");
            stmt.setString(1, "%"+id+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
                Modelo modelo = new Modelo();
                modelo.setId(rs.getInt("id"));
                modelo.setModelo(rs.getString("modelo"));
                modelo.setMarca(rs.getString("marca"));
                modelo.setAno(rs.getInt("ano"));
                modelos.add(modelo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Modelo>) modelos;
    }
    
    //ALTERAR O MODELO NO BANCO DE DADOS 
    public void update(Modelo m){
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE tbmodelo SET modelo = ?,"
                    + "marca = ?, ano = ? WHERE id = ?");
            stmt.setString(1, m.getModelo());
            stmt.setString(2, m.getMarca());
            stmt.setInt(3, m.getAno());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modelo "+m.getId()
                    +" modificado com sucesso!");
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt);
        }
    }
    //excluir do banco de dados 
    public void delete(Modelo m){
            PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM tbmodelo WHERE id = ?");
           
            stmt.setInt   (1, m.getId());
            
            if (JOptionPane.showConfirmDialog(null,"Exclusão", "Tem certeza que"
                    + " deseja excluir o modelo "+m.getModelo(),
                    JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Modelo "+m.getModelo()
                    +" excluído com sucesso!!");
                stmt.executeUpdate();
            }else{
                JOptionPane.showMessageDialog(null, "A exclusão do modelo "+m.getModelo()
                    +" foi cancelado com sucesso!");
            }
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt);
        }
    }
   
}
