package practice4v2;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
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
public class RadioButtonDemo extends ComboBoxDemo {
    
    public Pane createVBoxForRB(){
        
        VBox pane=new VBox(10);
        
        RadioButton rb1=new RadioButton("Home");
        RadioButton rb2=new RadioButton("Calendar");
        RadioButton rb3=new RadioButton("Settings");
     
        final ToggleGroup group=new ToggleGroup();
        rb1.setToggleGroup(group);
        //rb1.setSelected(true); Select rb1 by default
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);
        
        pane.getChildren().addAll(rb1,rb2,rb3);
        pane.setAlignment(Pos.CENTER_LEFT);
        pane.setPadding(new Insets(10)); // or put Insets(double top, double right, double bottom, double left)
        pane.setStyle("fx-border-color:green");
        return pane;
    }
    
    public Pane createVBox(){
        VBox pane=new VBox(2);
        pane.getChildren().addAll(super.createCheckBox(),super.createComboBox(),createVBoxForRB());
        
        return pane;
    }
    
    @Override
    public void start(Stage primaryStage) {  

        Scene scene = new Scene(createVBox());
        
        primaryStage.setTitle("Several Control Fields");
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
