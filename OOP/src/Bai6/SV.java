package Bai6;
import java.util.Date;
import java.time.Year;
class SV {
    
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
    public boolean equals(Object s){
        if(s instanceof SV){
            SV ss=(SV) s;
            return hoTen.equals(ss.hoTen)&& this.ngaySinh==ss.ngaySinh&& this.dtb==ss.dtb;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        SV p[]=new SV[5];
        p[1] = new SV("Nguyen Van An", new Date("10/24/2000"),8.5);
        p[2] = new SV("Nguyen Van An", new Date("10/24/2000"),8.5);
        p[2].hienThi();
        p[1].hienThi();
        
        System.out.println(p[1].equals(p[2]));
    }
    
}
