/*
Name: Dinh Thanh Cong Nguyen
Date: January 31, 2024
Descrition: This program will random password.
*/


public class RandomPassword {
  public static void main(String args[]) {
    System.out.printf("Welcome to the random password generator.\n");
    // First letter
    int random_capital = (int) (Math.random() * 26) + 65;
    char capital = (char) random_capital;
    // Second letter, a number
    int random_number = (int) (Math.random() * 10) + 0;
    // Third letter, a lowercase
    int random_lower_1 = (int) (Math.random() * 26) + 97;
    char lower_1 = (char) random_lower_1;
    // Fourth letter, a lowercase
    int random_lower_2 = (int) (Math.random() * 26) + 97;
    char lower_2 = (char) random_lower_2;
    // Fifth letter, a special letter
    int random_special = (int) (Math.random() * 5) + 35;
    char special = (char) random_special;
    // combine
    System.out.printf("Today's random password is: %c%d%c%c%c", capital, random_number, lower_1, lower_2, special);

  }
}