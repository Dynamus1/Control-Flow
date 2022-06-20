public class ForLoops {

    public ForLoops(){}

    public static void printAssociatesNames(String[] names){
        //here we have our basic for loop
        for(int i = 0; i< names.length;i++){
            System.out.println(names[i]);
        }

    }

    public static int printTotalAssociatesNamesCount(String[] associatesArray){
        int counter = 0;
        //here we have an enhanced ForLoop
        for(String singleAssociate: associatesArray){
            //below we are adding the length or count of EACH string in the string array
            //to our counter

            counter += singleAssociate.length();
        }

        //after it has completely gone through the entire array
        //we will return counter - which has our total

        return counter;
    }


}
