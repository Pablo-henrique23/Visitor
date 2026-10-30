package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaVisitorJsonTest {
    @Test
    void deveExibirAluno() {
        Aluno aluno =  new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        PessoaVisitorJson visitor =  new PessoaVisitorJson();
        assertEquals("{nome: Ana, curso: Sistemas de Informação, matricula: 1}", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessor() {
        Professor professor =  new Professor(1, "Maria", "Doutorado");

        PessoaVisitorJson visitor =  new PessoaVisitorJson();
        assertEquals("{nome: Maria, titulacao: Doutorado, matricula: 1}", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario =  new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitorJson visitor =  new PessoaVisitorJson();
        assertEquals("{nome: Pedro, codigo: 1, salario: 5000.0}", visitor.exibir(funcionario));
    }

}