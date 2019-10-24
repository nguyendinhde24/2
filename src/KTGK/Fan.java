package KTGK;
abstract class Fan extends ElectricalDevice {
    protected float speed;
    protected boolean swing;
    
    public Fan(String menu,double price,String id,String switcher,float speed,boolean swing){
        super(menu,price,id,switcher);
        this.speed=speed;
        this.swing=swing;
    }
    
    public void incSpeed(int so){
       switch(so){
           case 0:
               System.out.println(0);
            break;
           case 1:
               System.out.println(10);
            break;
           case 2:
               System.out.println(20);
            break;
            case 3:
               System.out.println(30);
            break;
            default:
                System.out.println(0);   
       }
    }
    
    public double update(){
        if(swing==true)
            return this.turnon();
        else
            return this.turnoff();
    }
}
