package Encapsulation;

public class ProtonX50 extends Proton
{
    private String panoramicOpen;
    private String panoramicClose;
    private String semiAutomaticDriving;
    private String name;
    private String color;
    
    ProtonX50()
    {
        this.panoramicOpen = "Panoramic Screen opened!";
        this.panoramicClose = "Panoramic Screen Closed!";
        this.semiAutomaticDriving = "Semi Automatic Driving Initialized!";
        
    }
    
    ProtonX50(String a, String b, String c, String d, String e, String f)
    {
        this.panoramicOpen = b;
        this.panoramicClose = c;
        this.semiAutomaticDriving = d;
        this.name = e;
        this.color = f;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void panoramicOpen()
    {
        System.out.println(panoramicOpen);
    }
    
    public void panoramicClose()
    {
        System.out.println(panoramicClose);
    }
    
    public void semiAutomaticDriving()
    {
        
        System.out.println(semiAutomaticDriving);
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
