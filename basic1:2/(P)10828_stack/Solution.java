import java.io.*;

public class Solution {
    int[] stack=null;
    int pointer=0;
    int stack_size=0;

    void solution() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        stack_size=Integer.parseInt(br.readLine());
        stack=new int[stack_size];
        for(int i=0; i<stack_size; i++){
            String[] inst=br.readLine().split(" ");
            if(inst[0].equals("push")){
                push(Integer.parseInt(inst[1]));
            }else if(inst[0].equals("pop")){
                bw.write(String.valueOf(pop())+"\n");
            }else if(inst[0].equals("size")){
                bw.write(String.valueOf(size())+"\n");
            }else if(inst[0].equals("empty")){
                bw.write(String.valueOf(empty())+"\n");
            }else if(inst[0].equals("top")){
                bw.write(String.valueOf(top())+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
    void push(int n){
        if(pointer<stack_size){
            stack[pointer++]=n;
        }
    }
    int pop(){
        if(empty()==1){
            return -1;
        }else{
            return stack[--pointer];
        }
    }
    int size(){
        return pointer;
    }
    int empty(){
        if(pointer==0){
            return 1;
        }else{
            return 0;
        }
    }
    int top(){
        if(empty()==1){
            return -1;
        }else{
            return stack[pointer-1];
        }
    }
}
