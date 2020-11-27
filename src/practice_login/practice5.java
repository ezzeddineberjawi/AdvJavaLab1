package practice_login;

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
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
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
public class practice5 extends Application {
    
    Stage loginStage;
    Stage actualStage;
    Scene scene;
        
        
    
    // Created the scene and stages as attributes in order to use them in event handlers
    
    public class myInnerHandler implements EventHandler {
        
        @Override
        public void handle(Event event) {
            loginStage.close();
        }
   
    }
    
    private GridPane createPane(){
            GridPane gp=new GridPane();
            gp.setVgap(20);
            gp.setHgap(15);
            gp.setAlignment(Pos.CENTER);
            gp.setStyle("-fx-background-color:linear-gradient(to bottom ,rgb(64,64,64),rgb(72,72,72))");

            Label un=new Label("Username");
            un.setFont(Font.font("Arial",12));
            un.setStyle("-fx-text-fill:white");
            
            GridPane.setHalignment(un, HPos.RIGHT);
            
            TextField username=new TextField();
            username.setFont(Font.font("Arial",12));
            username.setStyle("-fx-background-color:none;-fx-text-fill:white;-fx-border-color:white;");
            username.setPadding(new Insets(5,5,5,5));
            username.setPrefColumnCount(25);
            
            Label pw=new Label("Password");
            pw.setFont(Font.font("Arial",12));
            pw.setStyle("-fx-text-fill:white");
            
            GridPane.setHalignment(pw, HPos.RIGHT);
            
            PasswordField password=new PasswordField();
            password.setFont(Font.font("Arial",12));
            password.setStyle("-fx-background-color:none;-fx-text-fill:white;-fx-border-color:white");
            password.setPadding(new Insets(5,5,5,5));
            password.setPrefColumnCount(25);
            
            GridPane.setColumnSpan(username, 2);
            GridPane.setColumnSpan(password, 2);
            
            CheckBox cb=new CheckBox("  Remember my password");
            cb.setStyle("-fx-text-fill:white;-fx-box-color:rgb(64,64,64);-fx-cursor:hand");
            
            Button login=new Button("LOGIN");
            login.setFont(Font.font("Arial",12));
            login.setStyle("-fx-background-color:linear-gradient(to bottom ,rgb(130,130,130),rgb(90,90,90));-fx-text-fill:white;-fx-background-radius: 0;");
            login.setPadding(new Insets(5,15,5,15));
            login.setPrefWidth(100);
            login.setAlignment(Pos.BASELINE_LEFT);
            
            
            login.setOnMouseEntered(e -> login.setStyle("-fx-background-color:linear-gradient(to bottom ,rgb(150,150,150),rgb(120,120,120));-fx-text-fill:white;-fx-cursor:hand;-fx-background-radius: 0;"));
            login.setOnMouseExited(e -> login.setStyle("-fx-background-color:linear-gradient(to bottom ,rgb(130,130,130),rgb(90,90,90));-fx-text-fill:white;-fx-cursor:hand;-fx-background-radius: 0;"));
            
            Button cancel=new Button("CANCEL");
            cancel.setFont(Font.font("Arial",12));
            cancel.setStyle("-fx-background-color:linear-gradient(to bottom ,rgb(130,130,130),rgb(90,90,90));-fx-text-fill:white;-fx-background-radius: 0;");
            cancel.setPadding(new Insets(5,15,5,15));
            cancel.setPrefWidth(100);
            cancel.setAlignment(Pos.BASELINE_LEFT);
            
            cancel.setOnMouseEntered(e -> cancel.setStyle("-fx-background-color:linear-gradient(to bottom ,rgb(150,150,150),rgb(120,120,120));-fx-text-fill:white;-fx-cursor:hand;-fx-background-radius: 0;"));
            cancel.setOnMouseExited(e -> cancel.setStyle("-fx-background-color:linear-gradient(to bottom ,rgb(130,130,130),rgb(90,90,90));-fx-text-fill:white;-fx-cursor:hand;-fx-background-radius: 0;"));
            
            
            myInnerHandler mih=new myInnerHandler();
            cancel.setOnAction(mih);
            
            Separator s = new Separator();
            s.setOrientation(Orientation.HORIZONTAL);
            
            GridPane.setColumnSpan(s, 4);
            
            Label h=new Label("Need help with login?");
            h.setFont(Font.font("Arial",12));
            h.setStyle("-fx-text-fill:white");
            
            GridPane.setHalignment(h, HPos.RIGHT);
            
            Button help=new Button("I CAN'T LOGIN...");
            help.setFont(Font.font("Arial",12));
            help.setStyle("-fx-background-color:linear-gradient(to bottom ,rgb(130,130,130),rgb(90,90,90));-fx-text-fill:white;-fx-background-radius: 0;");
            help.setPadding(new Insets(5,15,5,15));
            help.setPrefWidth(200);
            help.setOnMouseEntered(e -> help.setStyle("-fx-background-color:linear-gradient(to bottom ,rgb(150,150,150),rgb(120,120,120));-fx-text-fill:white;-fx-cursor:hand;-fx-background-radius: 0;"));
            help.setOnMouseExited(e -> help.setStyle("-fx-background-color:linear-gradient(to bottom ,rgb(130,130,130),rgb(90,90,90));-fx-text-fill:white;-fx-cursor:hand;-fx-background-radius: 0;"));
            help.setAlignment(Pos.BASELINE_LEFT);
            
            Label n=new Label("Don't have an account?");
            n.setFont(Font.font("Arial",12));
            n.setStyle("-fx-text-fill:white");
            
            GridPane.setHalignment(n, HPos.RIGHT);
            
            Button newacc=new Button("CREATE A NEW ACCOUNT...");
            newacc.setFont(Font.font("Arial",12));
            newacc.setStyle("-fx-background-color:linear-gradient(to bottom ,rgb(130,130,130),rgb(90,90,90));-fx-text-fill:white");
            newacc.setPadding(new Insets(5,15,5,15));
            newacc.setPrefWidth(200);
            newacc.setOnMouseEntered(e -> newacc.setStyle("-fx-background-color:linear-gradient(to bottom ,rgb(150,150,150),rgb(120,120,120));-fx-text-fill:white;-fx-cursor:hand;-fx-background-radius: 0;"));
            newacc.setOnMouseExited(e -> newacc.setStyle("-fx-background-color:linear-gradient(to bottom ,rgb(130,130,130),rgb(90,90,90));-fx-text-fill:white;-fx-cursor:hand;-fx-background-radius: 0;"));
            newacc.setAlignment(Pos.BASELINE_LEFT);
            
            Label copyright=new Label("\u00a9 2020 YaBoiiEzzo. All Rights Reserved.");
            copyright.setAlignment(Pos.CENTER);
            copyright.setStyle("-fx-text-fill:rgb(180,180,180)");
            
            GridPane.setColumnSpan(copyright, 4);
            
            gp.add(un, 0, 0);
            gp.add(username, 1, 0);
            gp.add(pw, 0, 1);
            gp.add(password, 1, 1);
            gp.add(cb, 1, 2);
            gp.add(login, 1, 3);
            gp.add(cancel, 2, 3);
            gp.add(s,0,4);
            gp.add(h, 0, 5);
            gp.add(help, 1, 5);
            gp.add(n, 0, 6);
            gp.add(newacc, 1, 6);
            gp.add(copyright, 0, 9);
            
            return gp;
    
            }
    
    @Override
    public void start(Stage loginStage) {
        
        this.loginStage=loginStage;
        
        GridPane pane=createPane();
        this.scene = new Scene(pane,550,450);

        loginStage.setTitle("Login");
        loginStage.setScene(scene);
        loginStage.show();
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

