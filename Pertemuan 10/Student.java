class Student{
 	int NIM;
 	String name;
 	static String college ="Unsyiah";

 	static void change(){
 		college = "USK";
 	}

 	Student(int r,String n){
 		NIM = r;
 		name = n;
 	}
 
 	void display (){
 		System.out.println(NIM+" "+name+" "+college); 
 	}
 
 	public static void main(String args[]){
 		Student s1 = new Student(111,"Karen");
 		Student s2 = new Student(222,"Arya");
 		s1.display();
 		s2.display();

 		Student.change();
 		s1.display();
 		s2.display();
 	}
} 

/*
Output dari code diatas:
111 Karen Unsyiah
222 Arya Unsyiah
111 Karen USK
222 Arya USK

untuk dua output pertama menghasikan nim, nama dan kampus dari siswanya
dimana pada line 15  method void display akan di print 
111 Karen Unsyiah
222 Arya Unsyiah

pada line 25 terdapat student.change, yang maknanya ada data yang di ganti pada siswa
karena pada line 6 method static void change terdapat deklarasi baru untuk collage nya, 
maka pada line 25- 27 :

menghasilkan output:
111 Karen USK
222 Arya USK

*/