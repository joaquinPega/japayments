package org.japayments.persistence;

import java.io.File;
import java.net.UnknownHostException;






import java.nio.file.FileSystems;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoUtil {
	protected DB db;
	private MongoClient mongoClient=null;
	@SuppressWarnings("deprecation")
	protected void startOperation() throws DBFail{
		try {
			mongoClient = new MongoClient(System.getenv("OPENSHIFT_MONGODB_DB_HOST"),Integer.parseInt(System.getenv("OPENSHIFT_MONGODB_DB_PORT")));
			//Simple-xml
			Serializer serializer = new Persister();
			File source = new File(FileSystems.getDefault().getPath("src/main/resources", "MongoData.xml").toString());
			MongoData mongoData = serializer.read(MongoData.class, source);
			this.db = mongoClient.getDB(mongoData.getDbName()); // test es la base de datos de pruebas
			boolean auth= db.authenticate(mongoData.getDbUser(), mongoData.getDbPassword().toCharArray());
			if(!auth){
				
			}			
		} catch (NumberFormatException | UnknownHostException e) {
			throw new DBFail("Fallo "+e.getMessage());
		} catch (Exception e) {
			throw new DBFail("Fallo serializer "+e.getMessage());
		}			
	}
	protected void closeOperation()throws DBFail{
		try{
			if(mongoClient!=null){
				mongoClient.close();
			}
		}catch(Throwable e){
			throw new DBFail("Fallo: "+e.getMessage());
		}
	}
}
