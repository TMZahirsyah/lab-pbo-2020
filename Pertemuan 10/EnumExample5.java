class EnumExample5{

	enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
	SATURDAY}
 
 	public static void main(String args[]){
 		Day day=Day.MONDAY;
 		
 		switch(day){
 			case SUNDAY: System.out.println("sunday");
 			break;
 			case MONDAY: System.out.println("monday");
 			break;
 			default:
 			System.out.println("other day");
 		}
 	}
}
 
/*
output dari code  diatas 
monday 

pada line 7 merupakan deklarasi variabel day denga type data Day 
pada line 9  terdapat switch case:
karena diatas telah dideklarasi maka swtich case, maka:
line 12 merupakan case yang menajdi hasilnya.

*/