package com.AdJava;

import java.io.*;


class FormattedTable {
 void line(Console console){
	 console.printf("-------------------------------------------------------------------------------------\n");
 }
 
 void printHeader(Console console){ 
 console.printf("%-15s \t %s \t %s \n","Player","Matches","Goals","Goals per match");
}
 void printRow(Console console, String player,int matches, int goals){
	 console.printf("%-15s \t %5d \t\t %d \t\t %.1f \n",player,matches,goals,((float)goals/(float)matches));	 		
 }

 public static void main(String[] args){
	 FormattedTable T = new FormattedTable();
	 Console console =System.console();
	 if(console!=null){
		 T.line(console);
		 T.printHeader(console);
		 T.line(console);
		 T.printRow(console, "Prashanth", 201, 189);
		 T.printRow(console, "Ronaldo", 201, 300);
		 T.printRow(console, "Messi", 201, 400);
		 T.line(console);
	 }
 }
}