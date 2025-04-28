package com.br.sistemamecanica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tetzner
 */
public class Cliente {

    // Atributos
    
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    private String endereco;
    private List<Funcionario> funcionarios;
    private List<Veiculo> veiculos;

    // Construtor
    
    public Cliente(String nome, String telefone, LocalDate dataNascimento, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.funcionarios = new ArrayList<>();
        this.veiculos = new ArrayList<>();
    }
    
    // Getters
    
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    // Lembrar de retornar a copia e nao a original
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    // Lembrar de retornar a copia e nao a original
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    // Setters

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    // Metodos adicionais para adicionar e remover a lista de funcionarios e veiculos

    public void adicionaFuncionario(Funcionario funcionario) {
        if (funcionario == null) {
            throw new IllegalArgumentException("Erro: Funcionario nulo");
        }
        funcionarios.add(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario) {
        if (funcionario == null) {
            throw new IllegalArgumentException("Erro: Funcionario nulo");
        }
        funcionarios.remove(funcionario);
    }

    public void adicionaVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("Erro: Veiculo nulo");
        }
        veiculos.add(veiculo);
    }

    public void removeVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("Erro: Veiculo nulo");
        }
        veiculos.remove(veiculo);
    }

}
