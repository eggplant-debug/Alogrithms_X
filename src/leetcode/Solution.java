package leetcode;
import java.util.Arrays;

public class Solution {
        public String[] findWords(String[] words) {
            String[] oneLines = new String[]{
                    "QWERTYUIOP","ASDFGHJKL","ZXCVBNM"
            };
            int[] lines = new int[128];
            String[] res = new String[words.length];
            //初始化字典
            for(int i = 0;i<oneLines.length;i++){
                for(char c:oneLines[i].toCharArray()){
                    lines[c] = i+1;
                }
            }
            int count = 0;
            for(String word:words){
                //行数
                int lineNum = 0;
                //是否是同一行
                boolean isOneLine = true;
                for(char c:word.toCharArray()){
                    //字符全部转换为大写字母
                    c = Character.toUpperCase(c);
                    if(lineNum!=0&&lines[c]!=lineNum){
                        isOneLine = false;
                        break;
                    }else{
                        lineNum = lines[c];
                    }
                }
                if(isOneLine){
                    res[count] = word;
                    count++;
                }
            }
            return Arrays.copyOf(res,count);
        }

         public static void main(String[] args) {
            Solution s=new Solution();
            System.out.println(s.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}));

    }
    }

