
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    float DC = DiemChuan();
    float DTK = DiemTongKet();
    if (DTK >= DC)
    {
      System.out.println("Chuc mung ban da trung tuyen");

    }
    else
    {
      System.out.println("Ban khong trung tuyen");
    }

  }
  public static float DiemChuan()
  {
    // Can biet diem chuan cua tuyen sinh
    float DiemChuanTuyenSinh = 0.0f;
    System.out.println("Diem chuan tuyen sinh: ");
    Scanner sc = new Scanner(System.in);
    DiemChuanTuyenSinh = Float.parseFloat(sc.nextLine());
    return DiemChuanTuyenSinh;
  }

  public static float TongDiem3MonThi()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap diem mon thi thu nhat: ");
    float Mon1 = Float.parseFloat(sc.nextLine());
    System.out.println("Nhap diem mon thi thu hai: ");
    float Mon2 = Float.parseFloat(sc.nextLine());
    System.out.println("Nhap diem mon thi thu ba: ");
    float Mon3 = Float.parseFloat(sc.nextLine());

    float Tong = Mon1 + Mon2 + Mon3;
    return Tong;

  }

  public static float DiemUuTienKhuVuc() {
    float DiemUuTienKV = 0.0f;
    Scanner sc = new Scanner(System.in);
    System.out.println("Xin hoi ban o khu vuc uu tien nao?");
    System.out.println("Vui long chon A, B, hoac C");
    System.out.println("Nhap X neu ban khong thuoc khu vuc uu tien");
    String TuyChon = sc.nextLine();

      DiemUuTienKV = switch (TuyChon) {
          case "A" -> 2.0f;
          case "B" -> 1.0f;
          case "C" -> 0.5f;
          case "X" -> 0.0f;

      };
    return DiemUuTienKV;
  }
    public static float DiemUuTienDoiTuong(){
        float _DiemUuTienDoiTuong = 0.0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Xin cho biết bạn thuộc đối tượng ưu tiên nào?");
        System.out.println("Vui lòng chọn một trong ba: 1, 2 hoặc 3");
        String TuyChon = sc.nextLine();
        _DiemUuTienDoiTuong = switch (TuyChon) {
            case "1" -> 2.5f;
            case "2" -> 1.5f;
            case "3" -> 1.0f;
        };

        return _DiemUuTienDoiTuong;

    }

    public static float DiemUuTien()
    {
      float diemUuTien = DiemUuTienKhuVuc() + DiemUuTienDoiTuong();
      return diemUuTien;
    }

    public static float DiemTongKet()
    {
      float diemTongKet = TongDiem3MonThi() + DiemUuTien();
      return diemTongKet;
    }



}
