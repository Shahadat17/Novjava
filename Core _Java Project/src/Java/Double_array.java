package Java;

public class Double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	String foods [][]=new String [3][4];
	
	//first row
	foods[0] [0]="Vegetables";
	foods[0] [1]="Pizza";
	foods[0] [2]="fruit";
	foods[0] [3]="butter";
	//
	
	// third row
	foods[2] [0]="cheese";
	foods[2] [1]="sandwitch";
	foods[2] [2]="Salad";
	foods[2] [3]="bread";

	
	//System.out.println(foods[0][1]);
	//System.out.println(foods[2][3]);
	
	int rows=foods.length;
	int cols=foods[0].length;
	
	
	//arguments for rows
	for (int rownum=0; rownum<rows;rownum++){
		
		for (int colnum=0; colnum<cols;colnum++){
			
	System.out.println(foods[rownum][colnum]);	
	
		}
	}
			
		}
	
	

	
	
	
	
	
	}


