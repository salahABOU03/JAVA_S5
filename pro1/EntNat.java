class EntNat{
     
     int n ; 

    public EntNat(int a )throws ErrConst{
   
        if (a < 0) {
            throw new ErrConst("La valeur doit être un entier naturel (positif ou nul).",  a);
        }
   
        this.n=a ;
    }

    
    public static int somme(int  entNat1 , int entNat2 ) throws  ErrSom{
       int s ; 
       s= entNat1+entNat2 ; 
       if(s> 10){
        throw new ErrSom("Le resultas est tres grand ");
       }
       return s ; 
    }
    
    public static int diference(int a , int b) throws  ErrDiff{
        int d ; 
        d=a-b ; 
        if( a<b ){
        throw new ErrDiff("Difference Impossible!!! ");
       }
       return d ; 
    }

    public static int Produit(int a , int b) throws ErrProd {
        int d ; 
        d=a*b ; 
        if( d>10){
        throw new ErrProd("Le resultas est tres grand ");
       }
       return d ; 
    }


    public int getN() {
        return n;
    }

    public static int diff(EntNat entNat1, EntNat entNat2) {
        return 0;
    }
} 







