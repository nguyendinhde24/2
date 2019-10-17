package Bai5;
abstract class HPThucHanh extends DiemHP {
    public float db1;
    public float db2;
    public float db3;

    public HPThucHanh(String tenHP, int STC,float db1,float db2,float db3) {
        super(tenHP, STC);
        this.db1=db1;
        this.db2=db2;
        this.db3=db3;
    }
    @Override
    public double tinhDiem(){
       return (db1+db2+db3)/3; 
    }
    public void hienThi(){
        System.out.println("\nDiem thuc hanh toan rr: "+this.tenHP
                +"\nSoTC: "+this.soTinChi
                +"\nDiem trung binh thuc hanh"+this.tinhDiem());
    } 
}
