package ru.synergyIT.Enums;

import java.util.Random;

public enum Name {
    Алексей, Иван, Сергей, Андрей, Геннадий, Илья, Вадим;

    public static String getRandomName() {
        Name[] values = Name.values ();
        int lenght = values.length;
        int randIndex = new Random ().nextInt ( lenght );
        return String.valueOf ( values[randIndex] );
    }
}
