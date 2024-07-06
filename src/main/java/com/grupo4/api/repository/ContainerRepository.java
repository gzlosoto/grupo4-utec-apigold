package com.grupo4.api.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.grupo4.api.model.Container;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class ContainerRepository {
	@Autowired
	final private DynamoDBMapper dynamoDBMapper;

	public Container getContainerById(long id) {

		// Retrieve the item
		Container itemRetrieved = dynamoDBMapper.load(Container.class, id);

		System.out.println("Item retrieved:");
		System.out.println(itemRetrieved);

		return itemRetrieved;
	}

	public List<Container> getContainer() {

		DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();

		// Escanear la tabla utilizando DynamoDBMapper
		PaginatedScanList<Container> scanResult = dynamoDBMapper.scan(Container.class, scanExpression);

		// Convertir la lista paginada a una lista estándar
		List<Container> containerItems = scanResult.subList(0, scanResult.size());

		return containerItems;
	}
}