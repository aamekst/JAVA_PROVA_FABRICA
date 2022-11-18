package br.com.fab.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.fab.DAO.SapatoDAO;
import br.com.fab.beans.Sapato;
import br.com.fab.conexao.Conexao;
import br.com.fab.conexao.ConexaoDAO;



public class SapatoSelecionar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Connection con = ConexaoDAO.abrirConexao();
		

		SapatoDAO sapatoDao = new SapatoDAO(con);
		
		//select
		
		ArrayList<Sapato> lista = sapatoDao.retornarInfo();
		if(lista != null) {
			for (Sapato s : lista) {

				System.out.println("TABELA SAPATO");
				System.out.println("Tipo: " + s.getTipo());
				System.out.println("Tamanho: " + s.getTamanho());
				System.out.println("Preço: " + s.getPrecoFabricacao());
				System.out.println("Tamanho do salto: " + s.getTamanhoSalto());
				System.out.println("Cor: " + s.getCor());
				System.out.println("\n");
					
			}
			
		}
	

		Conexao.fecharConexao(con);

	}

}
