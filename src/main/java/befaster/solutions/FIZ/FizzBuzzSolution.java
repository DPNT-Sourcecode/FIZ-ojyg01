package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        Boolean fizzFlag = false, buzzFlag = false, deluxeFlag = false;
        Integer nrTrueFlags = 0;
        String stringToBeReturned = "";

        if (number % 3 == 0 || number.toString().contains("3")) {
            fizzFlag = true;
            nrTrueFlags++;
        }

        if (number % 5 == 0 || number.toString().contains("5")) {
            buzzFlag = true;
            nrTrueFlags++;
        }

        if (number % 3 == 0 && number.toString().contains("3")) {
            deluxeFlag = true;
            nrTrueFlags++;
        }

        if (number % 5 == 0 && number.toString().contains("5")) {
            deluxeFlag = true;
            nrTrueFlags++;
        }

        if (fizzFlag.equals(true)) {
            stringToBeReturned = "fizz";
        }
        if (buzzFlag.equals(true)) {
            if (nrTrueFlags > 1 && fizzFlag.equals(true)) {
                stringToBeReturned = stringToBeReturned + " buzz";
            } else {
                stringToBeReturned = "buzz";
            }
        }
        if (deluxeFlag.equals(true)) {
            if (nrTrueFlags > 1) {
                if (checkIfIsEven(number).equals(Boolean.TRUE)) {
                    stringToBeReturned = stringToBeReturned + " deluxe";
                } else {
                    stringToBeReturned = stringToBeReturned + " fake deluxe";
                }
            } else {
                if (checkIfIsEven(number).equals(Boolean.TRUE)) {
                    stringToBeReturned = "deluxe";
                } else {
                    stringToBeReturned = "fake deluxe";
                }
            }
        }

        if (stringToBeReturned.isEmpty() == false)
            return stringToBeReturned;
        return number.toString();
    }

    private Boolean checkIfIsEven (Integer n) {
        if (n % 2 == 0)
            return Boolean.TRUE;
        return Boolean.FALSE;
    }

}


