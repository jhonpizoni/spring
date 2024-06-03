package com.poo.SpringAula.resource;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poo.SpringAula.model.Cidade;

@RestController
@RequestMapping("/exemplos")
public class Exemplos {

	@PostMapping
	public String cadastraCidade(@RequestBody Cidade cidade) {
		//métodos de cadastro
		return cidade.toString();
	}
	@GetMapping
	public String retornaOlaMundo() {
		return "Olá mundo";
	}
	
	@GetMapping("/{nome}")
	public String mensagemComNome(@PathVariable String nome) {
		return "Olá mundo " + nome;
	}
	
	@GetMapping("/soma")
	public double some(@RequestParam  double n1, @RequestParam double n2) {
		return n1+n2;
	}
	
	private int sortearNumero() {
		Random random = new Random
	}
}
