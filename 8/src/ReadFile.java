import java.io.FileInputStream;

public class ReadFile {
    public static void main(String[] args) throws Exception{
        FileInputStream fin = new FileInputStream("hello.txt");
        int i;
        while((i = fin.read())!= -1){
            System.out.print((char)i);
        }
        fin.close();
    }
}
