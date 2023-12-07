import java.util.Scanner;

public class thoigian {
    private int ngay;
    private int thang;
    private int nam;
   

    public thoigian(int ngay, int thang, int nam){
        this.ngay= ngay;
        this.thang= thang;
        this.nam=nam;
    }
    public thoigian(){}

    public int getNgay(){
        return this.ngay;
    }
    public void setNgay(int ngay){
        if(ngay>=1 && ngay<=31)
            this.ngay= ngay;
        else
            this.ngay=1;
    }
    public int getThang(){
        return this.thang;
    }
    public void setThang(int thang){
        if(thang>=1 && thang<=12)
            this.thang= thang;
        else
            this.thang=1;
    }
    public int getNam(){
        return this.nam;
    }
    public void setNam(int nam){
        if(nam > 0)
            this.nam= nam;
        else this.nam=1;
    }
    public void nhap(){
        System.out.println("Nhap thoi gian thi:");
        Scanner sc = new Scanner(System.in);
        int ngay=1;
        try {
            System.out.println("nhap ngay:");
            ngay=sc.nextInt();
        } catch (Exception e) {
           System.out.println("nhap du lieu khong dung");
        }
        System.out.println("nhap thang: ");
        thang=sc.nextInt();
        System.out.println("nhap nam: ");
        nam=sc.nextInt();
    }
    public void xuat(){
        System.out.println("thoi gian thi: "+this.getNgay()+"/"+this.getThang()+"/"+this.getNam());
    }

    public static void main( String[] args){
        thoigian tg= new thoigian();
        tg.nhap();
        tg.xuat();
    }

    
}
