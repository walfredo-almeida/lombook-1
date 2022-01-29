import com.walf.model.Empregado;



public class Inicial {

	public static void main(String[] args) {
		Empregado empre1 = new Empregado("aleff","pereira",17);
		
		Empregado empre = new Empregado();
		empre.setNome("walfdredo");
		empre.setIdade(17);
		empre.setSobrenome("almeida");
		
		System.out.println(empre.toString());
		System.out.println("com construtor - "+empre1.toString());
		
		
	

	}

}
