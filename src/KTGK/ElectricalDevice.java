package KTGK;
abstract class ElectricalDevice implements Switchable {
    protected String menufacture;
    protected double price;
    protected String id;
    protected String switcher;
    
    public ElectricalDevice(String menu,double price,String id,String switcher){
        this.menufacture=menu;
        this.price=price;
        this.id=id;
        this.switcher=switcher;
    }
    public String layNSX(){
        return this.menufacture;
    }
    public void ganNSX(String mn){
        this.menufacture=mn;
    }
    
    public Double layGia(){
        return this.price;
    }
    public void ganGia(double gia){
        this.price=gia;
    }
    
    public String layTenSP(){
        return this.id;
    }
    public void ganTenSP(String ten){
        this.id=ten;
    }
    
    public abstract double update();

    @Override
    public String toString(){
        return this.id+this.price+this.menufacture;
    }
}
