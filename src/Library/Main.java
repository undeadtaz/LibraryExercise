package Library;


public class Main {
	public static void main(String[] args){
	
		//Services service = new Services();
		Book book1 = new Book("ASOIAF", "G.R.R.", 1337);
		Book book2 = new Book("Illadin", "H.D.D.", 8484);
		Book book3 = new Book("Two Worlds", "Z.P.", 1234);
		Book book4 = new Book("LoL", "S.A.L.T.", 4444);
		
		Services.Add(1, book1);
		Services.Add(2, book2);
		Services.Add(3, book3);
		Services.Add(4, book4);
		
		Services.List();
		
		Services.Remove(2);
		System.out.println();
		Services.List();
	
}}
