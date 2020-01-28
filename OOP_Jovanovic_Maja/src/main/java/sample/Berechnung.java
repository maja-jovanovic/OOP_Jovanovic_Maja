package main.java.sample;

import javafx.fxml.FXML;

public class Berechnung {

    @FXML
    private double nettopreisInput;
    private double anzahlungInput;
    private double zinsInput;
    private double laufzeitInput;
    private double restwertInput;

    public Berechnung(double nettopreisInput, double anzahlungInput, double zinsInput, double laufzeitInput, double restwertInput) {
        this.nettopreisInput = nettopreisInput;
        this.anzahlungInput = anzahlungInput;
        this.zinsInput = zinsInput;
        this.laufzeitInput = laufzeitInput;
        this.restwertInput = restwertInput;
    }

    public double getNettopreisInput() {
        return nettopreisInput;
    }

    public void setNettopreisInput(double nettopreisInput) {
        this.nettopreisInput = nettopreisInput;
    }

    public double getAnzahlungInput() {
        return anzahlungInput;
    }

    public void setAnzahlungInput(double anzahlungInput) {
        this.anzahlungInput = anzahlungInput;
    }

    public double getZinsInput() {
        return zinsInput;
    }

    public void setZinsInput(double zinsInput) {
        this.zinsInput = zinsInput;
    }

    public double getLaufzeitInput() {
        return laufzeitInput;
    }

    public void setLaufzeitInput(double laufzeitInput) {
        this.laufzeitInput = laufzeitInput;
    }

    public double getrestwertInput() {
        return restwertInput;
    }

    public void setrestwertInput(double restwertInput) {
        this.restwertInput = restwertInput;
    }
}
