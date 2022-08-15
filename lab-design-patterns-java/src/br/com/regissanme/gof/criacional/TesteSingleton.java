package br.com.regissanme.gof.criacional;

/**
 * Projeto: desafio-padroes-projeto-java
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 15/08/2022
 * Hora: 15:37
 */
public class TesteSingleton {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println("Lazy 1: " + lazy);

        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println("Lazy 2: " + lazy2);

//        SingletonEager eager = SingletonEager.getInstancia();
//        System.out.println("Eager 1: " + eager);
//
//        SingletonEager eager2 = SingletonEager.getInstancia();
//        System.out.println("Eager 2: " + eager2);
//
//        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
//        System.out.println("Lazy Holder 1: " + lazyHolder);
//
//        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstancia();
//        System.out.println("Lazy Holder 2: " + lazyHolder2);
    }
}
