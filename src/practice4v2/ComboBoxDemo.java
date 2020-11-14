package practice4v2;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import static javafx.scene.paint.Color.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author Ezzeddine Berjawi
 */
public class ComboBoxDemo extends CheckBoxDemo {
    public HBox createComboBox(){
        HBox pane=new HBox(10);
        
        ComboBox cb=new ComboBox(); // or ComboBox<String>=new ComboBox<String>; and then add the elements without initializing them
        String s1="Select a day";
        cb.getSelectionModel().select(s1);
        
        String s2="Monday";
        String s3="Tuesday";
        String s4="Wednesday";
        String s5="Thursday";
        String s6="Friday";
        String s7="Saturday";
        String s8="Sunday";
        
        cb.getItems().addAll(s1,s2,s3,s4,s5,s6,s7,s8);
        
        pane.getChildren().addAll(cb);
        pane.setAlignment(Pos.CENTER_LEFT);
        pane.setPadding(new Insets(75)); // or put Insets(double top, double right, double bottom, double left)
        pane.setStyle("fx-border-color:green");
        
        return pane;
    }
    
    
    public void start(Stage primaryStage) {  
        
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
