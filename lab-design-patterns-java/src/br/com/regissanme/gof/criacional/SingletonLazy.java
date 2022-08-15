package br.com.regissanme.gof.criacional;

/**
 * Projeto: desafio-padroes-projeto-java
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 15/08/2022
 * Hora: 15:24
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
