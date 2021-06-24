package exer4;

public class Avaliacao extends Thread{
	
	private String disciplina;
	private String aluno;
	private double nota;
	
	
	public Avaliacao(String disciplina, String aluno, double nota) {
		this.disciplina = disciplina;
		this.aluno = aluno;
		this.nota = nota;
		start();
	}


	public String getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	public String getAluno() {
		return aluno;
	}


	public void setAluno(String aluno) {
		this.aluno = aluno;
	}


	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
	/*public void run() {
		try {
			for (int i=0; i<6; i++){
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nome + " terminou a execução");
		}*/
}


