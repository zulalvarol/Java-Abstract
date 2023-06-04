
public abstract class AbstractDatabase {
	// Gövdeli metodlar
		// Gövdesiz metodlar
		// özellikler 
		// bu üçünü de ekleyebiliriz....
		
		// add ve delete bütün databaseler için ortak olacak... => gövdeli metot
		// get ve update bütün classlar için farklı olacak ise => gövdesiz metot
		// ve bütün classlar get ve update kendine göre implemente etmeli....

		public void add() {
			System.out.println("Eklendi....");
		}
		
		public void delete() {
			System.out.println("Silindi....");
		}
		// get ve update her database için farklı olacaksa burda gövdesi metot yazıyoruz
		// Gövdesiz metotlat soyut metotlar..
		
		abstract void update();			// abstract öntanımla etiketini kullanıyoruz....
		abstract void get();
}
