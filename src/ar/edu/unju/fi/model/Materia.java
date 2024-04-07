package ar.edu.unju.fi.model;

public class Materia {
	private String codigo;
	private String nombre;
	
	public Materia() { //para mapeo se requiere si o si 
		// TODO Auto-generated constructor stub
	}
	
	

	public Materia(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	

	@Override
	public String toString() {
		return "Codigo de la materia: " + codigo + ". Nombre materia: " + nombre + ".";
	}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
