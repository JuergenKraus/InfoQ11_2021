public class Warteschlange
{
    Listenelement erster;
    
    public Warteschlange()
    {
        erster = new Abschluss(); 
        einPaarEinfuegen();
    }

    void einfuegen(Datenelement knoteninhalt)
    {
        if (erster.anzahlDatenknotenGeben() == 0) {erster = new Datenknoten(knoteninhalt);}
        else {        
                erster = erster.hintenEinfuegen (knoteninhalt);
        }
    }
    
    Datenelement entnehmen()
    {
        Datenelement alterKnoteninhalt = erster.inhaltGeben();
        erster = erster.naechsterGeben();
        return alterKnoteninhalt;
    }
    
    int anzahlElementeGeben()
    {
        return erster.anzahlDatenknotenGeben();
    }
    
    void AlledatenAusgeben()
    {
        erster.ListendatenAusgeben();
    }
    
    boolean istLeer()
    {
        return (anzahlElementeGeben() == 0);
    }
    
    void einPaarEinfuegen()
    {
        Datenelement a = new Datenelement("Jürgen", "Kraus");
        einfuegen(a);
        Datenelement b = new Datenelement("Simon", "Franken");
        einfuegen(b);
        Datenelement c = new Datenelement("Marco", "Leuschner");
        einfuegen(c);
    }
}
