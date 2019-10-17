
package Bai3;
public class PS {

    private int tu;
    private int mau;

    public PS(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PS(int n) {
        tu = n;
        mau = 1;
    }

    public PS(PS p) {
        tu = p.tu;
        mau = p.mau;
    }

    public void ganTu(int t) {
        tu = t;
    }

    public int layTu() {
        return tu;
    }

    public void ganMau(int m) {
        mau = m;
    }

    public int layMau() {
        return mau;
    }

    public void hienThi() {
        System.out.println("Ra nè Mạnh cờ hó:"+tu + "/" + mau);
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
              a = a - b;
            }
            else {
              b = b - a;
            }
        }
        return a;
    }

    public void rutGon() {
        int i = timUSCLN(layTu(), layMau());
        ganTu(layTu() / i);
        ganMau(layMau() / i);
    }

    public static void main(String args[]) {
        PS p = new PS(6, 4);
        p.rutGon();
        p.hienThi();
    }
}