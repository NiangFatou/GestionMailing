package sn.dao;

import sn.entities.Client;

public interface IClient {
    public int menu();
    public void creation(Client client);
    public void afficheListeCleint();
    public void affichage(Client client);
    public void edition(Client client);
    public Client recherche(String email);

}
