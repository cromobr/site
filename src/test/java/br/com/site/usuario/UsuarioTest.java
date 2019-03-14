package br.com.site.usuario;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {

    @Test
    public void usuarioTest(){
        Usuario usuario = new Usuario("user","123");

        Assert.assertEquals("user",usuario.getUsuario());
        Assert.assertEquals("123",usuario.getSenha());


    }

    @Test
    public  void usuarioSetTest(){
        Usuario usuario = new Usuario("", "");

        usuario.setSenha("123");
        usuario.setUsuario("user");

        Assert.assertEquals("user",usuario.getUsuario());
        Assert.assertEquals("123",usuario.getSenha());
    }
}
