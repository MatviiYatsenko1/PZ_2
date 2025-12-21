// Клас для представлення учня в системі школи танців
public class Student extends Person {
    // Приватний атрибут для ідентифікатора учня
    private int studentId;
    // Агрегація: Student має HomeworkVideo
    private HomeworkVideo[] homeworkVideos;
    
    // Конструктор
    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
        this.homeworkVideos = new HomeworkVideo[5];
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
    
    // Агрегація: Добавити домашнє видео (учень може мати кілька домашніх видео)
    public void addHomeworkVideo(HomeworkVideo homework) {
        for (int i = 0; i < homeworkVideos.length; i++) {
            if (homeworkVideos[i] == null) {
                homeworkVideos[i] = homework;
                System.out.println("Учень " + getName() + " добавив домашнє видео: " + homework.getFilePath());
                return;
            }
        }
        System.out.println("Неможливо добавити більше домашніх видео. Масив заповнений.");
    }
    
    // Агрегація: Завантажити всі домашні видео
    public void uploadAllHomeworkVideos() {
        System.out.println("Учень " + getName() + " завантажує всі домашні видео:");
        for (HomeworkVideo homework : homeworkVideos) {
            if (homework != null) {
                homework.upload();
            }
        }
    }
    
    // Геттер для масиву домашніх видео
    public HomeworkVideo[] getHomeworkVideos() {
        return homeworkVideos;
    }
}
