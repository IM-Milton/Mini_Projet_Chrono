package com.example.mini_projet_chrono;

        import javafx.animation.Animation;
        import javafx.animation.KeyFrame;
        import javafx.animation.Timeline;
        import javafx.collections.ObservableList;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.css.FontCssMetaData;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.ListView;
        import javafx.scene.control.ScrollPane;
        import javafx.util.Duration;


public class StopwatchController {
    @FXML
    private ScrollPane paneTour;
    @FXML
    private Button startButton;
    @FXML
    private Button stopButton;
    @FXML
    private Button resetButton;
    @FXML
    private Button tourButton;

    private boolean pause;
    @FXML
    private Label timeLabel;

    @FXML
    private ScrollPane pane;

    @FXML
    private ListView<String> tourListView;

    private ObservableList<String> itemListView;

    private Timeline timeline;
    private int centiseconds = 0;

    @FXML
    private void initialize() {
        timeline = new Timeline(new KeyFrame(Duration.millis(10), this::updateTime));
        timeline.setCycleCount(Animation.INDEFINITE);
    }

    @FXML
    private void start(ActionEvent event) {
        pause = false;
        timeline.play();
    }

    @FXML
    private void stop(ActionEvent event) {
        pause = true;
        timeline.pause();
    }

    @FXML
    private void reset(ActionEvent event) {
        timeline.stop();
        centiseconds = 0;
        tourListView.getItems().clear();
        updateTime(null);
    }

    private void updateTime(ActionEvent event) {
        int heures = centiseconds / 360000;
        int minutes = centiseconds / 6000 % 60;
        int second = centiseconds / 100 % 60;
        int centiseconds = this.centiseconds % 100;
        //timeText.setText(String.format("%d:%02d", minutes, remainingSeconds));
        timeLabel.setText(String.format("%02d:%02d:%02d:%02d", heures, minutes, second, centiseconds));
        this.centiseconds++;
    }

    @FXML
    private void tour(ActionEvent event){
        if(pause == false){
            tourListView.getItems().add(timeLabel.getText());
        }

    }

}

