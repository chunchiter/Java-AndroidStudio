public class BasicOperations {
    public static void main(String[] args){
        //Addition = +
        //Subtraction "-"
        //Multiplication "*"
        //Division "/"
        //Remainder = "what remains.." 4 % 2 = 0 because 2*2 = 4 and there's not remainder
        // 4%3 = 1

        // === Relational Operators ===
        /*
            - == comparison, not assignment
            - != NOT equal
            = > greater than
            = < less than
            - >= Greater than or equal
            - <= Less than or equal

            === Logical Operators ===
            - AND ( && ) == both "sides" need to be TRUE in order the whole expression to return true
            - OR  ( || )
            - NOT ( ! )
        */

        double firstNum = 10;
        double secondNum = 3;
        double result = 0;

        boolean isOld = true;
        boolean isYoung = false;

        if ( (isOld && !isYoung) && (firstNum < secondNum) ) {
            System.out.println("Hello");
        }else {
            System.out.println("Not right!");
        }

        /* result = firstNum % secondNum;

        //If statements
        if (firstNum <= secondNum) {

            System.out.println("The remainder is " + result );
        } else{
            System.out.println("Numbers aren't equal");
        }

         */


    }
}
