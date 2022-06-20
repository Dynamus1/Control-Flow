public class DoWhile {

    public DoWhile(){}

    //method below is not taking in any parameters
    //not static so we have to create an instance of the class to run this method
    public void printValueIfTrue(){
        boolean check = false;

        do{
            //logic goes in here
            //this logic will be executed because the code reads top to bottom
            //meaning that the code says to print before the condition is actually checked
            //once the condition is checked - the program sees that the boolean value 'check'
            //is false, so it will not execute again
            //however if "check" was true, it would continue to
            //print the statement over and over - which is an infinite loop
            //until we change the value of check to false


            System.out.println("The do-while statement will always execute at least once");


        } while(check == true);

    }
}
