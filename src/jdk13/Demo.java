package jdk13;

public class Demo {
    public static void main(String[] args) {
        String x = "1";
        int i = switch (x) {
            case "1" -> 1;
            case "2" -> 2;
            default -> {
                int len = args[1].length();
                yield len;
            }
        };

//        switch (x) {
//            case "1":
//                i=1;
//                break;
//            case "2":
//                i=2;
//                break;
//            default:
//                i = x.length();
//                break;
//        }
        System.out.println("i = " + i);
    }
}
