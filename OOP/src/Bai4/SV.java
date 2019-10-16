package Bai4;
import java.util.*;
public class SV {
    private String hoTen;
    private Date ngaySinh;
    private double dtb;
    public SV(String ht,Date ns,double dtb){
        hoTen=ht;
        ngaySinh=ns;
        this.dtb=dtb;
    }
    
    public void ganHoTen(String ht){
        this.hoTen=ht;
    }
    public String layHoTen(){
        return this.hoTen;
    }
    
    public void ganNgaySinh(Date ns){
        this.ngaySinh=ns;
    }
    public Date layNgaySinh(){
        return this.ngaySinh;
    }
    
    public void ganDTB(double dtb){
        this.dtb=dtb;
    }
    public double layDTB(){
        return this.dtb;
    }
    
    public void hienThi(){
        System.out.println("Ho va Ten: "+this.hoTen+ "\nCo ho la: "+this.layHo()+"\nTen la: "+this.layTen()+"\nHo dem la:"+this.layHoDem()+"\nTuoi: "+this.layTuoi()+"\nXep loai: "+this.layXepLoai());
    }
    public String layHo(){
        String ho;
        ho=this.hoTen.substring(0, this.hoTen.indexOf(" "));
        return ho;
    }
    public String layTen(){
        String ten;
        ten=this.hoTen.substring(this.hoTen.lastIndexOf(" "));
        return ten;
    }
    public String layHoDem(){
        String hoDem;
        hoDem=this.hoTen.substring( this.hoTen.indexOf(" "),this.hoTen.lastIndexOf(" "));
        return hoDem;
    }
    public int layTuoi(){
        int yearNow=new Date().getYear()+1990;
        int namSinh=this.ngaySinh.getYear()+1990;
        int tuoi=yearNow-namSinh;
        return tuoi;
    }
    public String layXepLoai(){
        if(this.dtb>=8)
            return "Gioi";
        else{
            if(this.dtb>=7 )
                return "Kha";
            else{
                if(this.dtb>=5)
                    return "Trung binh";
                else
                    return "Yeu";
                }
            }
    }
}
