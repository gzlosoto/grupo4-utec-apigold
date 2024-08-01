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
@DynamoDBTable(tableName = "grupo4_gold_tbl_1")
public class Container {
    private String rowId_UNH;
    private String Agency;
    private String BOOKING;
    private String CARRIER;
    private String Date_time;
    private String DELIVER;
    private String DISCHARGE;
    private String LOAD;
    private String TRANSHIPMENT;
    //rowId_UNH
    @DynamoDBHashKey(attributeName = "rowidunh")
    public String getRowId_UNH() {
		return rowId_UNH;
	}
	public void setRowId_UNH(String rowId_UNH) {
		this.rowId_UNH = rowId_UNH;
	}
	
	@DynamoDBAttribute(attributeName = "Agency")
	public String getAgency() {
		return Agency;
	}
	public void setAgency(String agency) {
		Agency = agency;
	}
	
	@DynamoDBAttribute(attributeName = "booking")
	public String getBOOKING() {
		return BOOKING;
	}
	public void setBOOKING(String bOOKING) {
		BOOKING = bOOKING;
	}
	
	@DynamoDBAttribute(attributeName = "CARRIER")
	public String getCARRIER() {
		return CARRIER;
	}
	public void setCARRIER(String cARRIER) {
		CARRIER = cARRIER;
	}
	
	@DynamoDBAttribute(attributeName = "date_time")
	public String getDate_time() {
		return Date_time;
	}
	public void setDate_time(String date_time) {
		Date_time = date_time;
	}
	
	@DynamoDBAttribute(attributeName = "DELIVER")
	public String getDELIVER() {
		return DELIVER;
	}
	public void setDELIVER(String dELIVER) {
		DELIVER = dELIVER;
	}
	
	@DynamoDBAttribute(attributeName = "DISCHARGE")
	public String getDISCHARGE() {
		return DISCHARGE;
	}
	public void setDISCHARGE(String dISCHARGE) {
		DISCHARGE = dISCHARGE;
	}
	
	@DynamoDBAttribute(attributeName = "LOAD")
	public String getLOAD() {
		return LOAD;
	}
	public void setLOAD(String LOAD) {
		this.LOAD = LOAD;
	}
	
	@DynamoDBAttribute(attributeName = "TRANSHIPMENT")
	public String getTRANSHIPMENT() {
		return TRANSHIPMENT;
	}
	public void setTRANSHIPMENT(String tRANSHIPMENT) {
		TRANSHIPMENT = tRANSHIPMENT;
	}
}