// Клас для представлення учня в системі школи танців
public class Student extends Person {
    // Приватний атрибут для ідентифікатора учня
    private int studentId;
    
    // Конструктор
    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    
    // Геттер для ID учня
    public int getStudentId() {
        return studentId;
    }
    
    // Реалізація абстрактного методу
    @Override
    public void displayInfo() {
        System.out.println("Учень: " + getName() + ", ID: " + studentId + ", Вік: " + getAge());
    }
    
    // Метод для перегляду відеоуроку
    public void watchVideoLesson(VideoLesson lesson) {
        System.out.println("Учень " + getName() + " переглядає відеоурок: \"" + lesson.getTitle() + "\"");
        lesson.play();
    }
    
    // Метод для надсилання домашнього завдання
    public void sendHomeworkVideo(HomeworkVideo homework) {
        System.out.println("Учень " + getName() + " надсилає домашнє видео");
        homework.upload();
    }
    
    // Фінальний метод для підтвердження участі у репетиції
    public final void confirmParticipation() {
        System.out.println("Учень " + getName() + " підтвердив участь у репетиції");
    }
}
