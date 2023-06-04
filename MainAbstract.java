
public class MainAbstract {

public static void main(String[] args) {
		
		//AbstractClss lar interfacelere benzer yönleri
		// 1. Gövdesiz metodları içermesi
		// 2. Interfacelerde oldugu gibi AbstractClasslerdan referans noktası oluşturamıyoruz...
		
		// AbstractDatabase abstractDatabase = new AbstractDatabase();  => buna iznimiz yok!!!
		
		// Referenaslarımızı daha önce yaptıgımız gibi alt classlara yönlendirecegiz...
		
		AbstractDatabase abstractDatabase1 = new MysqlDatabase();
		
		AbstractDatabase abstractDatabase2 = new MongoDatabase();
		
		abstractDatabase1.add();
		abstractDatabase2.add();
		abstractDatabase1.delete();
		abstractDatabase2.delete();
		
		abstractDatabase1.get();
		abstractDatabase1.update();
		
		abstractDatabase2.get();
		abstractDatabase2.update();
	}
}
/* ekran çıktısı
Eklendi....
Eklendi....
Silindi....
Silindi....
MysqlDb verileri aldi...
MysqlDb verileri guncelledi...
MongoDb verileri aldi...
MongoDb verileri guncelledi...
 */
 