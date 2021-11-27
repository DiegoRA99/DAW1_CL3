package org.cibertec.ciberpet.controller;

import java.util.List;

import org.cibertec.ciberpet.model.Citas;
import org.cibertec.ciberpet.model.Tipo;
import org.cibertec.ciberpet.repository.ICitasRepositorio;
import org.cibertec.ciberpet.repository.ITipoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class CitasController {

	//TIPOS----------------------------------------------
		@Autowired
		private ITipoRepositorio tipos;
		
		//MASCOTA----------------------------------------------
		@Autowired
		private ICitasRepositorio citas;
		
		
		@GetMapping("/agregarCita")
		public String registroCita ( Model model) {
			model.addAttribute("citas", new Citas());
			List<Tipo> listaTipos = tipos.findAll();
			model.addAttribute("tipos",listaTipos);
			return "Registro-Ricalde";
		}
		
		@PostMapping("/addCita")
		public String agregarCita(@ModelAttribute Citas cita,RedirectAttributes redirectAttributes ) {		
			try {
				citas.save(cita);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				redirectAttributes.addFlashAttribute("message", "No se pudo registrar");
			    redirectAttributes.addFlashAttribute("alertClass", "alert-danger");
			    return "redirect:/agregarCita";
			}
			redirectAttributes.addFlashAttribute("message", "Registrado con exito");
		    redirectAttributes.addFlashAttribute("alertClass", "alert-success");
			return "redirect:/agregarCita";
		}
}
