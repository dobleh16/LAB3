package Lab3;

import static Lab3.HeapSort.printArray;
import static Lab3.MergeSort.printArray;
import static Lab3.QuickSort.printArray;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {

public static void main(String args[]) throws Exception
{
while (true){
    try (ServerSocket ss = new ServerSocket(1111)) {
        System.out.println("Servidor iniciado");
        System.out.println("Bienvenido cliente");
        try (Socket s = ss.accept()) {
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            int r,i=0;
            int k=din.readInt();
            int n=din.readInt();
            int a[]=new int[n];
            int b[]=new int[n];
            int count=0;
            for(i=0;i<n;i++)
            {
                a[i]=din.readInt();
            }
            for(i=0;i<n;i++)
            {
                b[i]=a[i];
            }
            if (k==1) {
                MergeSort ob = new MergeSort();
                ob.sort(a, 0, a.length - 1);
                System.out.println("Elegiste Mergesort:");
                for(i=0;i<n;i++){
                    dout.writeInt(a[i]);
                System.out.println("el vector sin ordenar digitado en la posicion #"+i + " es "+ b[i]);
                }
                for(i=0;i<n;i++){
                    dout.writeInt(a[i]);
                    System.out.println("el vector ordenado con mergesort en la posicion #"+i + " es "+ a[i]);
                }
                System.out.println("el tiempo en nano segundos del algoritmo de Mergesort fue de ");
                System.out.println(System.nanoTime());
            }   if (k==2) {
                HeapSort ob = new HeapSort();
                ob.sort(a);
                System.out.println(" Elegiste HeapSort:");
                for(i=0;i<n;i++){
                    dout.writeInt(a[i]);
                System.out.println("El vector sin ordenar digitado en la posicion #"+i + " es "+ b[i]);
                }
                for(i=0;i<n;i++){
                    dout.writeInt(a[i]);
                    System.out.println("el vector ordenado con heapsort en la posicion # "+i + " es "+ a[i]);
                }
                System.out.println("el tiempo en nano segundos del algoritmo de HeapSort fue de ");
                System.out.println(System.nanoTime());
                
            }   if (k==3) {
                QuickSort ob = new QuickSort();
                ob.sort(a, 0, n-1);
                for(i=0;i<n;i++){
                    dout.writeInt(a[i]);
                System.out.println("El vector sin ordenar digitado en la posicion #"+i + " es "+ b[i]);
                }
                System.out.println("Elegiste QuickSort:");
                for(i=0;i<n;i++){
                    dout.writeInt(a[i]);
                    System.out.println("el vector ordenado con quicksort en la posicion #"+i + " es "+ a[i]);
                }       System.out.println("el tiempo en nano segundos del algoritmo de QuickSort fue de ");
                System.out.println(System.nanoTime());
            }
        }
    }
    System.out.println("Sesion finalizada");
    System.out.println("==========================================================================");
}
}
}

///M. Lakhtaria, “Java program to implement sorting algorithm using TCP on server application,” Java Program to Implement sorting algorithm using TCP on Server application, 15-Aug-2021. [Online]. Available: https://codesforreference.blogspot.com/2020/05/simple-java-program-sorting-algorithm-on-server.html. [Accessed: 10-Nov-2022].


