package br.com.site.controller;

import br.com.site.usuario.Usuario;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Parameter;


public class MainControllerTest {

    @Test
    public void acessoInputNullTest(){

        MainController ws = new MainController();

        HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);

        String retorno = ws.acesso(mockedRequest);

        Assert.assertEquals("erro",retorno);

    }

    @Test
    public void acessoSucessoTest(){

        MainController ws = new MainController();

        HttpServletRequest  mockedRequest = Mockito.mock(HttpServletRequest.class);

//        mockedRequest.setAttribute("user","txtLogin");
//        mockedRequest.setAttribute("123","txtPassword");

        Object txtLogin =  new Object();
        Object txtPassword =  new Object();


        String retorno = ws.acesso(mockedRequest);


        Assert.assertEquals("principal",retorno);

    }
}
