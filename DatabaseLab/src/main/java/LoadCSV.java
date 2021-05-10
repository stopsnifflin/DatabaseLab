import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;


public class LoadCSV {
    public static void main(String[] args) {

        Map<String, String> foodMap = new HashMap<String, String>();
        foodMap.put("ID", "foodNum");
        foodMap.put("name", "food");
        foodMap.put("calories", "calorie");


        HeaderColumnNameTranslateMappingStrategy<FoodTable> strategy =
                new HeaderColumnNameTranslateMappingStrategy<FoodTable>();
        strategy.setType(FoodTable.class);
        strategy.setColumnMapping(foodMap);

        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader
                    ("nutrition.csv"));
        } catch (FileNotFoundException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        CsvToBean csvToBean = new CsvToBean<>();

        // call the parse method of CsvToBean
        // pass strategy, csvReader to parse method
        List<FoodTable> list = csvToBean.parse(strategy, csvReader);

        for (FoodTable e : list) {
            System.out.println(e);
        }
    }

        }



