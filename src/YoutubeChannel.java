import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel{
    List<ObserverIn>oberverList = new ArrayList<>();
    String newVideoName;

    @Override
    public void addObserver(ObserverIn observer){
        oberverList.add(observer);
    }

    @Override
    public void removeObserver(ObserverIn observer){
        oberverList.remove(observer);
    }

    @Override
    public void notifyListners(){
        for (ObserverIn observerIn : oberverList) {
            observerIn.update(newVideoName);
        }
    }

    void updateNewVideo(String newVideoName){
        this.newVideoName=newVideoName;
        notifyListners();
    }

}
