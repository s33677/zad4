public class Klient {
    private int Id;
    private String Imie;
    private String Nazwisko;
    private String Email;
    private boolean Czystaly;


    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String Imie) {
        this.Imie = Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean isCzystaly() {
        return Czystaly;
    }

    public void setCzyStaly(boolean Czystaly) {
        this.Czystaly = Czystaly;
    }

    public void WyswietlInformacje() {
        System.out.println("Id Klienta: " + Id);
        System.out.println("Imie Klienta: " + Imie);
        System.out.println("Nazwisko Klienta: " + Nazwisko);
        System.out.println("Email Klienta: " + Email);
        System.out.println("Czy Klient jest staly: " + Czystaly);
    }
}