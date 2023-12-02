public class App  {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Thread t = new Thread() {
@Override
        public void run(){
            System.out.println("Un traitement ");
        }
    } ; 

    t.start() ; 
}}
