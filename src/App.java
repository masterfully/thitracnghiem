import java.util.Scanner;

public class App {
	private static Scanner scan = new Scanner(System.in);
    public static DanhSachCauHoi DSCH = new DanhSachCauHoi();
    public static DanhSachGiaoVien DSGV = new DanhSachGiaoVien();
    public static StudentList DSSV = new StudentList();
    public static int MatKhau = 12345678;
    public static int id;
    
    public static void clearScreen(){
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------------------UNG DUNG QUAN LY THI TRAC NGHIEM--------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public static void DangNhap(){
        int m;
        do{
        	
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------------UNG DUNG QUAN LY THI TRAC NGHIEM--------------------------------------");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("ID cua ban:");
            id = Integer.parseInt(scan.nextLine());
            System.out.println("Mat khau:");
            m = Integer.parseInt(scan.nextLine());
            
            if(id <= DSSV.getN() && m == 12345678) {
            	MenuSinhVien();
            } else {
            	System.out.println("Sai thông tin đăng nhập mời bạn nhập lại");
            }
        }while(true);
        
    }
    public static void DangNhapAdmin() {
    	int m;
do{
        	
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------------UNG DUNG QUAN LY THI TRAC NGHIEM--------------------------------------");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("ID cua giang vien:");
            id = Integer.parseInt(scan.nextLine());
            System.out.println("Mat khau:");
            m = Integer.parseInt(scan.nextLine());
            
            if(id <= DSGV.getN() && m == 123456) {
            	menuAdmin();
            } else {
            	System.out.println("Sai thông tin đăng nhập mời bạn nhập lại");
            }
        }while(true);
    }
    public static void Thi() {
    	Thi thi = new Thi();
    	thi.getDetThi().NhapThongTinDeThi();
    	thi.LamDeThi();
    	System.out.println("Chuc Mung ban da hoan thanh Bai Thi");
    	Scanner scanner = new Scanner(System.in);
        int option;
    	while(true) {
    		System.out.println("1.Dang Xuat");
    		System.out.println("2.Quay ve Menu");
    		option = scanner.nextInt();
    		if(option == 1) {
    			ThongThiTracNghiem();
    		} 
    		if(option == 2) {
    			MenuSinhVien();
    		}
    	}
    }
    
    public static void ThongTinSinhVien() {
    	DSSV.searchId(id);
    	clearScreen();
    	MenuSinhVien();
    }
    
    public static void CapNhatThongTinSinhVien() {
    	DSSV.updateId(id);
    	clearScreen();
    	MenuSinhVien();
    }
    
    public static void MenuSinhVien(){
        Scanner scanner = new Scanner(System.in);
        int option;
        while (true) {
           System.out.println("1.Vao Thi");
           System.out.println("2.Xem Thong Tin");
           System.out.println("3.Cap Nhat Thong Tin");
           System.out.println("4.Dang Xuat");
            option = scanner.nextInt();
           if(option == 1){
        	   System.out.println("Vao Thi thanh cong");
        	   clearScreen();
        	   Thi();
            return;
           } else if(option == 2){
            System.out.println("Thong tin sinh vien");
            ThongTinSinhVien();
 
           } else if(option == 3){
             System.out.println("Moi Cap nhat thong tin");
             CapNhatThongTinSinhVien();
        }  else if(option == 4){
            return;
        }
         System.out.println("Khong Hop Le Moi Nhap Lai");
        }
    }
    
    public static void updateCauhoi() {
    	Scanner scanner = new Scanner(System.in);
    	int option;
    	while(true) {
    		System.out.println("Nhập câu bạn muốn sửa");
    		
    	}
    }
    
    public static void upDateGiangVien() {
    	
    }
    
    public static void menuAdmin() {
    	Scanner scanner = new Scanner(System.in);
        int option;
        while (true) {
           System.out.println("1.Danh sách học sinh");
           System.out.println("2.Danh sách giảng viên");
           System.out.println("3.Danh sách câu hỏi");
           System.out.println("4.Cập nhật danh sách câu hỏi");
           System.out.println("5.Cập nhật danh sách học sinh");
           System.out.println("6.Cập nhật danh sách giảng viên");
           System.out.println("7.Đăng xuất");
            option = scanner.nextInt();
           if(option == 1){
        	   System.out.println("Danh sách học sinh");
        	   clearScreen();
        	   DSSV.printList();
        	   menuAdmin();
           } else if(option == 2){
            System.out.println("Danh sách giảng viên");
            	DSGV.xuatDS();
            	menuAdmin();
           } else if(option == 3){
             System.out.println("Danh sách câu hỏi");
             DSCH.docFile("Hoahoc.txt");
             DSCH.xuatDS();
            menuAdmin();
           }  else if(option == 4) {
        	System.out.println("Cập nhật danh sách câu hỏi");
        		updateCauhoi();
        	}
       			else if(option == 5) {
        	System.out.println("Cập nhật danh sách học sinh");
       		}
       			else if(option == 6) {
        	System.out.println("Cập nhật danh sách giảng viên");
        		upDateGiangVien();
        	}
           
       		else if(option == 7){
            return;
       		}
         System.out.println("Khong Hop Le Moi Nhap Lai");
        }
    }
    public static void ThongThiTracNghiem(){
        Scanner scanner = new Scanner(System.in);
        int option;
        clearScreen();
        do{
     System.out.println("===============================================");
        System.out.println("Ban muon dang nhap voi tu cach gi: ");
        System.out.println("1.Tu cach sinh vien");
        System.out.println("2.Tu cach giao vien ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                  DangNhap();
                    return;
                case 2:
                    DangNhapAdmin();
                    return;
            }
            System.out.println("Khong hop le moi nhap lai");
        }while(true);
    }
    public static void main(String[] args) {
    	DSGV.docFile("danhsachgiaovien");
    	DSSV.readFile("student-data.txt");
        App app = new App();
        app.ThongThiTracNghiem();
        
        
    }

}