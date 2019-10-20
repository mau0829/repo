package com.demo.test;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;


public class CoffeBean {

public static int whiteBean=0;
public static int BlackBean=0;


public static void main(String[] args) {
 
 Scanner sc =new Scanner(System.in);
 
 System.out.println("enter can size");
 int size=sc.nextInt();
 
 //stack created with size
 Stack<String> stored=new Stack<>();
 Stack<String> stored1=new Stack<>();
// stored.setSize(size);
 
 //data enter now compare and push pop
 
 System.out.println("Enter coffebeans in can");
 for(int i=0;i<size;i++){
  String bean=sc.next();
  stored.add(bean);
 }
 System.out.println(stored);
 stored1.addAll(stored);
 
 //now compare and push pop
 compareBean(stored,stored1);
 
}

private static void compareBean(Stack<String> stored, Stack<String> stored1) {
 // TODO Auto-generated method stub
 System.out.println("in compare fun " + stored);
 String first;
 String next;
 ListIterator<String> it=stored.listIterator();
 while(it.hasNext()){
  //first=stored.pop();
  //next=stored.pop();
  //System.out.println( "it values  "+it.next());
  first=stored1.pop();
  next=stored1.pop();
 
  //System.out.println("Element in stack " + "/n first" + first + " /n next" + next  );
 
  if(first.equals(next)){
   stored1.push("B");
   //System.out.println("after same comapre " + stored1);
  }if((first.equals("B") &&  next.equals("W")) ||
    (first.equals("W") && next.equals("B"))){
   stored1.push("W");
   //System.out.println("after different compare " + stored1);
   
  }
  if(stored1.size()==1){
   System.out.println("remaining beans in can "  + stored1);
   break;
  }
 
 }
 
}

}
