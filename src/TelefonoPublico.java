
public class TelefonoPublico extends Telefono {
	
		
	public TelefonoPublico() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "TelefonoPublico ";
	}

}
