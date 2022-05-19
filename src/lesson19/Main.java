package lesson19;

public class Main {
    public static void main(String[] args) {

        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();
        CopyWithNio copyWithNio = new CopyWithNio();
        CopyWithAppache copyWithAppache = new CopyWithAppache();


        long start1 = System.currentTimeMillis();
        copyWithOneByte.copy("C:\\Users\\LeV\\Downloads\\jdk-17_windows-x64_bin.exe", "1.exe");
        long end1 = System.currentTimeMillis();
        System.out.println("Копирование с помощью одного байта и буфера : " + (end1 - start1));


        long start2 = System.currentTimeMillis();
        copyWithNio.copy("C:\\Users\\LeV\\Downloads\\jdk-17_windows-x64_bin.exe", "2.exe");
        long end2 = System.currentTimeMillis();
        System.out.println("Копирование с помощью NIO : " + (end2 - start2));


        long start3 = System.currentTimeMillis();
        copyWithAppache.copy("C:\\Users\\LeV\\Downloads\\jdk-17_windows-x64_bin.exe", "3.exe");
        long end3 = System.currentTimeMillis();
        System.out.println("Копирование с помощью Appache : " + (end3 - start3));


    }
}
