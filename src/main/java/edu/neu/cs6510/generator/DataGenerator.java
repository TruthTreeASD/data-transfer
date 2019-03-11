package edu.neu.cs6510.generator;

import edu.neu.cs6510.model.AttributeEnum;
import org.springframework.stereotype.Service;

import java.io.*;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.HashMap;

@Service
public class DataGenerator {

    private String[] headers = {};

    public static void main(String[] args) throws IllegalAccessException, IOException, InstantiationException {
        System.out.println("start");
        //read csv
        new DataGenerator().insert(new File("E:\\cs6510\\data-inserter\\The Government Finance Database_All Data.csv"));
        System.out.println("done!");
    }


    public void insert(File file) throws IOException, InstantiationException, IllegalAccessException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        Writer out = new FileWriter("data.csv",true);
        out.write("attributeid,locationid,year,value\n");
        headers = line.split(",");
        HashMap<Integer, AttributeEnum> headerMap = new HashMap<>();
        for(int i = 0; i < headers.length; i++) {
            try {
                Integer id = AttributeEnum.valueOf(headers[i]).getValue();
                headerMap.put(i, AttributeEnum.valueOf(headers[i]));
            } catch (Exception e) {
                System.out.println(headers[i]);
            }
        }

        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            //chose type code
            if (!values[6].equals("2")) {
                continue;
            }
            Integer location_id = Integer.valueOf(values[3]);
            Integer year = Integer.valueOf(values[1]);
            for (int i = 4; i < values.length; i++) {
                if (!headerMap.containsKey(i) || values[i].isEmpty()||values[i].equals("0")) {
                    continue;
                } else {
                    LookUp lookUp = new LookUp(headerMap.get(i).getValue(),location_id, year, values[i]);
                    //System.out.println(lookUp);
                    out.write(lookUp.toString());
                }
            }
        }
        out.close();
        reader.close();

    }

    private void insert(HashMap<String, String> map) throws IllegalAccessException, InstantiationException {

    }

    private void fillin(HashMap<String, String> map, Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String val = map.get(field.getName());
            try {
                if (val.length() == 0) continue;
            } catch (NullPointerException e) {
                System.out.println(map.toString());
                System.out.println(field.getName());
                System.exit(1);
            }

            try {
                field.set(obj, new BigDecimal(map.get(field.getName())));
            } catch (IllegalArgumentException e) {
                field.set(obj, map.get(field.getName()));
            }

        }
    }

    private HashMap<String, String> getHeader(String line) {
        HashMap<String, String> map = new HashMap<>();
        line = line.substring(1, line.length() - 1);
        headers = line.split("\',\'");
        for (String header : headers) {
            map.put(convertToJava(header.toLowerCase()), null);
        }
        return map;
    }

    private String convertToJava(String key) {
        String[] words = key.split("_");
        String res = toUppercase4FirstLetter(words);
        return res;
    }

    private String toUppercase4FirstLetter(String... words){
        StringBuffer buffer = new StringBuffer();
        if(words != null && words.length > 0){
            for(int i=0;i<words.length;i++){
                String word = words[i];
                if (word.length() == 0) continue;
                String firstLetter = word.substring(0, 1);
                String others = word.substring(1);
                String upperLetter = null;
                if(i != 0){
                    upperLetter = firstLetter.toUpperCase();
                } else {
                    upperLetter = firstLetter;
                }
                buffer.append(upperLetter).append(others);
            }
            return buffer.toString();
        }
        return "";
    }


}
