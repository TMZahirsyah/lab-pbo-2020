/*public class Child extends Parent {
	int x;
	
	public Child() {
	x = 5;

	super();
	}
}*/

/*
Code diatas akan error jika dijanlakan, 
hal tersebut terjadi karena pemanggilan methodsuper() nya 
tidak ada dibaris pertama.
*/

/*
agar code diatas dapta dijalanka Maka pada codenya di tambah super seperti berikut
*/

public class Child extends Parent {
	int x;

	public Child() {
	super();
	x = 5;
	}
}

/*
karena ada pemnaggilan method super() dibaris pertama
 class ini tidak menghasilkan error seperti code sebelumnya.
*/