public class PatternMatchingSwitch {

    public static void identifyType(Object obj) {
        switch (obj) {
            case Integer i ->
                System.out.println("Integer value: " + i);

            case String s ->
                System.out.println("String value: " + s);

            case Double d ->
                System.out.println("Double value: " + d);

            case Long l ->
                System.out.println("Long value: " + l);

            case null ->
                System.out.println("Object is null");

            default ->
                System.out.println("Unknown type: " + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        identifyType(100);
        identifyType("Hello Java");
        identifyType(99.99);
        identifyType(123456789L);
        identifyType(true);
        identifyType(null);
    }

    // To compile using java 17 : javac --enable-preview --release 17 PatternMatchingSwitch.java

    // To run using java 17: java --enable-preview PatternMatchingSwitch
}