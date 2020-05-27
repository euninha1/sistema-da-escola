package model;

import java.util.List;

import javax.swing.JOptionPane;

public class Matricula {
	private Curso curso; 
	private List<Aluno> alunos; 
	private int id, diaMatricula, mesMatricula; 
	private double nota; 

	public void matricularAluno(List<Aluno> a, Curso c, int dia, int mes) {
		this.alunos = a;
		this.diaMatricula = dia; 
		this.mesMatricula = mes; 
		this.curso = c; 
	}
	public void exibirMatricula() { 
		String menssagem = "Matricula \n"; 
		menssagem = menssagem + "Data: " + this.diaMatricula + "/" + this.diaMatricula; 
		JOptionPane.showMessageDialog(null, menssagem);
		for(Aluno a: alunos) { 
			JOptionPane.showMessageDialog(null, a.toString());
		}
	}

}
