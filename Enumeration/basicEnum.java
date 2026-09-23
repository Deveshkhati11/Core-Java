/**
 * learn
 */
public class learn{
    public static void main(String args[] ){
        Direction d = Direction.North;
        System.out.println(d.degree);
        d.move();
    }
    
    enum Direction{
       /*These North ,
        South , 
        East ,
        West  ->are object of type direction all enum extend to Enum in java.lang.Enum.
        enum are actually class 
         */
        North(0){
        @Override 
            public void move(){
            System.out.println("Y+1");
        }
        } ,
        South(180){
            @Override
             public void move(){
                 System.out.println("Y-1");
             }
        } , 
        East(90){
            @Override
             public void move(){
                 System.out.println("X+1");
             }
        } ,
        West(270){
            @Override
             public void move(){
                 System.out.println("X-1");
             }
        };
 
        public abstract  void move();

       
        
        private int degree   ;
    
        Direction(int degree){
            this.degree = degree ;
        }

        }
       
}