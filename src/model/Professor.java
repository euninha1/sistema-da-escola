package model;

import javax.swing.JOptionPane;

public class Professor extends Funcionario {
	private String formacao, disciplinas; 
	private int nivel; 
	private double salario; 
	private FolhaPagamento fpm; 
	
	public void valorSalario() { 
		this.nivel = Integer.parseInt(JOptionPane.showInputDialog("Nível: "));
		if(this.nivel == 1) { 
			this.salario = 4530.00; 
		}else if(this.nivel == 2) { 
			this.salario = 5325.50;
		}else if(this.nivel == 3) { 
			this.salario = 8568.43;
		}
		fpm = new FolhaPagamento(this.salario);
	}
	
	@Override
	public void cadastrar() { 
		super.cadastrar(); 
		this.disciplinas = JOptionPane.showInputDialog("Disciplinas que o Professor ministra: "); 
		this.formacao = JOptionPane.showInputDialog("Formação do Professor: "); 
	}

	
	public String exibir() { 
		String menssagem = "Exibindo as informações do Professor \n" + toString() + "\n  " + super.exibir();
		return menssagem;
	}
	public void exibirTela() { 
		JOptionPane.showMessageDialog(null, exibir()); 
		String folhaPagamento = "Folha de Pagamento do Professor \n Salario: " + this.salario; 
		folhaPagamento = folhaPagamento + "\nINSS:  R$" + fpm.getInss();
		folhaPagamento = folhaPagamento + "\nINSS:  R$" + fpm.getIrrf();
		folhaPagamento = folhaPagamento + "\nPlano de Saúde: R$125.00";
		folhaPagamento = folhaPagamento + "\nSalario Liquido: R$" + (fpm.getSalarioLiquido() - 125.00);
		JOptionPane.showMessageDialog(null, folhaPagamento);
	}

	@Override
	public String toString() {
		return "Professor [formacao=" + formacao + 
				", disciplinas=" + disciplinas + "]";
	}
	

}