package com.br.sistemamecanica;

import java.time.LocalDate;

/**
 *
 * @author tetzner
 */
public class Principal {

    public static void main(String[] args) {
        // Criação de Funcionários
        Funcionario funcionario1 = new Funcionario(
                "Ana Souza",
                "99999-1234",
                LocalDate.of(1990, 5, 12),
                "Rua A, 123"
        );

        Funcionario funcionario2 = new Funcionario(
                "Carlos Lima",
                "98888-4321",
                LocalDate.of(1985, 3, 20),
                "Rua B, 456"
        );

        // Criação de Veículos
        Veiculo veiculo1 = new Veiculo(
                "Civic",
                "Honda",
                LocalDate.of(2020, 1, 10),
                25000.0
        );

        Veiculo veiculo2 = new Veiculo(
                "Corolla",
                "Toyota",
                LocalDate.of(2019, 6, 5),
                40000.0
        );

        // Criação de Cliente
        Cliente cliente = new Cliente(
                "Bruno Oliveira",
                "97777-5555",
                LocalDate.of(1995, 8, 25),
                "Avenida Central, 789"
        );

        // Relacionando Funcionários ao Cliente
        cliente.adicionaFuncionario(funcionario1);
        cliente.adicionaFuncionario(funcionario2);

        // Relacionando Veículos ao Cliente
        cliente.adicionaVeiculo(veiculo1);
        cliente.adicionaVeiculo(veiculo2);

        // Relacionando Cliente aos Funcionários
        funcionario1.adicionaCliente(cliente);
        funcionario2.adicionaCliente(cliente);

        // Exibindo informações
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());

        System.out.println("\nFuncionários associados:");
        for (Funcionario f : cliente.getFuncionarios()) {
            System.out.println("- " + f.getNome() + " (" + f.getTelefone() + ")");
        }

        System.out.println("\nVeículos associados:");
        for (Veiculo v : cliente.getVeiculos()) {
            System.out.println("- " + v.getMarca() + " " + v.getModelo() + " (" + v.getKm() + " km)");
        }
    }
}
