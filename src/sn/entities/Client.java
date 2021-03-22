package sn.entities;

public class Client {
    private int id;
    private String nom;
    private String prennom;
    private String email;
    private String tel;

    public Client() {
    }

    public Client(int id, String nom, String prennom, String email, String tel) {
        this.id = id;
        this.nom = nom;
        this.prennom = prennom;
        this.email = email;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrennom() {
        return prennom;
    }

    public void setPrennom(String prennom) {
        this.prennom = prennom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
