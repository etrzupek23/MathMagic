/*
This program mathmatically manipulates an original number and prints the answer
Created by Emma on Feb. 5th, 2020
Intermediate Programming - Block 8
*/
public class mmagic  {
  public static void main(String[] args) {
    //This is the original number
    int myNumber = 2;
    //This multiplies the original number by itself
    int stepOne = myNumber * myNumber;
    //This adds step one to the original number
    int stepTwo = stepOne + myNumber;
    //This divides step two by the original number
    int stepThree = stepTwo / myNumber;
    //This adds 17 to step three
    int stepFour = stepThree + 17;
    //This subtracts the original number from step four
    int stepFive = stepFour - myNumber;
    //This divides step five by 6
    int stepSix = stepFive / 6;
    //This prints out step six
    System.out.println(stepSix);
  }
}
