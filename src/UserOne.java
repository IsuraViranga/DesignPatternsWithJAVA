public class UserOne implements ObserverIn {
    private  String name;
    String newVideoname="";

    UserOne(String name){
        this.name=name;
    }

    @Override
    public void update(String newVideoname){
        this.newVideoname = newVideoname;
        System.out.println(name + " received new video " + newVideoname);
    }

}
