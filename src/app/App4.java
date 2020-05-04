package app;

import java.util.Scanner;

public class App4 extends Thread{
    Scanner tec = new Scanner(System.in);
    String[] estacion={"Verano","Invierno","Primavera","Otonio"};
    String EstacionE;
    public App4(){
        System.out.println("Que estacion le gustaria que pasara justo ahora ? : ");
        EstacionE= tec.nextLine();
    }
    @Override
    public void run(){
       switch(EstacionE){
            case "Verano":
                try {
                    System.out.println("*********************************************************");
                    Thread.sleep(2000);
                    System.out.println("Diciembre");
                    Thread.sleep(5000);
                    System.out.println("Enero");
                    Thread.sleep(1000);
                    System.out.println("Febrero");
                    System.out.println("*********************************************************");
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case "Invierno":
                try {
                    System.out.println("*********************************************************");
                    Thread.sleep(2000);
                    System.out.println("Junio");
                    Thread.sleep(2000);
                    System.out.println("Julio");
                    Thread.sleep(3000);
                    System.out.println("Agosto");
                    System.out.println("*********************************************************");
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case "Primavera":
                try {
                    System.out.println("*********************************************************");
                    Thread.sleep(1000);
                    System.out.println("Setiembre");
                    Thread.sleep(2000);
                    System.out.println("Octubre");
                    Thread.sleep(5000);
                    System.out.println("Noviembre");
                    System.out.println("*********************************************************");
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case "Otonio":
                try {
                    System.out.println("*********************************************************");
                    System.out.println("Marzo");
                    Thread.sleep(1000);
                    System.out.println("Abril");
                    Thread.sleep(5000);
                    System.out.println("Mayo");
                    Thread.sleep(2000);
                    System.out.println("*********************************************************");
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            default:
                System.out.println("Bro ingresa correctamente la estacion");
       }
    }
    public static void main(String[] args) {
        App4 estacionesE = new App4 ();
        estacionesE.start();
    }
}