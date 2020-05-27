package model;

import javax.swing.JOptionPane;

public class Curso {
	private String titulo, descricao; 
	private double valor; 
	
	public void cadastrarCurso() { 
		this.titulo = JOptionPane.showInputDialog("Nome do curso: ");
		this.descricao = JOptionPane.showInputDialog("Descreva o curso : ");
	}
	
	public void exibirCurso() { 
		String menssagem = "CADASTRAR CURSO"; 
		menssagem = menssagem + "\n Titulo: " + this.titulo; 
		menssagem = menssagem + "\n Descrição : " + this.descricao; 
		JOptionPane.showMessageDialog(null, menssagem); 
	
	}
	public void calcularMinAlunos() { 
		double qtdaluno = 8568.43/865.23; 
		JOptionPane.showMessageDialog(null, "Número minimo de alunos é de: " + qtdaluno);
	}
	
}
