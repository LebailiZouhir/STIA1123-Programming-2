package Encapsulation;

public class ProtonX70 extends Proton
{
    private String AI,rearCamera,name,color;
    
    ProtonX70()
    {
        this.AI = "Artificial Intellegence turned on";
        this.rearCamera = "Rear camera turned on";
    }
    
    ProtonX70(String a, String b, String c, String d, String e)
    {
        this.AI = b;
        this.rearCamera = c;
        this.name= d;
        this.color = e;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void AI()
    {
        System.out.println(AI);        
    }
    
    public void rearCamera()
    {
        
        System.out.println(rearCamera);
    }
    
    public void setColor(String newColor)
    {
        this.color = newColor;
    }
    
    public String getColor()
    {
        return this.color;
    }    
}
