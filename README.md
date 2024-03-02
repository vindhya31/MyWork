## Test cases 
- **getBirthYear(String age, String Name)** This method takes the username and age as input and converts the age string into integer. This is to
  validate whether the given input is integer, if not exception will be thrown. The other condition
  validates whether the given age is below current year. 

- **TestCurrentYear()** An instance of the YearOfBirth class is created. This class presumably contains logic to determine the birth year or has a property to store the current year. The current year is obtained using the now().getValue() method. This assumes the existence of a method (now()) that provides the current date and time and returns a representation from which the year can be extracted. 
The assertEquals method is used to assert that the value of yearOfBirth.currentYear is equal to the current year obtained. 
The purpose of this test is to ensure that the YearOfBirth class can accurately determine or store the current year. It helps in validating that the class behaves as expected when retrieving the current year information.
- **TestGetBirthYearPrint()** This test checks the format of the output message to the user. The purpose of this test is to ensure that the getBirthYear method behaves correctly in response to both valid and invalid age inputs. This helps validate the method's ability to generate accurate greeting messages and handle inappropriate age values gracefully. 
- **TestGetBirthYearAge()** The purpose of this test is to ensure that the getBirthYear method handles invalid age inputs appropriately, providing a clear and informative error message for each case. This helps in maintaining robustness and user-friendly behavior in the face of unexpected inputs. This test case validates the age input by the user for below conditions.
    * negative. 
    * special characters. 
    * contains alphabets
    * exceeds the current year
    * is 0
    * is float number
