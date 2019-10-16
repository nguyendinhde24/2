package Bai6;

import java.util.Vector;
import java.util.*;

public class DSSV {

    private Vector ds;

    public DSSV() {
        ds = new Vector();
    }

    public void them(SV s) {
        if (!ds.contains(s)) {
            ds.addElement(s);
        }
    }

    public SV tim(String ht) {
        for (int i = 0; i < ds.size(); i++) {
            if (((SV) ds.elementAt(i)).layHoTen().equals(ht)) {
                return (SV) ds.elementAt(i);
            }
        }
        return null;
    }

    public void xoa(String ht) {
        for (int i = 0; i < ds.size(); i++) {
            if (((SV) ds.elementAt(i)).layHoTen().equals(ht)) {
                ds.removeElementAt(i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Vector ds = new Vector();
        //them cac phan tu vao danh sach
        ds.addElement("Nguyen Van A");
        ds.addElement("Tran Thi B");
        ds.addElement("Le Thi C");
        //in danh sach
        Enumeration e = ds.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        //xoa phan tu
        ds.removeElementAt(2);
        e = ds.elements();
        while (e.hasMoreElements()) {
            System.out.println(" "+e.nextElement());
        }
        //tim phan tu
        String ht="Tran Thi B";
        //String ht="Nguyen Van A";
        if(ds.contains(ht))
            System.out.println("\nCo SV: "+ht+"\ntai vi tri: "+ ds.indexOf(ht));
        else
            System.out.println("\nKhong co sv: "+ht);
    }
}
