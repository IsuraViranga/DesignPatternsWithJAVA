public class VehicleFactory {

    Vehicle getVehicletoDrive(String type){
        switch(type){
            case "car":
                return new Car();
            case "van":
                return new Van();
            default:
                return null;
        }
    }

}
