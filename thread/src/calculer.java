public class calculer extends Thread {
    int a  ; 

   /* calculer(int val){
         a = val ; 
    } ;*/ 

    int run(int a , int  b  ){
        int s= 0  ; 
        while (a<b) {
            s=s+a ; 
            a++ ; 
        }
        return s ; 
    }

    public static void main(String[] args){
       int a = new calculer.run(1,500000) ; 
       
    }

}
