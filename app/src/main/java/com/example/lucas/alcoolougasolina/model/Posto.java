package com.example.lucas.alcoolougasolina.model;

public class Posto {

    private double valorAlcool;
    private double valorGasolina;

    public double getValorAlcool() {
        return valorAlcool;
    }

    public void setValorAlcool(double valorAlcool) {
        this.valorAlcool = valorAlcool;
    }

    public double getValorGasolina() {
        return valorGasolina;
    }

    public void setValorGasolina(double valorGasolina) {
        this.valorGasolina = valorGasolina;
    }

    public boolean calcularCombustivel(){


        if (valorGasolina*0.7>=valorAlcool){
            return true;
        }else{
            return false;
        }
    }
}
