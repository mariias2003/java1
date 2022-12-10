package javadoc;
/**
 * Класс подразделения со свойствами <b>id</b>, <b>name</b>, <b>zp</b>, , <b>gender</b>, <b>birthday</b>, <b>division</b>.
 * @autor Шашкина Мария
 * @version 18.0.1
 */
public class HumanDoc {
    /** Поле id-индентификатор, zp-зарплата */
    private int id, zp;
    /** Поле данных человека*/
    private String name, gender, birthday, division;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     *      * @param id - производитель
     *      * @param name - имя
     *      * @param gender - пол
     *      * @param birthday - дата рождения
     *      * @param division - подразделение
     *      * @param zp - зарплата
     * @see HumanDoc#HumanDoc(int,String,String,String,String,int)
     */
    public HumanDoc(int id, String name, String gender, String birthday, String division, int zp) {
        this.id = id;
        this.division = division;
        this.zp = zp;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }
    /**
     * Функция получения значения поля {@link HumanDoc#id}
     * @return возвращает идентификатор человека
     */
    public int getId() {
        return id;
    }
    /**
     * Процедура определения производителя {@link HumanDoc#id}
     * @param id - идентификатор
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Функция получения значения поля {@link HumanDoc#zp}
     * @return возвращает зарплату
     */
    public int getZp() {
        return zp;
    }
    /**
     * Процедура определения производителя {@link HumanDoc#zp}
     * @param zp - зарплата
     */
    public void setZp(int zp) {
        this.zp = zp;
    }
    /**
     * Функция получения значения поля {@link HumanDoc#name}
     * @return возвращает имя человека
     */
    public String getName() {
        return name;
    }
    /**
     * Процедура определения производителя {@link HumanDoc#name}
     * @param name - имя
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Функция получения значения поля {@link HumanDoc#gender}
     * @return возвращает пол человека
     */
    public String getGender() {
        return gender;
    }
    /**
     * Процедура определения производителя {@link HumanDoc#gender}
     * @param gender - пол человека
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Функция получения значения поля {@link HumanDoc#birthday}
     * @return возвращает дату рождения
     */
    public String getBirthday() {
        return birthday;
    }
    /**
     * Процедура определения производителя {@link HumanDoc#birthday}
     * @param birthday - дата рождения
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    /**
     * Функция получения значения поля {@link HumanDoc#division}
     * @return возвращает подразделение
     */
    public String getDivision() {
        return division;
    }
    /**
     * Процедура определения производителя {@link HumanDoc#division}
     * @param division - подразделение
     */
    public void setDivision(String division) {
        this.division = division;
    }
}
