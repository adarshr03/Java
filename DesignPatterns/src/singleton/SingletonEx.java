package singleton;

public class SingletonEx {
    private static volatile SingletonEx obj;
    private SingletonEx(){}
    public static SingletonEx getInstanceOf(){
        if(obj==null){
            synchronized(SingletonEx.class){
                if(obj==null) {
                    obj = new SingletonEx();
                }
                }

            }
        return obj;
        }

    }
