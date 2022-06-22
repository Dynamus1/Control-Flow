
public class Main {


    public static void main(String[] args) {
        IfElse ifelse = new IfElse();
        String newString = "This is Hello World";
        System.out.println(ifelse.checkStringLength("Tiffany"));
        System.out.println(ifelse.printTStringsOnly(newString));


    /*
    For Loops
     */
        //Notice we did not have to make an instance of our ForLoops class in order to invoke
        // or call these methods because the methods are static


        //here we are creating our String array right in the param of our method
        ForLoops.printAssociatesNames(new String[]{"Jo Jo","CJ","DeeAnne","David","Shane"});

        String[] associates = {"Shaquanna","Mark","Tyler","Eric","Janga","Li"};
        System.out.println(ForLoops.printTotalAssociatesNamesCount(associates));

    /*
    While Loops
     */

       WhileLoops.printFirst3Indexes(associates);



    /*
    DoWhileLoops
     */

       DoWhile doWhile = new DoWhile();
       doWhile.printValueIfTrue();


    /*
    SwitchStatements
     */

    SwitchStatements switchStatements = new SwitchStatements();
    switchStatements.gradeCalculator(45);



    }
}
