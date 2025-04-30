package com.ordersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.ordersystem.repository")
public class OrderProcessingApplication {
    public static void main(String[] args) {
    	// Replace the placeholder with your MongoDB deployment's connection string
       /* String uri = "mongodb+srv://shruthisree07:Sreessruthi07@cluster0.btkvwsx.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("OrderSystem");*/
            //MongoCollection<Document> collection = database.getCollection("orders");
			/*
			 * Document doc = collection.find(eq("title", "Back to the Future")).first(); if
			 * (doc != null) { System.out.println(doc.toJson()); } else {
			 * System.out.println("No matching documents found."); }
			 */
        //}
        SpringApplication.run(OrderProcessingApplication.class, args);
    }
}
