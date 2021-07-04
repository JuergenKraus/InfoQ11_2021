
public class Datenelement
{
    int Telefonnummer;
    String name;
    
    public Datenelement()
    {
        
    }

    public Datenelement(int nr, String na)
    {
        Telefonnummer = nr;
        name = na;
    }
    
    void Ausgabe()
    {
        System.out.println("Telefonnummer :"+ Telefonnummer + ", Name :"+name);
    }
}
