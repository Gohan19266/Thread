package app;

public class App7par extends Thread{
    public void run(){
        int i;
        int contador=0;
        for (i=1;i<=10;i++){ 
            if (i % 2 == 0) {
            System.out.print(" "+i+"\n");
            contador=contador+i;
            } 
         }
        System.out.print("Total pares : "+contador + "\n");
    } 
}