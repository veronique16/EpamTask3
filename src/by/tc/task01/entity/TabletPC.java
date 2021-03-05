package by.tc.task01.entity;

import java.util.ArrayList;

public class TabletPC extends Appliance{
    public int Battery_Capacity;
    public int Display_Inches;
    public int Memory_ROM;
    public int Flash_Memory_Capacity;
    public String Color;
    @Override
    public Object GetValueByParametr(String parametr){
        if (parametr.equals("BATTERY_CAPACITY")){
            return Battery_Capacity;
        }
        if (parametr.equals("DISPLAY_INCHES")){
            return Display_Inches;
        }
        if (parametr.equals("MEMORY_ROM")){
            return Memory_ROM;
        }
        if (parametr.equals("FLASH_MEMORY_CAPACITY")){
            return Flash_Memory_Capacity;
        }
        if (parametr.equals("COLOR")){
            return Color;
        }
        return null;
    }
    @Override
    public ArrayList<String> getParametres() {
        ArrayList<String> parametres = new ArrayList<String>();
        parametres.add("BATTERY_CAPACITY");
        parametres.add("DISPLAY_INCHES");
        parametres.add("MEMORY_ROM");
        parametres.add("FLASH_MEMORY_CAPACITY");
        parametres.add("COLOR");
        parametres.add("PRICE");
        return parametres;
    }

    @Override
    public void initializeFields(ArrayList<String> values) {
        Battery_Capacity=Integer.parseInt(values.get(0));
        Display_Inches=Integer.parseInt(values.get(1));
        Memory_ROM=Integer.parseInt(values.get(2));
        Flash_Memory_Capacity=Integer.parseInt(values.get(3));
        Color=values.get(4);
        Price=Integer.parseInt(values.get(5));
        Name="TabletPC";
    }

    @Override
    public String getInformation() {
        String Information="Tablet PC: battery capacity - "+Battery_Capacity+", display inches - "+Display_Inches+
                ", memory ROM - "+Memory_ROM+", flash memory capacity - "+Flash_Memory_Capacity+", color - "+Color+
                ", price - "+Price;
        return Information;
    }
}
