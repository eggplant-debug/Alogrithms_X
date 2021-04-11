package file;
import java.io.File;
import java.io.IOException;
public class Testfile {
    public static void main(String[] args){
        File f=new File("C:/Windows");
        File[] fs=f.listFiles();
        if (null==fs)
            return;
        long minsize=Integer.MAX_VALUE;
        long maxsize=0;
        File maxfile=null;
        File minfile=null;
        for (File file:fs){
            if(file.isDirectory()){
                continue;
            }
            if(file.length()<minsize){
                minsize=file.length();
                minfile=file;
            }
            if(file.length()>maxsize){
                maxsize=file.length();
                maxfile=file;
            }
        }

        System.out.printf("最大的文件是%s,其字节为%d",maxfile.getAbsolutePath(),maxfile.length());
        System.out.printf("最小的文件是%s,其字节为%d",minfile.getAbsolutePath(),minfile.length());

    }
}
