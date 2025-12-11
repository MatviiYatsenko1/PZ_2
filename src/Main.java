// Головний клас для демонстрації роботи системи школи танців
public class Main {
    public static void main(String[] args) {
        System.out.println("=== DANCE SCHOOL SYSTEM ===\n");
        
        // Створення студента
        Student student1 = new Student("Maria", 20, 101);
        Student student2 = new Student("Petro", 22, 102);
        
        // Створення тренера
        Trainer trainer = new Trainer("Olha", 35, "Latin and Standard");
        
        // Створення адміністратора
        Administrator admin = new Administrator("Anna", 40, "Director");
        
        // Демонстрація інформації про осіб
        System.out.println("--- INFORMATION ABOUT PERSONS ---");
        student1.displayInfo();
        trainer.displayInfo();
        admin.displayInfo();
        System.out.println();
        
        // Демонстрація фінального методу
        System.out.println("--- FULL INFORMATION (FINAL METHOD) ---");
        System.out.println(student1.getFullDetails());
        System.out.println(trainer.getFullDetails());
        System.out.println();
        
        // ЗАЛЕЖНІСТЬ: Student залежить від VideoLesson
        System.out.println("--- SCENARIO 1: WATCHING VIDEO LESSON ---");
        VideoLesson lesson = new VideoLesson("Latin Basic Steps");
        student1.watchVideoLesson(lesson);
        System.out.println();
        
        // ЗАЛЕЖНІСТЬ: Student залежить від HomeworkVideo
        System.out.println("--- SCENARIO 2: SENDING HOMEWORK VIDEO ---");
        HomeworkVideo homework = new HomeworkVideo("homework_maria_01.mp4");
        student1.sendHomeworkVideo(homework);
        System.out.println();
        
        // РЕАЛІЗАЦІЯ: Trainer реалізує інтерфейс IVideoFeedback
        System.out.println("--- SCENARIO 3: PROVIDING FEEDBACK BY TRAINER ---");
        trainer.giveFeedback(homework, 45, "Excellent! Your turn is perfect. Keep working on movement precision.");
        System.out.println();
        
        // Фінальний метод Student
        System.out.println("--- SCENARIO 4: CONFIRMING PARTICIPATION ---");
        student1.confirmParticipation();
        System.out.println();
        
        // КОМПОЗИЦІЯ: Administrator управляє розкладом
        System.out.println("--- SCENARIO 5: MANAGING SCHEDULE ---");
        admin.openSchedule();
        System.out.println();
        
        // АГРЕГАЦІЯ: Administrator управляє бронюванням студентів
        System.out.println("--- SCENARIO 6: MANAGING BOOKING ---");
        admin.manageBooking(student2);
        System.out.println();
        
        // Демонстрація множинних студентів
        System.out.println("--- DEMONSTRATION WITH SECOND STUDENT ---");
        VideoLesson lesson2 = new VideoLesson("Standard Basics");
        student2.watchVideoLesson(lesson2);
        HomeworkVideo homework2 = new HomeworkVideo("homework_petro_01.mp4");
        student2.sendHomeworkVideo(homework2);
        trainer.giveFeedback(homework2, 30, "Good progress! Continue working on body position.");
        System.out.println();
        
        System.out.println("=== END OF DEMONSTRATION ===");
    }
}
