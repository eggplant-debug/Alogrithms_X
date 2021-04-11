package nowCoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class findAndSort {
    public static void main(String argsp[]) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        while (buf.ready()) {
            int n = Integer.parseInt(buf.readLine());
            int s = Integer.parseInt(buf.readLine());
            Student[] stu = new Student[n]; //为了后续存储方便，用多个数组的方式进行存储，
            for (int i = 0; i < n; i++) {
                String[] str = buf.readLine().split(" ");//空格分开，将学生名和成绩分开
                stu[i] = new Student(str[0], Integer.parseInt(str[1]));//将数字转移成int型

            }
            Arrays.sort(stu, new Comparator<Student>() {
                @Override //仔细看“）”在后面，说明这是一个新的类，然后方法直接覆写了
                public int compare(Student o1, Student o2) {
                    return s == 0 ? (o2.score - o1.score) : (o1.score - o2.score);//升序1还是降序0
                }

            });

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(stu[i].name + " " + stu[i].score + "\n");//这里用一个sb, append()方法将stu的
            }
            System.out.println(sb);
            System.out.println(sb.substring(0, sb.length() - 1));
        }

    }

    //定义一个学生类
    public static class Student {
        public String name;
        public int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

}


