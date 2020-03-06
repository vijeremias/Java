package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta  = new Conta();
		conta.saldo = 100;
		conta.deposita(100);
		System.out.println(conta.saldo);
		// conta.saca(1);
		boolean conseguiuRetirar = conta.saca(23);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);

	}

}
