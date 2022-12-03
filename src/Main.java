import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        FileIterator fileIterator = new FileIterator("C:\\Users\\Иван\\IdeaProjects\\untitled4\\test.txt");
        while (fileIterator.hasNext()) {
            System.out.println(fileIterator.next());
        }
    }
}