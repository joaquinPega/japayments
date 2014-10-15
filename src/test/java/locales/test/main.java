package locales.test;

import java.io.File;
import java.net.UnknownHostException;
import java.nio.file.FileSystems;

import org.japayments.persistence.MongoData;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class main {

	public static void main(String[] args) throws Exception {
		DB db;
		MongoClient mongoClient;
		mongoClient = new MongoClient("localhost");
		//Simple-xml
		Serializer serializer = new Persister();
		File source = new File(FileSystems.getDefault().getPath("src/main/resources", "MongoData.xml").toString());
		MongoData mongoData = serializer.read(MongoData.class, source);
		System.out.println(mongoData.getDbName()+" "+ mongoData.getDbUser()+ " "+ mongoData.getDbPassword());
		db = mongoClient.getDB(mongoData.getDbName()); // test es la base de datos de pruebas
		boolean auth= db.authenticate(mongoData.getDbUser(), mongoData.getDbPassword().toCharArray());
		System.out.println(auth);
	}

}
