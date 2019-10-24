
package KTGK;
abstract class Cooker extends ElectricalDevice{
   
    protected boolean cooking;
   
    public Cooker( String menufacture,double price,String id,String Switcher,boolean cooking){
        super(menufacture, price,id,Switcher);
        this.cooking=cooking;
    }
    public void cook(){
        this.cooking=true;
    }
    
    public void warn(){
        this.cooking=false;
    }
    
    public double update(boolean cooking){
        if(cooking== true)
            return this.turnon();
        else
            return this.turnoff();
    }
}
    
    
