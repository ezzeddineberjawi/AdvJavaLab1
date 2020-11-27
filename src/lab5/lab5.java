package lab5;

import javafx.application.Application;
import static javafx.application.Application.launch;
import static javafx.collections.FXCollections.fill;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.*;
import static javafx.scene.paint.Color.color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import static javafx.scene.text.FontWeight.BOLD;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author Ezzeddine Berjawi
 */
public class lab5 extends Application {
    
    Scene scene;
    Stage primaryStage;
    Stage newStage;
    
    // Created the scene and stages as attributes in order to use them in event handlers
    
    public class myInnerHandler implements EventHandler {
        
        @Override
        public void handle(Event event) {
            System.out.println("Inner handler says hello");
        }
   
    }
    
    private GridPane createGridPane(){
            GridPane pane=new GridPane();
            pane.setVgap(20);
            pane.setHgap(20);
            pane.setAlignment(Pos.CENTER);
            
            Button btn=new Button("Press Me");
            
            myOuterHandler mh=new myOuterHandler(); // calling the event handler class
            myInnerHandler mih=new myInnerHandler();
            
            btn.setOnAction(mh);
            
            Button btn2=new Button("Press me 2.0");
            btn2.setOnAction(mih);
            
            TextField tf=new TextField();
            tf.setPrefColumnCount(20);
            tf.setPromptText("Write something");
            
            tf.setOnKeyPressed(new EventHandler<KeyEvent>() { // KeyEvent is gud
                @Override
                public void handle(KeyEvent event) {
                    System.out.println(event.getCode());
                }
            });
         
            pane.add(btn, 0, 0);
            pane.add(btn2, 1, 0);
            pane.add(tf, 0, 1);

            return pane;
    
            }
    
    @Override
    public void start(Stage primaryStage) {
        
        this.primaryStage=primaryStage;
        
        GridPane pane=createGridPane();
        Scene scene = new Scene(pane,200,200);

        primaryStage.setTitle("Circle");
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

