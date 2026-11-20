import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BalanceView extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("VIEW BALANCE");

        Label accountLabel = new Label("Account Number:");
        TextField accountField = new TextField();

        Label balanceLabel = new Label("Current Balance: BWP 0.00");
        Label resultLabel = new Label();
        Button searchButton = new Button("Search");

         // Button Action
        searchButton.setOnAction(e -> {

            String accountNumber = accountField.getText();
 balanceLabel.setText(
        "Current Balance for Account "
        + accountNumber
        + ": BWP 1000.00"
    );

});


        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                title,
                accountLabel,
                accountField,
                balanceLabel,
                searchButton,
                resultLabel
        );

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("View Balance");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}