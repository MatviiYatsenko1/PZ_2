// Клас для представлення адміністратора школи танців
public class Administrator extends Person {
    // Приватний атрибут для ролі адміністратора
    private String role;
    
    // Конструктор
    public Administrator(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }
    
    // Геттер для ролі
    public String getRole() {
        return role;
    }
    
    // Реалізація абстрактного методу
    @Override
    public void displayInfo() {
        System.out.println("Адміністратор: " + getName() + ", Роль: " + role + ", Вік: " + getAge());
    }
    
    // Метод для відкриття розкладу занять
    public void openSchedule() {
        System.out.println("Адміністратор " + getName() + " відкриває розклад занять");
        System.out.println("Понеділок: 18:00 - Латина");
        System.out.println("Середа: 19:00 - Стандарт");
        System.out.println("Субота: 17:00 - Латина");
    }
    
    // Метод для управління бронюванням репетицій
    public void manageBooking(Student student) {
        System.out.println("Адміністратор " + getName() + " обробляє бронювання учня " + student.getName());
        System.out.println("Репетиція заброньована на 2025-12-09 16:00");
    }
}
