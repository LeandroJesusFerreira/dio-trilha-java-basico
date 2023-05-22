public class Usuario {
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		NavegadorInternet navegador = iphone;
		AparelhoTelefonico aparelhoTelefonico = iphone;
		ReprodutorMusical reprodutorMusical = iphone;
	
		
		navegador.exibirPagina();
		aparelhoTelefonico.ligar();
		reprodutorMusical.tocar();
	}
}
