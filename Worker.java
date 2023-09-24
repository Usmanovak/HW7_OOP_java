package observer;

public class Worker implements Observer{

    private String name;
    private String jobTitle;
    private int salary = 80000;

    public Worker(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean receiveOffer(String companyName, String jobTitle, int salary) {
        if (this.salary <= salary && this.jobTitle.equals(jobTitle)) {
            System.out.printf("Работник: %s: Мне нужна эта работа! (Компания: %s; Вакансия %s; Заработная плата: %d)\n", name, companyName, jobTitle, salary);
        return true;
        }    
        else {
            System.out.printf("Работник: %s: Я найду работу получше! (Компания: %s; Вакансия %s; Заработная плата: %d)\n", name, companyName, jobTitle, salary);
        return false;
        } 
    }
}
