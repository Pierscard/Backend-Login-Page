package com.example.PROVAESAME.Dto;

public class UtenteDTO {
	
	int id;
	String codiceFiscale;
	String nome;
	String numeroDiTelefono;
	String username;
	String password;
	String ruolo;
	
	public UtenteDTO(int id, String codiceFiscale, String nome, String numeroDiTelefono, String username,
			String password, String ruolo) {
		
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
