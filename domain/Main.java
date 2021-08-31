package domain;

public class Main {
    public static void main(String[] args) {

        Professor professorJoao = new Professor("Camila", "Fernanda", "556.908.782-30", 35);

        Tutor tutorFabio = new Tutor("Carlos", "Oliveira", "289.389.271-29", 32);

        Aluno alunaCatarina = new Aluno("Fabiana", "Falcao", "789.234.543-20", 25, "7892", "Veterinaria", "4°", "Anatomia");

        FuncionarioManutencao manutencaoAline = new FuncionarioManutencao("Joana", "Dark", "728.179.234-30", 29, "671829");

        FuncionarioSuporteTecnico suportePedro = new FuncionarioSuporteTecnico("Joao", "Mota", "561.345.236-30", 30, "4");

        professorJoao.imprimeDadosDoProfessor();

        tutorFabio.imprimeDadosDoTutor();

        alunaCatarina.imprimeDadosDoAluno();

        manutencaoAline.imprimeDadosDoFuncionarioManutencao();

        suportePedro.imprimeDadosDoFuncionarioSuporteTecnico();
    }
}
