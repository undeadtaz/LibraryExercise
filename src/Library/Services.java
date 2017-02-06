package Library;

import java.util.HashMap;
import java.util.Map;
//import java.util.Set;

public class Services {
	static Map<Integer, Book> bookstore = new HashMap<Integer, Book>();
	static void Add(int key, Book book) {
		bookstore.put(key, book);
	}
	static void Remove(Object key){
		bookstore.remove(key);
	}
	static void List(){
		for (Integer key: bookstore.keySet()){
			//Set<Integer> s = bookstore.keySet();
            
            
            System.out.print(bookstore.get(key).getAuthor());
            System.out.print(bookstore.get(key).getTitle());
            System.out.println(bookstore.get(key).getId());

} 
	}
}
