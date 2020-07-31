package ru.synergyIT;

import ru.synergyIT.Enums.Name;
import ru.synergyIT.Enums.Secondname;
import ru.synergyIT.Enums.Surname;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class EmployeeRunner {

    public static void main(String[] args) {
        Random random = new Random ();
        ArrayList<Employee> employees = new ArrayList<> ();

        for (int i = 0; i < 10; i++) {
            Employee e = new Employee ();
            String eSurname = Surname.getRandomSurname ();
            e.setSurname ( eSurname );
            String eName = Name.getRandomName ();
            e.setName ( eName );
            String eSecondname = Secondname.getRandomSecondname ();
            e.setSecondname ( eSecondname );
            e.setWorkAge ( random.nextInt ( 50 ) );
            employees.add ( e );
            e.printEmployee ();
        }
        System.out.println ( "--------------------------------------------------" );
        printEmployeeWithWorkAge ( employees , 30 );
    }

    public static void printEmployeeWithWorkAge(ArrayList<Employee> employees , int workAge) {
        for (Iterator<Employee> e = employees.iterator (); e.hasNext (); ) {
            Employee em = e.next ();
            if (em.getWorkAge () >= workAge) {
                em.printEmployee ();
            }
        }
    }

}
