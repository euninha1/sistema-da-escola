package model;

import javax.swing.JOptionPane;

public class Pessoa {
	private String nome, rg, cpf, anoNasc, mesNasc, sexo; 
	private Endereco endereco; 
	
	public Pessoa () { 
		endereco = new Endereco(); 
	}
	public void cadastrar() { 
		this.nome = JOptionPane.showInputDialog("Nome: ");
		this.rg = JOptionPane.showInputDialog("RG: ");
		this.cpf = JOptionPane.showInputDialog("CPF: ");
		this.anoNasc = JOptionPane.showInputDialog("Ano de Nascimento: ");
		this.mesNasc = JOptionPane.showInputDialog("Mês de Nascimento: ");
		this.sexo = JOptionPane.showInputDialog("Sexo: ");
		endereco.cadastrarEndereco();
	
	}
	public String exibir() { 
		String menssagem = endereco.exibirEndereco(); 
		menssagem = menssagem + toString();
		return menssagem; 
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + 
				", rg=" + rg + 
				", cpf=" + cpf + 
				", anoNasc=" + anoNasc + 
				", mesNasc=" + mesNasc
				+ ", sexo=" + sexo + "," ; 
	}
	
	public void exibirTela() { 
		JOptionPane.showMessageDialog(null, exibir()); 
	}
}
