Name:               Neil Dandekar
Class [Section]:    CIS 35A [36Y]
Assignment Number:  1
Due Date:           02.06.2023
Date Submitted:     02.06.2023
__________________________________

Hello.

** All code is formatted so that it is easy to read with comments documenting the functionality.

DRIVER:
* 'Driver.java' contains main and sample output is provided at the bottom.
* Instructions: Run this file just like any other java file and answer the questions printed to console with 
  keyboard input

    DESIGN:
    * Variables
        * (Driver)
            * d1 - Driver object used to call readValue() and to create new Person objects.
        * (Person)
            * Stacey, Ross, Mia - Person objects to demonstrate functionality.

	* Input
        * Use a scanner to read input for Person object info (name, address, age, phone number) for each Person

	* Processing 
        * public static void main(String[] args):
            Create d1 Driver object and creates/prints 3 Person objects.

        * public Person readValue(Scanner s1):
            Takes one Scanner object, s1, argument. Uses the Scanner object to prompt user for input to create and
            return a Person object. Information collected include the name, address, age, and phone number using the
            Scanner class methods.

    * Output
        * Each Person object that is created is printed as a string, displaying their respective properties.

PERSON:
* 'Person.java' contains the Person object blueprint. 
* Instructions: N/A.
    
    DESIGN:
    * Variables
        * (int)
            * age - private instance variable to represent the age of the Person object.
            * phoneNum - private instance variable to represent the phoneNum of the Person object.
        * (String)
            * address - private instance variable to represent the age of the Person object.
            * name - private instance variable to represent the name of the Person object.

	* Input
        * N/A

	* Processing 
        * public static void getNum(): 
            Takes no arguments from the user. Reads an integer input for num and uses conditionals to check if the 
            input is valid (positive). Uses a while loop to continue collecting input and informing the user of 
            invalid input until num is positive. Then, the method calls sqrt() and passes num, and finally prints
            the result.
        * GETTER METHODS: 
            - public String getName()
            - public String getAddress()
            - public int getAge()
            - public int getPhoneNum()
            Getter methods take no input but must be called using an instance of the class. They return the 
            respective instance variable. For example, getName() returns the name of the Person object.

        * SETTER METHODS: 
            - public void setName(String _name)
            - public void setAddress(String _address)
            - public void setAge(int _age)
            - public void setPhoneNum(int _phoneNum)
            Setter methods must be called using an instance of the class. The take an input corresponding to the 
            instance variable they will change. For example, setName() takes a String input and sets it as its name.

        * INSTANCE METHODS:
            - public void print()
            Prints the object as a String. Format: "[NAME], [ADDRESS], [AGE], [PHONE NUMBER]".

    * Output
        * N/A

Thank you for using my program.
-Neil Dandekar, 02.06.2023