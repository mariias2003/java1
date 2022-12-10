package model;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {


    public static void main(String[] args) throws IOException {

        char separator = ';';
        String csvFilePath = "foreign_names.csv";
        ArrayList<Human> people = new ArrayList<Human>();
        HashSet<String> divisionSet = new HashSet<String>();
        ArrayList<Division> divisions = new ArrayList<Division>();

        try (InputStream in = Main.class.getClassLoader().getResourceAsStream(csvFilePath);
             CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in))) {
            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }
            String[] nextLine;
            reader.readNext();

            while ((nextLine = reader.readNext()) != null) {
                people.add(new Human(Integer.parseInt(nextLine[0]), nextLine[1], nextLine[2], nextLine[3], nextLine[4], Integer.parseInt(nextLine[5])));
                divisionSet.add(nextLine[4]);
            }


            int id = 1000;
            for (String divisionName : divisionSet) {
                id++;
                divisions.add(new Division(id, divisionName));
            }

            for (Human human : people) {
                System.out.print("id = " + human.getId() + ", ");
                System.out.print("name = " + human.getName() + ", ");
                System.out.print("gender = " + human.getGender() + ", ");
                System.out.print("Birthday = " + human.getBirthday() + ", ");
                System.out.print("Division = " + human.getDivision() + ", ");
                System.out.println("Salary = " + human.getZp());
            }

            for (Division division : divisions) {
                System.out.print("id = " + division.getId() + ", ");
                System.out.println("name = " + division.getName());
            }

        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}



