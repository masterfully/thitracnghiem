import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DanhSachCauHoi implements DuyetDS , File{
	private CauHoi[] ch;
	private int n;
	
	public DanhSachCauHoi () {
		
	}
	
	public DanhSachCauHoi(CauHoi[] ch, int n) {
		this.ch = ch;
		this.n = n;
	}
	
	
	public CauHoi[] getCh() {
		return ch;
	}


	public void setCh(CauHoi[] ch) {
		this.ch = ch;
	}


	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}


	@Override
	public void docFile() {
		
	}
	public void docFile(String nameFile) {
		try (FileReader file = new FileReader(nameFile); 
	            BufferedReader buffer = new BufferedReader(file)) {
	                 n = 0;
	                 ch = new CauHoi[1];
	                 String []data = new String[7];
	                 String line = buffer.readLine();
	                 while (true){
	                     data[0] = buffer.readLine();
	                     System.out.println(data[0]);
	                     if (data[0] == null)
	                         break;
	                     n++;
	                     ch = Arrays.copyOf(ch, n);
	                     data[1] = buffer.readLine();
	                     data[2] = buffer.readLine();
	                     data[3] = buffer.readLine();
	                     data[4] = buffer.readLine();
	                     data[5] = buffer.readLine();
	                     data[6] = buffer.readLine();
	                     ch[n-1] = new CauHoi(data[0], data[1], data[2], data[3], data[4], data[5],data[6]);
	                 }
	                buffer.close();
	                file.close();
	        } catch (IOException ex) {
	            System.out.println("Loi khi mo File!");
	        }
	}
	@Override
	public void ghiFile() {
	}
	public void ghiFile(String nameFile) {
		try {
			FileWriter file = new FileWriter(nameFile);
			BufferedWriter buffer = new BufferedWriter(file);
			buffer.write("Số lượng câu hỏi:" + n);
			for(CauHoi s : ch) {
				buffer.write(s.getIdCau());
				buffer.newLine();
				buffer.write(s.getNoiDungCau());
				buffer.newLine();
				buffer.write(s.getPhuongAnA());
				buffer.newLine();
				buffer.write(s.getPhuongAnB());
				buffer.newLine();
				buffer.write(s.getPhuongAnC());
				buffer.newLine();
				buffer.write(s.getPhuongAnD());
				buffer.newLine();
				buffer.write(s.getDapAn());
				buffer.newLine();
			}
			buffer.close();
			file.close();;
		} catch (IOException e) {
			System.out.println("Loi khi mo File!");
		}
		
	}
	@Override
	public void timKiem() {}
//	public void timKiem(int id) {
//		for(int i = 1 ; i <= n ; i++) {
//			if(ch[i].g)
//		}
//	}
	public int timKiem(String NoiDungCauHoi) {
		for(int i = 0 ; i < n ; i++) {
			if(ch[i].getNoiDungCau().equalsIgnoreCase(NoiDungCauHoi)) {
				return i;
			}
		}
		return -1;
	}
	@Override
	public void sapXep() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void themPT() {
		n++;
		ch = Arrays.copyOf(ch, n);
		ch[n - 1] = new CauHoi();
		ch[n - 1].nhap();
		
	}
	@Override
	public boolean xoaPT(int x) {
        if (x > n)  return false;
        n--;
        if (x > n)  return true;
        for (int i = x; i < n; i++){
            ch[i] = ch[i+1];
        }
        ch[n] = null;
        ch = Arrays.copyOf(ch, n);
        return true;
    }
	@Override
	public void nhapDS() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập vào số câu hỏi bạn muốn:");	
			n = sc.nextInt();
		} while (n < 0);
		ch = new CauHoi[n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Câu "+ i + ":");
			ch[i] = new CauHoi();
			ch[i].nhap();
		}	
		
	}
	@Override
	public void xuatDS() {
		for(int i = 0 ; i < n ; i++) {
			ch[i].xuat();
		}
		
	}

	 void XuatCauHoiTheoViTri(int index){
			this.ch[index].xuat(); 
	}
	
	 public static void main(String[] args) {
		DanhSachCauHoi dsch = new DanhSachCauHoi();
		dsch.docFile("danhsachcauhoi");
		dsch.xuatDS();
	}
}
