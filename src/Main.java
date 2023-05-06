public class Main {
    public static void main(String[] args) {
        MagicBox<String> forString = new MagicBox<String>(10);//для строк
        MagicBox<Integer> forNumbers = new MagicBox<Integer>(3); //для чисел

        forString.pick();
        forString.add("FFF");


        System.out.println(forNumbers.add(2));
        System.out.println(forNumbers.add(5));
        System.out.println(forNumbers.add(1));
        System.out.println(forNumbers.add(3));

        System.out.println(forNumbers.pick());

    }
}
