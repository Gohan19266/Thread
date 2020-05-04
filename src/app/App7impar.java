package app;

public class App7impar extends Thread{
    public void run(){
        int i, a=0;
        int contador=0;
        for ( i=1;i<=10;i++){
            a= i%2;
            if (a != 0) {
            contador=contador+i;
            System.out.println(" "+i);
            }
        }
    System.out.print("Total impares : "+contador + "\n");
    }
}