
public class Datenelement
{
    String vname;
    String name;
    
    public Datenelement()
    {
        
    }

    public Datenelement(String vn, String na)
    {
        vname = vn;
        name = na;
    }
    
    void Ausgabe()
    {
        System.out.println(vname + ", " + name);
    }
}
