package com.nisum.economycart.app.model;

import javax.persistence.*;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product  implements Serializable{

	@Id
	private String id;

	private String productName;

	private String productDesc;

	private String productType;

	private Integer quantity;

	private String productId;

	//private Orders orders;

	public Product(String productId,String productName,String productDesc,
			String productType,Integer quantity){
		this.productName=productName;
		this.productDesc=productDesc;
		this.productType=productType;
		this.quantity=quantity;
		this.productId=productId;
		//	this.orders=orders;
	}

	public Product() {


	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	/*public void setOrders(Orders orders) {
		this.orders = orders;
	}
	 */
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	/*public Orders getOrders() {
		return orders;
	}



	 */
	@Override
	public String toString() {
		ObjectMapper mapper = new ObjectMapper();

		String jsonString = "";
		try {
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			jsonString = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return jsonString;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
