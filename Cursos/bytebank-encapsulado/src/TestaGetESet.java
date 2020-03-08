
public class TestaGetESet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cria objeto conta
		Conta c = new Conta();
		c.deposita(100);
		System.out.println(c.getSaldo());
		
		// Seta uma agência
		c.setAgencia(1377);
		System.out.println(c.getAgencia());
		
		
		// Cria objeto Cliente 
		Cliente vinicius = new Cliente();
		
		// Seta um nome pra conta
		vinicius.setNome("Vinicius");
		System.out.println(vinicius);
		
		
		c.setTitular(vinicius);
		System.out.println(c.getTitular().getNome());
		
		//Altera o nome para outro com método set
		c.getTitular().setNome("Zé da silva");
		System.out.println(c.getTitular().getNome());

	}

}
