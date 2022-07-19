import java.io.*;
import java.util.Stack;

public class Solution {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    void solution() throws IOException {
        int num=Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            check(br.readLine());
        }
        bw.flush();
        bw.close();
        br.close();
    }
    void check(String str) throws IOException { //시간복잡도 i*j
        Stack<Character> stack=new Stack<>();
        for(int j=0; j<str.length();j++){
            if(str.charAt(j)=='('){
                stack.push('(');
            }else{
                if(stack.empty()){
                    bw.write("NO\n");
                    return;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            bw.write("YES\n");
        }else{
            bw.write("NO\n");
        }
    }
}
