package asg3;


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

/**
 *
 * @author Ezzeddine Berjawi
 */
public class login_form extends Application {
    
    private static final String imgURL="https://picsum.photos/200";
    
    public ImageView insertImageViewFromURL(){
        Image image=new Image(imgURL,10,10,true,true);
        ImageView img = new ImageView(imgURL);
        return img;
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        register_form rf=new register_form();
        
        GridPane pane=new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setPadding(new Insets(10));
        
//        Label welcome=new Label("Welcome");
//        welcome.setStyle("-fx-font-size:20");
//        pane.add(welcome, 0, 0);
        
        
        
        insertImageViewFromURL().setScaleX(2);
        insertImageViewFromURL().setScaleY(2);
        
        Label l1=new Label("Username");
        l1.setFont(Font.font("Arial",12));
        pane.add(l1, 0, 1);
        
        TextField tf1=new TextField();
        tf1.setFont(Font.font("Arial",12));
        pane.add(tf1, 1, 1);
        
        Label l2=new Label("Password");
        l2.setFont(Font.font("Arial",12));
        pane.add(l2, 0, 2);
        
        PasswordField pf=new PasswordField();
        pf.setFont(Font.font("Arial",12));
        pane.add(pf, 1, 2);
        
        Button btn=new Button("Login");
        btn.setFont(Font.font("Arial",12));
        
        VBox vb=new VBox(10);
        vb.setPadding(new Insets(10));
        vb.setAlignment(Pos.CENTER);
        vb.getChildren().addAll(insertImageViewFromURL(),pane,btn);
        
        HBox hb=new HBox(20);
        hb.setPadding(new Insets(10));
        hb.setAlignment(Pos.CENTER);
        
        Separator s = new Separator();
        s.setOrientation(Orientation.VERTICAL);
        
        VBox vb2=new VBox(10);
        vb2.setPadding(new Insets(150,10,150,10));
        
        Label t=new Label("Don't have an account?");
        t.setFont(Font.font("Arial",FontPosture.ITALIC,12));
        t.setAlignment(Pos.CENTER);
        
        Button register=new Button("Register");
        register.setAlignment(Pos.CENTER);
        
        vb2.getChildren().addAll(t,register);
        
        
        hb.getChildren().addAll(vb,s,vb2);
        
        register.setOnAction(e -> {
            rf.start(primaryStage);
        });
        
        register.setOnMouseEntered(e -> {
            register.setCursor(Cursor.HAND);
        });
        
        Scene scene = new Scene(hb);
        
        primaryStage.setTitle("Login");
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
