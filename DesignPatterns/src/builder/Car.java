package builder;

public class Car {
    private final String modelType;
    private final String colour;

    @Override
    public String toString() {
        return "Car{" +
                "modelType='" + modelType + '\'' +
                ", colour='" + colour + '\'' +
                ", havingNitrousBooster=" + havingNitrousBooster +
                ", tractionController=" + tractionController +
                '}';
    }

    //optional
    private final boolean havingNitrousBooster;
    private final boolean tractionController;

    public Car(String modelType, String colour, boolean havingNitrousBooster, boolean tractionController) {
        this.modelType = modelType;
        this.colour = colour;
        this.havingNitrousBooster = havingNitrousBooster;
        this.tractionController = tractionController;
    }

    public Car(CarBuilder carBuilder) {
        this.colour=carBuilder.colour;
        this.modelType=carBuilder.modelType;
        this.havingNitrousBooster=carBuilder.havingNitrousBooster;
        this.tractionController=carBuilder.tractionController;
    }

    public static class CarBuilder{
    private final String modelType;
    private final String colour;
    private  boolean havingNitrousBooster =false;
    private  boolean tractionController =false;
    public CarBuilder(String modelType, String colour) {
        this.modelType = modelType;
        this.colour = colour;
    }

    public CarBuilder setHavingNitrousBooster(boolean havingNitrousBooster) {
        this.havingNitrousBooster = havingNitrousBooster;
        return this;
    }

    public CarBuilder setTractionController(boolean tractionController) {
        this.tractionController = tractionController;
        return this;
    }
    public Car build(){
       return new Car(this);
    }


}


}
