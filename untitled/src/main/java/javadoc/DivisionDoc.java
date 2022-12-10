package javadoc;
/**
 * Класс подразделения со свойствами <b>id</b> и <b>name</b>.
 * @autor Шашкина Мария
 * @version 18.0.1
 */
public class DivisionDoc {
    /** Поле id-индентификатор*/
    private int id;
    /** Поле name - имя*/
    private String name;
    /**
     * Конструктор - создание нового объекта с определенными значениями
     *      * @param id - производитель
     *      * @param name - имя
     *
     * @see DivisionDoc#DivisionDoc(int,String)
     */
    public DivisionDoc(int id, String name) {
        this.id = id;
        this.name = name;
    }
    /**
     * Функция получения значения поля {@link DivisionDoc#id}
     * @return возвращает идентификатор человека
     */
    public int getId() {
        return id;
    }
    /**
     * Процедура определения производителя {@link DivisionDoc#id}
     * @param id - идентификатор
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Процедура определения производителя {@link DivisionDoc#name}
     * @param //name - имя
     */
    public String getName() {
        return name;
    }
/**
        * Функция получения значения поля {@link DivisionDoc#name}
     * @return возвращает имя человека
     */
    public void setName(String name) {
        this.name = name;
    }
}
