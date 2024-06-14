package comspringboot;

import comspringboot.entidades.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "Rua A, 123");

        Fixa linhaFixa1 = new Fixa(40, "1234-5678");
        Movel linhaMovel1 = new Movel(50, "9876-5432", true);
        cliente1.adicionarLinhaTelefonica(linhaFixa1);
        cliente1.adicionarLinhaTelefonica(linhaMovel1);

        Cliente cliente2 = new Cliente("Maria Souza", "Rua B, 456");
        Fixa linhaFixa2 = new Fixa(20, "2345-6789");
        Movel linhaMovel2 = new Movel(30, "8765-4321", false);
        cliente2.adicionarLinhaTelefonica(linhaFixa2);
        cliente2.adicionarLinhaTelefonica(linhaMovel2);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}

