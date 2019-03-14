package br.com.site.usuario;

public class UseCaseUsuario {

    public static boolean validaUsuarioSenha(Usuario usuario){

        if(usuario.getUsuario().equals("user") & usuario.getSenha().equals("123"))
            return  true;
        return false;
    }
}
