package lab6;

import ajlab3.*;
import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import static javafx.collections.FXCollections.fill;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
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
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;

/**
 *
 * @author Ezzeddine Berjawi
 */
public class classwork extends Application {
    
    Transition setTranslateTransition(Node node){
       TranslateTransition t=new TranslateTransition(); 
       t.setNode(node);
       
       t.setDuration(Duration.seconds(2));
       t.setCycleCount(Timeline.INDEFINITE);
       t.setAutoReverse(true);
       t.setByX(500);
       
       return t;
    }
    
    Transition setScaleTransition(Node node){
       ScaleTransition t=new ScaleTransition(); 
       t.setNode(node);
       
       t.setDuration(Duration.seconds(1));
       t.setCycleCount(Timeline.INDEFINITE);
       t.setAutoReverse(true);
       t.setByX(5);
       t.setByY(5);
       
       return t;
    }
    
    Transition setFillTransition(Node node){
       FillTransition t=new FillTransition(); 
       t.setShape((Shape) node);
       
       t.setDuration(Duration.seconds(1));
       t.setCycleCount(Timeline.INDEFINITE);
       t.setAutoReverse(true);
       t.setToValue(BLUE);
       
       return t;
    }
    
    @Override
    public void start(Stage primaryStage) {  
        Pane pane=new Pane();
        
        Circle c=new Circle(50);
        c.setCenterX(50);
        c.setCenterY(300);
        c.setFill(RED);
        
        Transition tt=this.setTranslateTransition(c);
        
        Transition st=this.setScaleTransition(c);
        
        Transition ft=this.setFillTransition(c);
        
//        SequentialTransition seq=new SequentialTransition(tt,st,ft);
//        seq.play();

        ParallelTransition par=new ParallelTransition(tt,st,ft);
        par.play();
        
        pane.getChildren().addAll(c);
        
        Scene scene = new Scene(pane,600,600);
        
        primaryStage.setTitle("Lab 6: Animations");
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
