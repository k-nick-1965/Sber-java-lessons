package ru.sbrf.lesson;

public class Dog extends BasicAnimalsProp {
    private String name;
    private OtherAnimalsProp oap = new OtherAnimalsProp();

    public Dog(String name) {
        this.name = name;
        super.setFood("Cat");
        super.setMoveType(MoveTypes.RUNNIN);
        super.setSpeed(9.5);
        super.setVoice("Гав-гав");
        oap.addOtherMovingTypes(MoveTypes.SWIMMING);
    }
}
