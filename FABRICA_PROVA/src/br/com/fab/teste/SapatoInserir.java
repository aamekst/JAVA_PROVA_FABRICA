package br.com.fab.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.fab.DAO.SapatoDAO;
import br.com.fab.beans.Sapato;
import br.com.fab.conexao.Conexao;
import br.com.fab.conexao.ConexaoDAO;


public class SapatoInserir {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Connection con = ConexaoDAO.abrirConexao();
		
		Sapato sapato = new Sapato ();
		SapatoDAO sapatoDao = new SapatoDAO(con);
		
		sapato.setTipo(JOptionPane.showInputDialog("Digite o tipo do sapato:" ));
		sapato.setTamanho(Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho:" )));
		sapato.setPrecoFabricacao(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço" )));
		sapato.setTamanhoSalto(Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do salto:" )));
		sapato.setCor(JOptionPane.showInputDialog("Digite a cor:" ));
		
		System.out.println(sapatoDao.inserirSapato(sapato));
		
		System.out.println(sapato.mostrarAtributos());
		Conexao.fecharConexao(con);
	}

}
