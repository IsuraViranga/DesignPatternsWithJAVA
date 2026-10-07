public class MilkCoffe implements Coffe {
    Coffe coffe;

    MilkCoffe(Coffe coffe){
        this.coffe=coffe;
    }

    public String getDescription(){
        return coffe.getDescription() + " milk added";
    }

    public int getCost(){
        return coffe.getCost() + 40;
    }
}
