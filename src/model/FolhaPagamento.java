package model;

public class FolhaPagamento {
	 private final double salarioBruto;
	    private double inss;
	    private double irrf;
	    private double salarioLiquido;

	    public FolhaPagamento(double salarioBruto) {
	        this.salarioBruto = salarioBruto;
	    }

	public double getInss(){
	        if(salarioBruto < 1830.29){
	            this.inss = salarioBruto * 0.08;
	        } else if(salarioBruto > 1830.30 && salarioBruto < 3050.52){
	            this.inss = salarioBruto * 0.09;
	        } else if(salarioBruto > 3050.53 && salarioBruto < 6101.06){
	            this.inss = salarioBruto * 0.11;
	        } else if (salarioBruto > 6101.06){
	            this.inss = 671.11;
	        }
	        return inss;
	    }

	    public double getIrrf() {
	        double salarioSInss = salarioBruto - getInss();
	        if(salarioSInss > 1903.98 && salarioSInss < 2826.66){
	            this.irrf = salarioSInss * 0.075;
	        } else if(salarioSInss > 2826.65 && salarioSInss < 3751.06) {
	            this.irrf = salarioSInss * 0.15;
	        } else if(salarioSInss > 3751.05 && salarioSInss < 4664.69){
	            this.irrf = salarioSInss * 0.225;
	        } else if(salarioSInss > 4664.68){
	            this.irrf = salarioSInss * 0.275;
	        }
	        return irrf;
	    }

	    public double getSalarioLiquido() {
	        this.salarioLiquido = salarioBruto - (getIrrf() + getInss());
	        return salarioLiquido;
	    }
}

