import br.com.dio.desafio.domain.Conteudo;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Desafio POO");
        curso.setDescricao("Descrição do curso");
        curso.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso.setTitulo("Curso Js");
        curso.setDescricao("Descrição do curso");
        curso.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da Mentoria");
        mentoria.setCargaHoraria(2);
        mentoria.setData(LocalDate.now());


        System.out.println(curso);

    }

}
