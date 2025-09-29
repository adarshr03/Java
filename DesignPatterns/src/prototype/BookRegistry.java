package prototype;

import javax.swing.text.Document;
import java.util.HashMap;
import java.util.Map;

public class BookRegistry {
    private Map<String,BookProtoType> allPrototypes= new HashMap<>();
    public void addPrototypes(String key,BookProtoType prototype){
        allPrototypes.put(key,prototype) ;
    }
    public BookProtoType getClonedBookPrototype(String key){
        BookProtoType p = allPrototypes.get(key);
        if(p!=null){
            return p.clone();
        }else{
            throw new IllegalArgumentException("No prototype found for given key");
        }
    }

}
