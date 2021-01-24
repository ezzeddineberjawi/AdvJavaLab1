package asg4;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;

/**
 *
 * @author Ezzeddine Berjawi
 */
public class login_form extends Application {
    
    @Override
    public void start(Stage primaryStage) {  
        GridPane pane=new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setPadding(new Insets(10));
        
//        Label welcome=new Label("Welcome");
//        welcome.setStyle("-fx-font-size:20");
//        pane.add(welcome, 0, 0);
        
        
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
        vb.getChildren().addAll(pane,btn); // I removed the image for the code to run faster
        
        HBox hb=new HBox(20);
        hb.setPadding(new Insets(10));
        hb.setAlignment(Pos.CENTER);
        
        Separator s = new Separator();
        s.setOrientation(Orientation.VERTICAL);
        
        VBox vb2=new VBox(10);
        
        
        btn.setOnAction(e -> {
            try {
                File file=new File("users.txt");
                Scanner scan = new Scanner(file);
                scan.nextLine();
                scan.nextLine();
                while(scan.hasNext()){
                    if(scan.next().equalsIgnoreCase(tf1.getText())){
                        if(scan.next().equalsIgnoreCase(pf.getText())){
                            Alert a = new Alert(Alert.AlertType.INFORMATION);
                            a.setContentText("Successfully logged in");
                            a.show();
                            break;
                        }
                        else{
                            Alert a = new Alert(Alert.AlertType.WARNING);
                            a.setContentText("Invalid Password");
                            a.show();
                             break;
                        }
                    }
                    else{
                        if(scan.next().equalsIgnoreCase(pf.getText())){
                            Alert a = new Alert(Alert.AlertType.WARNING);
                            a.setContentText("Invalid Username");
                            a.show();
                            break;
                        }
                    }
                     
                }
                scan.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(login_form.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
        Text t=new Text("Some random text, i guess.");
        t.setFont(Font.font("Arial",FontPosture.ITALIC,12));
        
        hb.getChildren().addAll(vb,s,t);
        
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
