package br.com.fab.teste;

import java.sql.Connection;

import br.com.fab.DAO.SapatoDAO;
import br.com.fab.beans.Sapato;
import br.com.fab.conexao.Conexao;
import br.com.fab.conexao.ConexaoDAO;



public class SapatoDelete {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		  Connection con = ConexaoDAO.abrirConexao();
			
			Sapato sapato = new Sapato ();
			SapatoDAO sapatoDao = new SapatoDAO(con);
			
			System.out.println(sapatoDao.deleteSapato());
			
			Conexao.fecharConexao(con);
	}

}
