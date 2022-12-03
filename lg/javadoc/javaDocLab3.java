package javadoc;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
/*
 * Класс для сравнения скорости методов: заполнения, удаления, получения значения с помощью </b>ArrayList</b> и </b>Linked list</b>
 * @autor Шашкина Мария
 * @version 18.0.1
 */

public class javaDocLab3 {


    /**
     * Функция сравнения скорости выполнения методов {@link javaDocLab3#isFasted(long, long)}
     *
     * @return возвращает сообщение(String) наиболее быстрого(по времени) варианта срабатывания
     */
    public static String isFasted(long a, long l) {
        if (a == l) return "=";
        else if (a < l) return "Массив";
        else return "Список";
    }

    /**
     * Функция добавления значений в массив и список {@link javaDocLab3#timeAdd(int)}
     *
     * @param countNumber - кол-во элементов
     * @return возвращает строку(String), [кол-во вызовов, время выполнения, кто быстрее]
     * @value startArray - запуск таймера для массива
     * @value finishArray - конец таймера для массива
     * @value startList - запуск таймера для списка
     * @value startList - конец таймера для списка
     */
    public static String[] timeAdd(int countNumber) {
        ArrayList array = new ArrayList();
        Date startArray = new Date();
        for (int i = 0; i < countNumber; i++) {
            array.add(i);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        LinkedList list = new LinkedList();
        Date startList = new Date();
        for (int i = 0; i < countNumber; i++) {
            list.add(i);
        }
        Date finishList = new Date();
        long listTime = finishList.getTime() - startList.getTime();
        String[] s = {"Добавление", countNumber + "", arrayTime + "", listTime + "", isFasted(arrayTime, listTime)};
        return s;
    }

    /**
     * Функция удаления значений в массиве и списке {@link javaDocLab3#timeRemoveFromBegin(int)}
     *
     * @param countNumber - кол-во элементов
     * @return возвращает строку(String), [кол-во вызовов, время выполнения, кто быстрее]
     * @value startArray - запуск таймера для массива
     * @value finishArray - конец таймера для массива
     * @value startList - запуск таймера для списка
     * @value startList - конец таймера для списка
     */
    public static String[] timeRemoveFromBegin(int countNumber) {
        ArrayList array = new ArrayList();
        for (int i = 0; i < countNumber; i++) {
            array.add(i);
        }
        Date startArray = new Date();
        for (int i = 0; i < countNumber; i++) {
            array.remove(0);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        LinkedList list = new LinkedList();
        for (int i = 0; i < countNumber; i++) {
            list.add(i);
        }
        Date startList = new Date();
        for (int i = 0; i < countNumber; i++) {
            list.remove(0);
        }
        Date finishList = new Date();
        long listTime = finishList.getTime() - startList.getTime();
        String[] s = {"Удаление", countNumber + "", arrayTime + "", listTime + "", isFasted(arrayTime, listTime)};
        return s;
    }

    /**
     * Функция получения значений из массива и списка {@link javaDocLab3#timeGet(int)}
     *
     * @param countNumber - кол-во элементов
     * @return возвращает строку(String), [кол-во вызовов, время выполнения, кто быстрее]
     * @value startArray - запуск таймера для массива
     * @value finishArray - конец таймера для массива
     * @value startList - запуск таймера для списка
     * @value startList - конец таймера для списка
     */
    public static String[] timeGet(int countNumber) {
        int x = 0;
        ArrayList array = new ArrayList();
        for (int i = 0; i < countNumber; i++) {
            array.add(i);
        }
        Date startArray = new Date();
        for (int i = 0; i < countNumber; i++) {
            x = (int) array.get(i);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        LinkedList list = new LinkedList();
        for (int i = 0; i < countNumber; i++) {
            list.add(i);
        }
        Date startList = new Date();
        for (int i = 0; i < countNumber; i++) {
            x = (int) list.get(i);
        }
        Date finishList = new Date();
        long listTime = finishList.getTime() - startList.getTime();
        String[] s = {"Получить", countNumber + "", arrayTime + "", listTime + "", isFasted(arrayTime, listTime)};
        return s;
    }

    /**
     * Функция для заполнения таблицы значениями  {@link javaDocLab3#dataTable(int[])}
     *
     * @return возвращает таблицу со значениями
     */
    public static String[][] dataTable(int[] countNumber) {
        String[][] data = new String[12][];
        int index = 0;
        for (int i = 0; i < countNumber.length; i++) {
            data[index] = timeAdd(countNumber[i]);
            index++;
        }
        for (int i = 0; i < countNumber.length; i++) {
            data[index] = timeRemoveFromBegin(countNumber[i]);
            index++;
        }
        for (int i = 0; i < countNumber.length; i++) {
            data[index] = timeGet(countNumber[i]);
            index++;
        }
        return data;
    }

    /**
     * Функция создания таблицы {@link javaDocLab3#createTable(String[][])}
     *
     * @param data -передаем двумерный массив для размера таблицы
     * @value columnNames - колонка для названия столбцов
     */
    public static void createTable(String[][] data) {
        JFrame frame = new JFrame("Результат");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"Метод", "Кол-во вызовов", "Время для массива", "Время для списка", "Быстрее"};

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(1000, 500));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Основная функция программа, {@link javaDocLab3#main(String[])}
     *
     * @value callNamber - массив, в котором хранятся значения для кол-во вызовов
     * @value columnNames - колонка для названия столбцов
     */
    public static void main(String[] args) {
        int[] callNumber = {1000, 5000, 10000, 50000};
        String[][] data = dataTable(callNumber);

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createTable(data);
            }
        });
    }
}
