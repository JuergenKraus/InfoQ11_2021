
public class Datenknoten extends Listenelement
{
    Listenelement naechster;
    Datenelement inhalt;
    
    public Datenknoten()
    {
        
    }

    public Datenknoten(Datenelement DE,Listenelement LI )
    {
        naechster = LI;
        inhalt = DE;
    }
    
    Listenelement hintenEinfuegen (Datenelement knoteninhalt)
    {
        //Der erste im Stativ ist der erste in der Warteschlange
        // Deshalb muss der eingefügte Knoteninhalt bis zum Abschluss druchgereicht werden
        naechster = naechster.hintenEinfuegen (knoteninhalt);
        return this;
    }
    
    int anzahlDatenknotenGeben()
    {
        return 1 + naechster.anzahlDatenknotenGeben();
    }
    
    void ListendatenAusgeben()
    {
        inhalt.Ausgabe();
        naechsterGeben().ListendatenAusgeben();
    }
    
    Listenelement naechsterGeben()
    {
        return naechster;
    }
    
    Datenelement inhaltGeben()
    {
        return inhalt;
    }
}
