package exercicio1oo;

class TestaAluno {
        public static void main(String[] args) {
            Aluno aluno = new Aluno();
            aluno.matricula = "1234";
            aluno.nome = "José da Silva";
            aluno.idade = 30;
            aluno.nota1 = 8;
            aluno.nota2 = 9;
            aluno.nota3 = 7;
            aluno.nota4 = 8;

            System.out.println("Matricula: " + aluno.matricula);
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Idade: " + aluno.idade);
            System.out.println();
            System.out.println("Nota 1: " + aluno.nota1);
            System.out.println("Nota 2: " + aluno.nota2);
            System.out.println("Nota 3: " + aluno.nota3);
            System.out.println("Nota 4: " + aluno.nota4);

        }
}
