import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainMenuView extends Application {

    @Override
    public void start(Stage stage) {

        Button openAccountBtn = new Button("Open Account");
        Button depositBtn = new Button("Deposit Funds");
        Button withdrawBtn = new Button("Withdraw Funds");
        Button balanceBtn = new Button("View Balance");
        Button interestBtn = new Button("Pay Interest");
        Button exitBtn = new Button("Exit");

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                openAccountBtn,
                depositBtn,
                withdrawBtn,
                balanceBtn,
                interestBtn,
                exitBtn
        );

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Banking System Menu");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}