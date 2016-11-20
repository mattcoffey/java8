public class ByteSwitch {

    public static void main(String...args) {
        final byte one = 1;
        final byte two = 2;
        final byte three = 3;
        final byte four = 4;
        
        assert args.length == 1: "Assert exactly one argument";
        
        final byte b = Byte.valueOf(args[0]);
        
        switch(b) {
            case one: System.out.println("one"); break;
            case two: System.out.println("one"); break;
            case three:
            case four: System.out.println("Three or four"); break;
            default: System.out.println("More than four");
        }

    }
}
