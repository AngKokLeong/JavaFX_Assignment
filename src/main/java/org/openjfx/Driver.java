package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author angkokleong
 */
public class Driver extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(getClass());
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
           
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        
        stage.setTitle("JavaFX and Gradle");
        stage.setScene(scene);
        stage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }

}