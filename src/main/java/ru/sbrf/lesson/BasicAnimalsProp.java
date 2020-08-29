package ru.sbrf.lesson;


public class BasicAnimalsProp {
    private String voice;
    private MoveTypes moveType;
    private double speed;
    private String food;

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public MoveTypes getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveTypes moveType) {
        this.moveType = moveType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public enum MoveTypes {NONE, GOING, RUNNIN, JAMPING, SWIMMING, CLIMBING_TREES, CRAWL}
}
