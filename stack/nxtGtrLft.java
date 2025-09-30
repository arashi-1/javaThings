package stack;

import java.util.Stack;

public class nxtGtrLft {
     public static void main(String args[]){
    int arr[]= {3,1,0,8,6};
    Stack<Integer>s= new Stack<>();
    int nxtGtrLft[]=new int[arr.length];

    for(int i =0; i<arr.length;i++){
        while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nxtGtrLft[i]= -1;
        }
        else{
            nxtGtrLft[i]=arr[s.peek()];
        }
        s.push(i);
    }

    for(int j =0; j<arr.length;j++){
        System.out.print(nxtGtrLft[j]+" ");
    }
    System.out.println();
}
}

