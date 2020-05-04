package app;

public class App2 extends Thread{
    public static void main(String[]args) throws Exception{
        for(int i=1; i<26 ;i++){
            System.out.println("Nro: "+i);
            Thread.sleep(2000);
        }
        System.out.println("End");
    }
}