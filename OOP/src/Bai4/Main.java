package Bai4;

import java.util.Date;

public class Main {
        public static void main(String[] args) {
        SV p[]=new SV[5];
        p[1] = new SV("Nguyen Van An", new Date("10/24/2000"),8.5);
        p[2] = new SV("Nguyen Van B", new Date("10/24/2000"),8.5);
        p[2].hienThi();
        p[1].hienThi(); 
}
}
