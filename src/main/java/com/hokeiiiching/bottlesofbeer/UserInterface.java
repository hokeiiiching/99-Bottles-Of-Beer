package com.hokeiiiching.bottles_of_beer;

public class UserInterface {

    private final String[] beersOnTheWall;
    private final String[] takeOneDown;
    private int beerNum;

    public UserInterface(int beerNum) {
        this.beerNum = beerNum;
        // Size of string arrays might be beernum - 2
        this.beersOnTheWall = new String[beerNum + 1];
        this.takeOneDown = new String[beerNum + 1];
    }

    public void start() {
        // Decrement beerNum until beerNum ==1
        while (this.beerNum > 1) {
                this.beersOnTheWall[this.beerNum] = this.beerNum + " bottles of beer on the wall, " + this.beerNum + " bottles of beer.";
                System.out.println(this.beersOnTheWall[this.beerNum]);
                this.beerNum--;
                this.takeOneDown[this.beerNum] = "Take one down and pass it around, " + this.beerNum + " bottles of beer on the wall.";
                System.out.println(this.takeOneDown[this.beerNum]);
        }
        // When beerNum = 1, change tense to singular
        if (this.beerNum == 1) {
            this.beersOnTheWall[this.beerNum] = this.beerNum + " bottle of beer on the wall, " + this.beerNum + " bottle of beer.";
            this.takeOneDown[this.beerNum] = "Take one down and pass it around, no more bottles of beer.";
            System.out.println(this.beersOnTheWall[this.beerNum]);
            System.out.println(this.takeOneDown[this.beerNum]);
            this.beerNum--;
        }
        // When beerNum = 0, print special last line and end program
        if (this.beerNum == 0) {

            this.beersOnTheWall[0] = "No more bottles of beer on the wall, no more bottles of beer.";
            this.takeOneDown[0] = "Go to the store and buy some more, 99 bottles of beer on the wall.";
            System.out.println(this.beersOnTheWall[0]);
            System.out.println(this.takeOneDown[0]);
        }
    }

}

