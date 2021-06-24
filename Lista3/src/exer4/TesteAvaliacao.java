package exer4;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;



public class TesteAvaliacao {

	public static void main(String[] args) {
		
		
		//List<Pessoa> listPessoas2 = Arrays.asList(new Pessoa("Marcus", 29),
		List<Avaliacao> alu = Arrays.asList(new Avaliacao("Mat", "Santos", 5), new Avaliacao("Port", "Marcus", 6.2), new Avaliacao("Fis", "Vinicius", 9));
		
		
		alu.sort(Comparator.comparing(Avaliacao::getAluno));
		
		alu.forEach(n -> {
			if (getNota(n) >  6)
			{
				System.out.println("Nome: " + n.getAluno() + "\nNota: " + n.getNota());
			}
			else {
				System.out.println("Aluno: " + n.getAluno() + " não aprovado " + n.getNota());
			}});
			
		
		

	}
	
	/*
	 public static void avaliaExpressao(List<Integer> list, Predicate<Integer> predicate) {
		list.forEach(n -> {
		if (predicate.test(n)) {
		System.out.println(n + " ");
		}
		});
		}
	   */

	

	private static double getNota(Avaliacao n) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void aprovado(List<Avaliacao> alu, Predicate<Integer> predicate)
	{
		
		
	}
	
	public static void avaliaExpressao(List<Avaliacao> alu, Predicate<Integer> predicate) {
		alu.forEach(n -> {
			if (predicate.test(n)) {
				System.out.println(n + " ");
			}
		});
	}
}
