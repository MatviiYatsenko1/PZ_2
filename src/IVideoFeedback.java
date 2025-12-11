// Інтерфейс для видачі відгуку на відео
public interface IVideoFeedback {
    // Метод для надання відгуку на домашнє відео
    void giveFeedback(HomeworkVideo video, int timeStamp, String comment);
}
