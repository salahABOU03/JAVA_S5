public class app {
    public static void main(String[] args) {
        try {
            EntNat entNat = new EntNat(-5); 
            System.out.println("Valeur de l'EntNat : " + entNat.getN());
        } catch (ErrConst e) {
            System.out.println("Exception ErrConst : " + e.getMessage());
            e.printStackTrace();
        }

        
        try {
            int sum = EntNat.somme(10, 20);
            System.out.println("Somme : " + sum);
        } catch (ErrSom e) {
            System.out.println("Exception ErrSom : " + e.getMessage());
            e.printStackTrace();
        }


        try {
            int product = EntNat.Produit(10, 20);
            System.out.println("Produit : " + product);
        } catch (ErrProd e) {
            System.out.println("Exception ErrProd : " + e.getMessage());
           
        }


        try {
            int difference = EntNat.diference(30, 20);
            System.out.println("Différence : " + difference);
        } catch (ErrDiff e) {
            System.out.println("Exception ErrDiff : " + e.getMessage());
            e.printStackTrace();
        }

       }
}