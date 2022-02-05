
public class Animal {

	// Atributos
	private int idAnimal;
	private String nombreAnimal;
	private int fechaIngreso;
	private boolean saludAnimal;
	
	// Constructor
	public Animal() {
		
	}

	public Animal(int idAnimal, String nombreAnimal, int fechaIngreso, boolean saludAnimal) {
		this.idAnimal = idAnimal;
		this.nombreAnimal = nombreAnimal;
		this.fechaIngreso = fechaIngreso;
		this.saludAnimal = saludAnimal;
	}
	
	// Métodos accesodores (get/ set)
	public int getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNombreAnimal() {
		return nombreAnimal;
	}

	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}

	public int getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(int fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public boolean isSaludAnimal() {
		return saludAnimal;
	}

	public void setSaludAnimal(boolean saludAnimal) {
		this.saludAnimal = saludAnimal;
	}
	
	// Otros métodos
    public int retornarIngreso(){
        return 2021 - this.fechaIngreso;
    }

	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", nombreAnimal=" + nombreAnimal + ", fechaIngreso=" + fechaIngreso
				+ ", saludAnimal=" + saludAnimal + "]";
	}

	

}
