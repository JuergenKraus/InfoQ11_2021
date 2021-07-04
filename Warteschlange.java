public class Warteschlange
{
    Listenelement erster;
    
    public Warteschlange()
    {
        erster = new Abschluss();    
    }

    void einfuegen(Datenelement knoteninhalt)
    {
        erster = erster.hintenEinfuegen (knoteninhalt);
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
        Datenelement a = new Datenelement(32418452, "Sekretariat");
        einfuegen(a);
        Datenelement b = new Datenelement(32418450, "Chefin");
        einfuegen(b);
        Datenelement c = new Datenelement(32418465, "Stahl");
        einfuegen(c);
        Datenelement d = new Datenelement(32418454, "Walcher");
        einfuegen(d);
        Datenelement e = new Datenelement(32418460, "Lehrerzimmer");
        einfuegen(e);
    }
}
