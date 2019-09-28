package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        Boolean fizz_flag = false,buzz_flag = false;

       if (number % 3 == 0 || number.toString().contains("3")) {
           fizz_flag = true;
       }
        if (number % 5 == 0 || number.toString().contains("5")) {
            buzz_flag = true;
        }

        if (fizz_flag.equals(true) && buzz_flag.equals(true))
            return "fizz buzz";
        else if (fizz_flag.equals(true))
            return "fizz";
        else if (buzz_flag.equals(true))
            return "buzz";
        else return number.toString();

    }

  
}

