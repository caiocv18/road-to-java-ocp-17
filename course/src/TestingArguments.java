public class TestingArguments {
    public static void main(String[] args) {

        if(args.length == 0){
            // Throw an Exception
            throw new IllegalArgumentException("You need to provide arguments to the program.");
        } else {
            for (String arg : args) {
                System.out.println(arg);
            }
        }


    }
}