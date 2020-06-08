import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class myfa extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        
        // Layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(20);
        grid.setVgap(20);
        grid.setPadding(new Insets(25,25,25,25));
        
        // Welcome Message
        Text scenetitle = new Text("Welcome");
        //scenetitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,20));
        scenetitle.setId("welcome");
        grid.add(scenetitle, 0, 0, 2, 1);
        
        // UserName
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        
        //UserName Input
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        
        //Password
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        
        // Password Input
        PasswordField pwb = new PasswordField();
        grid.add(pwb, 1, 2);
        
        // Button
        Button btn = new Button("Sign In");
        HBox hbbtn = new HBox(10);
        hbbtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbbtn.getChildren().add(btn);
        grid.add(hbbtn, 1, 4);
        
        // Final Text for Displaying the Message
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
        	public void handle(ActionEvent e) {
        		//actiontarget.setFill(Color.FIREBRICK);
        		actiontarget.setId("action");
        		actiontarget.setText("Sign in button pressed");
        	}
        });
        Scene scene = new Scene(grid,300,275);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(myfa.class.getResource("login.css").toExternalForm());
        primaryStage.show();
    }
}

/* css part

.root {
   -fx-background-image: url("background.jpg");
}
.label {
  -fx-font-size: 20px;
  -fx-font-weight: bold;
  -fx-text-fill: #333333;
  -fx-effect: dropshadow(gaussian, rgba(255,255,255,0.5), 0,0,0,1);
}
#welcome {
 -fx-font-size: 32px;
 -fx-font-family: "Arial Black";
 -fx-fill: #818181;
 -fx-effect: innershadow(three-pass-box , rgba(0,0,0,0.7) , 6, 0.0 , 0 , 2 );
}
#action {
 -fx-fill: FIREBRICK;
 -fx-font-weight: bold;
 -fx-effect: dropshadow( gaussian , rgba(255,255,255,0.5) , 0,0,0,1 );
}
.button {
 -fx-text-family: white;
 -fx-font-family: "Arial Narrow";
 -fx-font-weight: bold;
 -fx-background-color: linear-gradient(#61a2b1, #2A5058);
 -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );
}
.button:hover {
  -fx-background-color: linear-gradient(#2A5058, #61a2b1);
}

*/
