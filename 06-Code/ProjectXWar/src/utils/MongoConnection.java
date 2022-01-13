
package utils;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Alexander Ruano
 */
public class MongoConnection {

        ConnectionString connectionString = new ConnectionString("mongodb+srv://TheTue:Thetrue_18@cluster0.tanum.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
         .applyConnectionString(connectionString)
          .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("Warehouse");

    
    
    public MongoDatabase obtenerDB(){
        return database;
    }

}
