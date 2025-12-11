// Клас для представлення домашнього відео учня
public class HomeworkVideo {
    // Приватний атрибут для шляху до файлу
    private String filePath;
    
    // Конструктор
    public HomeworkVideo(String filePath) {
        this.filePath = filePath;
    }
    
    // Геттер для шляху до файлу
    public String getFilePath() {
        return filePath;
    }
    
    // Метод для завантаження видео на платформу
    public void upload() {
        System.out.println("📤 Завантаження видео: " + filePath);
    }
}
