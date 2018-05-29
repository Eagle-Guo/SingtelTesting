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
