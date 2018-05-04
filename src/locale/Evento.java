package locale;

import locale.Locale;
import persone.Invitato;
import vincoli.Vincolo;

import java.util.*;


public class Evento {
    private String nomeEvento;

    private locale.Locale location = null;
    private ArrayList <Invitato> invitati;
    private  ArrayList <Vincolo> lista_vincoli;
    private GregorianCalendar dataEvento;



    /*nell'uml manca la data dell'evento ( l'aggiungo al costruttore )]*/


    public Evento(String nomeEvento, GregorianCalendar dataEvento, Locale location,
                  ArrayList <Vincolo> lista_vincoli, ArrayList <Invitato> invitati){

        /*il locale è creato dall'evento?? serve una classe nel mezzo che crei le istanze?
        da dove prendo i locali ?? (secondo me sono memorizzati nel Database) quindi dovrò trovare una soluzione temporanea
                */

        this.nomeEvento = nomeEvento;
        this.location = location;
        this.dataEvento = dataEvento;
        this.lista_vincoli.addAll(lista_vincoli);
        invitati = new ArrayList();
        this.invitati.addAll(invitati);

    }
    /*NOTA PER ME: provare a togliere new ArrayList prima del metodo "add All" per vedere se funziona lo stesso*/


    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void setLocation(locale.Locale location) {
        this.location = location;
    }

    /* invitati dove li prendo?? dove sono memorizzati?? (non sono già nel Database da prima perchè li passa il persone)
    una possibile soluzione può essere creare una factory build?
    si possono aggiungere invitati? [nel caso andrà cambiato anche il numero di posti disponibili e il numero di tavoli
    ( in alcuni casi )]
    PARERE PERSONALE: la lista invitati non si può modificare[almeno inizialmente,perchè in caso di modifica
     crea una catena di eventi a cascata che influenzano il programma (va gestito), nel caso iniziale
     direi di renderlo non modificabile (nel caso più che un set invitato ha senso mettere un aggiungi o rimuovi
     invitato
     */
    /*public void setInvitati(ArrayList <persone.Invitato> invitati) {
        this.invitati = invitati;
    }*/

    public void setLista_vincoli(ArrayList <Vincolo> lista_vincoli) {
        this.lista_vincoli = lista_vincoli;
    }

    public void setDataEvento(GregorianCalendar dataEvento) {
        this.dataEvento = dataEvento;
    }
}