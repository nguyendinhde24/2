package Bai6;
import java.util.Enumeration;
import java.util.Hashtable;
public class TD {
    
    private final Hashtable td;
    public TD(){
        td=new Hashtable();
    }
    
    public void them(String tu,Nghia ng){
        td.put(tu, ng);
    }
    
    public Nghia tra(String tu){
        return(Nghia) 
        td.get(tu);
    }
    
    public void hienThi(){
        Enumeration e=td.keys();
        while(e.hasMoreElements()){
            String tu=(String)e.nextElement();
            Nghia ng=(Nghia)td.get(tu);
            System.out.println(tu+":"+ng);
        }
    }
    public static void main(String[] args) {
        Hashtable td=new Hashtable();
        td.put("Hello", "Xin Chao");
        td.put("Begin", "Bat dau");
        td.put("End", "Ket thuc");
        Hashtable<String, Nghia>hashTable=new Hashtable<>();
        
    }
}
