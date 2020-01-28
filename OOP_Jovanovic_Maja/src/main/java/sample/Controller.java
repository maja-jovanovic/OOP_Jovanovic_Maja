package main.java.sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public TextField bruttopreisInput;
    @FXML
    public TextField anzahlungInput;
    @FXML
    public Spinner<Double> zinsInput;
    @FXML
    public ComboBox laufzeitComboBox;
    @FXML
    public TextField restwertInput;
    @FXML
    public TextField rateOutput;
    @FXML
    public TextField zinskostenOutput;
    @FXML
    public TextField amortisationOutput;
    @FXML
    public TextField nameInput;


    private double bruttopreis;
    private double anzahlung;
    private double zins;
    private int laufzeit;
    private double restwert;

    @FXML
    public ListView<Berechnung> listView;

    private ObservableList observableList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        laufzeitComboBox.getItems().addAll(
                "6 Monate", "12 Monate", "24 Monate", "36 Monate", "48 Monate", "60 Monate"
        );

        SpinnerValueFactory<Double> valueFactory = new SpinnerValueFactory.DoubleSpinnerValueFactory(0.1, 10);

        zinsInput.setValueFactory(valueFactory);
        observableList = FXCollections.observableArrayList();

        listView.setItems(observableList);

    }

    public void angaben() {
        bruttopreis = Double.parseDouble(bruttopreisInput.getText());
        anzahlung = Double.parseDouble(anzahlungInput.getText());
        zins = Double.parseDouble(zinsInput.getValue().toString());
        String[] laufzeitZahl = laufzeitComboBox.getValue().toString().split(" ");
        laufzeit = Integer.parseInt(laufzeitZahl[0]);
        restwert = Double.parseDouble(restwertInput.getText());
    }

    @FXML
    public void onSaveClick() {
        angaben();
        String name = nameInput.getText();

        Berechnung berechnung = new Berechnung(bruttopreis, anzahlung, zins, laufzeit, restwert,
                ((bruttopreis - anzahlung + restwert) * zins * (double) (laufzeit / 12)) / (2 * 100),
                bruttopreis - anzahlung - restwert,
                (((bruttopreis - anzahlung + restwert) * zins * (double) (laufzeit / 12)) / (2 * 100)
                        + bruttopreis - anzahlung - restwert) / laufzeit);
        berechnung.setName(name);

        observableList.add(berechnung);

        bruttopreisInput.clear();
        anzahlungInput.clear();
        restwertInput.clear();
        rateOutput.clear();
        amortisationOutput.clear();
        zinskostenOutput.clear();
        nameInput.setText("neuer Name");
    }

    @FXML
    public void onCalculateClick() {
        angaben();
        Berechnung berechnung = new Berechnung(bruttopreis, anzahlung, zins, laufzeit, restwert);

        double zinskosten = ((bruttopreis - anzahlung + restwert) * zins * (double) (laufzeit / 12)) / (2 * 100);
        double amortisation = bruttopreis - anzahlung - restwert;
        double rate = (zinskosten + amortisation) / laufzeit;

        berechnung.setZinskosten(zinskosten);
        berechnung.setAmortisation(amortisation);
        berechnung.setRate(rate);

        zinskostenOutput.setText(Double.toString(zinskosten));
        amortisationOutput.setText(Double.toString(amortisation));
        rateOutput.setText(Double.toString(rate));
    }

    @FXML
    public void onLoadClick() {
        Berechnung berechnung = listView.getSelectionModel().getSelectedItem();

        bruttopreisInput.setText(Double.toString(berechnung.getBruttopreisInput()));
        anzahlungInput.setText(Double.toString(berechnung.getAnzahlungInput()));
        laufzeitComboBox.setValue(Integer.toString(berechnung.getLaufzeitInput()));
        restwertInput.setText(Double.toString(berechnung.getRestwertInput()));
        rateOutput.setText(Double.toString(berechnung.getRate()));
        amortisationOutput.setText(Double.toString(berechnung.getAmortisation()));
        zinskostenOutput.setText(Double.toString(berechnung.getZinskosten()));
        nameInput.setText(berechnung.getName());
    }
}
