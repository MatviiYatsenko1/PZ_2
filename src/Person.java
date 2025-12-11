// Абстрактний клас для представлення особи в системі школи танців
public abstract class Person {
    // Приватні атрибути
    private String name;
    private int age;
    
    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Геттери
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Сеттери
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Абстрактний метод, який мають реалізувати потомки
    public abstract void displayInfo();
    
    // Фінальний метод, який не може бути перевизначений
    public final String getFullDetails() {
        return "Ім'я: " + name + ", Вік: " + age;
    }
}
