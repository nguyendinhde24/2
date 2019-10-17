import java.util.Date;
import java.util.Vector;
public class DSSV{
    private Vector ds;
    public DSSV(){
        ds=new Vector();
    }
    //PT them 1 sv có kt trùng lặp
    public void them(SV s){
        if(!ds.contains(s))
            ds.addElement(s);
    }
    //PT tìm 1 sv theo họ ten
    public SV tim(String ht){
        for(int i=0;i<ds.size();i++)
           if(((SV)ds.elementAt(i)).layHoTen().equals(ht))
               return (SV)ds.elementAt(i);
        return null;
    }
    //PT xóa
    public void xoa(String ht){
        for(int i=0;i<ds.size();i++)
           if(((SV)ds.elementAt(i)).layHoTen().equals(ht)){
               ds.removeElementAt(i);
               return;
           }
    }
    public static void main(String[] args) {
        Vector p=new Vector();
        p.addElement(new SV("Nguyen Van C",new Date("10/10/2000"),8.1));
        p.addElement(new SV("Nguyen Van C",new Date("10/10/2000"),8.1));
    }
}