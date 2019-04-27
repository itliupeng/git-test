package com.itheima;

/*public class Singleton {

    private static  Singleton singleton = new Singleton();


    private Singleton(){

    }

    public static Singleton getInstace(){
        return singleton;
    }

    public static void main(String[] args) {
    Singleton.getInstace();
    }
}*/

public class Singleton {

    private static  Singleton singleton;


    private Singleton(){

    }

    public static synchronized Singleton getInstace(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public static  void main(String[] args) {
        Singleton.getInstace();
    }
}
