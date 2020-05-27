package model;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
	private FolhaPagamento fpm; 
	private int matricula, nivel; 
	private String setor, cargo; 
	private double salario; 
	
	public Funcionario () { 
		super(); 
	}
	public void valorSalario() { 
		this.nivel = Integer.parseInt(JOptionPane.showInputDialog("Nível: "));
		if(this.nivel == 1) { 
			this.salario = 1520.25; 
		}else if(this.nivel == 2) { 
			this.salario = 2362.67;
		}else if(this.nivel == 3) { 
			this.salario = 2988.92; 	
		}else if(this.nivel == 4) { 
			this.salario = 3572.77;
		}else if(this.nivel == 5) { 
			this.salario = 4878.67;
		}
		fpm = new FolhaPagamento(this.salario); 
	
	}
	public void cadastrar() { 
		JOptionPane.showMessageDialog(null, "CADASTRO DE FUNCIONÁRIO");
		super.cadastrar(); 
		this.matricula = Integer.parseInt(JOptionPane.showInputDialog("Matricula: "));
		valorSalario(); 
		this.setor = JOptionPane.showInputDialog("Setor: "); 
		this.cargo = JOptionPane.showInputDialog("Cargo: "); 
	}
	
	public String exibir() { 
		String menssagem = "Exibindo as informações do funcionário \n" + toString() + "\n  " + super.exibir();
		return menssagem;
	}
	
	public void exibirTela() { 
		JOptionPane.showMessageDialog(null, exibir()); 
		String folhaPagamento = "Folha de Pagamento do Funcionario \n Salario: " + this.salario; 
		folhaPagamento = folhaPagamento + "\nINSS:  R$" + fpm.getInss();
		folhaPagamento = folhaPagamento + "\nINSS:  R$" + fpm.getIrrf();
		folhaPagamento = folhaPagamento + "\nPlano de Saúde: R$125.00";
		folhaPagamento = folhaPagamento + "\nSalario Liquido: R$" + (fpm.getSalarioLiquido() - 125.00);
		JOptionPane.showMessageDialog(null, folhaPagamento);
	}
	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", nivel=" + nivel + ", setor=" + setor + ", cargo=" + cargo
				+ ", salario=" + salario + "]";
	}
}
