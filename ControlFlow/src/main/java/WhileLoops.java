public class WhileLoops {

    public WhileLoops() {
    }

    public static void printFirst3Indexes(String[] associates) {
        //note we are starting our counter at 2
        //2 is the 3rd index in an array


        /* int count = 2;

        while(count >= 0){
            System.out.println(associates[count]);
            count--;
        }
         */

        //if you want to maintain the order, start at 0 and increment upwards

        int count = 0;

        while (count < 3) {
            System.out.println(associates[count]);
            count++;


        }

    }
}
