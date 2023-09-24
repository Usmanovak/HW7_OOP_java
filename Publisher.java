package observer;



public interface Publisher {
   
    Observer sendOffer(String companyName, String vacancy, int salary);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

}
