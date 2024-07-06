package com.grupo4.api.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.grupo4.api.model.Musica;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class MusicaRepository {
	@Autowired
	final private DynamoDBMapper dynamoDBMapper;

	public Musica getMusicaById(long id) {

		// Retrieve the item
		Musica itemRetrieved = dynamoDBMapper.load(Musica.class, id);

		System.out.println("Item retrieved:");
		System.out.println(itemRetrieved);

		return itemRetrieved;
	}
	
	public List<Musica> getMusica() {

		DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();

        // Escanear la tabla utilizando DynamoDBMapper
        PaginatedScanList<Musica> scanResult = dynamoDBMapper.scan(Musica.class, scanExpression);

        // Convertir la lista paginada a una lista estándar
        List<Musica> musicaItems = scanResult.subList(0, scanResult.size());

        return musicaItems;
	}
}