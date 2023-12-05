
public class TelefonoCelular extends TelefonoPrivado{

	@Override
	public String toString() {
		return super.toString() + "TelefonoCelular";
	}
	
	@Override
	public void recibirLlamada() {
		System.out.println("Llamda entrante en mi celular");
	}
	
}
