package model;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
	private int codigo; 
	private String interesse, celular, email; 
	
	
	public Aluno () { 
		super(); 
	}

	public void cadastrar() { 
		JOptionPane.showMessageDialog(null, "CADASTRAR ALUNO");
		super.cadastrar();
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Código: ")); 
		this.interesse = JOptionPane.showInputDialog("Interesse: ");
		this.celular = JOptionPane.showInputDialog("Celular: "); 
		this.email = JOptionPane.showInputDialog("Email: ");
	}
	public String exibir() { 
		String menssagem = "Exibindo as informações do aluno \n" + toString() + "\n  " + super.exibir();
		return menssagem;
	}
	
	public void exibirTela() { 
		JOptionPane.showMessageDialog(null, exibir()); 
	}
	
	
	
	@Override
	public String toString() {
		return "Aluno [codigo=" + codigo +
				", interesse=" + interesse + 
				", celular=" + celular + 
				", email=" + email
				+ "]";
	}
}
