package CalculadoraImc.IMC.model;

import java.text.DecimalFormat;

public class Calculadora {

    private float peso;
    private float altura;
    private float imc;
    private String mensagem;

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public Calculadora(float peso, float altura) {
        this.imc = Math.round(peso / (altura * altura));

    }

    public String getMensagem() {
        if (imc < 18.50) {
            this.mensagem = "IMC = " + imc + "  Classificação de risco elevado para a saúde";
        } else if (imc >= 18.50 && imc <= 24.99) {
            this.mensagem = "IMC = " + imc + "  Classificação de risco inexistente para a saúde";
        } else if (imc >= 25.00 && imc <= 29.99) {
            this.mensagem = "IMC = " + imc + "  Classificação de risco elevado para a saúde";
        } else if (imc >= 30.00 && imc <= 34.99) {
            this.mensagem = "IMC = " + imc + "  Classificação de risco muito elevado para a saúde";
        } else if (imc >= 35.00 && imc <= 39.99) {
            this.mensagem = "IMC = " + imc + "  Classificação de risco muitíssimo elevado para a saúde";
        } else if (imc >= 40.00) {
            this.mensagem = "IMC = " + imc + "  Classificação de obesidade mórbida";
        }
        return mensagem;

    }
}


