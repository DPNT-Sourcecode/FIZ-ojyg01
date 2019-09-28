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

        if (number > 10) {
            Integer tempNumber = number;
            Integer lastDigitOfTheNumber = number % 10;
            while (tempNumber % 10 == lastDigitOfTheNumber) {
                tempNumber = tempNumber / 10;
                if (tempNumber > 0 == false) {
                    deluxeFlag = true;
                    nrTrueFlags++;
                    break;
                }
            }
        }

        if (fizzFlag.equals(true)) {
            stringToBeReturned = "fizz";
        }
        if (buzzFlag.equals(true)) {
            if (nrTrueFlags > 1) {
                stringToBeReturned = stringToBeReturned + " buzz";
            } else {
                stringToBeReturned = "buzz";
            }
        }
        if (deluxeFlag.equals(true)) {
            if (nrTrueFlags > 1) {
                stringToBeReturned = stringToBeReturned + " deluxe";
            } else {
                stringToBeReturned = "deluxe";
            }
        }

        if (stringToBeReturned.isEmpty() == false)
            return stringToBeReturned;
        return number.toString();
    }

}


