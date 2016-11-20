public class EnumSwitch {
    public static void main(String...args) {
        Color color = Color.valueOf(args[0]);
        switch(color) {
            case RED: System.out.print(color.getCode()); break;
            case BLUE: System.out.print(color.getCode()); break;
            case GREEN: System.out.print(color.getCode()); break;
            default: throw new IllegalArgumentException("Valid colors are: RED, GREEN or BLUE");
        }
        System.out.println(args[1]);
    }

    enum Color {
        RED("\u001B[31m"), BLUE("\u001B[34m"), GREEN("\u001B[32m");
        private final String code;
        Color(String code) {
            this.code = code;
        }
        public String getCode() {
            return code;
        }
    }
}

