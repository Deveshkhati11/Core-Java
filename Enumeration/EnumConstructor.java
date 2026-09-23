


public class EnumConstructor{
    public static void main(String[] args) {
        size s = size.Extra_Large;
        System.out.println(s.getLength());
        size s2 = size.Medium;
        System.out.println(s2.getLength());
    }

    enum size{
        Small(30),
        Medium(34),
        Large(36),
        Extra_Large(38);
        
        public int Length;

        private size(int length){
            this.Length = length ;
        }

        public int getLength(){
            return this.Length;
        }
    }
}