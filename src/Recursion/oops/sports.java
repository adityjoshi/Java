/*
Write a Java program to create a base class Sports with a method called play().
Create three subclasses: Football, Basketball, and Rugby.
Override the play() method in each subclass to play a specific statement for each sport.

 */

package Recursion.oops;

public class sports {
    public static void main(String[] args) {
        Sports sport = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        sport.play();
        football.play();
        basketball.play();
        rugby.play();

    }
    static class Sports {
        public void play() {
            System.out.println("I am playing a sport");
        }
    }
    static class Football extends Sports {
        public void play() {
        System.out.println("Hey folks i am playing football");
    }
    }
     static class Basketball extends Sports {

         public void play() {
             System.out.println("Hey folks i am playing basketball");
         }
    }
     static class Rugby extends Sports {

         public void play() {
             System.out.println("Hey folks i am playing rugby");
         }
    }
}
