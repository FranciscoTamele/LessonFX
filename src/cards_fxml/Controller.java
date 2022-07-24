package cards_fxml;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    VBox container;
    @FXML
    Button btnAdd;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                getView(1);

            }
        });

    }

    public ObservableList<Label> getView(int i){

        try {
            Parent root = FXMLLoader.load(Main.aClass.getResource("card.fxml"));
            System.out.println("********************************************************");
            System.out.println(root.getClass().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }


}
