import java.util.List;

import static java.time.Year.now;

public class YearOfBirth {

    int currentYear= now().getValue(); //inbuilt function to get current year


    public String getBirthYear (String age, String Name){

        // try and catch function is used to throw exception during age validation
        try
        {
            int userAge = Integer.parseInt(age); //to check if input age is integer
            if (userAge <= 0 || userAge >= currentYear)
            {
                throw new Exception(); //throw exception if age is not in between 0 to current year
            }
            int birth = currentYear - userAge;
            return ("Hi " + Name + "," + " you were born in " + birth);
        }
        catch (Exception e)
        {
            return "Invalid age: The age should be positive integer and should not exceed "+ currentYear;
        }
    }
}
