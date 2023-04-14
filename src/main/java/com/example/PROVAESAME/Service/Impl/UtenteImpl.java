package com.example.PROVAESAME.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PROVAESAME.Dto.UtenteDTO;
import com.example.PROVAESAME.Entity.Utente;
import com.example.PROVAESAME.Repository.UtenteRepository;
import com.example.PROVAESAME.Service.UtenteService;

@Service
public class UtenteImpl implements UtenteService {

	@Autowired
	UtenteRepository utenteRepository;

	@Override
	public String addUtente(UtenteDTO utenteDTO) {

		Utente utente = new Utente(

				utenteDTO.getId(), utenteDTO.getCodiceFiscale(), utenteDTO.getNome(), utenteDTO.getNumeroDiTelefono(),
				utenteDTO.getUsername(), utenteDTO.getPassword(), utenteDTO.getRuolo());

		utenteRepository.save(utente);

		return utente.getUsername();

	}

}
