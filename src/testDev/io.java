package testDev;
import java.io.*;

public class io {
    public static void main(String[] str) throws IOException {
        File file=new File("./io-demo/aa");
        FileReader reader=new FileReader("./io-demo/aa");
        char[] buf =new char[126];
        int n;
        while((n=reader.read(buf))!=-1){
            System.out.print(1);
        }
        if(!file.exists()){
            file.mkdirs();
            // mkdir 和 mkdirs 区别
        }
        FileOutputStream fos =new FileOutputStream("./io-demo/aa/demo2.txt");
        fos.write("1234".getBytes());
        fos.flush();
        fos.close();
    }
}
