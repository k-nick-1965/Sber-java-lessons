package ru.sbrf.lesson;

import ru.sbrf.lesson.BasicAnimalsProp.MoveTypes;

import java.util.ArrayList;
import java.util.List;

public class OtherAnimalsProp {
    private List<MoveTypes> otherMovingTypes = new ArrayList<MoveTypes>();

    public List<MoveTypes> getOtherMovingTypes() {
        return otherMovingTypes;
    }

    public void setOtherMovingTypes(List<MoveTypes> otherMovingTypes) {
        this.otherMovingTypes = otherMovingTypes;
    }

    public void addOtherMovingTypes(MoveTypes omt) {
        this.otherMovingTypes.add(omt);
    }

}
