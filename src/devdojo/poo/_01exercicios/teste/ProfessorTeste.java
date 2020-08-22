package devdojo.poo._01exercicios.teste;

import devdojo.poo._01exercicios.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Astolfo";
        professor.matricula = "654a9s87da2sd";
        professor.cpf = "987.351.987-20";
        professor.rg = "65.897.351-9";

        System.out.println("Nome do professor: " + professor.nome);
        System.out.println("Matricula do professor: " + professor.matricula);
        System.out.println("CPF do professor: " + professor.cpf);
        System.out.println("RG do professor: " + professor.rg);

    }
}
