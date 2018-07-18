package br.com.guimaraes.cursosspring;

import br.com.guimaraes.cursosspring.domain.Pessoa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Programa {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Programa.class);

        Pessoa pessoa = context.getBean(Pessoa.class);

        pessoa.setNome("Guimarães Neto");
        pessoa.setIdade(33);
        System.out.println(pessoa);
    }
}
