package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso de programação Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JS");
		curso2.setDescricao("Curso de programação JavaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Java");
		mentoria.setDescricao("Mentoria Java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp sobre Java POO");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev developer1 = new Dev();
		developer1.setNome("Gilnario");
		developer1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos " + developer1.getConteudosInscritos());
		developer1.progredir();
		System.out.println("Conteúdos inscritos " + developer1.getConteudosInscritos());
		System.out.println("Conteúdos concluídos " + developer1.getConteudosConcluidos());
		System.out.println("XP " + developer1.calcularTotalXp());
		System.out.println("-------");
		
		Dev developer2 = new Dev();
		developer2.setNome("Camila");
		developer2.inscreverBootcamp(bootcamp);
		developer2.progredir();
		System.out.println("Conteúdos inscritos " + developer2.getConteudosInscritos());
		developer2.progredir();
		System.out.println("Conteúdos inscritos " + developer2.getConteudosInscritos());
		System.out.println("Conteúdos concluídos " + developer2.getConteudosConcluidos());
		System.out.println("XP " + developer2.calcularTotalXp());
	}
}
