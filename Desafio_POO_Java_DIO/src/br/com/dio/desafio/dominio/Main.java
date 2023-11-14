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
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Java");
		mentoria.setDescricao("Mentoria Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(mentoria);
	}
}
