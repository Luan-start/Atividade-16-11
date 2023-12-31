package com.example.demo.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_compromisso")
public class Compromisso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 50, nullable = false)
	private String local;
	@Column(length = 12, nullable = false)
	private String contato;
	@Column(length = 100, nullable = false)
	private String data;
	@Column(length = 100, nullable = false)
	private String hora;
	@Column(length = 100, nullable = false)
	private String status;
	@Column(length = 100, nullable = false)
	private String idcontato;
	public int getId() {
		return id;
	}
	public Compromisso() {
	}
	public Compromisso(int id, String local, String contato, String data, String hora, String status,
			String idcontato) {
		super();
		this.id = id;
		this.local = local;
		this.contato = contato;
		this.data = data;
		this.hora = hora;
		this.status = status;
		this.idcontato = idcontato;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIdcontato() {
		return idcontato;
	}
	public void setIdcontato(String idcontato) {
		this.idcontato = idcontato;
	}
	public Object getLocalcomp() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setLocalcomp(Object localcomp2) {
		// TODO Auto-generated method stub
		
	}
	
}