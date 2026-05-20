package task2;

public class Task2 {
  byte zero = 0;
  short three = 3;
  int eleven = 11;
  float twoPointZero = 2.0F;
  boolean isTrue = true;
  char letterH = 'H';
  char smallLetterW = 'w';
  char smallLetterR = 'r';
  char smallLetterL = 'l';
  char smallLetterD = 'd';

  String output = "" + letterH + three + eleven + zero + ' ' 
  + smallLetterW + zero + smallLetterR + smallLetterL + smallLetterD + " " + twoPointZero + " " + isTrue;
  public static void main(String[] args) {
    
    Task2 task2 = new Task2();
    System.out.println(task2.output);
  } 
}
