package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class WeightLiftingController {
    @FXML
    public TableView<WeightLifters> Tableview;
    public TableColumn column1;
    public TableColumn column2;
    public TableColumn column3;
    public TableColumn column4;
    public TableColumn column5;


    public void initialize(URL location, ResourceBundle resources){
        column1.setCellFactory(new PropertyValueFactory<WeightLifters,String>("Name"));
        column2.setCellFactory(new PropertyValueFactory<WeightLifters,String>("Weight"));
        column3.setCellFactory(new PropertyValueFactory<WeightLifters,String>("Bench Press"));
        column4.setCellFactory(new PropertyValueFactory<WeightLifters,String>("Squat"));
        column5.setCellFactory(new PropertyValueFactory<WeightLifters,String>("Dead Lift"));

        WeightLifters weightlifter = new WeightLifters();
        weightlifter.name = "Bill";
        weightlifter.weight = "240";
        weightlifter.benchpress = "555";
        weightlifter.squat = "602";
        weightlifter.deadlift = "120";


        Tableview.getColumns().addAll(column1,column2,column3,column4,column5);
        Tableview.getItems().add(weightlifter);
    }


}
