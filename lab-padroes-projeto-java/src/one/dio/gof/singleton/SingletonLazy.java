package one.dio.gof.singleton;

/*
* Singleton "preguiçoso"
* @Author Vinicius
* */

public class SingletonLazy {
    private static SingletonLazy intancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (intancia == null) {
            intancia = new SingletonLazy();
        }
        return intancia;
    }
}
