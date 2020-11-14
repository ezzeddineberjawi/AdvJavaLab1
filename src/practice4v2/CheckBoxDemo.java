package practice4v2;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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
public class CheckBoxDemo extends Application {
    public HBox createCheckBox(){
        HBox pane=new HBox(10);
        
        CheckBox cb1=new CheckBox("Home");
        CheckBox cb2=new CheckBox("Calendar");
        CheckBox cb3=new CheckBox("Settings");

        pane.getChildren().addAll(cb1,cb2,cb3);
        pane.setAlignment(Pos.CENTER_LEFT);
        pane.setPadding(new Insets(10)); // or put Insets(double top, double right, double bottom, double left)
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
