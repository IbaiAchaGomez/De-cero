package com.curso.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController extends HttpServlet {
	
	@RequestMapping("/") 
	public String saludar(Model model) {
		model.addAttribute("saludo", "Bienvenido a nuestra tienda online!");
		model.addAttribute("linea1", "Los mejores productos ");
		return "inicio";
	}

}
