public class EnumSwitch{
    public static void main(String[] args) {
        Angle a = Angle.Acute;
        switch (a){
            case Acute :
              System.out.println("0<a<90");
              break;

            case Obtuse:
                System.out.println("90<a<180");
                break;

            case Reflex:
                 System.out.println("180<a<360");
                 break ;

            default :
                System.out.println("Invalid");
        }
    }
    enum Angle{
        Acute ,
        Obtuse ,
        Reflex ;
    }

}
