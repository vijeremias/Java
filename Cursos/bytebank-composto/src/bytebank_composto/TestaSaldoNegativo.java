package bytebank_composto;

public class TestaSaldoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancia uma nova classe e deposita o valor
		Conta c = new Conta();
		c.deposita(200);
		System.out.println(c.pegaSaldo());
		
		// Chama o m�todo saca e atribui um saque maior
		// guarda a express�o em uma vari�vel
		boolean temSaldo = c.saca(300);
		System.out.println(temSaldo);
		System.out.println(c.pegaSaldo());
	}

}
