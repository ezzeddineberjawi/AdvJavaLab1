package asg3;


import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import login_form.*;
import javafx.application.Application;
import static javafx.collections.FXCollections.fill;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import static javafx.scene.paint.Color.*;
import static javafx.scene.paint.Color.color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;

/**
 *
 * @author Ezzeddine Berjawi
 */
public class home extends Application {   
    @Override
    public void start(Stage primaryStage) {
        register_form rf=new register_form();
        login_form lf=new login_form();
        
        StackPane pane = new StackPane();
        VBox vb=new VBox(20);
        HBox choice=new HBox(10);
        choice.setAlignment(Pos.CENTER);
        
        vb.setAlignment(Pos.CENTER);
        vb.setPadding(new Insets(20));
        
        Label welcome=new Label("Welcome!");
        welcome.setStyle("-fx-font-size:24;-fx-font-weight:bold");
        Button register=new Button("Register if you are new");
        Button login=new Button("Login if you already have an account");
        
        choice.getChildren().addAll(register,login);
        vb.getChildren().addAll(welcome,choice);
        
        Image img=new Image("file:///C:\\Users\\iTECH\\Desktop\\slide0.jpg");
        ImageView i=new ImageView(img);
        i.setOpacity(0.25);
        
        Image img2=new Image("file:///C:\\Users\\iTECH\\Desktop\\slide1.jpg");
        
        Image img3=new Image("file:///C:\\Users\\iTECH\\Desktop\\slide2.jpg");
        
        
        
        EventHandler EH = e -> {
            if(i.getImage().equals(img)){
                i.setImage(img2);
                i.setOpacity(0.25);
            }
            else if(i.getImage().equals(img2)){
                i.setImage(img3);
                i.setOpacity(0.25);
            }
            else if(i.getImage().equals(img3)){
                i.setImage(img);
                i.setOpacity(0.25);
            }
        };
        
        Timeline timeline=new Timeline(new KeyFrame(Duration.millis(2000),EH));
        timeline.setCycleCount(Timeline.INDEFINITE);
        
        timeline.play();
        
        
        register.setOnAction(e -> {
            rf.start(primaryStage);
        });
        
        login.setOnAction(e -> {
            lf.start(primaryStage);
        });
        
        register.setOnMouseEntered(e -> {
            register.setCursor(Cursor.HAND);
        });
        
        login.setOnMouseEntered(e -> {
            login.setCursor(Cursor.HAND);
        });
        
        pane.getChildren().addAll(i,vb);
        
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("Welcome");
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
