/*
1 Create an array list for 5 names
2 use loop to print hello and then return each of the values in the Array
*/

public class NameList {
	public static void main(String[]args){
		String[] names = {"Joy", "Segun", "Sam", "Ronke", "Bayo"};

		/*for(int counter = 0; counter < names.length; counter++){
			System.out.println("Hello " + names[counter]);
		}*/

		//Enhanced For Statement
		for(String eachNames : names){
			System.out.println("Hello " + eachNames);
		}
	}
}