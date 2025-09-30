package stack;

import java.util.Stack;

public class nxtSmrlLft {
    public static void main(String[] args) {
        int arr []={6,8,0,1,3};
        Stack<Integer>s= new Stack<>();
        int nxtSmrlLft[] = new int[arr.length];

        for(int i =0; i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtSmrlLft[i]=-1; 
            }
            else{
                nxtSmrlLft[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(nxtSmrlLft[i]+" ");
        }
        System.out.println();
    }
}
