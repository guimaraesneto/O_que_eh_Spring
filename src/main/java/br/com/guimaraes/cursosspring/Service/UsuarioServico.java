package br.com.guimaraes.cursosspring.Service;

import br.com.guimaraes.cursosspring.domain.Mailer;
import br.com.guimaraes.cursosspring.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServico {
    private Usuario usuario;

    @Autowired
    private Mailer mailer;

    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public void lembrarSenhaPorEmail(){
        //O banco de dados poderar ser acessado por aqui para recuperar a senha
        mailer.setDestinatario(usuario.getEmail());
        mailer.setMensagem("A senha do úsuario "+usuario.getLogin() +" é xxx");
        mailer.enviarEmail();
    }
}
