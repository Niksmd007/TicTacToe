package com.TicTacToe;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to game env!!");
        TicTacToeGame game=new TicTacToeGame();
        System.out.println("Game winner is: "+game.startGame());
    }
}
