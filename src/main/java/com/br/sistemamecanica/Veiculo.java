package com.br.sistemamecanica;

import java.time.LocalDate;

/**
 *
 * @author tetzner
 */
public class Veiculo {
    
    //  Atributos
    
    private String modelo;
    private String marca;
    private LocalDate data;
    private Double km;
    
    // Construtor

    public Veiculo(String modelo, String marca, LocalDate data, Double km) {
        this.modelo = modelo;
        this.marca = marca;
        this.data = data;
        this.km = km;
    }
    
    // Getters

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public LocalDate getData() {
        return data;
    }

    public Double getKm() {
        return km;
    }

    // Setters

    public void setKm(Double km) {
        this.km = km;
    }
   
}
