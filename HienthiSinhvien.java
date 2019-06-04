package session2;
import java.util.Scanner;
public class HienthiSinhvien {
    public static void main(String[] args) {

        String[] student = {"Thiên", "Thời", "Địa", "Lợi", "Nhân", "Hòa"};
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập tên sinh viên : ");
        String inputName = input.nextLine();

        boolean check = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(inputName)) {
                System.out.println("Sinh viên " + inputName + " thuộc trong danh sách SINHVIEN" +"ở vị trí thứ " +(i+1));
                check = true;
                break;
            }
            }
        if(!check){
            System.out.println("Tên sinh viên " +inputName+" không tìm thấy trong danh sách");
        }
        }
    }
