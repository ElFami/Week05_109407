import java.sql.SQLOutput;
import java.util.Scanner;

public class Tugas {
    private String color;
    public static void main(String[] args) {
        menu();
    }

    public static void menu() { //Menunya
        Scanner in = new Scanner(System.in);
        System.out.println("-------Program Menghitung Bangun Ruang------");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Segitiga");
        System.out.println("5. Keluar");
        System.out.println("Pilihan : ");
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                Lingkaran();
            case 2 :
                Persegi();
            case 3:
                PersegiPanjang();
            case 4:
                Segitiga();
                case 5:
                    System.out.println("Keluar program...");
                    break;
            default:
                System.out.println("Input tidak valid");
                menu();
        }
    }

    public static void Lingkaran () {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Jari-Jari : ");
        double r =  in.nextDouble();

        CircleTugas circle = new CircleTugas(r, "Biru");
        System.out.println("------Lingkaran-------");
        System.out.println("Jari-jari : " + r);
        System.out.println("Color : " + circle.getColor());
        System.out.println("Keliling Lingkaran : " + circle.getPerimeter());
        System.out.println("Luas Lingkaran : " + circle.getArea());
    }
    public static void Persegi() {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan panjang sisi :");
        int s = in.nextInt();

        SquareTugas square = new SquareTugas(s, "Merah");

        System.out.println("------Persegi------");
        System.out.println("Warna : " + square.getColor());
        System.out.println("Panjang Sisi : " + s);
        System.out.println("Keliling Persegi : " + square.getPerimeter());
        System.out.println("Luas Persegi : " + square.getArea());
    }
    public static void PersegiPanjang() {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan panjang sisi :");
        int length = in.nextInt();
        System.out.println("Masukkan panjang lebar :");
        int width = in.nextInt();

        RectangleTugas rectangle = new RectangleTugas(length, width, "Ungu");
        System.out.println("Warna : " + rectangle.getColor());
        System.out.println("Panjang & Lebar : " + length + " & " + width);
        System.out.println("Keliling Persegi Panjang : " + rectangle.getPerimeter());
        System.out.println("Luas Persegi Panjang : " + rectangle.getArea());
    }

    public static void Segitiga() {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan alas : ");
        int alas = in.nextInt();
        System.out.println("Masukkan Tinggi : ");
        int tinggi = in.nextInt();

        TriangleTugas triangle = new TriangleTugas(alas, tinggi, "Hitam");
        System.out.println("------Segitiga Siku-siku------");
        System.out.println("Warna : " + triangle.getColor());
        System.out.println("Panjang & Tinggi : " + alas + " & " + tinggi);
        System.out.println("Keliling Segitiga Siku-siku : " + triangle.getPerimeter());
        System.out.println("Luas Segitiga Siku-siku : " + triangle.getArea());
    }
}
