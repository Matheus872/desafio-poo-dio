import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Desafio POO");
        curso.setDescricao("Descrição do curso");
        curso.setCargaHoraria(10);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da Mentoria");
        mentoria.setCargaHoraria(2);
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("JOAO");
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        System.out.println(dev.getConteudosInscritos());
        System.out.println(dev.getConteudosConcluidos());

        Dev dev2 = new Dev();
        dev2.setNome("MARIA");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println(dev2.getConteudosInscritos());



    }

}
