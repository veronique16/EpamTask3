package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {

    public ApplianceDAOImpl() {
        try {
            objects = readFile("C:\\Users\\user\\Downloads\\Telegram Desktop\\jc1-les24-examples-criteria\\jc1-les24-examples-criteria\\resources\\appliances_db.txt");
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    ArrayList<Appliance> objects;

    @Override
    public Appliance find(Criteria criteria) {
        String groupName = criteria.getGroupSearchName();
        Map<String, Object> parametres = criteria.getCriteria();

        for (Map.Entry<String, Object> item : parametres.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }
        for (Appliance appliance : objects) {
            if (appliance.Name.equals(groupName)) {
                int counter = 0;
                for (Map.Entry<String, Object> p : parametres.entrySet()) {
                    counter++;
                    Object value = appliance.GetValueByParametr(p.getKey());
                    if (value.equals(p.getValue())) {
                        if (counter == parametres.size()) {
                            return appliance;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        // you may add your own code here

        return null;
    }

    // you may add your own code here
    public static ArrayList<Appliance> readFile(String path) throws IOException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Appliance> householdAppliances = new ArrayList<Appliance>();
        while ((line = reader.readLine()) != null) {
            if (line.equals("")) {
                continue;
            }
            int index = line.indexOf(':');
            String name = line.substring(0, index);
            Appliance ha = Appliance.getTech(name.trim());
            ArrayList<String> param = ha.getParametres();
            ArrayList<String> values = new ArrayList<>();
            for (int i = 0; i < param.size(); i++) {
                int start_index = line.indexOf(param.get(i)) + param.get(i).length() + 1;
                int end_index = i + 1 == param.size() ?
                        line.length() :
                        line.indexOf(param.get(i + 1)) - 2;
                String value = line.substring(start_index, end_index);
                values.add(value.trim());
            }
            ha.initializeFields(values);
            householdAppliances.add(ha);

        }
        return householdAppliances;

    }
}

//you may add your own new classes