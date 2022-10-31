package one.dio.gof.singleton;

/*
* Singleton "apressado"
* @Author Vinicius
* */

public class SingletonEager {
    private static SingletonEager intancia =  new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {

        return intancia;
    }
}
