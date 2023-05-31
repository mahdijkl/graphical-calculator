package ir.ac.kntu.gui;

import ir.ac.kntu.logic.Calculator;
import ir.ac.kntu.logic.Operator;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 * @author MAhdi Goudarzi
 */
public class CalculatorGui {
    //todo: declare gui nodes eg. calculator buttons and text-field
    private TextField display;

    private GridPane root = new GridPane();

    private Operator operator;

    private double num1 = 0;

    private double num2 = 0;

    Button button0 = new Button();

    Button button1 = new Button();

    Button button2 = new Button();

    Button button3 = new Button();

    Button button4 = new Button();

    Button button5 = new Button();

    Button button6 = new Button();

    Button button7 = new Button();

    Button button8 = new Button();

    Button button9 = new Button();


    Button buttonPlus = new Button();

    Button buttonMinus = new Button();

    Button buttonMultiple = new Button();

    Button buttonEqual = new Button();

    Button buttonDivide = new Button();

    Button buttonClear = new Button();


    public CalculatorGui() {
        //todo: initialize your fields.
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(10));
        setButtonsSize();
        setEventsHandlers();
        addNodesToPane(root);
    }

    public GridPane getRoot() {
        return root;
    }

    public void setEventsHandlers() {
        //todo: set your fields event handler on mouse clicked.
        //todo: use lambdas as much as possible :)
        button0.setOnAction(e -> appendToDisplay("0"));
        button1.setOnAction(e -> appendToDisplay("1"));
        button2.setOnAction(e -> appendToDisplay("2"));
        button3.setOnAction(e -> appendToDisplay("3"));
        button4.setOnAction(e -> appendToDisplay("4"));
        button5.setOnAction(e -> appendToDisplay("5"));
        button6.setOnAction(e -> appendToDisplay("6"));
        button7.setOnAction(e -> appendToDisplay("7"));
        button8.setOnAction(e -> appendToDisplay("8"));
        button9.setOnAction(e -> appendToDisplay("9"));
        buttonPlus.setOnAction(e -> setOperator(Operator.PLUS));
        buttonMinus.setOnAction(e -> setOperator(Operator.MINUS));
        buttonMultiple.setOnAction(e -> setOperator(Operator.MULTIPLY));
        buttonDivide.setOnAction(e -> setOperator(Operator.DIVIDE));
        buttonEqual.setOnAction(e -> calculate());
        buttonClear.setOnAction(e -> clearDisplay()); // Set the action for the clear button

    }

    private void clearDisplay() {
        operator = Operator.UNKNOWN;
        num1 = 0;
        num2 = 0;
        display.setText("");
    }

    private void setOperator(Operator op) {
        operator = op;
        num1 = Double.parseDouble(display.getText());
        display.setText("");
    }

    private void appendToDisplay(String value) {
        display.setText(display.getText() + value);
    }

    private void calculate() {
        if (!(operator == Operator.UNKNOWN)) {
            num2 = Double.parseDouble(display.getText());
            double result = 0;
            result = Calculator.calculate(num1, num2, operator);
            display.setText(String.valueOf(result));
            operator = Operator.UNKNOWN;
            num1 = 0;
            num2 = 0;
        }
    }

    public void setButtonsSize() {
        button7.setMinWidth(50);
        button7.setMinHeight(50);
        button8.setPrefWidth(50);
        button8.setPrefHeight(50);
        button9.setPrefWidth(50);
        button9.setPrefHeight(50);
        buttonPlus.setPrefWidth(50);
        buttonPlus.setPrefHeight(50);
        button4.setPrefWidth(50);
        button4.setPrefHeight(50);
        button5.setPrefWidth(50);
        button5.setPrefHeight(50);
        button6.setPrefWidth(50);
        button6.setPrefHeight(50);
        buttonMinus.setPrefWidth(50);
        buttonMinus.setPrefHeight(50);
        button1.setPrefWidth(50);
        button1.setPrefHeight(50);
        button2.setPrefWidth(50);
        button2.setPrefHeight(50);
        button3.setPrefWidth(50);
        button3.setPrefHeight(50);
        buttonDivide.setPrefWidth(50);
        buttonDivide.setPrefHeight(50);
        buttonClear.setPrefWidth(50);
        buttonClear.setPrefHeight(50);
        button0.setPrefWidth(50);
        button0.setPrefHeight(50);
        buttonEqual.setPrefWidth(50);
        buttonEqual.setPrefHeight(50);
        buttonMultiple.setPrefWidth(50);
        buttonMultiple.setPrefHeight(50);
    }

    public void addNodesToPane(GridPane root) {
        //todo: add your fields to pane in an appropriate order :)
        //todo: cast the pane to which child you need, eg. GridPane, VBox, etc.
        //todo: you can change signature of this method if you need more than a single pane.
        display = new TextField();
        display.setEditable(false);
        display.setPrefWidth(200);
        display.setPadding(new Insets(10));

        String imagePath = "file:C:/Users/moham/Documents/Java_floder/Hws/Hw10/t1-graphical-calculator/src/main/resources/buttons/";

        Image icon = new Image(imagePath + "0.jpg");
        ImageView imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        button0.setGraphic(imageView);

        icon = new Image(imagePath + "1.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        button1.setGraphic(imageView);


        icon = new Image(imagePath + "2.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        button2.setGraphic(imageView);

        icon = new Image(imagePath + "3.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        button3.setGraphic(imageView);

        icon = new Image(imagePath + "4.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        button4.setGraphic(imageView);

        icon = new Image(imagePath + "5.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        button5.setGraphic(imageView);

        icon = new Image(imagePath + "6.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        button6.setGraphic(imageView);

        icon = new Image(imagePath + "7.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        button7.setGraphic(imageView);

        icon = new Image(imagePath + "8.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        button8.setGraphic(imageView);

        icon = new Image(imagePath + "9.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        button9.setGraphic(imageView);

        icon = new Image(imagePath + "plus.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        buttonPlus.setGraphic(imageView);


        icon = new Image(imagePath + "minus.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        buttonMinus.setGraphic(imageView);


        icon = new Image(imagePath + "multiply.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        buttonMultiple.setGraphic(imageView);


        icon = new Image(imagePath + "equal.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        buttonEqual.setGraphic(imageView);


        icon = new Image(imagePath + "clear.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        buttonClear.setGraphic(imageView);

        icon = new Image(imagePath + "divide.jpg");
        imageView = new ImageView(icon);
        imageView.setFitWidth(button0.getPrefWidth());
        imageView.setFitHeight(button0.getPrefHeight());
        buttonDivide.setGraphic(imageView);

        root.add(display, 0, 0, 4, 1);
        root.add(button7, 0, 1);
        root.add(button8, 1, 1);
        root.add(button9, 2, 1);
        root.add(buttonPlus, 3, 1);
        root.add(button4, 0, 2);
        root.add(button5, 1, 2);
        root.add(button6, 2, 2);
        root.add(buttonMinus, 3, 2);
        root.add(button1, 0, 3);
        root.add(button2, 1, 3);
        root.add(button3, 2, 3);
        root.add(buttonDivide, 3, 3);
        root.add(buttonClear, 0, 4);
        root.add(button0, 1, 4);
        root.add(buttonEqual, 2, 4);
        root.add(buttonMultiple, 3, 4);
    }
}
