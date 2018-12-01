package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.Program.FileJSONReader;
import sample.Program.Student;
import sample.Program.Subject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Year1Controller implements Initializable {
    ObservableList list = FXCollections.observableArrayList();
    ObservableList list2 = FXCollections.observableArrayList();
    private Student student;


    @FXML public ListView<String> subjectList;
    @FXML private ListView<String> subjectList2;
    @FXML private Label year1;
    @FXML private TextArea screen;
    @FXML private Button goBack;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadData();


    }


    private void loadData() {
        list.removeAll(list);
        list2.removeAll(list2);
        String a = "Calculus I";
        String b = "Fund.Programming Concepts";
        String c = "Intro. to Computer Science";
        String d = "Digital Computer Logic";
        String e = "ศาสตร์แห่งแผ่นดิน";

        String f = "Calculus II";
        String g = "Computer Programming";
        String h = "Fundamentals of Computing";

        list.addAll(a,b,c,d,e);
        list2.addAll(f,g,h);
        subjectList.getItems().addAll(list);
        subjectList2.getItems().addAll(list2);
    }

    @FXML
    public void displaySelected(MouseEvent event){
        String subject = subjectList.getSelectionModel().getSelectedItem();
        if (subject == null || subject.isEmpty()){
            screen.setText("Nothing Selected");
        }
        screen.setText(subject + " Selected");

    }

    public void changetoPageChoose (ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) goBack.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("chooseyear.fxml"));
        stage.setTitle("Regis");
        stage.setScene(new Scene(root,600,400));
        stage.show();
    }
}
