package asg3;


import asg2.*;
import login_form.*;
import javafx.application.Application;
import static javafx.collections.FXCollections.fill;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
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
public class register_form extends Application { 
    GridPane pane;
    
    private TextField name;
    private TextField email;
    private TextField phone;
    private PasswordField password;
    private PasswordField confirmPassword;
    private ComboBox country;
    private TextField aboutyou;
    private Button register;
    private int r=10;
    private Button login;
   

    @Override
    public void start(Stage primaryStage) {
        login_form lf=new login_form();
        
        
        pane=new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(10);
        pane.setHgap(10);
        pane.setPadding(new Insets(10));
//        pane.setGridLinesVisible(true);

        Label n=new Label("Name");
        n.setFont(Font.font("Arial",12));
        pane.add(n, 0, 1);
        
        name=new TextField();
        name.setFont(Font.font("Arial",12));
        name.setPadding(new Insets(5,5,5,5));
        GridPane.setColumnSpan(name, 2);
        
        name.setOnAction(new EventHandler<ActionEvent>() { // KeyEvent is gud
                @Override
                public void handle(ActionEvent event) {
                    Label invalid =new Label("Invalid name");
                    invalid.setStyle("-fx-text-fill:RED");
                    if(name.getText().contains("0")){ 
                        pane.addRow(++r, invalid);
                    }
                    if(name.getText().contains("1")){ 
                        pane.addRow(++r, invalid);
                    }
                    if(name.getText().contains("2")){ 
                        pane.addRow(++r, invalid);
                    }
                    if(name.getText().contains("3")){ 
                        pane.addRow(++r, invalid);
                    }
                    if(name.getText().contains("4")){ 
                        pane.addRow(++r, invalid);
                    }
                    if(name.getText().contains("5")){ 
                        pane.addRow(++r, invalid);
                    }
                    if(name.getText().contains("6")){ 
                        pane.addRow(++r, invalid);
                    }
                    if(name.getText().contains("7")){ 
                        pane.addRow(++r, invalid);
                    }
                    if(name.getText().contains("8")){ 
                        pane.addRow(++r, invalid);
                    }
                    if(name.getText().contains("9")){ 
                        pane.addRow(++r, invalid);
                    }
  
                }
                
            });
        
        pane.add(name, 1, 1);
        
        Label e=new Label("Email");
        e.setFont(Font.font("Arial",12));
        pane.add(e, 0, 2);
        
        email=new TextField();
        email.setFont(Font.font("Arial",12));
        email.setPadding(new Insets(5,5,5,5));
        GridPane.setColumnSpan(email, 2);
        
        email.setOnAction(new EventHandler<ActionEvent>() { // KeyEvent is gud
                @Override
                public void handle(ActionEvent event) {
                    Label invalid =new Label("Invalid email address");
                    invalid.setStyle("-fx-text-fill:RED");
                    if(!(email.getText().contains("@"))&&!(email.getText().contains(".")))
                        pane.addRow(++r, invalid);
                }
            });
        
        pane.add(email, 1, 2);
        
        Label ph=new Label("Phone");
        ph.setFont(Font.font("Arial",12));
        pane.add(ph, 0, 3);
        
        phone=new TextField();
        phone.setFont(Font.font("Arial",12));
        phone.setPadding(new Insets(5,5,5,5));
        GridPane.setColumnSpan(phone, 2);
        
        phone.setOnAction(new EventHandler<ActionEvent>() { // KeyEvent is gud
                @Override
                public void handle(ActionEvent event) {
                    Label invalid =new Label("Invalid phone number");
                    invalid.setStyle("-fx-text-fill:RED");
                    
                    Label shortn =new Label("Short phone number");
                    shortn.setStyle("-fx-text-fill:RED");
                    
                    boolean isNumbers=true;
                        try{
                            double p= Double.parseDouble(phone.getText());
                        }
                        
                        catch(NumberFormatException e){
                            isNumbers=false;
                        }
                    
                    if(!isNumbers)
                        pane.addRow(++r, invalid);
                        
                    if(phone.getText().length()<8 || phone.getText().length()>8)
                        pane.addRow(++r, shortn);
                }
            });
        
        pane.add(phone, 1, 3);
        
        Label p=new Label("Password");
        p.setFont(Font.font("Arial",12));
        pane.add(p, 0, 4);
        
        password =new PasswordField();
        password.setFont(Font.font("Arial",12));
        password.setPadding(new Insets(5,5,5,5));
        GridPane.setColumnSpan(password, 2);
        
        password.setOnAction(new EventHandler<ActionEvent>() { // KeyEvent is gud
                @Override
                public void handle(ActionEvent event) {
                    
                    Label lower =new Label("Password must contain an uppercase character");
                    lower.setStyle("-fx-text-fill:RED");
                    
                    Label upper =new Label("SPassword must contain an lowercase character");
                    upper.setStyle("-fx-text-fill:RED");
                    
                    Label special =new Label("Password must contain a special character");
                    special.setStyle("-fx-text-fill:RED");
                    
                    Label shortp =new Label("Password is too short");
                    shortp.setStyle("-fx-text-fill:RED");

                    boolean hasUppercase = !password.getText().equals(password.getText().toLowerCase());
                    boolean hasLowercase = !password.getText().equals(password.getText().toUpperCase());
                    boolean hasSpecial   = !password.getText().matches("[A-Za-z0-9 ]*");
                    
                    if(!hasUppercase)
                        pane.addRow(++r, lower);
                    if(!hasLowercase)
                        pane.addRow(++r, upper);

                    if(!hasSpecial)
                        pane.addRow(++r, special);
                    
                    if(password.getText().length()<8)
                        pane.addRow(++r, shortp);
                }
            });

        pane.add(password, 1, 4);
        
        Label c=new Label("Confirm");
        c.setFont(Font.font("Arial",12));
        pane.add(c, 0, 5);
        
        confirmPassword=new PasswordField();
        confirmPassword.setFont(Font.font("Arial",12));
        confirmPassword.setPadding(new Insets(5,5,5,5));
        GridPane.setColumnSpan(confirmPassword, 2);
        
        confirmPassword.setOnAction(new EventHandler<ActionEvent>() { // KeyEvent is gud
                @Override
                public void handle(ActionEvent event) {
                    Label cf =new Label("Passwords don't match");
                    cf.setStyle("-fx-text-fill:RED");
                    if(!(confirmPassword.getText().equals(password.getText())))
                        pane.addRow(++r, cf);
                }
            });
        
        pane.add(confirmPassword, 1, 5);
        
        Label cb=new Label("Country");
        cb.setFont(Font.font("Arial",12));
        pane.add(cb, 0, 6);
        
        country=new ComboBox();
        country.setPadding(new Insets(2,5,2,5));
        pane.add(country, 1, 6);
        
        String s1="Select a country";
        country.getSelectionModel().select(s1);
        GridPane.setColumnSpan(country, 3);
        
        String s2="Japan";
        String s3="Lebanon";
        String s4="Mozambique";
        String s5="England";
        String s6="Uganda";
        String s7="United States of America";
        String s8="The Motherland";
        
        country.getItems().addAll(s1,s2,s3,s4,s5,s6,s7,s8);
        
        country.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Label noc =new Label("Country not selected");
                    noc.setStyle("-fx-text-fill:RED");

                    boolean isMyComboBoxEmpty = country.getSelectionModel().isSelected(0);
                    if(isMyComboBoxEmpty)
                        pane.addRow(++r, noc);
                }
            });
        
        Label g=new Label("Gender");
        g.setFont(Font.font("Arial",12));
        pane.add(g, 0, 7);
        
        RadioButton male=new RadioButton("Male");
        RadioButton female=new RadioButton("Female");
        
        final ToggleGroup group=new ToggleGroup();
        male.setToggleGroup(group);
        female.setToggleGroup(group);
        
        pane.add(male, 1, 7);
        pane.add(female, 2, 7);
        
        Label lang=new Label("Languages");
        lang.setFont(Font.font("Arial",12));
        pane.add(lang, 0, 8);
        
        CheckBox lang1=new CheckBox("Arabic");
        CheckBox lang2=new CheckBox("English");
        CheckBox lang3=new CheckBox("Spanish");
        
        pane.add(lang1,1,8);
        pane.add(lang2,2,8);
        pane.add(lang3,3,8);
        
        Label me=new Label("About You");
        me.setFont(Font.font("Arial",12));
        pane.add(me, 0, 9);
        
        aboutyou=new TextField();
        aboutyou.setPrefSize(300, 100);
        aboutyou.setPromptText("Your biography...");
        aboutyou.setAlignment(Pos.TOP_LEFT);
        aboutyou.setPadding(new Insets(5,5,5,5));
        
        aboutyou.setOnAction(new EventHandler<ActionEvent>() {
                
                @Override
                public void handle(ActionEvent event) {
                    Label tf =new Label("Not enough information is given");
                    tf.setStyle("-fx-text-fill:RED");

                    if(aboutyou.getText().length()<50)
                        pane.addRow(++r, tf);
                }
            });
        
        GridPane.setColumnSpan(aboutyou, 3);
        pane.add(aboutyou, 1, 9);
        
        register=new Button("Register");
        register.setFont(Font.font("Arial",12));
        register.setPadding(new Insets(5,150,5,150));
        pane.add(register, 0, 10);
        register.setAlignment(Pos.CENTER);
        GridPane.setColumnSpan(register, 4);
        
        register.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(name.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty() || password.getText().isEmpty() || confirmPassword.getText().isEmpty() || aboutyou.getText().isEmpty() ){
                    Label missing =new Label("Missing fields");
                    missing.setStyle("-fx-text-fill:RED");
                    pane.addRow(++r, missing); 
                }
                
                else {
                Label invalidName =new Label("Invalid name");
                invalidName.setStyle("-fx-text-fill:RED");
                if(name.getText().contains("0")){
                    pane.addRow(++r, invalidName);
                }
                if(name.getText().contains("1")){
                    pane.addRow(++r, invalidName);
                }
                if(name.getText().contains("2")){
                    pane.addRow(++r, invalidName);
                }
                if(name.getText().contains("3")){
                    pane.addRow(++r, invalidName);
                }
                if(name.getText().contains("4")){
                    pane.addRow(++r, invalidName);
                }
                if(name.getText().contains("5")){
                    pane.addRow(++r, invalidName);
                }
                if(name.getText().contains("6")){
                    pane.addRow(++r, invalidName);
                }
                if(name.getText().contains("7")){
                    pane.addRow(++r, invalidName);
                }
                if(name.getText().contains("8")){
                    pane.addRow(++r, invalidName);
                }
                if(name.getText().contains("9")){
                    pane.addRow(++r, invalidName);
                }
                
                Label invalidEmail =new Label("Invalid email address");
                invalidEmail.setStyle("-fx-text-fill:RED");
                if(!(email.getText().contains("@"))&&!(email.getText().contains(".")))
                    pane.addRow(++r, invalidEmail);
                
                Label invalidPhone =new Label("Invalid phone number");
                invalidPhone.setStyle("-fx-text-fill:RED");
                
                Label shortn =new Label("Short phone number");
                shortn.setStyle("-fx-text-fill:RED");
                
                boolean isNumbers=true;
                try{
                    double p= Double.parseDouble(phone.getText());
                }
                
                catch(NumberFormatException e){
                    isNumbers=false;
                }
                
                if(!isNumbers)
                    pane.addRow(++r, invalidPhone);
                
                if(phone.getText().length()<8 || phone.getText().length()>8)
                    pane.addRow(++r, shortn);
                
                Label lower =new Label("Password must contain an uppercase character");
                    lower.setStyle("-fx-text-fill:RED");
                    
                    Label upper =new Label("SPassword must contain an lowercase character");
                    upper.setStyle("-fx-text-fill:RED");
                    
                    Label special =new Label("Password must contain a special character");
                    special.setStyle("-fx-text-fill:RED");
                    
                    Label shortp =new Label("Password is too short");
                    shortp.setStyle("-fx-text-fill:RED");

                    boolean hasUppercase = !password.getText().equals(password.getText().toLowerCase());
                    boolean hasLowercase = !password.getText().equals(password.getText().toUpperCase());
                    boolean hasSpecial   = !password.getText().matches("[A-Za-z0-9 ]*");
                    
                    if(!hasUppercase)
                        pane.addRow(++r, lower);
                    if(!hasLowercase)
                        pane.addRow(++r, upper);

                    if(!hasSpecial)
                        pane.addRow(++r, special);
                    
                    if(password.getText().length()<8)
                        pane.addRow(++r, shortp);
                    
                    Label cf =new Label("Passwords don't match");
                    cf.setStyle("-fx-text-fill:RED");
                    if(!(confirmPassword.getText().equals(password.getText())))
                        pane.addRow(++r, cf);
                    
                    Label noc =new Label("Country not selected");
                    noc.setStyle("-fx-text-fill:RED");

                    boolean isMyComboBoxEmpty = country.getSelectionModel().isSelected(0);
                    if(isMyComboBoxEmpty)
                        pane.addRow(++r, noc);
                    
                    Label tf =new Label("Not enough information is given");
                    tf.setStyle("-fx-text-fill:RED");

                    if(aboutyou.getText().length()<50)
                        pane.addRow(++r, tf);
                }
                
                Label success =new Label("Registration Complete");
                success.setStyle("-fx-text-fill:GREEN");
                pane.addRow(++r, success);
            }
        });
        
        login=new Button("Login if you already have an account");
        login.setFont(Font.font("Arial",12));
        login.setPrefWidth(345);
        pane.add(login, 0, 11);
        login.setAlignment(Pos.CENTER);
        GridPane.setColumnSpan(login, 4);
        
        login.setOnAction(event -> {
            lf.start(primaryStage);
        });
        
        login.setOnMouseEntered(event -> {
            login.setCursor(Cursor.HAND);
        });
        
        register.setOnMouseEntered(event -> {
            register.setCursor(Cursor.HAND);
        });

        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("Registration Form");
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
