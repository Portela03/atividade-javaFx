import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Create Labels and TextFields for username and password
        Label usernameLabel = new Label("Username:");
        TextField usernameTextField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordTextField = new PasswordField();

        // Create Login Button
        Button loginButton = new Button("Login");
        loginButton.setPrefWidth(200);
        loginButton.setDefaultButton(true);
        loginButton.setOnAction(event -> {
            System.out.println("Username: " + usernameTextField.getText());
            System.out.println("Password: " + passwordTextField.getText());
        });

        // Create a VBox for the login form
        VBox loginForm = new VBox(10);
        loginForm.setId("loginForm");
        loginForm.setAlignment(Pos.CENTER);
        loginForm.setPadding(new Insets(30));
        loginForm.getChildren().addAll(usernameLabel, usernameTextField, passwordLabel, passwordTextField, loginButton);

        // Set up the scene and stage
        Scene scene = new Scene(loginForm, 400, 300);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        primaryStage.setTitle("Login Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
