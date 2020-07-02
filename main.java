/*/
/* Name: Swayam Amin                                                       */
/* Student No: 342739141                                                          */
/* Course name: ICS3U1                                                          */
/* Teacher: Ms.Ham                                                                */
/* Discription: Making "Who Wants To Be A Millionaire" game using java.    */
import java.util.*;
     class Main {
        public static void main(String[] args) {
             Scanner sc = new Scanner (System.in);
              int firstperson;
              int standardsday;
              int goodfriday;
              int worldyear;
              int theme;
              int value1 = 0;
              int value2 = 0;
              int value3 = 0;
              int value4 = 0;
              int value5 = 0;
              int rand1;
              for (int i=1; i==1; i++);
              int min=1;
              int max=4;
              rand1 = (int)(Math.random() * (max - min + 1) + min);           //randomly gives number between 1 to 4
              System.out.print("Enter Your Name: ");                          //asks for player name
              String name =sc.nextLine();
              System.out.println(" ");
              System.out.println("Welcome "+name+" to Who Wants To Be A Millionaire!");
              System.out.println(" ");
              System.out.println("Here are your game instructions:");                 //displays game instructions
              System.out.println("1) Please choose only one option out of four. Two options would not be valid.");
              System.out.println("2) Every question asked would have a time limit. After the expiry of time if you were not successfully able to answer the question, then you won’t be able to play furthermore.");
              System.out.println("3) No phones or any other electronic devices are allowed during this game.");
              System.out.println("4) On every correct answer, you will win money based on the value of the question. ");
              System.out.println("5) Please choose options between 1-4 in order to evaluate your answers.");
              System.out.println(" ");
              System.out.println("----$10,000 Question----");
              System.out.println("Q1. Who was the first person to walk on the moon?");
              System.out.println("1. Neil Armstrong");
              System.out.println("2. Buzz Aldrin");
              System.out.println("3. Pete Conrad");
              System.out.println("4. Alan Bean");
                  
                    int value = sc.nextInt();
                    if(value<0 || value>4){                                                          //user has to input numbers between 1 - 4
                      System.out.print("Please enter an acceptable choice of answer.");
                      value=sc.nextInt();
                    }
                    if (value == 1){
                      System.out.println("Congratulations! You are correct. You have banked $10,000");
                    }else {
                      System.out.println("Your answer is incorrect Neil Armstrong is the right answer.");
                    }
                    System.out.println();
                    System.out.println(" ");
                  
                    if (value == 1){
                      System.out.println("----$100,000 Question----");
                      System.out.println("Q2. Which day is observed as the World Standards Day?");
                      System.out.println("1. June 26");
                      System.out.println("2. October 14");
                      System.out.println("3. November 15");
                      System.out.println("4. December 2");
                      System.out.println();
                      System.out.println();
                      System.out.println("Would you like to:");
                      System.out.println("1) Walk away with $10,000");
                      System.out.println("2) Answer the question");
                      System.out.println("3) To use the double dip lifeline.");
                      
                      int choice = sc.nextInt();
                      if(choice==1){
                        System.out.println("Thank you for playing. You are walking away with $10,000.");
                      }
                    
                else if(choice==2){
                        System.out.println("Enter you answer.");
                        value1 = sc.nextInt();
                        if(value1<0 || value1>4){                                              //user has to input numbers between 1 - 4
                        System.out.print("Please enter an acceptable choice of answer.");
                        value1=sc.nextInt();
                      }
                      else if (value1 == 2){
                        System.out.println("Congratulations! You are correct. You have banked $100,000");
                      }else {
                        System.out.println("Your answer is incorrect October 14 is the right answer");
                        System.out.println("Thank you for playing. You are walking away with $100,000");
                      }
                      }
                      else{
                        
                        System.out.println("Enter you answer.");
                        value1 = sc.nextInt();
                        if(value1<0 || value1>4){                                                     //user has to input numbers between 1 - 4
                        System.out.print("Please enter an acceptable choice of answer.");
                        value1=sc.nextInt();
                      }
                      else if (value1 == 2){
                        System.out.println("Congratulations! You are correct. You have banked $100,000");
                      }else if(value1!=2){
                      System.out.println("Your answer is incorrect! You still have one more chance to answer.");
                      value1=sc.nextInt();
                      }
                       if(value1 == 2){
                      System.out.println("Congratulations! You are correct. You have banked $100,000");
                      }
                      else{
                      System.out.println("Thank you for playing. You are walking away with $100,000");
                      }
                      }
                      
                      
                      System.out.println();
                      System.out.println(" ");
                      if (value1 == 2){
                        System.out.println("----$250,000 Question----");
                        System.out.println("Q3. Good Friday is observed to commemorate the event of");
                        System.out.println("1. Birth of Jesus Christ");
                        System.out.println("2. Birth of St.Peter");
                        System.out.println("3. Crucification of Jesus Christ");
                        System.out.println("4. Rebirth of Jesus Christ");
                        System.out.println();
                      System.out.println();
                      System.out.println("Would you like to:");
                      System.out.println("1) Walk away with $100,000");
                      System.out.println("2) Answer the question");
                      if(choice!=3){
                        System.out.println("3) To use double dip lifeline.");
                      }
                      else{
                        System.out.println("");
                      }

                      int choice1 = sc.nextInt();
                      if(choice1==1){
                        System.out.println("Thank you for playing. You are walking away with $100,000.");
                      }
                    
                else if(choice1==2){

                        System.out.println("Enter you answer.");
                      
                      
                         value2 = sc.nextInt();                                                       //user has to input numbers between 1 - 4
                        if(value2<0 || value2>4){
                          System.out.print("Please enter an acceptable choice of answer.");
                          value2=sc.nextInt();
                        }
                        else if (value2 == 3){
                            System.out.println("Congratulations! You are correct. You have banked $250,000");
                          }
                          else {
                            System.out.println("Your answer is incorrect Crucification of Jesus Christ is the right answer.");
                            System.out.println("Thank you for playing. You are walking away with $100,000");
                          }
                }
                          else{
                        System.out.println("Enter you answer.");
                        value2 = sc.nextInt();
                        if(value2<0 || value2>4){                                                   //user has to input numbers between 1 - 4
                        System.out.print("Please enter an acceptable choice of answer.");
                        value2=sc.nextInt();
                      }
                      else if (value2 == 3){
                        System.out.println("Congratulations! You are correct. You have banked $250,000");
                      }else if(value2!=3){
                      System.out.println("Your answer is incorrect! You still have one more chance to answer.");
                      value5=sc.nextInt();
                      }
                       if(value5 == 3){
                      System.out.println("Congratulations! You are correct. You have banked $250,000");
                      }
                      else{
                      System.out.println("Thank you for playing. You are walking away with $100,000");
                      }
                      }


                          System.out.println();
                          System.out.println(" ");
                          if (value2 == 3|| value5 == 3){
                            System.out.println("----$500,000 Question----");
                            System.out.println("Q4. Which of the following year was celebrated as the World Communication Year?");
                            System.out.println("1. 1981");
                            System.out.println("2. 1983");
                            System.out.println("3. 1985");
                            System.out.println("4. 1987");
                            System.out.println();
                      System.out.println();
                      System.out.println("Would you like to:");
                      System.out.println("1) Walk away with $100,000.");
                      System.out.println("2) Answer the question");
                      if(choice!=3&&choice1!=3){
                        System.out.println("3) To use double dip lifeline.");                    
                      }
                      else{
                        System.out.println();
                      }


                      int choice2 = sc.nextInt();
                      if(choice2==1){
                        System.out.println("Thank you for playing. You are walking away with $100,000.");
                      }
                    
                else if(choice2==2){

                        System.out.println("Enter you answer.");
                      
                          
                             value3 = sc.nextInt();
                            if(value3<0 || value3>4){                                                          //user has to input numbers between 1 - 4
                              System.out.print("Please enter an acceptable choice of answer.");
                              value3=sc.nextInt();
                            }
                            else if (value3 == 2){
                                System.out.println("Congratulations! You are correct. You have banked $500,000");
                              }
                              else {
                                System.out.println("Your answer is incorrect 1983 is the right answer.");
                                System.out.println("Thank you for playing. You are walking away with $500,000");
                              }
                              }

                               else{
                        System.out.println("Enter you answer.");
                        value3 = sc.nextInt();
                        if(value3<0 || value3>4){                                                                //user has to input numbers between 1 - 4
                        System.out.print("Please enter an acceptable choice of answer.");
                        value3=sc.nextInt();
                      }
                      else if (value3 == 2){
                        System.out.println("Congratulations! You are correct. You have banked $5,00,000");
                      }
                      else if(value3!=2){
                      System.out.println("Your answer is incorrect! You still have one more chance to answer.");
                      value3=sc.nextInt();
                      }
                       if(value3 == 2){
                      System.out.println("Congratulations! You are correct. You have banked $5,00,000");
                      }
                      else{
                      System.out.println("Thank you for playing. You are walking away with $100,000");
                      }
                      }

                              System.out.println();
                              System.out.println(" ");
                              if (value3 == 2){
                                System.out.println("----$1,000,000 Question----");
                                System.out.println("Q5. Which of the following was the theme of the World Red Cross and Red crescent Day?");
                                System.out.println("1. Dignity for all-focus on women");
                                System.out.println("2. Dignity for all-focus on children");
                                System.out.println("3. Focus on health for all");
                                System.out.println("4. Nourishment for all-focus on children");
                                System.out.println();
                      System.out.println();
                      System.out.println("Would you like to:");
                      System.out.println("1) Walk away with $5,00,000.");
                      System.out.println("2) Answer the question");
                      System.out.println("3) Use 50 50 lifeline.");

                      int choice3 = sc.nextInt();
                      if(choice3==1){
                        System.out.println("Thank you for playing. You are walking away with $500,000.");
                      }
                    
                else if(choice3==2){

                        System.out.println("Enter you answer.");
                        value4 = sc.nextInt();
                                if(value4<0 || value4>4){                                                    //user has to input numbers between 1 - 4
                                  System.out.print("Please enter an acceptable choice of answer.");
                                  value4=sc.nextInt();
                                }
                                  else if (value4 == 2){
                                    System.out.println("Congratulations! You are correct. You have banked $1,000,000");
                                  }
                                  else {
                                    System.out.println("Your answer is incorrect Dignity for all-focus on children is the right answer .");
                                    System.out.println("Thank you for playing. You are walking away with $500,000");
                                  }
                      }          
                          
                              if (rand1 == 1){           //if rand1 produces 1 than
                                System.out.println("As requested, 2 of incorrect choices are removed.");
                                System.out.println("Q5. Which of the following was the theme of the World Red Cross and Red crescent Day?");
                                System.out.println("1. Dignity for all-focus on women"); 
                                System.out.println("2. Dignity for all - focus on children");
                                System.out.println("3. ");
                                System.out.println("4. ");
                                 value4=sc.nextInt();

                              }
                                else if (rand1 == 2){     //if rand1 produces 2 than
                                System.out.println("As requested, 2 of incorrect choices are removed.");
                                System.out.println("1. ");
                                System.out.println("2. Dignity for all - focus on children");
                                System.out.println("3. Focus on health for all.");
                                System.out.println("4. ");
                                value4=sc.nextInt();
                                }
                                else if (rand1 == 3){     //if rand1 produces 3 than
                                System.out.println("As requested, 2 of incorrect choices are removed.");
                                System.out.println("1. ");
                                System.out.println("2. Dignity for all - focus on children");
                                System.out.println("3. ");
                                System.out.println("4. Nourishment for all - focus on children.");
                                value4=sc.nextInt();
                                }
                                else {        //if rand1 produces 4 than
                                System.out.println("As requested, 2 of incorrect choices are removed.");
                                System.out.println("1. Dignity for all - focus on women");
                                System.out.println("2. Dignity for all - focus on children");
                                System.out.println("3. ");
                                System.out.println("4. ");
                                value4=sc.nextInt();
                                }
                                
                                
                              }
                              if (value4 == 2){
                                    System.out.println("Congratulations! You are correct. You have banked $1,000,000");
                                  }
                                  else {
                                    System.out.println("Your answer is incorrect Dignity for all-focus on children is the right answer .");
                                    System.out.println("Thank you for playing. You are walking away with $500,000");
                          }
                                  System.out.println();
                                }
                              }
                            }
                          }
                        }
