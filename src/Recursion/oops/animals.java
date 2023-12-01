/*
Write a Java program to create a base class Animal with methods move() and makeSound().
Create two subclashses Bird and Panthera.
Override the move() method in each subclass to describe how each animal moves.
Also, override the makeSound() method in each subclass to make a specific sound for each animal.

 */
package Recursion.oops;

public class animals {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Panthera panthera = new Panthera();

        System.out.println("Bird");
        bird.move();
        bird.makeSound();
        System.out.println("\nPanthera");
        panthera.move();
        panthera.makeSound();

    }
    static class Animal {
        public void move() {
            System.out.println("Animal moves");
        }
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }
    static class Bird extends Animal {
        public void move() {
            System.out.println("Bird flies");
        }
        public void makeSound() {
            System.out.println("Bird Chirps");
        }
    }
   static class Panthera extends Animal {
        @Override
        public void move() {
            System.out.println("Panthera runs");
        }

        @Override
        public void makeSound() {
            System.out.println("Panthera roars");
        }
    }
}
