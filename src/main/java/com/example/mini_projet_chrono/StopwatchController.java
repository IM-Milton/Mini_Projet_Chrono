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
    private int seconds = 0;

    @FXML
    private void initialize() {
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), this::updateTime));
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
        seconds = 0;
        updateTime(null);
    }

    private void updateTime(ActionEvent event) {
        int heures = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        int remainingSeconds = seconds % 60;
        //timeText.setText(String.format("%d:%02d", minutes, remainingSeconds));
        timeLabel.setText(String.format("%02d:%02d:%02d", heures, minutes, remainingSeconds));
        seconds++;
    }

    @FXML
    private void tour(ActionEvent event){
        Label txtlbl = new Label();

    }
}

