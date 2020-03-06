package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta  = new Conta();
		conta.saldo = 2000;
		conta.deposita(200);
		System.out.println(conta.saldo);
		// conta.saca(1);
		boolean conseguiuRetirar = conta.saca(100);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta outraConta = new Conta();
		outraConta.saldo = 1000;
		System.out.println(outraConta.saldo);
		
		
		boolean sucessoTransferencia = outraConta.transfere(100, conta);
		if(sucessoTransferencia) {
			System.out.println("Transferencia com sucesso");
		}else {
			System.out.println("Faltou dinheiro pobre");
		}
		
		System.out.println(outraConta.saldo);
		System.out.println(conta.saldo);
		

	}

}
