package principal;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
	  
       Conta conta1 = new Conta(12345, "Samuel", 2000.0);
	   conta1.retirar(500.0);	
	   System.out.println("Saldo conta 1 : " + conta1.getSaldo());	
	   
	   Conta conta2 = new ContaPoupanca(55555, "Mikhaela", 3000.0, 0.01);
	   conta2.retirar(1000.0);
	   System.out.println("Saldo conta 2 : " + conta2.getSaldo());
	   
	   Conta conta3 = new ContaEmpresa(99999, "MTech", 30000.0, 9000.0);
	   conta3.retirar(7000.0);
	   System.out.println("Saldo conta 3 : " + conta3.getSaldo());
	   
	}

}
