package prototype;

public class ProtoTypeDriver {
    public static void main(String args[]){
        BookRegistry registry =new BookRegistry();
BookProtoType templateToCopy = new BookProtoType("HarryPotter","JK","Fantasy");
        registry.addPrototypes("TEMPLATE",templateToCopy);
    BookProtoType prototype2 =registry.getClonedBookPrototype("TEMPLATE");
        prototype2.setTitle("Rich Dad Poor Dad");
        System.out.println("The hashcode of templateToCopy is "+templateToCopy.hashCode());
        System.out.println("\nThe hashcode of prototype2 is "+prototype2.hashCode());
    }
}
