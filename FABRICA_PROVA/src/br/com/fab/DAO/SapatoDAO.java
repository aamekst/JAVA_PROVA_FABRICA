package br.com.fab.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fab.beans.Sapato;

public class SapatoDAO {
	
	private Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public SapatoDAO(Connection con){
		setCon(con);
	}
	
	
	//metodo inserir aluno
	public String inserirSapato(Sapato sapato)
	{
		String sql = "insert into sapato(tipo, tamanho, precoFabricacao, tamanhoSalto, cor) values (?,?,?,?,?)";
		
		try {
			
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, sapato.getTipo());
			ps.setInt(2, sapato.getTamanho());
			ps.setDouble(3, sapato.getPrecoFabricacao());
			ps.setDouble(4, sapato.getTamanhoSalto());
			ps.setString(5, sapato.getCor());
			if(ps.executeUpdate()>0) {
				return "Inserido com sucesso!";
			}else {
				return "Erro ao inserir";
			}
			
			
		}catch (SQLException e)
		{
			return e.getMessage();
		}
		
	}
	
	//metodo deletar sem where
	public String deleteSapato()
	{
		String sql = "delete from sapato";
		
		try {
			
			PreparedStatement ps = getCon().prepareStatement(sql);
	
			if(ps.executeUpdate()>0) {
				return "Deletado com sucesso!";
			}else {
				return "Erro ao deletar";
			}
			
		}catch (SQLException e)
		{
			return e.getMessage();
		}
		
	}
	
	//metodo update com where
	public String updateSapatoWhere(Sapato sapato)
	{
		String sql = "update sapato set tamanho=(?) where cor =(?)";
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, sapato.getTamanho());
			ps.setString(2, sapato.getCor());
			if(ps.executeUpdate()>0) {
				return "Alterado com sucesso!";
			}else {
				return "Erro ao alterar";
			}
			
		}catch (SQLException e)
		{
			return e.getMessage();
		}
		
	}
	
	//select com array - meotodo selecionar aluno

	public ArrayList<Sapato>  retornarInfo(){//nome do metodo
		
		String sql = "Select * from sapato";
		ArrayList<Sapato> retornarSapato = new ArrayList<Sapato>();//objeto "retornanotebook"
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					Sapato sapato = new Sapato();
					sapato.setTipo(rs.getString(1));
					sapato.setTamanho(rs.getInt(2));
					sapato.setPrecoFabricacao(rs.getDouble(3));
					sapato.setTamanhoSalto(rs.getDouble(4));
					sapato.setCor(rs.getString(5));
					retornarSapato.add(sapato);
				}
				return retornarSapato;
				
			}else{
				return null;
			}
			
		}catch(SQLException e) {
			return null;
		}
		
	}
	
	
	
}
