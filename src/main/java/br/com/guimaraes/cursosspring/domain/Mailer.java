package br.com.guimaraes.cursosspring.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mailer {
    private String destinatario;

    @Value("guimaraesneto@gmail.com")
    private String remetente;

    @Value("Lembrete de senha de úsuario!")
    private String titulo;

    private String mensagem;

    public void setDestinatario(String destinatario) { this.destinatario = destinatario; }

    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    public void enviarEmail(){
        //Simula o envio de e-mail
        System.out.println("**** E-mail enviado com sucesso ****");
        System.out.println("Titulo do e-mail: "+titulo);
        System.out.println("Remetente: "+remetente);
        System.out.println("Destinatário: "+destinatario);
        System.out.println("Mensagem: "+mensagem);
    }
}
