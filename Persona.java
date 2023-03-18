
public abstract class Persona {

	private String[] names = {"Nemo", "Gru", "Dory", "Blanca Nieves", "Aladdín", "Mike Wasaousky", "Sullyvan", "Pocoyó", "Ralph El Demoledor", "Manny a la obra"};
	private String name;
	private String atributo1;
	private String atributo2;
	private String atributo3;
	private String atributo4;
	
	public Persona() {
	}

	public void setNombre(String name) {
		this.name = name;
	}
	
	public String getNombre() {
		return name;
	}
	
	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}
	
	public String getAtributo1() {
		return atributo1;
	}
	
	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}
	
	public String getAtributo2() {
		return atributo2;
	}
	
	public void setAtributo3(String atributo3) {
		this.atributo3 = atributo3;
	}
	
	public String getAtributo3() {
		return atributo3;
	}
	
	public void setAtributo4(String atributo4) {
		this.atributo4 = atributo4;
	}
	
	public String getAtributo4() {
		return atributo4;
	}

}
