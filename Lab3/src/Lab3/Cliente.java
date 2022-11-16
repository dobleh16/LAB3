package Lab3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
public static void main(String[] args) throws Exception
{
Socket s=new Socket("localhost",1111);
System.out.println("Digite que tipo de ordenamiento desea");
System.out.println("Digite el numero 1 para mergesort");
System.out.println("Digite el numero 2 para heapsort");
System.out.println("Digite el numero 3 para quicksort");
Scanner scanner=new Scanner(System.in);
int k=scanner.nextInt();
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeInt(k);
System.out.println("Digite el tamaño del vector");
int n=scanner.nextInt();
int a[]=new int[n];
System.out.println("Digite el vector y luego presione enter");
System.out.println("");
dout.writeInt(n);
for(int i=0;i<n;i++)
{
int r=scanner.nextInt();;
dout.writeInt(r);
}
DataInputStream din=new DataInputStream(s.getInputStream());
int r;
for(int i=0;i<n;i++)
{
r=din.readInt();
}
s.close();
}
}
///M. Lakhtaria, “Java program to implement sorting algorithm using TCP on server application,” Java Program to Implement sorting algorithm using TCP on Server application, 15-Aug-2021. [Online]. Available: https://codesforreference.blogspot.com/2020/05/simple-java-program-sorting-algorithm-on-server.html. [Accessed: 10-Nov-2022].





