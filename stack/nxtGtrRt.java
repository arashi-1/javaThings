package stack;

import java.util.Stack;

public class nxtGtrRt {
    public static void main(String args[]){
        int arr[] ={6,8,0,1,3};
        Stack<Integer>s = new Stack<>();
        int nxtGtr[] = new int[arr.length];
        
        for(int i = arr.length-1; i>=0;i--){
            //while
            while(!s.isEmpty() && arr[s.peek()] <=arr[i]){
                s.pop();
            }
            //if-else
            if(s.isEmpty()){
                nxtGtr[i]=-1;
            }
            else{
                nxtGtr[i]=arr[s.peek()];
            }
            //push in s
            s.push(i);
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(nxtGtr[i]+" ");
        }
        System.out.println();
    }
}
