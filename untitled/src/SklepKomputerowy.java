public class SklepKomputerowy {
    private Produkt[] Produkty = new Produkt[3];
    private int LiczbaProduktow = 0;
    private Klient[] Klienci = new Klient[10];
    private int LiczbaKlientow=0;
    private Zamowienie[] Zamowienia=new Zamowienie[2];
    private int LiczbaZamowien=0;



    public void dodajProdukt(Produkt produkt) {
        LiczbaProduktow++;
        Produkty[LiczbaProduktow -1] = produkt;

    }
    public void dodajKlienta(Klient klient) {
        LiczbaKlientow++;
        Klienci[LiczbaKlientow - 1] = klient;

    }

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        LiczbaZamowien++;
        Zamowienie zamowienie = new Zamowienie(klient, produkty, ilosci);
        zamowienie.setKlient(klient);
        zamowienie.setId(LiczbaZamowien-1);
        zamowienie.setProdukty(produkty);
        zamowienie.setIlosci(ilosci);
        zamowienie.setDataZamowiena(java.time.LocalDate.now().toString());
        zamowienie.setStatus("Nowe");
        zamowienie.ObliczWartoscZamowienia();
        Zamowienia [LiczbaZamowien-1]= zamowienie;
        return zamowienie;
    }
    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        for (int i = 0; i < Produkty.length; i++) {
            for (int j = 0; j < zamowienie.getProdukty().length; j++) {
                if (Produkty[i] == zamowienie.getProdukty()[j]) {
                    int ilosc = Produkty[i].getIloscWMagazynie() - zamowienie.getIlosci()[j];
                    Produkty[i].setIloscWMagazynie(ilosc);
                }
            }
        }
    }
    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus){
        Zamowienia[idZamowienia].setStatus(nowyStatus);
            }






        public void wyswietlProduktyWKategorii(String kategoria){
        if(Produkty == null || Produkty.length == 0){
            System.out.println("Brak produktów");
            return;
        }
        for (int i = 0; i < Produkty.length; i++) {
            String kat = Produkty[i].getKategoria();
            if(kat.equals(kategoria)){
                System.out.println(Produkty[i].getKategoria() +" "+ Produkty[i].getIloscWMagazynie());
            }


        }


    }
    public void  wyswietlZamowieniaKlienta(int idKlienta){
        for (int i = 0; i < LiczbaZamowien; i++){
            Zamowienie zam = Zamowienia[i];
            if(zam.getKlient().getId() == idKlienta){
                zam.wyswietlSzczegoly();
            }
        }
    }
    public void idzamowienia(){

    }


}
