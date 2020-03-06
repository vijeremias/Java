package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 99;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo +=100;
		System.out.println(segundaConta.saldo);
		System.out.println("Primeira conta: "+ primeiraConta.saldo);

	}

}
