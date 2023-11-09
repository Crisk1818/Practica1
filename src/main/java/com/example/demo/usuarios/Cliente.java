package com.example.demo.usuarios;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="Clientes")
public class Cliente implements Serializable{

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true)
	private String Username;
	
	@Column(length=15)
	private String Password;
	private Boolean Estado;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private List<Roles> roles;
	
	
	private static final long serialVersionUID = 1L;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public Boolean getEstado() {
		return Estado;
	}


	public void setEstado(Boolean estado) {
		Estado = estado;
	}


	public List<Roles> getRoles() {
		return roles;
	}


	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	
}
