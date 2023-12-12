package com.example.mini_projet_chrono;

        import javafx.animation.Animation;
        import javafx.animation.KeyFrame;
        import javafx.animation.Timeline;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.text.Text;
        import javafx.util.Duration;

        import java.security.PrivateKey;
        import java.util.ArrayList;
        import java.util.Arrays;

public class StopwatchController {
    @FXML
    private Button startButton;
    @FXML
    private Button stopButton;
    @FXML
    private Button resetButton;

    @FXML
    private Label timeLabel;

    private ArrayList<Label> label;

    private Timeline timeline;
    private int centiseconds = 0;

    @FXML
    private void initialize() {
        timeline = new Timeline(new KeyFrame(Duration.millis(10), this::updateTime));
        timeline.setCycleCount(Animation.INDEFINITE);
    }

    @FXML
    private void start(ActionEvent event) {
        timeline.play();
    }

    @FXML
    private void stop(ActionEvent event) {
        timeline.pause();
    }

    @FXML
    private void reset(ActionEvent event) {
        timeline.stop();
        centiseconds = 0;
        updateTime(null);
    }

    private void updateTime(ActionEvent event) {
        int heures = centiseconds / 360000 % 24;
        int minutes = centiseconds / 6000 % 60;
        int second = centiseconds / 100 % 60;
        int miliseconds = this.centiseconds % 100;
        //timeText.setText(String.format("%d:%02d", minutes, remainingSeconds));
        timeLabel.setText(String.format("%02d:%02d:%02d:%02d", heures, minutes, second, miliseconds));
        this.centiseconds++;
    }

    @FXML
    private void tour(ActionEvent event){
        Label txtlbl = new Label();

    }
}

