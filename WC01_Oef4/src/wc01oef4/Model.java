package wc01oef4;

import java.util.ArrayList;
import java.util.List;

public class Model {
	private static List<Artikel> shop =  new ArrayList<Artikel>();
	
	public static void addArtikel(Artikel art){
		shop.add(art);
	}
	
	public static void removeArtikel(Artikel art){
		shop.remove(art);
	}
	
	public static List<Artikel> getBasket(){
		return shop;
	}
	
	public static String artikelList(){
		String s = "";
		if(shop != null){
			for (Artikel a : shop) {
				s = s + a.toString() + "\n";
			}
		}
		return s;
	}
	
}
