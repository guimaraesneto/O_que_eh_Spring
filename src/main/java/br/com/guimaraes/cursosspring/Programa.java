package br.com.guimaraes.cursosspring;


import br.com.guimaraes.cursosspring.Service.UsuarioServico;
import br.com.guimaraes.cursosspring.domain.Usuario;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan("br.com.guimaraes.cursosspring")
public class Programa {
    public static void main(String[] args){
        Scanner lerDados = new Scanner(System.in);
        Usuario usuario = new Usuario(1,"Guimarães Neto","guimaraesneto@gmail.com","guimaraesneto","!23#21");
        System.out.println("Deseja recuperar a senha (S/N)?");
        String resposta = lerDados.nextLine();
        if(resposta.equalsIgnoreCase("S")){
            ApplicationContext context = new AnnotationConfigApplicationContext(Programa.class);
            UsuarioServico usuarioServico = context.getBean(UsuarioServico.class);

            usuarioServico.setUsuario(usuario);
            usuarioServico.lembrarSenhaPorEmail();
        }

    }
}
