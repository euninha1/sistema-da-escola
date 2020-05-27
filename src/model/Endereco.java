package model;

import javax.swing.JOptionPane;

public class Endereco {
	private String logradouro, numero, complemento, bairro, cep, cidade, uf;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	} 
	
	public void cadastrarEndereco() { 
		setLogradouro(JOptionPane.showInputDialog("Endereço: "));
		setNumero(JOptionPane.showInputDialog("Número: "));
		setComplemento(JOptionPane.showInputDialog("Complemento: "));
		setBairro(JOptionPane.showInputDialog("Bairro: "));
		setCep(JOptionPane.showInputDialog("CEP: "));
		setCidade(JOptionPane.showInputDialog("Cidade: "));
		setUf(JOptionPane.showInputDialog("Estado: "));	
	}
	public String exibirEndereco( ) { 
		return "Endereco [logradouro=" + logradouro + 
				", numero=" + numero + 
				", complemento=" + complemento
				+ ", bairro=" + bairro + 
				", cep=" + cep + ", cidade=" + cidade + 
				", uf=" + uf + "]";
	}

}
