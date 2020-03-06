package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeirConta = new Conta();
		primeirConta.saldo = 200;
		System.out.println(primeirConta.saldo);
		
		primeirConta.saldo +=100;
		System.out.println(primeirConta.saldo);

	}

}
