package codeeval;
import java.util.*;

public class Solution {
    static int n;
   
public static int solution(int []A, int[]B, int M, int X, int Y){
    ArrayList<Integer> A1=new ArrayList<Integer>();
    ArrayList<Integer> B1=new ArrayList<Integer>();
for(int i=0;i<A.length;i++){
    A1.add(A[i]);
}
for(int i=0;i<B.length;i++){
    B1.add(B[i]);
}
    n=A1.size();
    int totalnoofstops=1;
    int noinlift=0,weightofpeople=0;
    HashMap takeninlift=new HashMap<>(n);
    do{
    for(int i=0;i<=n;i++){
        if(noinlift<X && weightofpeople<Y){
            takeninlift.put(i, "true");
            noinlift=noinlift+1;
            weightofpeople=weightofpeople+A[i];
        }
        
    }
   
    for(int i=0;i<n;i++){
        if(takeninlift.get(i).equals("true")){
            ArrayList<Integer> floorscovered=new ArrayList<>();
            if(!floorscovered.contains(B[i])){
            floorscovered.add(B[i]);
            totalnoofstops++;
           
            };
            
            B1.remove(B[i]);
        }
    }
    }while(B1.size()!=0);
    return totalnoofstops;
}

public static void main(String[] args) {
    int m=5, x=2,y=200;
int A[]=new int[3];
A[0]=60;
A[1]=80;
A[2]=40;
int B[]=new int[3];
B[0]=2;
B[1]=3;
B[2]=5;
    int result= solution(A,B,m,x,y);
   
}
}