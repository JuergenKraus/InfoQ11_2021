public abstract class Listenelement
{
    
    public Listenelement()
    {
        
    }

    abstract Listenelement hintenEinfuegen (Datenelement knoteninhalt);
    
    abstract int anzahlDatenknotenGeben();
    
    abstract void ListendatenAusgeben();  
    
    abstract Listenelement naechsterGeben();
    
    abstract Datenelement inhaltGeben();
}
