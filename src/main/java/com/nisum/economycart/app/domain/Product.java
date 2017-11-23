<<<<<<< HEAD:src/main/java/com/nisum/economycart/app/model/Product.java
package com.nisum.economycart.app.model;
<<<<<<< HEAD

import javax.persistence.*;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

=======
>>>>>>> b5ae7178de115f90711170d64df9370d6a44101f
=======
package com.nisum.economycart.app.domain;
>>>>>>> c936f0b17af5241e583b0e46fbc41c526d532fbc:src/main/java/com/nisum/economycart/app/domain/Product.java
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
<<<<<<< HEAD
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
=======
@Table(name="Product")
public class Product implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
        @Id
        @Column(name = "productId")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private  int productId;
        private String  productName;    
        private float productPrice;
            private LocalDateTime createdDate; 
            private String  description;
        private int categoryId;
        private String  productImage;
        
        /**
         * @return the productId
         */
        public int getProductId() {
            return productId;
        }
        /**
         * @param productId the productId to set
         */
        public void setProductId(int productId) {
            this.productId = productId;
        }
        /**
         * @return the productName
         */
        public String getProductName() {
            return productName;
        }
        /**
         * @param productName the productName to set
         */
        public void setProductName(String productName) {
            this.productName = productName;
        }
        /**
         * @return the productPrice
         */
        public float getProductPrice() {
            return productPrice;
        }
        /**
         * @param productPrice the productPrice to set
         */
        public void setProductPrice(float productPrice) {
            this.productPrice = productPrice;
        }
        /**
         * @return the createdDate
         */
        public LocalDateTime getCreatedDate() {
            return createdDate;
        }
        /**
         * @param createdDate the createdDate to set
         */
        public void setCreatedDate(LocalDateTime createdDate) {
            this.createdDate = createdDate;
        }
        /**
         * @return the description
         */
        public String getDescription() {
            return description;
        }
        /**
         * @param description the description to set
         */
        public void setDescription(String description) {
            this.description = description;
        }
        /**
         * @return the categoryId
         */
        public int getCategoryId() {
            return categoryId;
        }
        /**
         * @param categoryId the categoryId to set
         */
        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }
        /**
         * @return the productImage
         */
        public String getProductImage() {
            return productImage;
        }
        /**
         * @param productImage the productImage to set
         */
        public void setProductImage(String productImage) {
            this.productImage = productImage;
        }
        /**
         * @return the serialversionuid
         */
        public static long getSerialversionuid() {
            return serialVersionUID;
        }
        
        /* (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + categoryId;
            result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
            result = prime * result + ((description == null) ? 0 : description.hashCode());
            result = prime * result + productId;
            result = prime * result + ((productImage == null) ? 0 : productImage.hashCode());
            result = prime * result + ((productName == null) ? 0 : productName.hashCode());
            result = prime * result + Float.floatToIntBits(productPrice);
            return result;
        }
        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Product other = (Product) obj;
            if (categoryId != other.categoryId)
                return false;
            if (createdDate == null) {
                if (other.createdDate != null)
                    return false;
            } else if (!createdDate.equals(other.createdDate))
                return false;
            if (description == null) {
                if (other.description != null)
                    return false;
            } else if (!description.equals(other.description))
                return false;
            if (productId != other.productId)
                return false;
            if (productImage == null) {
                if (other.productImage != null)
                    return false;
            } else if (!productImage.equals(other.productImage))
                return false;
            if (productName == null) {
                if (other.productName != null)
                    return false;
            } else if (!productName.equals(other.productName))
                return false;
            if (Float.floatToIntBits(productPrice) != Float.floatToIntBits(other.productPrice))
                return false;
            return true;
        }
        /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        @Override
        public String toString() {
            return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
                    + ", createdDate=" + createdDate + ", description=" + description + ", categoryId=" + categoryId
                    + ", productImage=" + productImage + "]";
        }
    
}
>>>>>>> b5ae7178de115f90711170d64df9370d6a44101f
