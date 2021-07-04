
public class Abschluss extends Listenelement
{
    
    public Abschluss()
    {
        
    }

    Listenelement hintenEinfuegen (Datenelement knoteninhalt)
    {
        Datenknoten neu = new Datenknoten(knoteninhalt, this);
        return neu;
    }
    
    int anzahlDatenknotenGeben()
    {
        return 0;
    }
    
    void ListendatenAusgeben()
    {}
    
    Listenelement naechsterGeben()
    {
        return null;
    }
    
    Datenelement inhaltGeben()
    {
        return null;
    }
}
