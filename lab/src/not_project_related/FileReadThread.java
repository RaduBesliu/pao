package not_project_related;

import java.io.File;
import java.util.Scanner;

public class FileReadThread extends Thread {
    public int count;
    public String fileName;
    public String word;

    public FileReadThread(String fileName, String word) {
        this.count = 0;
        this.fileName = fileName;
        this.word = word;
    }

    @Override
    public void run() {
        try {

            Scanner s = new Scanner(new File(fileName));
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] words = line.split("[, \n]+");
                for (String word: words) {
                    if (word.equals(this.word)) {
                        ++count;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.next();

        FileReadThread f1 = new FileReadThread("src/not_project_related/1.txt", word);
        FileReadThread f2 = new FileReadThread("src/not_project_related/2.txt", word);
        FileReadThread f3 = new FileReadThread("src/not_project_related/2.txt", word);

        f1.start();
        f2.start();
        f3.start();

        try {
            f1.join();
            f2.join();
            f3.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int total = f1.count + f2.count + f3.count;
        System.out.println(total);
    }
}