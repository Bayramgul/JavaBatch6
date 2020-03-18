package com.syntax.class10;

public class TeamPlayerArrays {

	public static void main(String[] args) {
		String []team= {"Beshiktash","Trabzon","Galatasaray","Fenerbahce"};
		String [] player= {"Sergen","Yattara","Hakan","Alex"};
		
		
		for(int row=0;row<team.length;row++) {
			switch (team[row]) {
			case "Beshiktash":System.out.println("Sergen is the player of Beshiktas");break;
			case "Trabzon":System.out.println("Yattara is the player of Trabzon");break;
			
				
			}
		}

	}

}
