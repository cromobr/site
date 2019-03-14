package br.com.site.controller;


import br.com.site.usuario.UseCaseUsuario;
import br.com.site.usuario.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {
 
	/***
	 * ESSE MÉTODO CARREGA A PÁGINA(index.html) DE LOGIN DA NOSSA APLICAÇÃO
	 * @return
	 */
	@RequestMapping(value="/", method= RequestMethod.GET)	
	public String index(){	
 
	    return "login";
	}
	
	/***
	 * ESSE MÉTODO CARREGA A PÁGINA(index.html) DE LOGIN DA NOSSA APLICAÇÃO
	 * @return
	 */
	@RequestMapping(value="/Login", method= RequestMethod.GET)	
	public String login(){


 
	    return "login";
	}

	/***
	 * ESSE MÉTODO CARREGA A PÁGINA(index.html) DE LOGIN DA NOSSA APLICAÇÃO
	 * @return
	 */
	@RequestMapping(value="/Acesso", method= RequestMethod.POST)
	public String acesso(HttpServletRequest req){

		if( req.getParameter("txtLogin") != null && req.getParameter("txtPassword") != null) {
			String login = req.getParameter("txtLogin");
			String password = req.getParameter("txtPassword");

			if (UseCaseUsuario.validaUsuarioSenha(new Usuario(login, password)))
				return "principal";

		}
		return "erro";


	}
 
}