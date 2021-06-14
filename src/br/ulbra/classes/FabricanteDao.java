package br.ulbra.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FabricanteDao {
    Connection con;
    
    public FabricanteDao() throws SQLException{
        con = ConnectorSQL.getConnection();
    }
    
    // salvar veículo no banco de dados
    public void create(Fabricante f){
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tbfabricante (id,"
                    + "marca,telefone,site,email) VALUE "
                    + "(?,?,?,?,?)");
            stmt.setInt(1, f.getId());
            stmt.setString(2, f.getMarca());
            stmt.setString(3, f.getTelefone());
            stmt.setString(4, f.getSite());
            stmt.setString(5, f.getEmail());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Fabricante "+f.getMarca()
                    +" salva com sucesso!");
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt);
        }
    }
     //listagem de veículos na tabela 
    
    public ArrayList<Fabricante> read(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Fabricante> fabricantes = new ArrayList<Fabricante>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbfabricante");
            rs = stmt.executeQuery();
            while(rs.next()){
                Fabricante fabricante = new Fabricante();
                fabricante.setId(rs.getInt("id"));
                fabricante.setMarca(rs.getString("marca"));
                fabricante.setTelefone(rs.getString("telefone"));
                fabricante.setSite(rs.getString("site"));
                fabricante.setEmail(rs.getString("email"));             
                fabricantes.add(fabricante);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Fabricante>) fabricantes;
    }
    
    public ArrayList<Fabricante> readPesq(int id){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Fabricante> fabricantes = new ArrayList<Fabricante>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbfabricante WHERE id LIKE ?");
            stmt.setString(1, "%"+id+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
                Fabricante fabricante = new Fabricante();
               fabricante.setId(rs.getInt("id"));
                fabricante.setMarca(rs.getString("marca"));
                fabricante.setTelefone(rs.getString("telefone"));
                fabricante.setSite(rs.getString("site"));
                fabricante.setEmail(rs.getString("email"));
                fabricantes.add(fabricante);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Fabricante>) fabricantes;
    }
    
    //ALTERAR O VEICULO NO BANCO DE DADOS 
    public void update(Fabricante f){
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE tbveiculo SET id = ?,"
                    + "marca = ?, telefone = ? ,site = ? WHERE email = ?");
            stmt.setString(1, f.getMarca());
            stmt.setString(2, f.getTelefone());
            stmt.setString(3, f.getSite());
            stmt.setString(4, f.getEmail());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Fabricante "+f.getMarca()
                    +" modificada com sucesso!");
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt);
        }
    }
    //excluir do banco de dados 
    public void delete(Fabricante f){
            PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM tbveiculo WHERE id = ?");
           
            stmt.setInt   (1, f.getId());
            
            if (JOptionPane.showConfirmDialog(null,"Exclusão", "Tem certeza que"
                    + " deseja excluir o veículo "+f.getMarca(),
                    JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Veículo "+f.getMarca()
                    +" excluído com sucesso!!");
                stmt.executeUpdate();
            }else{
                JOptionPane.showMessageDialog(null, "A exclusão do veículo "+f.getMarca()
                    +" cancelado com sucesso!");
            }
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt);
        }
    }
    
}
