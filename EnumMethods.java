public class EnumMethods{
    public static void main(String[] args) {
        //Direction.values() return the array of constants of Enum
        Direction d[] = Direction.values();
        for(Direction d1 :Direction.values()) {
            System.out.println(d1);
        }


        // valueOf() Method changes a String(only constant that are present in Enum class )  into Enum Constant;
        Direction d2 = Direction.valueOf("North");
        System.out.println(d2);

        //ordinal() method return the order of(Index) Enum constant from direction;
        System.out.println(Direction.North.ordinal());
        System.out.println(Direction.South.ordinal());

        //name() return the string of enum constant that same can be done by toString(),
        // but the major differece is that toString() can be overridded but name() can't.
        System.out.println(d2.name());

    }
    enum Direction{
        North ,
        East  ,
        South ,
        West  ;
    }
}
