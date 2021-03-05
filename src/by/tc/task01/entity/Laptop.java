package by.tc.task01.entity;

import java.util.ArrayList;
public class Laptop extends Appliance{
    public double Battery_Capacity;
    public String OS;
    public int Memory_ROM;
    public int System_Memory;
    public double CPU;
    public int Display_Inches;

    @Override
    public ArrayList<String> getParametres() {
        ArrayList<String> parametres = new ArrayList<String>();
        parametres.add("BATTERY_CAPACITY");
        parametres.add("OS");
        parametres.add("MEMORY_ROM");
        parametres.add("SYSTEM_MEMORY");
        parametres.add("CPU");
        parametres.add("DISPLAY_INCHS");
        parametres.add("PRICE");
        return parametres;
    }

    @Override
    public void initializeFields(ArrayList<String> values) {
        Battery_Capacity=Double.parseDouble(values.get(0));
        OS=values.get(1);
        Memory_ROM=Integer.parseInt(values.get(2));
        System_Memory=Integer.parseInt(values.get(3));
        CPU=Double.parseDouble(values.get(4));
        Display_Inches=Integer.parseInt(values.get(5));
        Price=Integer.parseInt(values.get(6));
        Name="Laptop";
    }
    @Override
    public Object GetValueByParametr(String parametr){
        if (parametr.equals("BATTERY_CAPACITY")){
            return Battery_Capacity;
        }
        if (parametr.equals("OS")){
            return OS;
        }
        if (parametr.equals("MEMORY_ROM")){
            return Memory_ROM;
        }
        if (parametr.equals("SYSTEM_MEMORY")){
            return System_Memory;
        }
        if (parametr.equals("CPU")){
            return CPU;
        }
        if (parametr.equals("DISPLAY_INCHS")){
            return Display_Inches;
        }
        return null;
    }

    @Override
    public String getInformation() {
        String Information="Laptop: battery capacity - "+Battery_Capacity+", operating system - "+OS+
                ", memory ROM - "+Memory_ROM+", system memory - "+System_Memory+", CPU - "+CPU+", display inches - "+
                Display_Inches+", price - "+Price;
        return Information;
    }
}
