import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("JS");
        curso1.setDescricao("JavaScript");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java");
        curso2.setDescricao("Java17");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Criar um negócio");
        mentoria.setDescricao("Como criar seu primeiro negocio escalavel");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de programacao e negocios");
        bootcamp.setDescricao("sobre negocios na area da programacao e treinamentos");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Luis");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("O dev " + dev1.getNome() + " esta inscrito nos conteudos " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + dev1.getConteudosConcluidos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("O dev " + dev1.getNome() + " esta inscrito nos conteudos " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + dev1.getConteudosConcluidos());
        System.out.println("---------------------");
        Dev dev2 = new Dev();
        dev2.setNome("Felipe");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("O dev " + dev2.getNome() + " esta inscrito nos conteudos " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + dev2.getConteudosConcluidos());
        dev2.progredir();
        System.out.println("O dev " + dev2.getNome() + " esta inscrito nos conteudos " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + dev2.getConteudosConcluidos());
        System.out.println("Xp: " + dev1.calcularTotalXp());
        System.out.println("Xp: " + dev2.calcularTotalXp());
    }
}