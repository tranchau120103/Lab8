
package Lab8;

import java.util.ArrayList;
import java.util.Scanner;


public class SanPham
{
    String TenSanPham;
    double dongia;
    double giamgia;

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(double giamgia) {
        this.giamgia = giamgia;
    }

    public SanPham(String TenSanPham, double dongia, double giamgia) {
        this.TenSanPham = TenSanPham;
        this.dongia = dongia;
        this.giamgia = giamgia;
    }
    double getthuenhapxuat()
    {
    return dongia - giamgia;
    }
    void xuat(){}
    void nhap(){}
}
class main
{
public static void main(String[] arg)
{
    Scanner sc = new Scanner(System.in);
    SanPham sp = new SanPham(null,0,0);
    int chon =sc.nextInt();
    do
    sp.nhap();
    while(chon != 0);
}
}