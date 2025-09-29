package singleton;

public class Main {
    public static void main(String[] args) {
       //---------SINGLETON STARTS------------------
    SingletonEx obj1 =SingletonEx.getInstanceOf();
        SingletonEx obj2 =SingletonEx.getInstanceOf();
        System.out.println("The hashcode of obj1 is "+obj1.hashCode());
        System.out.println("\nThe hashcode of obj2 is "+obj2.hashCode());
        if(obj1==obj2){
            System.out.println("Same instance is utilised for both");
        }else{
            System.out.println("different instance is utilised for both");
        }

    }
}