public class Zamowienie {
    private int Id;
    private Klient Klient;
    private Produkt[] Produkty;
    private int[] Ilosci;
    private String DataZamowiena;
    private String Status;
    private double wartosc;

    public Zamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        this.Klient = klient;
        this.Produkty = produkty;
        this.Ilosci = ilosci;
    }

    public int getId() {
        return Id;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public Klient getKlient() {
        return Klient;
    }
    public void setKlient(Klient Klient) {
        this.Klient = Klient;
    }
    public Produkt[] getProdukty() {
        return Produkty;
    }
    public void setProdukty(Produkt[] Produkty) {
        this.Produkty = Produkty;
    }
    public int[] getIlosci() {
        return Ilosci;
    }
    public void setIlosci(int[] Ilosci) {
        this.Ilosci = Ilosci;
    }
    public String getDataZamowiena() {
        return DataZamowiena;
    }
    public void setDataZamowiena(String DataZamowiena) {
        this.DataZamowiena = DataZamowiena;
    }
    public double getWartosc() {
        return wartosc;
    }
    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }
    public void ObliczWartoscZamowienia() {
        wartosc=0;
        for (int i = 0; i < Produkty.length; i++) {
            if (Produkty[i] != null) {
                wartosc += Produkty[i].getCena() * Ilosci[i];
            }
        }

    }
    public void zastosujZnizke(){
        if (Klient.isCzystaly()==true){
            wartosc = wartosc*0.9;
        }

    }
    public void wyswietlSzczegoly(){
        int j = 0;
        for (int i = 0; i < Ilosci.length; i++) {
            j+= Ilosci[i];
        }
        System.out.println("Zamowienie ID: " + getId() +"\nStatus: " + Status);
        System.out.println("Zamowienie Klient: " + Klient.getImie() + " " + Klient.getNazwisko());
        for ( int i = 0; i<Produkty.length; i++){
            System.out.println(Produkty[i].getNazwa() + ", Sztuk:  " + Ilosci[i]);
        }
        System.out.println("Łączna wartość " + Math.round(wartosc));
    }
}



