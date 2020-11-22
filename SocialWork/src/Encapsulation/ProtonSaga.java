package Encapsulation;

public class ProtonSaga extends Proton
{
    private String airbags, eco, name, color;
    
    ProtonSaga()
    {
        this.airbags = "Airbags Initialized!";
        this.eco = "ECO System initialized!";
    }
    
    ProtonSaga(String a, String b, String c, String d, String e)
    {
        this.airbags = b;
        this.eco = c;
        this.name = d;
        this.color = e;
    }
    
    public void setName(String newName) //Setter
    {
        this.name = newName;
    }
    
    public String getName() //Getter
    {
        return this.name;
    }
    
    public void airbags()
    {
       
        System.out.println(airbags);
    }
    
    public void eco()
    {    
        System.out.println(eco);
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