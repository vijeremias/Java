package bytebank_composto;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciado nova conta
		Conta contaDaMarcela = new Conta();
		//impressao de conta vazia, mostra apenas end de memoria
		System.out.println(contaDaMarcela);
		
		//System.out.println(contaDaMarcela.saldo);
		
		// instancia a classe Conta fazendo a ligação com a classe cliente.
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.titular.nome = "Marcela";
		contaDaMarcela.titular.cpf = "123.123.123-12";
		System.out.println(contaDaMarcela.titular.nome);
		System.out.println(contaDaMarcela.titular.cpf);

	}

}
