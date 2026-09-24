public class EnumWithField {
    public static void main(String[] args) {
     degree d = degree.Low;
     System.out.println(d.getValue());   
    }
}

enum degree{
    Low(1) ,
    Medium(2) ,
    High(3) ;

    private int value ;

    degree(int value ){
        this.value = value ;
    }

   public int getValue(){
    return value;
   }
}