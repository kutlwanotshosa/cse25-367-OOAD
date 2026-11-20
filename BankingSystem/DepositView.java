import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DepositView extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("DEPOSIT FUNDS");

        Label accountLabel = new Label("Account Number:");
        TextField accountField = new TextField();

        Label amountLabel = new Label("Amount:");
        TextField amountField = new TextField();
        Label resultLabel =new Label();

        Button depositButton = new Button("Deposit");
        depositButton.setOnAction(e -> {

            String accountNumber = accountField.getText();

            try{

                double amount = Double.parseDouble(amountField.getText());
               if(accountNumber.isEmpty()) {
                  resultLabel.setText("Please enter an account number.");
} else{
    resultLabel.setText(
        "Deposit of BWP " + amount +
        " successful into account " +
        accountNumber
    );
}
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
                depositButton,
                resultLabel

        );

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Deposit Funds");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}