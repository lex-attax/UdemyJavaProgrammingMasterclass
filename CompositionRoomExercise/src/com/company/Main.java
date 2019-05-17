package com.company;

public class Main {

    public static void main(String[] args) {
	Room theRoom = new Room(20,3,new Wall("white",4,false),new Furniture(true));
	System.out.println(theRoom.getWall().getColor());
	theRoom.getWall().changeColor("red");
	System.out.println(theRoom.getWall().getColor());

    }
}
