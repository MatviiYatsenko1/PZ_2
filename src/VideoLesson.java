// Клас для представлення відеоуроку
public class VideoLesson {
    // Приватний атрибут для назви уроку
    private String title;
    
    // Конструктор
    public VideoLesson(String title) {
        this.title = title;
    }
    
    // Геттер для назви уроку
    public String getTitle() {
        return title;
    }
    
    // Метод для відтворення відеоуроку
    public void play() {
        System.out.println(" Відтворення уроку: \"" + title + "\" ...");
    }
}
