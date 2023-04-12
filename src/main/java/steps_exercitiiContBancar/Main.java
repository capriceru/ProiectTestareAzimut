package steps_exercitiiContBancar;

import java.util.Date;

import static steps_exercitiiContBancar.Client.client1;

public class Main {

    //Vom exersa notiunile de Java invatate pana acum prin efectuarea platii unei facturi
    // Pentru asta avem nevoie de un client, o factura si un cont bancar.
    // Astfel, vom crea un client, caruia ii vom da un nume si o adresa.
    // Clientului ii vom asocia un cont bancar, ce va curpinde atat datele clientului, cat si informatii despre
    // numele contului(alias), numarul contului si suma de bani in lei.
    // Astfel, vom putea alimenta contul bancar, vom putea retrage o anumita suma si vom putea converti suma din LEI in EURO
    // Apoi, vom crea si o factura, ce va contine datele clientului, numarul de client, data emiterii si suma datorata
    // pe care clientul o va putea plati.

    public static void main(String[] args) {
        client1 = new Client("Andreea", "Bucuresti");
//        System.out.println(client1.getNumeClient());
//        client1.setNumeCLient("Alina");
//        System.out.println(client1.getNumeClient());


        ContBancar conntAndreea = new ContBancar("Andreea", "Bucuresti", "economii", 6969, 500);
//        conntAndreea.alimentareContBancar(-100);

        conntAndreea.retragereSuma(100);
        conntAndreea.exchange("EURO");



        Factura facturaElectricitate = new Factura(client1, 3456, new Date(2023-03-01), 800);

        conntAndreea.plataFactura(facturaElectricitate.getTotalFactura());

    }
}
