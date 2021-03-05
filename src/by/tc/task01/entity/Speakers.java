package by.tc.task01.entity;

import java.util.ArrayList;

public class Speakers extends Appliance{
    public int Power_Consumption;
    public int Number_Of_Speakers;
    public String Frequency_Range;
    public int Cord_Length;
    @Override
    public Object GetValueByParametr(String parametr){
        if (parametr.equals("POWER_CONSUMPTION")){
            return Power_Consumption;
        }
        if (parametr.equals("NUMBER_OF_SPEAKERS")){
            return Number_Of_Speakers;
        }
        if (parametr.equals("FREQUENCY_RANGE")){
            return Frequency_Range;
        }
        if (parametr.equals("CORD_LENGTH")){
            return Cord_Length;
        }
        return null;
    }
    @Override
    public ArrayList<String> getParametres() {
        ArrayList<String> parametres = new ArrayList<String>();
        parametres.add("POWER_CONSUMPTION");
        parametres.add("NUMBER_OF_SPEAKERS");
        parametres.add("FREQUENCY_RANGE");
        parametres.add("CORD_LENGTH");
        parametres.add("PRICE");
        return parametres;
    }

    @Override
    public void initializeFields(ArrayList<String> values) {
        Power_Consumption=Integer.parseInt(values.get(0));
        Number_Of_Speakers=Integer.parseInt(values.get(1));
        Frequency_Range=values.get(2);
        Cord_Length=Integer.parseInt(values.get(3));
        Price=Integer.parseInt(values.get(4));
        Name="Speakers";
    }

    @Override
    public String getInformation() {
        String Information="Speaker: power consumption - "+Power_Consumption+", number of speakers - "+
                Number_Of_Speakers+", frequency range - "+Frequency_Range+", cord length - "+Cord_Length+
                ", price - "+Price;
        return Information;
    }
}
