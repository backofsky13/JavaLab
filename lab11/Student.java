package lab11; //11
public class Student {
    private Long id;
    private String name;
    private Integer totalScore;
    public Student(long id, String name, int totalScore) {
        // Инициализация полей объекта с переданными значениями
        this.id = id;
        this.name = name;
        this.totalScore = totalScore;
    }
    // Геттер для получения идентификатора студента
    public Long getId() {
        return id;
    }
    // Сеттер для установки идентификатора студента
    public void setId(long id) {
        this.id = id;
    }
    // Геттер для получения имени студента
    public String getName() {
        return name;
    }
    // Сеттер для установки имени студента
    public void setName(String name) {
        this.name = name;
    }
    // Геттер для получения общего балла студента
    public Integer getTotalScore() {
        return totalScore;
    }
    // Сеттер для установки общего балла студента
    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
    // Переопределение метода toString для представления объекта в виде строки
    public String toString() {
        return "Student " + "id = " + id + ", name = '" + name + '\'' + ", totalScore = " + totalScore;
    }
}