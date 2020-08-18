package ru.sbrf.lesson;

public class Cat extends BasicAnimalsProp {
    private String name;
    private OtherAnimalsProp oap = new OtherAnimalsProp();

    public Cat(String name) {
        this.name = name;
        super.setFood("Вискас");
        super.setMoveType(MoveTypes.RUNNIN);
        super.setSpeed(10.0);
        super.setVoice("Мяу-мяу");
        oap.addOtherMovingTypes(MoveTypes.CLIMBING_TREES);
    }
}
