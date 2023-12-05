
public class Main {

	public static void main(String[] args) {
		
		TelefonoPublico telefonoPublico = new TelefonoPublico();
		TelefonoPrivado telefonoPrivado = new TelefonoPrivado();
		
		telefonoPrivado.setNumeroTelefono("22");
		telefonoPublico.setNumeroTelefono("5555555");	
		System.out.println(telefonoPrivado);
		System.out.println(telefonoPublico);
		
		if(telefonoPublico instanceof TelefonoPublico) {
			TelefonoPublico telefonoPublico2 = (TelefonoPublico)telefonoPublico;
		}
		
		TelefonoCelular tc = new TelefonoCelular();
		System.out.println(tc.toString());
		tc.recibirLlamada();
		telefonoPublico.recibirLlamada();
		telefonoPrivado.recibirLlamada();
		
	}

}
