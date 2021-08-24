package controller;

public class ThreadCalc extends Thread{
	
	private int a,b,op;
	public ThreadCalc(int a,int b,int op) {
		super();
		this.a = a;
		this.b = b;
		this.op = op;
	}
	
	@Override
	public void run() {
		calc();
	}
	
	private void calc() {
		int resultado = 0;
		String operacao = "";
		switch (op) {
		case 0:
			resultado = a + b;
			operacao = "+";
			break;
		case 1:
			resultado = a - b;
			operacao = "-";
			break;
		case 2:
			resultado = a * b;
			operacao = "*";
			break;
		case 3:
			resultado = a / b;
			operacao = "/";
			break;
		}
		System.out.println("TID #"+getId() + " ==> " + a + " " + operacao + " " + b + " = " + resultado);
	}
}
