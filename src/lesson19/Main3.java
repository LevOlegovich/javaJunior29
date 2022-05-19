package lesson19;

import java.io.File;
import java.io.FileFilter;

public class Main3 {
    public static void main(String[] args) {
        File startDir = new File("C:\\Users\\LeV\\Downloads");

        File[] files = startDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getName().endsWith(".mp4")) {

                    return true;

                }
                return false;
            }

        });

        for (File f : files) {
            System.out.println(f.getName());

        }
        System.out.println("Количество файлов: " + files.length);

    }
}
