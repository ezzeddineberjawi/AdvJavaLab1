package practice4v2;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.ListView;
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
public class ListViewDemo extends Application {
    @Override
    public void start(Stage primaryStage) {  
        HBox pane=new HBox(10);
        
        ListView lv=new ListView(); // or ComboBox<String>=new ComboBox<String>(); and then add the elements without initializing them

        ObservableList<String> data= FXCollections.observableArrayList("Black","Red","Orange","Brown");
        // We can use ObservableList for combo box as well
        lv.setItems(data);

        VBox vb=new VBox(10);
        Button Right=new Button(">");
        Button Left=new Button("<");
        
        vb.setAlignment(Pos.CENTER);
        vb.getChildren().addAll(Right,Left);

        HBox pane2=new HBox(10);
        
        ListView lv2=new ListView(); // or ComboBox<String>=new ComboBox<String>(); and then add the elements without initializing them

        ObservableList<String> data2= FXCollections.observableArrayList("Yellow","Green","Blue","Purple","Indigo","White");
        // We can use ObservableList for combo box as well
        lv2.setItems(data2);

        Right.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                data2.add(data.remove(0));
            }
        });
        
        Left.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                data.add(data2.remove(0));
            }
        });
        
        
        pane.getChildren().addAll(lv,vb,lv2);
        pane.setAlignment(Pos.CENTER_LEFT);
        pane.setPadding(new Insets(10)); // or put Insets(double top, double right, double bottom, double left)
        pane.setStyle("fx-border-color:green");
        
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("List View");
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
