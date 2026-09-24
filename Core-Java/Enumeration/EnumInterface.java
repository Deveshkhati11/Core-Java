public class EnumInterface{
    public static void main(String[] args) {
      Color c = Color.Black;
      c.print();
    }

    interface Printable{
        public void print();
    }
    enum Color implements Printable{
        Red ,
        Green ,
        Blue ,
        Black ;

        @Override
        public void print(){
            System.out.println(this);
        }
    }

}
