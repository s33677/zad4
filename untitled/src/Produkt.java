public class Produkt {

    private int Id;
    private String Nazwa;
    private String Kategoria;
    private double Cena;
    private int IloscWMagazynie;

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        this.Nazwa = nazwa;
    }

    public String getKategoria() {
        return Kategoria;
    }

    public void setKategoria(String kategoria) {
        this.Kategoria = kategoria;
    }

    public double getCena() {
        return Cena;
    }

    public void setCena(double cena) {
        this.Cena = cena;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }
    public int getIloscWMagazynie() {
        return IloscWMagazynie;
    }
    public void setIloscWMagazynie(int iloscWMagazyne){
        this.IloscWMagazynie = iloscWMagazyne;
    }
    public void wyswietlInformacje(){
        System.out.println("Id Produktu: " + Id);
        System.out.println("Nazwa Produktu: " + Nazwa);
        System.out.println("Kategoria Produktu: " + Kategoria);
        System.out.println("Cena Produktu: " + Cena);
        System.out.println("Ilosc w magazynie Produktu: " + IloscWMagazynie);

    }

}