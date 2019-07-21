import java.util.Scanner; //Import Java scanner utility
class Student{ //Student class
	int RollNo;
	String Name;
	void ShowInfo(){ //Cannot give system output without declaring a function
		System.out.println("Student Name:"+Name+"\n");
		System.out.println("Student Roll No.:"+RollNo+"\n");

	}

}
class Exam extends Student{ //Exam class inheriting student class
	int sub1, sub2, sub3, sub4, sub5 ; 
	void Output(){ //Function to give system output
		
		System.out.println("Marks of 5 subjects");
		System.out.println("Sub1:"+sub1+"\nSub2:"+sub2+"\nSub3:"+sub3+"\nSub4:"+sub4+"\nSub5:"+sub5+"\n");
	}
}

class Result extends Exam{ //Extending OR inheriting Exam class
	int TotalMarks, Average;
	
	void ShowResult(){ // Function to show total and average
		TotalMarks=sub1+ sub2+ sub3+ sub4+ sub5;
	    Average= TotalMarks/5;
		System.out.println("Total Marks: " +TotalMarks);
		System.out.println("Average: " +Average);

	}

}

class Inherit{ // Main class
	public static void main(String args[]){ // *Main fucntion is important*
		Result sm= new Result(); //Making a new object sm   //*FIRST OBJECT*
		Result sm1= new Result(); //Making a new object sm1  //*SECOND OBJECT*
		
		sm.Name="Kunal"; //Defining variable values for object sm
		sm.RollNo=60;
		sm.sub1=10;
		sm.sub2=20;
		sm.sub3=30;
		sm.sub4=40;
		sm.sub5=50;
		sm.ShowInfo(); //calling fucntions for object sm
		sm.Output();
		sm.ShowResult();
		
		System.out.println("\n \n \n \n "); //Blank lines for giving a gap betweeen two object outputs

		sm1.Name="Somya"; //Object sm1 variable values
		sm1.RollNo=71;
		sm1.sub1=30;
		sm1.sub2=40;
		sm1.sub3=50;
		sm1.sub4=60;
		sm1.sub5=70;
		sm1.ShowInfo(); //calling functions for object sm1
		sm1.Output();
		sm1.ShowResult();
		
		

	}
}