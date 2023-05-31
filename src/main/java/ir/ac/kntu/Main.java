package ir.ac.kntu;

import ir.ac.kntu.gui.CalculatorGui;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * @author MAhdi Goudarzi
 */
public class Main extends Application {

    public static void main(String[] args) {
        // todo: don't modify this method.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // todo: create a CalculatorGui.
        // todo: set its EventsHandlers.
        // todo: create some Panes.
        // todo: add your nodes to the panes (use CalculatorGui's interface
        // (addNodesToPane)).
        CalculatorGui calculatorGui = new CalculatorGui();
        GridPane root = calculatorGui.getRoot();

        Scene scene = new Scene(root);

        // todo: set your main pane to scene. (change argument of Scene constructor)
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        // todo: enjoy your graphical calculator.
    }
}