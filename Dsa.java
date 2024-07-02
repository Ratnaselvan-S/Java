// Array creation in DSA
// import  java.util.*;
// class Dsa{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int sim=sc.nextInt();
//         int arr[]=new int[sim];
//         for (int i=0;i<sim;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         for (int i=1;i<sim;System.out.print(arr[i]+" "),i++)
//     }
// }

// Finding Max Value

// import  java.util.*;
// class Dsa{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int sim=sc.nextInt();
//         int arr[]=new int[sim];
//         for (int i=0;i<sim;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         Arrays.sort(arr);
//         for(int k=sim-1;k>=0;k--)
//         {
//             System.out.print(arr[k]+" ");
//         }
//     }
// }


// import  java.util.*;
// class Dsa{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//          int sim=sc.nextInt();
//         int arr[]=new int[sim];
//         for (int i=0;i<sim;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//          System.out.println("Give the element to search:");
//         int er=sc.nextInt();
//         for(int j=0;j<sim;j++)
//         {
//             if(arr[j]==er){
//                 System.out.println(j);
//                 break;
//             }
//         }
//     }
// }

// Binary search

// import java.util.*;
// public class Dsa
// {
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		int size=sc.nextInt();
// 		int find=sc.nextInt();
// 		long arr[]=new long[size];
// 		for(int i=0;i<size;i++){
// 		    arr[i]=sc.nextLong();
		  
// 		}
// 		Arrays.sort(arr);
// 		int flag=0;
// 		int start=0;
// 		int end=size-1;
// 		int mid;
// 		while(start<=end)
// 		{
// 		    mid=(start+end)/2;
// 		    if(arr[mid]==find)
// 		    {
// 		        System.out.println(true);
// 		        flag=1;
// 		        break;
// 		    }
// 		    else if(arr[mid]>find)
// 		    {
// 		        end=mid-1;
// 		    }
// 		    else if(arr[mid]<find)
// 		    {
// 		        start=mid+1;
// 		    }
// 		}
// 		if(flag==0){
// 		    System.out.println(false);
// 		}
		
// 	}
// }

// Selection sort
// import java.util.*;

// public class Dsa
// {
// 	public static void main(String[] args) {
// 	    Scanner sc=new Scanner(System.in);
// 	    int size=sc.nextInt();
// 		int arr[]=new int[size];
// 		for(int i=0;i<size;arr[i++]=sc.nextInt());
// 		for(int i=0;i<size;i++)
// 		{
// 		    int min=i;
// 		    for(int j=i+1;j<size;j++)
// 		    {
// 		        if(arr[j]<arr[min])
// 		        {
// 		            min=j;
// 		        }
		        
// 		    }
// 		    int t=arr[i];
// 		    arr[i]=arr[min];
// 		    arr[min]=t;
		    
// 		}
// 		for(int i=0;i<size;i++){
// 		    System.out.print(arr[i]+" ");
// 		}
// 	}
// }

// Bubble sort 


// import java.util.*;

// public class Dsa{
// 	public static void main(String[] args) {
// 	    Scanner sc=new Scanner(System.in);
// 	    int size=sc.nextInt();
// 		int arr[]=new int[size];
// 		for(int h=0;h<size;arr[h++]=sc.nextInt());
// 		for(int i=0;i<size;i++)
// 		{
// 		    for(int j=0;j<size-i-1;j++)
// 		    {
// 		        if(arr[j+1]<arr[j])
// 		        {
// 		             int t=arr[j];
// 		             arr[j]=arr[j+1];
// 		             arr[j+1]=t;
// 		        }
		        
// 		    }
// 		}
// 		for(int i=0;i<size;i++){
// 		    System.out.print(arr[i]+" ");
// 		}
	
// 	}
// }


// merge sort 


// import java.util.*;
// public class Main{   
//     static void mergesort(int a[],int s,int e){
//     if(s<e){
//         int mid=(s+e)/2;
//         mergesort(a,s,mid);  
//         mergesort(a,mid+1,e);
//         merge(a,s,mid,e);
//     }
//     }
//     static void merge(int arr[],int st,int mid,int en){
//         int ls=mid-st+1;
//         int rs=en-mid;
//         int larr[]=new int[ls];
//         int rarr[]=new int[rs];
//         for(int i=0;i<ls;i++){
//             larr[i]=arr[st+i];
//         }
//         for(int i=0;i<rs;i++){
//             rarr[i]=arr[mid+i+1];   
//         }
//         int i=0;
//         int j=0;
//         int k=st;
//         while(i<ls&&j<rs){
//             if(larr[i]<=rarr[j]){
//                 arr[k]=larr[i];
//                 i++;
//             }    
//             else{
//                 arr[k]=rarr[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i<ls){
//             arr[k]=larr[i];
//             i++;
//             k++;
//         }
//         while(j<rs){
//             arr[k]=rarr[j];
//             j++;
//             k++;
//         }
//     }
    
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		int s=sc.nextInt();
// 		int arr[]=new int[s];
// 		for(int i=0;i<s;arr[i++]=sc.nextInt());
// 		int st=0;
// 		int en=s-1;
// 		mergesort(arr,st,en);
// 		for(int i=0;i<s;System.out.print(arr[i]+" "),i++);
// 	}
// }


// QuickSort

// import java.util.*;
// public class Dsa{
//     static int split(int a[] , int st, int end){
//         int pivot=a[end];
//         int i =st-1;
//         int j;
//         for(j=st;j<end ;j++){
//             if(a[j]<pivot){
//                 i++;
//                 int t= a[j];
//                 a[j]=a[i];
//                 a[i]=t;
//             }
//         }
//         int t= a[i+1];
//         a[i+1]=a[j];
//         a[j]=t;
//         return i+1;
//     }
//     static void quick(int a[] , int s, int e){
//       if(s<e){
//           int mid= split(a,s,e);
//           quick(a,s,mid-1);
//           quick(a,mid+1,e);
//       }  
//     }
// 	public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// int size=sc.nextInt();
// int a[]=new int[size];
// for(int i=0;i<size;a[i++]=sc.nextInt());
// 	int s=0;
// 	int end=a.length-1;
// 	quick(a,s,end);
// 	for(int i=0;i<a.length;System.out.print(a[i++]+" "));
// 	}
// }


// Stack 
// import java.util.*;
// class stack{
//     int arr[] = new int[5];
//     static int top = -1;
//     void push(int a){  // inserting an Element
//         if (isFull()){
//             System.out.println("Array is Full");
//         }
//         else{
//             arr[++top] = a;
//         }
//     }
    
//     static boolean isFull(){
//         return top == 5-1;
//     }

//     void pop(){  // deleting the element
//         if (isEmpty()){
//             System.out.println("Array is Empty");
//         }
//         else{
//             arr[top--] = 0;
//         }
//     }

//     static boolean isEmpty(){
//         return top == -1;
//     }

//     void display(){

//         for (int a: arr){
//             System.out.println(a);
//         }
//     } 

//     void peek(){
//         System.out.println(top);
//     }

//     void size(){
//         System.out.println(top);
//     }
// }

// public class Dsa{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         stack myObj = new stack();
//         myObj.push(10);
//         myObj.push(20);
//         myObj.push(30);
//         myObj.push(40);
//         myObj.push(10);
//         myObj.push(60);
//         myObj.pop();
//         myObj.pop();
//         myObj.pop();
//         myObj.pop();
//         myObj.pop();
//         myObj.pop();
//         myObj.display();
//         myObj.peek();
//         myObj.size();
        
//     }
// }   


// Stack span of finding profit

// import java.util.*; 
// class Stack
// { 
//  int[] arr=new int[50]; 
//  int top=-1; 
//  void push(int data) 
//  { 
//   if(isFull()) 
//   { 
//    System.out.println("Stack is Full!!!"); 
//   } 
//   else 
//   { 
//    arr[++top]=data; 
//   } 
//  } 
//  int pop() 
//  { 
//   if(isEmpty()) 
//   { 
//    return -1;
//   } 
//   else 
//   { 
//    int d=arr[top];
//    arr[top--]=0; 
//    return d; 
//   }  
//  } 
//  int peek() 
//  { 
//   return arr[top]; 
//  } 
//  boolean isFull() 
//  { 
//   return top==5; 
//  } 
//  boolean isEmpty() 
//  { 
//   return top<0; 
//  } 
//  int size() 
//  { 
//   return top; 
//  } 
//  void show() 
//  { 
//   if(isEmpty()) 
//   { 
//    System.out.println("Stack is Empty!!!"); 
//   } 
//   else 
//   { 
//    for(int i=top-1;i>=0;i--) 
//    { 
//     if(arr[i]!=0)
//     System.out.print(arr[i]+" "); 
//    } 
//    System.out.println(); 
//   } 
//  } 
// } 
// public class Dsa{ 
 
//  public static void main(String[] args) { 
  
//  int arr[]= {10,60,50,75,80,78,90}; 
//  int n=arr.length; 
//         int[] op=new int[n]; 
//         Stack sp=new Stack();
//         sp.push(0); 
//         op[0]=1; 
//         for(int i=1;i<n;i++) { 
//          while(!sp.isEmpty() && arr[i]>=arr[sp.peek()]) { 
//           sp.pop(); 
//          } 
//          op[i]=sp.isEmpty()?i+1:i-sp.peek(); 
//          sp.push(i); 
//         } 
//         System.out.println(Arrays.toString(op)); 
//  } }

// stack span using brackets
// class Stackspan
// { 
//  int[] arr=new int[50]; 
//  int top=-1; 
//  void push(int data) 
//  { 
//   if(isFull()) 
//   { 
//    System.out.println("Stack is Full!!!"); 
//   } 
//   else 
//   { 
//    arr[++top]=data; 
//   } 
//  } 
//  int pop() 
//  { 
//   if(isEmpty()) 
//   { 
//    return -1;
//   } 
//   else 
//   { 
//    int d=arr[top];
//    arr[top--]=0; 
//    return d; 
//   }  
//  } 
//  int peek() 
//  { 
//   return arr[top]; 
//  } 
//  boolean isFull() 
//  { 
//   return top==5; 
//  } 
//  boolean isEmpty() 
//  { 
//   return top<0; 
//  } 
//  int size() 
//  { 
//   return top; 
//  } 
//  void show() 
//  { 
//   if(isEmpty()) 
//   { 
//    System.out.println("Stack is Empty!!!"); 
//   } 
//   else 
//   { 
//    for(int i=top-1;i>=0;i--) 
//    { 
//     if(arr[i]!=0)
//     System.out.print(arr[i]+" "); 
//    } 
//    System.out.println(); 
//   } 
//  } 
// } 

// public class Dsa {
// 	public static void main(String[] args) {
// 		char data[]= "{}[}]".toCharArray();
// 		   Stackspan check=new Stackspan();
// 		   int f=0;
// 		   for(int i=0;i<data.length;i++) {
// 			   if(data[i]=='{'||data[i]=='['||data[i]=='(')
// 				   check.push(data[i]);
// 			   else	{
// 				  if(data[i]=='}'&&check.pop()=='{')
// 					  continue;
// 				  else if(data[i]==']'&&check.pop()=='[')
// 					  continue;
// 				  else if(data[i]==')'&&check.pop()=='(')
// 					  continue;
// 				  else {
// 					  f=1;
// 					  break;
// 				  }   
// 			   }
// 		   }
// 		   if(f==0 && check.isEmpty()){
// 			   System.out.println("Valid");
// 		   }
// 		   else{
// 		       System.out.println("Invalid");
// 		   }

// 	}

// }

// Queue
// class Queue{
// int a[]=new int[5];
// int top=-1,end=-1;
// void enqueue(int d)
// {
// if(isfull())
// {
// System.out.println("Queue is full");
// top=0;
// }
// else
// {
// a[++end]=d;
// top=0;
// }
// }



// boolean isfull()
// {
// return end==5-1;
// }
// boolean isempty()
// {
// return top==-1;
// }


// int dequeue(){
// if(isempty())
// {
// return -1;
// }
// else
// {
// int d=a[top];
// top++;
// return d;
// }
// }
// int peek()
// {
// return a[top];
// }

// void dis()
// {
// if(isempty())
// {
// System.out.println("no data");
// }
// else
// {
// for(int i=top;i<=end;i++)
// System.out.print(a[i]+" ");
// }
// System.out.println();
// }
// }
// public class Dsa{
// public static void main(String[] args) {
// Queue q=new Queue();
// q.enqueue(10);
// q.enqueue(20);
// q.enqueue(30);
// q.dis();
// q.dequeue();
// q.dis();
// }
// }

// Linear search on circular 

// class Queue {
//     int a[]=new int[5];
//     int f=-1,e=-1;
//     void enqueue(int d)
//     {
//         if(isful())
//         {
//             System.out.println("is full");
//         }
//         else if(f==-1)
//         {
//           f=0;
//           a[++e]=d;
//         }
//         else
//         {   
//             e=(e+1)%5;
//             a[e]=d;
//         }
//     }
    
//     int dequeue()
//     {
//         if(isempty())
//         {
//            return -1;
//         }
//         else if(f==e)
//         {
//             int d=a[f];
//             f=e=-1;
//             return d;
//         }
//         else 
//         {
//             int d=a[f];
//             f=(f+1)%5;
//             return d;
//         }
//     }
//     boolean isful()
//     {
//         return (f==e+1 ||f==0&&e==4);
//     }
//     boolean isempty()
//     {
//         return f==-1;
//     }
//     int peek()
//     {
//         if(isempty()){
//             return -1;
//         }
//         else{
//         return a[f];
//         }
//     }
//     void dis()
//     {
//         if(isempty())
//         {
//             System.out.println("no data");
//         }
//         else 
//         {
//             int i=f;
//          while(i!=e)
//          {
//          System.out.print(a[i]+" ");
//          i=(i+1)%5;
//          }
//          System.out.print(a[i]);
//         }
//         System.out.println();
//     }
    
// }

// public class Dsa 
// {
// 	public static void main(String[] args) {
// 		Queue q=new Queue();
// 		q.enqueue(12);
// 		q.enqueue(2);
// 		q.enqueue(1);
// 		q.enqueue(10);
// 		q.enqueue(78);
// 		q.dis();
// 		int del=q.dequeue();
// 		System.out.println(del!=-1?del:"no data");
// 		q.dis();
// 		q.enqueue(178);
// 		q.dis();
// 	}
// }


// Collection in Java:
// A collection is a group of individual data, that are grouped together to form a single unit. Collections are containers that hold multiple data as a single unit. For example, if we store the names of all the employees in a single list and name it as Employee, it will form a collection.
// The two root interfaces of java collection class are:
// Collection interface (java.util.collection) Map interface (java.util.Map)

// Array list and iteration

// import  java.util.*;
// public class Dsa{
//     public static void main(String[] arg){
//         ArrayList<String>names = new ArrayList<String>();
//         names.add("Hello");
//         names.add("I am");
//         names.add("Darasan");
//         Iterator Ilist = names.iterator();
//         while(Ilist.hasNext()){
//             System.out.println(Ilist.next());
//         }
//     }
// }

// Good array

// import java.util.Arrays;

// class GoodArray {
//     public boolean isGood(int[] nums) {
//         Arrays.sort(nums);
//         if (nums.length == 1) {
//             return false;
//         }
//         else {
//             int ans = nums.length - 1;
//             int count = 1;
//             for (int i = 0; i < nums.length - 1; i++) {
//                 if (nums[i] == count) {
//                     count++;
//                 }
//                 else {
//                     return false;
//                 }
//             }

// largest in array

// class King {
// static int largest (int arr[], int n, int i)
// {
// if (i==n-1) {
// return arr[i];
// }
// int recMax = largest (arr, n, i + 1);
// return Math.max(recMax, arr[i]);
// }
// public static void main(String[] args)
// {
// int arr[] = { 10, 324, 45, 90, 9808 };
// int n =arr.length;
// System.out.println("Largest in given array is "
// + largest (arr, n, 0));
// }
// }

// Key:value in java

// import java.util.*;
// class Dsa{
//     public static void main(String args[])
//     {
//         HashMap<String,Integer> map=new HashMap<String,Integer>();
//         map.put("ram",10);
//         map.put("re",20);
//         System.out.println(map.size());
//         System.out.println(map);
//         if(map.containsKey("ram"))
//         {
//             Integer a=map.get("ram");
//             System.out.println(a);
//         }


//     }
// }

// Linked list 
// Methods for linked list are add,access,change,remove

// import java.util.*;
// class Dsa
// {
// public static void main(String[] args)
// {
// LinkedList<String> abc=new LinkedList<>();
// abc.add("a");
// abc.add("b");
// abc.add("c");
// System.out.println(abc);
// abc.add(1,"d");
// System.out.println(abc);
//  String str=abc.get(1);
// System.out.println(str);
// abc.set(1,"a");
// System.out.println(abc);
// String s=abc.remove(1);
// System.out.println(s);
// }
// }

// Maximum in stack  
// class stack{
//     int arr[] = new int[5];
//     static int top = -1;
//     void push(int a){  // inserting an Element
//         if (isFull()){
//             System.out.println("Array is Full");
//         }
//         else{
//             arr[++top] = a;
//         }
//     }
    
//     static boolean isFull(){
//         return top == 5-1;
//     }

//     void pop(){  // deleting the element
//         if (isEmpty()){
//             System.out.println("Array is Empty");
//         }
//         else{
//             arr[top--] = 0;
//         }
//     }

//     static boolean isEmpty(){
//         return top == -1;
//     }

//     void display(){
//         int firstElem = arr[0];
//         for (int a =1 ; a<arr.length;a++){
//             if (firstElem < arr[a]){
//                 firstElem=arr[a];
//             }
//         }
//         System.out.println(firstElem);
//     } 

//     // void peek(){
//     //     System.out.println(top);
//     // }

//     // void size(){
//     //     System.out.println(top);
//     // }
// }

// public class Main{
//     public static void main(String args[]){
//         stack myObj = new stack();
//         myObj.push(10);
//         myObj.push(120);
//         myObj.push(60);
//         myObj.push(40);
//         myObj.push(90);
//         myObj.display();
//     }
// }  

// linked list practice 
// import java.util.*;
// class Dsa {
//     public static void main(String args[]){
//         Scanner user = new Scanner(System.in);
//         LinkedList<String> item = new LinkedList<>();
//         LinkedList<Integer> value = new LinkedList<>();
//         item.add("darasan");
//         item.add("ratna");
//         item.add("vicky");
//         value.add(1);
//         value.add(2);
//         value.add(3);
//         System.out.println(item);
//         System.out.println(value);
//     }
// }



// import java.util.*;
// public class Main
// {
//     int data;
//     Main next;
//     public Main(int d){
//         this.next = null;
//         this.data = d;
//     }
//     public void display(){
//         int temp = next;
//         System.out.println(temp);
//     }
// 	public static void main(String[] args) {
// 		Scanner user = new Scanner(System.in);
//         LinkedList<String> item = new LinkedList<>();
//         Main he=new Main(5);
//         item.add("darasan");
//         item.add("ratna");
//         item.add("vicky");
//         System.out.println(display());
// 	}
// }



// insert at the beginning in doubly linked list 
// class DoublyLinkedList
// {
//   class Node
//   {
// 	int data;
// 	Node previous;
// 	Node next;
// 	public Node (int data)
// 	{
// 	  this.data = data;
// 	}
//   }
//   Node head, tail = null;
//   public void addNode (int data)
//   {
// 	Node newNode = new Node (data);
// 	if (head == null)
// 	  {
// 		head = tail = newNode;
// 		head.previous = null;
// 		tail.next = null;
// 	  }
// 	else
// 	  {
// 		newNode.previous = null;
// 		newNode.next=head;
// 		head=newNode;
// 	  }
//   }

//   public void display ()
//   {
// 	Node current = head;
// 	if (head == null)
// 	  {
// 		System.out.println ("List is empty");
// 		return;
// 	  }
// 	System.out.println ("Nodes of doubly linked list: ");
// 	while (current != null)
// 	  {
// 		System.out.print (current.data + " ");
// 		current = current.next;
// 	  }
//   }
// }

// public class Main
// {
//   public static void main (String[]args)
//   {
// 	DoublyLinkedList dList = new DoublyLinkedList ();
// 	  dList.addNode (1);
// 	  dList.addNode (2);
// 	  dList.addNode (3);
// 	  dList.addNode (4);
// 	  dList.addNode (5);
// 	  dList.display ();
//   }
// }

// Example for Traversal:

// static void inorder (Node root) {
// if (root == null)
// return;
// // Traverse left
// inorder(root.left); I
// // Traverse root
// System.out.print(root.item + "->");
// // Traverse right
// inorder(root.right);
// }


// Inorder 
// class Node
// {
//   int data;
//   Node left, right;
//   public Node (int d)
//   {
// 	data = d;
// 	left = right = null;
//   }
// }
// class Tree
// {
//   Node root;
//   Tree ()
//   {
// 	root = null;
//   }

//   void inOrder (Node node)
//   {
// 	if (node == null)
// 	  return;
// 	inOrder (node.left);
// 	System.out.println (node.data);
// 	inOrder (node.right);
//   }
// }

// public class Main
// {
//   public static void main (String[]ar)
//   {
// 	Tree tree = new Tree ();
//     tree.root = new Node (5);
//     tree.root.left = new Node (3);
//     tree.root.right = new Node (7);
//     tree.root.left.left = new Node (10);
//     tree.root.left.right = new Node (6);
//     tree.inOrder (tree.root);
//   }
// }


