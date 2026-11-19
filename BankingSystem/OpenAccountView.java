import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OpenAccountView extends Application {

    @Override
    public void start(Stage stage) {

        Label titleLabel = new Label("OPEN ACCOUNT");

        Label nameLabel = new Label("Customer Name:");
        TextField nameField = new TextField();

        Label accountTypeLabel = new Label("Account Type:");
        ComboBox<String> accountTypeBox = new ComboBox<>();

        accountTypeBox.getItems().addAll(
                "Savings Account",
                "Investment Account",
                "Cheque Account"
        );

        Button createButton = new Button("Create Account");

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                titleLabel,
                nameLabel,
                nameField,
                accountTypeLabel,
                accountTypeBox,
                createButton
        );

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Open Account");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}