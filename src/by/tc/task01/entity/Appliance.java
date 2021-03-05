package by.tc.task01.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Appliance {
    public int Price;
    public String Name;

    public abstract ArrayList<String> getParametres();

    public abstract void initializeFields(ArrayList<String> values);

    public abstract String getInformation();
    public abstract Object GetValueByParametr(String parametr);

    public static Appliance getTech(String name) {
        switch (name) {
            case ("Oven"):
                return new Oven();
            case ("Laptop"):
                return new Laptop();
            case ("Refrigerator"):
                return new Refrigerator();
            case ("VacuumCleaner"):
                return new VacuumCleaner();
            case ("TabletPC"):
                return new TabletPC();
            case ("Speakers"):
                return new Speakers();
            default:
                System.out.println(name);
                return null;
        }
    }

}
