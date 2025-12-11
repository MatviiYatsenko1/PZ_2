// Клас для представлення тренера в системі школи танців
public class Trainer extends Person implements IVideoFeedback {
    // Приватний атрибут для спеціалізації тренера
    private String specialization;
    
    // Конструктор
    public Trainer(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }
    
    // Геттер для спеціалізації
    public String getSpecialization() {
        return specialization;
    }
    
    // Реалізація абстрактного методу
    @Override
    public void displayInfo() {
        System.out.println("Тренер: " + getName() + ", Спеціалізація: " + specialization + ", Вік: " + getAge());
    }
    
    // Реалізація методу інтерфейсу IVideoFeedback
    @Override
    public void giveFeedback(HomeworkVideo video, int timeStamp, String comment) {
        System.out.println("Тренер " + getName() + " дає відгук на видео (позначка часу: " + timeStamp + "с)");
        System.out.println("Коментар: \"" + comment + "\"");
    }
}
