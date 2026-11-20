import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView extends Application {

    @Override
    public void start(Stage stage) {

        Label titleLabel = new Label("BANKING SYSTEM LOGIN");

        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Label resultLabel = new Label();

        Button loginButton = new Button("Login");

        loginButton.setOnAction(e -> {

    String username = usernameField.getText();
    String password = passwordField.getText();

    if(username.equals("admin") && password.equals("1234")) {

        try {
            new MainMenuView().start(new Stage());
            stage.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }

    } else {
        titleLabel.setText("Invalid Username or Password");
    }
});


        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                titleLabel,
                usernameLabel,
                usernameField,
                passwordLabel,
                passwordField,
                loginButton,
                resultLabel
        );

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Banking System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}