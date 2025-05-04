package exercicio1oo.classes;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.matricula = "12345";
        aluno.nome = "Lucas";
        aluno.idade = 23;
        aluno.nota1 = 7;
        aluno.nota2 = 8;
        aluno.nota3 = 6;
        aluno.nota4 = 7;

        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Notas: " + aluno.nota1 + ", " + aluno.nota2 + ", " + aluno.nota3 + ", " + aluno.nota4);
    }
}
