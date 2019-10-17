package Bai5;
class HPLyThuyet extends DiemHP {
    private int chuyenCan;
    private int giuaKy;
    private int cuoiKy;
    
    public HPLyThuyet(String tenHP, int STC,int CC,int GK,int CK) {
        super(tenHP, STC);
        this.chuyenCan=CC;
        this.giuaKy=GK;
        this.cuoiKy=CK;
    }
    @Override
    public double tinhDiem(){
        return chuyenCan*0.1+this.giuaKy*0.2+this.cuoiKy*0.7;
    }
    public void hienThi(){
        System.out.println("Ten hoc phan la: "+this.tenHP
                +"\nVoi so tin chi: "+this.soTinChi
                +"\nTinh Diem: "+this.tinhDiem());
    }
    
}