package projeto.principal;

import java.util.LinkedList;
import java.util.List;

import projetos.alunos.alunos;

public class main {
	public static void main(String[] args) {
		
		
		alunos aluno1 = new alunos("Paulo", 2215, "aprovado");
		alunos aluno2 = new alunos("Maria", 5910, "aprovado");
		alunos aluno3 = new alunos("Carlos", 9320, "reprovado");
		alunos aluno4 = new alunos("João", 4561, "reprovado");
		alunos aluno5 = new alunos("Isabela", 3009, "aprovado");
		
		List<alunos> listadeAlunos = new LinkedList<>();
		
		listadeAlunos.add(aluno1);
		listadeAlunos.add(aluno2);
		listadeAlunos.add(aluno3);
		listadeAlunos.add(aluno4);
		listadeAlunos.add(aluno5);
		System.out.println(listadeAlunos);
	
}
	}
