package exer1;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;


public class exTeste {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		
		System.out.println("Todos os números ");
		numeros(num, (n) -> true);
		System.out.println("Quadrado ");
		numerosFunc(num, (n) -> n * n);
		System.out.println("Dobro ");
		numerosFunc(num, (n) -> n * 2);
		System.out.println("Soma + 3");
		numerosFunc(num, (n) -> n + 3);
		

	}
	
	public static void numeros(List<Integer> num, Predicate<Integer> predicate)
	{
		num.forEach(n -> {
			if (predicate.test(n)) {
			System.out.println(n + " ");
			}
		});
		
		
		
	}
	
	public static void numerosFunc(List<Integer> numero, IntFunction<Integer> func)
	{
		numero.forEach (n -> {
			n = func.apply(n);
			System.out.println(n + " ");
		});
	}
	
	
}
