public abstract class DiemHP {
    protected String tenHP;
    protected int soTinChi;
    public DiemHP(String tenHP,int STC){
        this.tenHP=tenHP;
        soTinChi=STC;
    }
    
    public String layTenHP(){
        return this.tenHP;
    }
    
    public int laySoTinChi(){
        return this.soTinChi; 
    }
    
    public abstract double tinhDiem();
}
