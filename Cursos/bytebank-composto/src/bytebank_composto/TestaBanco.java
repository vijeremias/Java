package bytebank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		
		paulo.nome = "Paulo da silva";
		paulo.cpf= "123.456.789-10";
		paulo.profissao = "Porgramador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(1000);
		System.out.println(contaDoPaulo.pegaSaldo());
		
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular.cpf);
		System.out.println(contaDoPaulo.titular.profissao);
	}

}
