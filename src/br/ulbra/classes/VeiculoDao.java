package br.ulbra.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VeiculoDao {
Connection con;
    
    public VeiculoDao() throws SQLException{
        con = ConnectorSQL.getConnection();
    }
    
    // salvar veículo no banco de dados
    public void create(Veiculo v){
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tbveiculo (id,"
                    + "marca,modelo,ano,cor,placa,motor,km,valorfipe) VALUE "
                    + "(?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, v.getId());
            stmt.setString(2, v.getMarca());
            stmt.setString(3, v.getModelo());
            stmt.setInt(4, v.getAno());
            stmt.setString(5, v.getCor());
            stmt.setString(6, v.getPlaca());
            stmt.setString(7, v.getMotor());
            stmt.setInt(8, v.getKm());
            stmt.setDouble(9, v.getValorfipe());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Veículo "+v.getPlaca()
                    +" salvo com sucesso!");
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt);
        }
    }
     //listagem de veículos na tabela 
    
    public ArrayList<Veiculo> read(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbveiculo");
            rs = stmt.executeQuery();
            while(rs.next()){
                Veiculo veiculo = new Veiculo();
                veiculo.setId(rs.getInt("id"));
                veiculo.setMarca(rs.getString("marca"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setAno(rs.getInt("ano"));
                veiculo.setCor(rs.getString("cor"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setMotor(rs.getString("motor"));
                veiculo.setKm(rs.getInt("km"));
                veiculo.setValorfipe(rs.getDouble("valorfipe"));                
                veiculos.add(veiculo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Veiculo>) veiculos;
    }
    
    public ArrayList<Veiculo> readPesq(int id){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbveiculo WHERE id LIKE ?");
            stmt.setString(1, "%"+id+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
                Veiculo veiculo = new Veiculo();
                veiculo.setId(rs.getInt("id"));
                veiculo.setMarca(rs.getString("marca"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setAno(rs.getInt("ano"));
                veiculo.setCor(rs.getString("cor"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setMotor(rs.getString("motor"));
                veiculo.setKm(rs.getInt("km"));
                veiculo.setValorfipe(rs.getDouble("valorfipe"));
                veiculos.add(veiculo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Veiculo>) veiculos;
    }
    
    //ALTERAR O VEICULO NO BANCO DE DADOS 
    public void update(Veiculo v){
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE tbveiculo SET id = ?,"
                    + "marca = ?, modelo = ? ,ano = ? WHERE cor = ?"
                    + "placa = ?, motor = ? ,km = ? WHERE valorfipe = ?");
            stmt.setString(1, v.getMarca());
            stmt.setString(2, v.getModelo());
            stmt.setInt(3, v.getAno());
            stmt.setString(4, v.getCor());
            stmt.setInt   (5, v.getId());
            stmt.setString(6, v.getPlaca());
            stmt.setString(7, v.getMotor());
            stmt.setInt(8, v.getKm());
            stmt.setDouble(9, v.getValorfipe());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Veículo "+v.getPlaca()
                    +" modificado com sucesso!");
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt);
        }
    }
    //excluir do banco de dados 
    public void delete(Veiculo v){
            PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM tbveiculo WHERE id = ?");
           
            stmt.setInt   (1, v.getId());
            
            if (JOptionPane.showConfirmDialog(null,"Exclusão", "Tem certeza que"
                    + " deseja excluir o veículo "+v.getPlaca(),
                    JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Veículo "+v.getPlaca()
                    +" excluído com sucesso!!");
                stmt.executeUpdate();
            }else{
                JOptionPane.showMessageDialog(null, "A exclusão do veículo "+v.getPlaca()
                    +" cancelado com sucesso!");
            }
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
        } finally{
            ConnectorSQL.closeConnection(con, stmt);
        }
    }
   
}
