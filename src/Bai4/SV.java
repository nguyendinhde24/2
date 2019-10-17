package Bai4;
import java.time.Month;
import java.util.Date;
public class SV {
    private String hoTen;
    private Date ngaySinh;
    private double dtb;
    
    public SV( String hoTen,Date ngaySinh,double dtb){
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.dtb=dtb;
    }
    
    public String layHoTen(){
        return hoTen;
    }
    
    public void ganHoTen(String ht){
        hoTen=ht;
    }
    
    public Date layNgaySinh(){
        return ngaySinh;
    }
    public void ganNgaySinh(Date ns){
        ngaySinh=ns;
    }
    
      public double layDTB(){
        return dtb;
    }
    
    public void ganHoTen(double diemTB){
        dtb=diemTB;
    }
    public void hienThi(){
        System.out.println("\nHo va ten: "+hoTen
                +"\nSinh ngay: "+ngaySinh
                +"\nDiem trung binh cuoi ki: "+dtb
                +"\nso tuoi:"+this.layTuoi()
                +"\nHo la:"+this.layHo()
                +"\nHo dem la:"+this.layHoDem()
                +"\nTen la:"+this.layTen()
                +"\nXep loai: "+this.xepLoai());
    }
    public String layHo(){
        String ho;
        ho=this.hoTen.substring(0,this.hoTen.indexOf(" "));
        return ho;
    }
    
    public String layTen(){
        String ten;
        ten=this.hoTen.substring(this.hoTen.lastIndexOf(" "));
        return ten;
    }
    
    public String layHoDem(){
        String hoDem;
        hoDem=this.hoTen.substring(this.hoTen.indexOf(" "), this.hoTen.lastIndexOf(" "));
        return hoDem;
    }
    public int layTuoi(){
        
        int YearNow = new Date().getYear() + 1900;
        int BoD = ngaySinh.getYear() + 1900;
        int tuoi = YearNow - BoD;
        return tuoi;
    }
    
    public boolean equals(Object s){
        if(s instanceof SV){
            SV ss=(SV) s;
            return hoTen.equals(ss.hoTen)&&this.layTuoi()==ss.layTuoi() && this.dtb==ss.dtb;
        }
        else return false;
    }
    
    public String xepLoai(){
        if(this.dtb>=8)
            return "gioi";
        else
            if(this.dtb>7)
                return "kha";
            else
                if(this.dtb>5)
                    return "trung binh";
                else
                    return "yeu";
    }
    
    public static void main(String args[]){
        SV p[]=new SV[6];
        p[1]=new SV("Nguyen Van A",new Date("10/24/2000"),7.4);
        p[2]=new SV("Nguyen Van B",new Date("10/24/2000"),7.4);
        p[1].hienThi();
        System.out.println(p[1].equals(p[2]));
    }
}
