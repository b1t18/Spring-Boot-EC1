package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Cursos;

@Controller
public class CursosController {
	
	@GetMapping("/cursos")
	public String formularioCursos(Model model) {
		model.addAttribute("titulo", "Formulario de Cursos");
		return "cursos";
	}
	
	@PostMapping("/cursos")
	public String procesarCursos(Model model,
			@RequestParam  String codCurso,
			@RequestParam  String nomCurso,
			@RequestParam  String profCargo,
			@RequestParam int horasDictadas){
		
			Cursos cursos = new Cursos();
			cursos.setCodCurso(codCurso);
			cursos.setNomCurso(nomCurso);
			cursos.setProfCargo(profCargo);
			cursos.setHorasDictadas(horasDictadas);
		
		model.addAttribute("titulo","Resultado registro curso");
		model.addAttribute("cursos",cursos);
		
		
		return "resultadoCurso";	
	}
	

}
