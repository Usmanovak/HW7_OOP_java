package observer;

public class Program {
    public static void main(String[] args) {

        Publisher JobAgency = new JobAgency();

        Vacancy vacancy1 = new Vacancy("Программист", 90000);
        Vacancy vacancy2 = new Vacancy("Тестировщик", 70000);
        Vacancy vacancy3 = new Vacancy("Лидогенератор", 30000);

        Company google = new Company("Google", JobAgency, vacancy1);
        Company yandex = new Company("Yandex", JobAgency, vacancy2);
        Company geekBrains = new Company("Geek Brains", JobAgency, vacancy3);

        Student student1 = new Student("Глеб", "Тестировщик");
        Student student2 = new Student("Алексей", "Лидогенератор");
        Worker worker1 = new Worker("Алевтина", "Программист");
        Freelancer freelancer1 = new Freelancer("Александр", "Тестировщик");
    
        

        JobAgency.registerObserver(student1);
        JobAgency.registerObserver(student2);
        JobAgency.registerObserver(worker1);
        JobAgency.registerObserver(freelancer1);

        for (int i=0; i<4; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }

    }
}
