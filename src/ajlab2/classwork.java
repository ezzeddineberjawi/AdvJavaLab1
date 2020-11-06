package ajlab2;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
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
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import static javafx.scene.paint.Color.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author Ezzeddine Berjawi
 */
public class classwork extends Application {
    
    private static final String imgURL="https://www.clker.com/cliparts/3/m/v/Y/E/V/small-red-apple-hi.png";
    
    public Text createText(){
        Text t=new Text(10,10,"\nWHY ARE YOU RUNNING?!");
        t.setFont(Font.font("Arial",25));
//        t.setFont(Font.font("Arial",FontPosture.ITALIC,25));
        t.setFill(INDIGO);
        t.setUnderline(true);
        
        return t;
    }
    
    public Pane createPane() throws FileNotFoundException{
        VBox pane=new VBox(10);
        pane.setPadding(new Insets(10));
        pane.getChildren().addAll(createText(),insertImageViewFromURL(),insertImageViewFromPath());
        return pane;
    }
    
    public Scene createScene() throws FileNotFoundException{
        Scene scene = new Scene(createPane());
        scene.setFill(GOLD);
        return scene;
    }
    
    public ImageView insertImageViewFromURL(){
        Image image=new Image(imgURL,10,10,true,true);
        ImageView img = new ImageView(imgURL);
        
        return img;
    }
    public ImageView insertImageViewFromPath() throws FileNotFoundException{
        InputStream in = new FileInputStream("C:\\Users\\iTECH\\Desktop\\man.png");
        Image image=new Image(in);
        ImageView img = new ImageView(image);
        
        return img;
    }
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {    
        primaryStage.setTitle("Lab 2 Classwork");
        primaryStage.setScene(createScene());
        primaryStage.show();
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
