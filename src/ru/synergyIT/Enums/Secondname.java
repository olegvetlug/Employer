package ru.synergyIT.Enums;

import java.util.Random;

public enum Secondname {
    Алексеевич, Иванович, Сергеевич, Андреевич, Геннадьевич, Ильич, Вадимович;

    public static String getRandomSecondname() {
        Secondname[] values = Secondname.values ();
        int lenght = values.length;
        int randIndex = new Random ().nextInt ( lenght );
        return String.valueOf ( values[randIndex] );
    }
}
