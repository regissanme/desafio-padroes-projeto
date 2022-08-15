package br.com.regissanme.gof.criacional;

/**
 * Projeto: desafio-padroes-projeto-java
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 15/08/2022
 * Hora: 15:24
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
