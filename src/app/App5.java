package app;

import java.util.*;

public class App5 extends Thread{
    Scanner tec = new Scanner(System.in);
    public void run(){
        int n;
        int promedio = 0,nota=1;
        int contador = 0;
        System.out.println("Promedio de notas del Alumno");
        while(nota < 6) { 
            System.out.println("Ingrese la nota " + nota + "°");
            n = tec.nextInt();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e) {
        }
        nota++;
        contador = contador + n;
        promedio = contador / nota;
    }
    System.out.println("Promedio es : "+ promedio);
    }
    public static void main(String []args){
    App5 notas = new App5();
    notas.start();
    }
}