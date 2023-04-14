package com.example.PROVAESAME.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Utente")
public class Utente {

	@Id
	@Column(name = "UtenteId", length = 45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "codiceFiscale", length = 255)
	private String codiceFiscale;

	@Column(name = "nome", length = 255)
	private String nome;
	@Column(name = "numeroDiTelefono", length = 255)
	private String numeroDiTelefono;
	@Column(name = "username", length = 255)
	private String username;
	@Column(name = "password", length = 255)
	private String password;
	@Column(name = "ruolo", length = 255)
	private String ruolo;

	public Utente(int id, String codiceFiscale, String nome, String numeroDiTelefono, String username, String password,
			String ruolo) {
		super();
		this.id = id;
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.numeroDiTelefono = numeroDiTelefono;
		this.username = username;
		this.password = password;
		this.ruolo = ruolo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroDiTelefono() {
		return numeroDiTelefono;
	}

	public void setNumeroDiTelefono(String numeroDiTelefono) {
		this.numeroDiTelefono = numeroDiTelefono;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

}
