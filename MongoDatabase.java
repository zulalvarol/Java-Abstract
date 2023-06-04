
public class MongoDatabase extends AbstractDatabase {
	// add ve delete metodlarını miras aldık
	// istediğiiz yerd eistediğimiz biçimde kullanabiliriz
	// get ve update bunla soyut metodlar bunları kendimize göre implemente etmemmiz gerekiyor...
			@Override
			void update() {
				System.out.println("MongoDb verileri güncelledi...");
			}

			@Override
			void get() {
				System.out.println("MongoDb verileri aldı...");	
			}
}
