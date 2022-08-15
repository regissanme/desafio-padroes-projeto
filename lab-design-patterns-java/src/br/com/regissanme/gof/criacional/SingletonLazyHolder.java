package br.com.regissanme.gof.criacional;

/**
 * Projeto: desafio-padroes-projeto-java
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 15/08/2022
 * Hora: 15:24
 * @see <a href="https://stackoverflow.com/a/24018148"></a>
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
