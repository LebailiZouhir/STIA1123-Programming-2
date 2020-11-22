package Encapsulation;

public class Proton 
{
    
    String accelerate,color,wiperOff,wiperOn,windowsDOWN,windowsUP;
    
    Proton()
    {
        this.accelerate = "Throttle pressed";
        this.windowsUP = "Windows rolled up";
        this.windowsDOWN = "Windows rolled down";
        this.wiperOn = "Wipers on";
        this.wiperOff = "Wipers off";
        this.color = "Silver";
    }
    
    Proton(String a, String b, String c, String d, String e, String f)
    {
        this.accelerate = a;
        this.windowsUP = b;
        this.windowsDOWN = c;
        this.wiperOn = d;
        this.wiperOff = e;
        this.color = f;
    }
    
    public void accelerate()
    {
        System.out.println(accelerate);
    }
    
    public void windowsDown()
    {
        System.out.println(windowsDOWN);
    }
    
    public void windowsUp()
    {
        System.out.println(windowsUP);
    }
    
    public void wiperOn()
    {
        System.out.println(wiperOn);
    }
    
    public void wiperOff()
    {
        System.out.println(wiperOff);
    }
    
    public void color()     
    {
        System.out.println(color);
    }
    
    
}