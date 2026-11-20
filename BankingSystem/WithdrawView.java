import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WithdrawView extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("WITHDRAW FUNDS");

        Label accountLabel = new Label("Account Number:");
        TextField accountField = new TextField();

        Label amountLabel = new Label("Amount:");
        TextField amountField = new TextField();

        Button withdrawButton = new Button("Withdraw");
 withdrawButton.setOnAction(e -> {
String accountNumber = accountField.getText();

    try {

        double amount = Double.parseDouble(amountField.getText());

        resultLabel.setText(
            "Withdrawal of BWP " + amount + " successful."
        );

    } catch(NumberFormatException ex) {

        resultLabel.setText("Enter a valid amount.");
    }
});

    
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                title,
                accountLabel,
                accountField,
                amountLabel,
                amountField,
                withdrawButton
        );

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Withdraw Funds");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}