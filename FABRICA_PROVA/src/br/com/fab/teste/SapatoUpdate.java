package br.com.fab.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.fab.DAO.SapatoDAO;
import br.com.fab.beans.Sapato;
import br.com.fab.conexao.Conexao;
import br.com.fab.conexao.ConexaoDAO;


public class SapatoUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

			Connection con = ConexaoDAO.abrirConexao();
			
			Sapato sapato = new Sapato ();
			SapatoDAO sapatoDao = new SapatoDAO(con);
			
			sapato.setTamanho(Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho correto:" )));
			sapato.setCor(JOptionPane.showInputDialog("Digite a cor correta:" ));


			System.out.println(sapatoDao.updateSapatoWhere(sapato));
			
			Conexao.fecharConexao(con);
	}

}
