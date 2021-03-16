package MentoringClass;

public class MathSolution{
    // 25 + 1x = 39
    // 1x * 3 = 45
    // 45 / 3 = x5

    public static String mathSolution(String str) {

        if(!str.matches("[0-9x]+ [+\\-*/] [0-9x]+ = [0-9x]+")){
            throw new IllegalArgumentException("Wrong parameter pattern");
        }

        String[] operators = str.split(" ");  // 25 + 1x = 39 ->   x5, /, 3, =, 15
        //                    0, 1, 2, 3, 4

        int indexOfX = findIndexOfX(operators);

        int actualNumber = -1;

        switch (indexOfX) {
            case 0:
                actualNumber = logicForFirstDigit(operators[2],operators[4],operators[1]);
                break;
            case 2:
                actualNumber = logicForSecondDigit(operators[0],operators[4],operators[1]);
                break;
            case 4:
                actualNumber = logicForThirdDigit(operators[0],operators[2],operators[1]);
                break;
        }

        String actualNumberStr = Integer.toString(actualNumber);

        // actualNumberStr = 455555
        // the given Str at index(0) = 4555x5

        for(int i = 0; i<actualNumberStr.length(); i++){
            char checking = operators[indexOfX].charAt(i);
            char actual = actualNumberStr.charAt(i);

            if(checking != actual) {
                return ""+actual;
            }
        }

        return null;
    }

    public static int logicForFirstDigit(String secondDigit, String thirdDigit, String operator) {
        int sDigit = Integer.parseInt(secondDigit);
        int tDigit = Integer.parseInt(thirdDigit);

        switch (operator) {
            case "+":
                return tDigit - sDigit;
            case"-":
                return tDigit + sDigit;
            case "*":
                return tDigit / sDigit;
            case "/":
                return tDigit * sDigit;
        }

        return -1;
    }

    // 25 / X = 5
    public static int logicForSecondDigit(String firstDigit, String thirdDigit, String operator) {
        int fDigit = Integer.parseInt(firstDigit);
        int tDigit = Integer.parseInt(thirdDigit);

        switch (operator) {
            case "+":
                return tDigit - fDigit;
            case"-":
                return fDigit-tDigit;
            case "*":
                return tDigit / fDigit;
            case "/":
                return fDigit / tDigit;
        }

        return -1;
    }
    // 25 - 25 = 5x
    public static int logicForThirdDigit(String firstDigit, String secondDigit, String operator) {
        int fDigit = Integer.parseInt(firstDigit);
        int sDigit = Integer.parseInt(secondDigit);

        switch (operator) {
            case "+":
                return fDigit + sDigit;
            case"-":
                return fDigit - sDigit;
            case "*":
                return fDigit * sDigit;
            case "/":
                return fDigit / sDigit;
        }

        return -1;
    }

    public static int findIndexOfX(String[] operators) {
        for(int i=0; i< operators.length; i++) {
            if(operators[i].contains("x")) {
                return i;
            }
        }
        return -1;
    }





}
