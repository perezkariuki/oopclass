package com.mycompany.movie1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Movies");
        Text text1 = new Text("Genres:");
        
        Text text2 = new Text("Name:");
        
        Text text3 = new Text("Registered:");
        
        TextField textField1 = new TextField();
        
        ComboBox comboBox = new ComboBox();
        ComboBox comboBox1 = new ComboBox();
        
        Button button1 = new Button("Save Movie");
        Button button2 = new Button("Remove Movie");
        
        GridPane gridPane = new GridPane();
        
        gridPane.setMinSize(600,400);
        gridPane.setPadding(new Insets(10,10,10,10));
        
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        
        gridPane.setAlignment(Pos.CENTER);
        
        gridPane.add(text1,0,0);
        gridPane.add(comboBox,1,0);
        
        gridPane.add(text2,0,2);
        gridPane.add(textField1,1,2);
        gridPane.add(button1,1,1);
        
        gridPane.add(text3,0,3);
        gridPane.add(comboBox1,1,3);
        
        gridPane.add(button2,1,4);
        
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        
        text1.setStyle("-fx-font: normal bold 20px 'serif'");
        text2.setStyle("-fx-font: normal bold 20px 'serif'");
        text3.setStyle("-fx-font: normal bold 20px 'serif'");
        gridPane.setStyle("-fx-background-color: BEIGE;");
        
        Scene scene = new Scene(gridPane);
        
        stage.setTitle("Movie Library System");
        
        stage.setScene(scene);
        
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
