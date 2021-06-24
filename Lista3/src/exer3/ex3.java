package exer3;

import java.util.function.Function;

public class ex3 {

	public static void main(String[] args) {
		
		Fatorial f = new Fatorial();
		
		f.fat = (n) -> {
			if (n==1)
			{
				return n;
			}
			return (n * f.Fat.apply( n-1));
		};
		
	}
	
	System.out.prinln(t.f.apply(5));
	
	
	public static class Fatorial
	{
		Function<Interger, Interger> fat;
	}

}
