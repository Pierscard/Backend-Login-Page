package com.example.PROVAESAME.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.PROVAESAME.Dto.UtenteDTO;
import com.example.PROVAESAME.Service.UtenteService;

@RestController
@CrossOrigin
@RequestMapping("api/utente")
public class UtenteController {

	@Autowired
	UtenteService utenteService;

	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addUtente(@RequestBody UtenteDTO utenteDTO) {
		String id = utenteService.addUtente(utenteDTO);
		return id;

	}

	/*
	 * @RequestMapping(value="/getAll", method=RequestMethod.GET) public
	 * List<Utente> findAll(){
	 * 
	 * }
	 */

}
