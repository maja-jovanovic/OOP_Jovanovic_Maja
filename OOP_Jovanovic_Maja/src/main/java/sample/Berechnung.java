package main.java.sample;

import javafx.fxml.FXML;

public class Berechnung {

    @FXML
    private double bruttopreisInput;
    @FXML
    private double anzahlungInput;
    @FXML
    private Double zinsInput;
    @FXML
    private int laufzeitInput;
    @FXML
    private double restwertInput;

    private double rate;
    private double amortisation;
    private double zinskosten;

    private String name;


    public Berechnung(double bruttopreisInput, double anzahlungInput, Double zinsInput, int laufzeitInput,
                      double restwertInput, double rate, double amortisation, double zinskosten) {
        this.bruttopreisInput = bruttopreisInput;
        this.anzahlungInput = anzahlungInput;
        this.zinsInput = zinsInput;
        this.laufzeitInput = laufzeitInput;
        this.restwertInput = restwertInput;
        this.rate = rate;
        this.amortisation = amortisation;
        this.zinskosten = zinskosten;
    }

    public Berechnung(double bruttopreisInput, double anzahlungInput, Double zinsInput, int laufzeitInput, double restwertInput) {
        this.bruttopreisInput = bruttopreisInput;
        this.anzahlungInput = anzahlungInput;
        this.zinsInput = zinsInput;
        this.laufzeitInput = laufzeitInput;
        this.restwertInput = restwertInput;
    }

    public double getBruttopreisInput() {
        return bruttopreisInput;
    }

    public void setBruttopreisInput(double bruttopreisInput) {
        this.bruttopreisInput = bruttopreisInput;
    }

    public double getAnzahlungInput() {
        return anzahlungInput;
    }

    public void setAnzahlungInput(double anzahlungInput) {
        this.anzahlungInput = anzahlungInput;
    }

    public Double getZinsInput() {
        return zinsInput;
    }

    public void setZinsInput(Double zinsInput) {
        this.zinsInput = zinsInput;
    }

    public int getLaufzeitInput() {
        return laufzeitInput;
    }

    public void setLaufzeitInput(int laufzeitInput) {
        this.laufzeitInput = laufzeitInput;
    }

    public double getRestwertInput() {
        return restwertInput;
    }

    public void setRestwertInput(double restwertInput) {
        this.restwertInput = restwertInput;
    }


    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getAmortisation() {
        return amortisation;
    }

    public void setAmortisation(double amortisation) {
        this.amortisation = amortisation;
    }

    public double getZinskosten() {
        return zinskosten;
    }

    public void setZinskosten(double zinskosten) {
        this.zinskosten = zinskosten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
