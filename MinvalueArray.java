package session2;
import java.util.Scanner;
public class MinvalueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hiển thị giá trị nhỏ nhất trong mảng");
        int[] array;
        int size;

        do{
            System.out.println("Nhập  độ dài của mảng : ");
            size = scanner.nextInt();
            if(size > 22) {
                System.out.println("Kích thước số nhập vào phải nhỏ hơn 22");
            }
        }while(size > 22);

        int i = 0;
        array =  new int[size];
        while(i < array.length){
            System.out.println("nhập phần tử " + (i+1) +" là: ");
            array[i] = scanner.nextInt();
            i++;
        }

        minValue(array);

    }
    public static void minValue(int []array) {

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("phần tử nhỏ nhất trong mảng là : " + array[index]);
    }
}
