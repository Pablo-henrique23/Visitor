package org.example;

public class PessoaVisitorJson implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAluno(Aluno aluno) {
        return "{" +
                "nome: " + aluno.getNome() +
                ", curso: " + aluno.getNomeCurso() +
                ", matricula: " + aluno.getMatricula() +
                "}";
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return "{" +
                "nome: " + professor.getNome() +
                ", titulacao: " + professor.getTitulacao() +
                ", matricula: " + professor.getMatricula() +
                "}";
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "{" +
                "nome: " + funcionario.getNome() +
                ", codigo: " + funcionario.getCodigo() +
                ", salario: " + funcionario.getSalario() +
                "}";
    }
}