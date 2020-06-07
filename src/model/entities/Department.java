package model.entities;

import java.io.Serializable;

public class Department implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private int id;
	private String nomeDepartment;
	public Department() {}
	public Department(int id, String nomeDepartment) {
		super();
		this.id = id;
		this.nomeDepartment = nomeDepartment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeDepartment() {
		return nomeDepartment;
	}
	public void setNomeDepartment(String nomeDepartment) {
		this.nomeDepartment = nomeDepartment;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", nomeDepartment=" + nomeDepartment + "]";
	}
	
}
