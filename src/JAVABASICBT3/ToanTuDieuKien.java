package JAVABASICBT3;

public class ToanTuDieuKien {

    static int a = 10;
    static int b = 20;
    static int c = 30;
    static int result;

    public static void rankAcademy(double n){
        double mark = 7.6;
        if (mark == n){
            System.out.println("Điểm xếp loại trung bình");
        } else if (mark > n){
            System.out.println("Điểm xếp loại trên trung bình");
        } else {
            System.out.println("Điểm xếp loại dưới trung bình");
        }
    }

    public static void main(String[] args) {

        System.out.println("Toán tử số học"); // Toán tử số học
        System.out.println("Phép cộng a + b + c: " + (result = a + b + c));
        System.out.println("Phép trừ c - b : " + (result = c - b));
        System.out.println("Phép nhân a x c : " + (result = a * c));
        System.out.println("Phép chia c/a : " + (result = c / a));
        System.out.println("Phép lấy modul của c/b : " + (result = c % b));
        System.out.println("Phép tăng dần của a: " + (++a));
        System.out.println("Phép giảm dần của b: " + (--b));
        System.out.println("Phép Cộng và gán giá trị: " + (result += c));
        System.out.println("Phép Trừ và gán giá trị: " + (result -= a));
        System.out.println("Phép lấy số dư và gán giá trị: " + (c + (result %= b)));

        int x = 2;
        int y = 4;
        int z = 6;
        System.out.println("Toán tử quan hệ"); // Toán tử quan hệ
        String s = (y - x == z - y) ? "x,y,z cấp số cộng" : "x,y,z không phải cấp số cộng";
        System.out.println(s);
        String m = (x + y > z ) ? "x,y,z là 3 cạnh tam giác" : "x,y,z không phải là 3 cạnh tam giác";
        System.out.println(m);
        String n = (y/x != z/4) ? "x,y,z không phải cấp số nhân" : "x,y,z là cấp số nhân";
        System.out.println(n);
        System.out.println((x+2) == z);
        System.out.println(x+y == z);

        System.out.println("Toán tử logic");  //Toán tử logic
        System.out.println((x*2) == y && (x+x) == y);
        System.out.println((x*x) == y || (x+z) < y);
        System.out.println((x*x) == y ^ (y/x) == 2);
        System.out.println(!((x+2)!=y));

        System.out.println("Hàm điều kiện dùng xếp loại"); //Hàm if else truyền tham số n
        rankAcademy(5);

    }
}
