import org.junit.Test;

import static java.time.Year.now;
import static org.junit.Assert.assertEquals;

public class YearOfBirthTest {

   @Test
   public void TestCurrentYear() {
   YearOfBirth yearOfBirth = new YearOfBirth();
   assertEquals(yearOfBirth.currentYear, now().getValue());
   }

   @Test
   public void TestGetBirthYearPrint() {
   YearOfBirth yearOfBirth = new YearOfBirth();
   String result = yearOfBirth.getBirthYear("29", "abcd");
   assertEquals("Hi abcd, you were born in 1995", result);
   String result1 = yearOfBirth.getBirthYear("-29", "efgh");
   assertEquals("Invalid age: The age should be positive integer and should not exceed "+ yearOfBirth.currentYear, result1);
   }

   @Test
   public void TestGetBirthYearAge() {
   YearOfBirth yearOfBirth = new YearOfBirth();
   String expected = "Invalid age: The age should be positive integer and should not exceed "+ yearOfBirth.currentYear;
   String age = yearOfBirth.getBirthYear("-10", "hgdh");
   assertEquals(expected,age);
   String age1 = yearOfBirth.getBirthYear("$$", "abcd");
   assertEquals(expected,age1);
   String age2 = yearOfBirth.getBirthYear("Ghij", "vindhya");
   assertEquals(expected,age2);
   String age3 = yearOfBirth.getBirthYear("2025", "vghy");
   assertEquals(expected,age3);
   String age4 = yearOfBirth.getBirthYear("0", "vgy");
   assertEquals(expected,age4);
   String age5 = yearOfBirth.getBirthYear("10.3", "hjik");
   assertEquals(expected, age5);
   }
}
