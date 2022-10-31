package one.dio.gof.singleton;

/*
* Singleton "Lazy Holder"
*
* @Author Vinicius
* */

public class SingletonLazyHolder {
    private static class InstanceHolder {
        private static SingletonLazyHolder intancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.intancia;
    }
}
