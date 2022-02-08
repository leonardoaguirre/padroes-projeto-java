package one.digitalinovation.gof.singleton;
/*
Singleton "Lazy Holder"
@author Leonardo Aguirre
 */
public class SingletonLazyHolder {
    private static class InstanceHolder{
    private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return  InstanceHolder.instancia;
    }
}
