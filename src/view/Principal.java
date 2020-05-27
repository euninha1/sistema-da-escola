package view;


import java.util.ArrayList;
import java.util.List;


import model.*;

public class Principal {

	public static void main(String[] args) {
		Aluno a = new Aluno(); 
		Funcionario f = new Funcionario ();
		//f.cadastrar(); 
		//f.exibirTela();
		//f = new Professor(); 
		//f.cadastrar();
		//f.exibirTela();
		//f = new Coordernador(); 
		//f.cadastrar(); 
		//f.exibirTela(); 
		Curso c = new Curso(); 
		c.cadastrarCurso();
		c.calcularMinAlunos();
		a.cadastrar();
		Aluno a2 = new Aluno(); 
		List<Aluno> alunos = new ArrayList<Aluno>(); 
		alunos.add(a);
		alunos.add(a2);
		Matricula m = new Matricula(); 
		m.matricularAluno(alunos, c, 13, 05);
		m.exibirMatricula();
	}

}
