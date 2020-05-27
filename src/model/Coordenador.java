package model;

import javax.swing.JOptionPane;

public class Coordenador extends Funcionario {
	private String area; 
	private double plusSalario = 0.15; 
	private FolhaPagamento fpm; 
	private double salario; 
	private int nivel; 
	 
	public Coordenador () { 
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
		this.salario = this.plusSalario + (this.plusSalario * this.plusSalario);
		fpm = new FolhaPagamento(this.salario); 
	}

	public void exibirTela() { 
		JOptionPane.showMessageDialog(null, exibir()); 
		String folhaPagamento = "Folha de Pagamento do Coordenador \n Salario: " + this.salario; 
		folhaPagamento = folhaPagamento + "\nINSS:  R$" + fpm.getInss();
		folhaPagamento = folhaPagamento + "\nINSS:  R$" + fpm.getIrrf();
		folhaPagamento = folhaPagamento + "\nPlano de Saúde: R$125.00";
		folhaPagamento = folhaPagamento +"\nPlus de salário: 15%";
		folhaPagamento = folhaPagamento + "\nSalario Liquido: R$" + (fpm.getSalarioLiquido() - 125.00);
		JOptionPane.showMessageDialog(null, folhaPagamento);
	}

	@Override
	public String toString() {
		return "Coordenador [area=" + area + 
				", salario=" + salario + 
				", nivel=" + nivel + "]";
	}

	

}