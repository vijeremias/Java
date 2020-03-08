package bytebank_composto;

public class Conta {

	// Atribuido privado para encapsular o método
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo > valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
			
		}
	}
	// Criado o get do saldo pra torna-lo privado.
	public double pegaSaldo() {
		return this.saldo;
	}
}
