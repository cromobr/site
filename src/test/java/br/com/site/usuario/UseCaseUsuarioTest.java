package br.com.site.usuario;

import org.junit.Assert;
import org.junit.Test;


public class UseCaseUsuarioTest {

    @Test
    public void validaUsuarioSenhaSucessoTest(){
        Usuario usuario = new Usuario("user", "123");

        Boolean retorno = UseCaseUsuario.validaUsuarioSenha(usuario);

        Assert.assertEquals(true, retorno);
    }

    @Test
    public void validaUsuarioSenhaFalhaTest(){
        Usuario usuario = new Usuario("user", "");

        Boolean retorno = UseCaseUsuario.validaUsuarioSenha(usuario);

        Assert.assertEquals(false, retorno);
    }
}
