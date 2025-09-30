package stack;

import java.util.Stack;

public class duplicateParetheses {
    public static boolean isDuplicate(String str){
        Stack<Character>s= new Stack<>();

        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);

            if(ch==')'){
                int count =0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }
            else{
                    s.push(ch);
                }
        }

        if(s.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";   
        System.out.println(isDuplicate(str));
    }
}
