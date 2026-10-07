public interface Channel {
    void addObserver(ObserverIn observer);
    void removeObserver(ObserverIn observer);
    void notifyListners();
}
