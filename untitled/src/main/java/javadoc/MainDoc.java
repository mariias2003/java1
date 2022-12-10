package javadoc;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import model.Division;
import model.Human;
import model.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
/**
 * Программа Main реализует приложение, которое позволяет получить объект типа </b>List</b> в котором
 * будут находится люди из файла
 * @autor Шашкина Мария
 * @version 18.0.1
 */
public class MainDoc {
/**
 * Функция сравнения скорости выполнения методов {@link MainDoc#main(String[])}
 * @value separator - разделитель для csv файла
 * @value csvFilePath - путь к csv файлу
 * @ArrayList<Human> people - для хранения людей
 * @HashSet<String> divisionSet - для временного заполнения списка подразделений (чтобы исключить повторения)
 * @ArrayList<Division> divisions - для хранения списка подразделений с ID

    */
    public static void main(String[] args) throws IOException {

        char separator = ';';
        String csvFilePath = "foreign_names.csv";
        ArrayList<Human> people = new ArrayList<Human>();
        HashSet<String> divisionSet = new HashSet<String>();
        ArrayList<Division> divisions = new ArrayList<Division>();
        //чтение из файла
        try (InputStream in = Main.class.getClassLoader().getResourceAsStream(csvFilePath);
             CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in)))  {
            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }
            String[] nextLine;
            reader.readNext(); /** Пропуск первой строки, т.к. данные в ней не подходят по формату*/

            while ((nextLine = reader.readNext()) != null) {
                /**  System.out.println(nextLine[0] +" " + nextLine[1]); */
                people.add(new Human(Integer.parseInt(nextLine[0]), nextLine[1], nextLine[2], nextLine[3], nextLine[4], Integer.parseInt(nextLine[5])));
                divisionSet.add(nextLine[4]);
            }


                 /**  Заполнение списка подразделений с генерацией id*/
            int id = 1000; /** начальное значение ID подразделений*/
            for (String divisionName : divisionSet){
                id++;
                divisions.add(new Division(id, divisionName));
            }

            /**  Вывод списка сотрудников:*/
            for (Human human : people) {
                System.out.print("id = " + human.getId() + ", ");
                System.out.print("name = " + human.getName() + ", ");
                System.out.print("gender = " + human.getGender() + ", ");
                System.out.print("Birthday = " + human.getBirthday() + ", ");
                System.out.print("Division = " + human.getDivision() + ", ");
                System.out.println("Salary = " + human.getZp());
            }
            /** Вывод списка подразделений:*/
            for (Division division : divisions) {
                System.out.print("id = " + division.getId() + ", ");
                System.out.println("name = " + division.getName() );
            }

        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}



