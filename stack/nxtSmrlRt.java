package stack;

import java.util.Stack;

public class nxtSmrlRt {
    public static void main(String args[]){
        int arr[] ={6,8,0,3,1};
        Stack<Integer>s=new Stack<>();
        int nxtSmrlRt[]=new int[arr.length];

        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtSmrlRt[i]=-1;
            }
            else{
                nxtSmrlRt[i]= arr[s.peek()];
            }
            s.push(i);
        }

        for(int i =0; i<arr.length;i++){
            System.out.print(nxtSmrlRt[i]+" ");
        }
        System.out.println();
    }
}
