package app;
import java.util.Scanner;

public class App3 extends Thread{
    Scanner tec=new Scanner(System.in);
    String nombre;
    public App3(int prioridad,String nombre){
        this.nombre=nombre;
        setPriority(prioridad);
        System.out.println("*******Copa Mundial*******");
       // for(int i=1;i<=3 ;i++){
         //   System.out.println("Ingrese el nombre del participante Nro "+ i +" :");
           // nombre=tec.nextLine();
       //}
    }
    @Override 
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.print(i+"mt ");
            yield(); 
            }
            System.out.println("\n Llego a la meta " + nombre);
    }
    static App3 Jorge;
    static App3 Nick;
    static App3 Gabriel;
    public static void main(String[]args) throws Exception{
        // Thread carrera= new App3(1);
        //Thread carrera2=new App3(5);
        //Thread carrera3=new App3(3);
        Jorge = new App3(8,"Jorge");
        Nick = new App3(7,"Nick");
        Gabriel = new App3(5,"Gabriel");
        Jorge.start();
        Nick.start();
        Gabriel.start();
        Jorge.join();
        Nick.join();
        Gabriel.join();
    }
}