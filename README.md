# SingtelTesting Project

## Q&A
## 1. Can you implement the sing() method for the bird?
  #### Q. How did you unit test it?
  A. Use the Junit to test the return string and the predefine string assert the same.
  #### Q. How did you optimize the code for maintainability?
  A. Update the sing method to return the string and the modifiers to public
  
## 2. Now, we have 2 special kinds of birds: the Duck and the Chicken... 
  #### Q. Can you implement them to make their own special sound?
  A. Override the the sing method for chicken and Duck
  #### Q. A chicken cannot fly
  A. Use the @Deprecated to highlight this method is Deprecated. And return the exception when call this method.

## 3. Now how would you model a rooster?
   #### Q. A rooster says: “Cock-a-doodle-doo”
   A. Override the the sing method for rooster
   #### Q. How is the rooster related to the chicken?
   A. Rooster is the child of the chicken. So can extend the Rooster from chicken.
   #### Q. Can you think of other ways to model a rooster without using inheritance?
   A. Rooster is one kinds of chicken. So we can define the Chicken interface and Rooster and Hen implement this interface method
   
## 4. Can you model a parrot? 
  #### Q. We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.
   A. Use the factory design pattern, differnt parameter return different sing.
   #### Q. How do you keep the parrot maintainable? What if we need another parrot lives near a Duck? Or near a phone that rings frequently?
   A. Update the factory class to return different method
