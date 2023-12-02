class ErrConst extends Exception{
    int val  ;
    public ErrConst(String message , int a ) {
        super(message);
        this.val=a ;
    }
    
    public int GetVal(){
        return val ; 
    }

}