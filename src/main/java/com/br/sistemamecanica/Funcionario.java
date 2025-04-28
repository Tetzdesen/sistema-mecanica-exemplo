package com.br.sistemamecanica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tetzner
 */
public class Funcionario {

    // Atributos
    
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    private String endereco;
    private List<Cliente> clientes;
    
    // Construtor
    
    public Funcionario(String nome, String telefone, LocalDate dataNascimento, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.clientes = new ArrayList<>();
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
    public List<Cliente> getClientes() {
        return clientes;
    }
      
    // Setters

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    // Metodos adicionais para adicionar e remover a lista de clientes

    public void adicionaCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Erro: Cliente nulo");
        }
        clientes.add(cliente);
    }
    
    public void removeCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Erro: Cliente nulo");
        }
        clientes.remove(cliente);
    }
}
