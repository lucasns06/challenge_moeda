package br.com.alura.challengemoeda.modelos;

import com.google.gson.annotations.SerializedName;

public class Moeda {
    @SerializedName("conversion_result")
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
