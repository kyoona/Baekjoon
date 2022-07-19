import java.io.*;
import java.util.Stack;

public class Solution {
    void solution() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack=new Stack<>();
        int num=Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){ //시간복잡도 i*j*k
            String[] str=br.readLine().split(" ");
            for(int j=0; j<str.length; j++){
                for(int k=0; k<str[j].length(); k++){
                    stack.push(str[j].charAt(k));
                }
                while(!stack.empty()){
                    bw.write(stack.pop());
                }
                bw.write(" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
