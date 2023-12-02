public class compte extends Thread{
    int val  ; 

    compte(int a ){
       this.val = a  ; 
    }

    public void run(){
        for(;;){System.err.println(val); 
            Thread.sleep(100);}  
        
    }
 
    public static void main(String[] args) {
    new compte(2).start(); 
       new compte(99).start(); 
} }
