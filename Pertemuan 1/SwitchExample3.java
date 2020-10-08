public class SwitchExample3 {
	public static void main(String[] args) { 
		String dayOfWeekArg = "Thursday"; 
		String typeOfDay = "";

		switch (dayOfWeekArg) {
		    case "Monday":
			    typeOfDay = "Start of work week";
			    break;

		    case "Tuesday":
		    case "Wednesday":
		    case "Thursday":
			    typeOfDay = "Midweek";
			    break;

		    case "Friday":
			    typeOfDay = "End of work week";
			    break;

		    case "Saturday":
		    case "Sunday":
			    typeOfDay = "Weekend";
			    break;
	
		    default:
			    System.out.println("Invalid day of the week: " + dayOfWeekArg);
		}
		System.out.println(typeOfDay);
	}
}


/*
	Masih sama seperti program sebelumnya program diatas masih menggunkan switch case
	jadi hanya akan ada satu pernyataan yang akan dipilih 
	jika case pertama tidak sesuai dengan penyataan yang ada maka akan lanjut ke case 2 jika di dua tidak ada maka terus lanjut hinggas case abis atau sesuai dengan pernyataannya.
	pada progam diatas diketahui bahwa dayOfWeekArg berisi "thursday" jadi  typeOfDay nya adalah midweek karena pada case tersebut terdapat "Tursday" sehingga output yang dihasilkan adalah "Midweek"
	



*/