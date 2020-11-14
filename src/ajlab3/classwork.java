package ajlab3;

import javafx.application.Application;
import static javafx.collections.FXCollections.fill;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import static javafx.scene.paint.Color.*;
import static javafx.scene.paint.Color.color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author Ezzeddine Berjawi
 */
public class classwork extends Application {
    @Override
    public void start(Stage primaryStage) {  
        Pane pane=new Pane();
        Line l1=new Line(50,0,150,100);
        
        Polygon p=new Polygon();
        p.getPoints().addAll(new Double[] {
            200.0,50.0,
            400.0,50.0,
            450.0,150.0,
            400.0,250.0,
            200.0,250.0,
            150.0,150.0,   
        });
        p.setFill(rgb(151, 124, 64));
        p.setStyle("-fx-opacity:0.5;-fx-stroke:black");
        
        pane.getChildren().addAll(l1,p);
        pane.setBackground(new Background(new BackgroundFill(GREY, new CornerRadii(20), Insets.EMPTY)));
        
        Polygon p2=new Polygon();
        p2.getPoints().addAll(new Double[] {
            200.0,50.0,
            400.0,50.0,
            450.0,150.0,
            400.0,250.0,
            200.0,250.0,
            150.0,150.0,   
        });
        
        p2.setFill(rgb(69, 42, 9));
        p2.setStyle("-fx-opacity:0.5;-fx-stroke:red");
        
        FlowPane fp=new FlowPane();
        fp.setAlignment(Pos.CENTER);
        fp.setColumnHalignment(HPos.LEFT);
        fp.setOrientation(Orientation.VERTICAL);
        fp.setVgap(50);
        fp.getChildren().addAll(pane,p2);
        
        Scene scene = new Scene(fp);
        
        primaryStage.setTitle("Lab 3");
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
