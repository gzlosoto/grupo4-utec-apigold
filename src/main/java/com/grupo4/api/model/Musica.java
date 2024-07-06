package com.grupo4.api.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "grupo4.musica")
public class Musica {
	
	
	private long IdCancion;
		
	private String Cancion;
	
	@DynamoDBHashKey(attributeName = "IdCancion")
	public long getIdCancion() {
		return IdCancion;
	}
	
	public void setIdCancion(long IdCancion) {
		this.IdCancion = IdCancion;
	}
	
	@DynamoDBAttribute(attributeName = "Cancion")
	public String getCancion() {
		return Cancion;
	}
	
	public void setCancion(String Cancion) {
		this.Cancion = Cancion;
	}
}