package builder;

public class CarDriver
{
    public static void main(String args[]){
        Car figo =new Car.CarBuilder("ford","orange").setHavingNitrousBooster(true).build();
   System.out.println(figo.toString()); }
}
