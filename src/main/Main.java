package main;

import sn.dao.ClientImpl;
import sn.dao.DB;
import sn.entities.Client;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws Exception{
        DB db = new DB();
        db.getConnection();
        Scanner clavier = new Scanner(System.in);
        int choix = 0;


        ClientImpl controll = new ClientImpl();


        do {
            choix = controll.menu();
            switch (choix){
                case 1:
                    Client cl = new Client();
                    System.out.println("Entrer le nom du client");
                    cl.setNom(clavier.nextLine());
                    System.out.println("Entrer le prenom");
                    cl.setPrennom(clavier.nextLine());
                    System.out.println("Entrer l email");
                    cl.setEmail(clavier.nextLine());
                    System.out.println("Entrer le tel");
                    cl.setTel(clavier.nextLine());

                    controll.creation(cl);
                    break;
                case 2:
                    System.out.println("  Affichage ");

                    controll.afficheListeCleint();
                    break;
                case 3:
                    System.out.println(" Modification ");
                    controll.afficheListeCleint();
                    System.out.println("Veuillez saisir le mail du client a modifier");
                    String mail;
                    mail=clavier.nextLine();
                    Client cl1 = controll.recherche(mail);
                    if (cl1 !=null){
                            System.out.println("Entrer le nouveau nom du client");
                            cl1.setNom(clavier.nextLine());
                            System.out.println("Entrer le nouveau prenom");
                            cl1.setPrennom(clavier.nextLine());
                            System.out.println("Entrer le nouveau  email");
                            cl1.setEmail(clavier.nextLine());
                            System.out.println("Entrer le nouveau  tel");
                            cl1.setTel(clavier.nextLine());
                            controll.edition(cl1);

                    }



                    break;
                case 4:

                    System.out.println(" Recherche");
                    //controll.afficheListeCleint();
                    String email;
                    System.out.println("Veillez saisir l'email");
                    email=clavier.nextLine();
                    Client cl2 = controll.recherche(email);
                    controll.affichage(cl2);




                    break;
                case 5:

                    break;
                default :
                    System.out.println("Veuillez faire un choix entre 1 - 5");
                break;
            }
        }while (choix != 5);
    }
}
