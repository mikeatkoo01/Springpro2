package com.LBG.jalal.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@JsonIgnoreProperties("inspection")
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String address;
	private String location;
	private String typeOfProperty;
	private Integer bedrooms;
	private Integer bathrooms;
	private String garden;
	private String uploadImages;
	private String propertyStatus;

	@JsonManagedReference(value = "propertyToView")
	@OneToMany(mappedBy = "property")
	List<Booking> bookings;

	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	private Integer price;

//	public Seller getSeller() {
//		return seller;
//	}
//
//	/**
//	 * @param seller the seller to set
//	 */
//	public void setSeller(Seller seller) {
//		this.seller = seller;
//	}

	// json file has offersinregionof instead of price

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTypeOfProperty() {
		return typeOfProperty;
	}

	public void setTypeOfProperty(String typeOfProperty) {
		this.typeOfProperty = typeOfProperty;
	}

	public Integer getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(Integer bedrooms) {
		this.bedrooms = bedrooms;
	}

	public Integer getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(Integer bathrooms) {
		this.bathrooms = bathrooms;
	}

	public String getGarden() {
		return garden;
	}

	public void setGarden(String garden) {
		this.garden = garden;
	}

	public String getUploadImages() {
		return uploadImages;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public void setUploadImages(String uploadImages) {
		this.uploadImages = uploadImages;
	}

	public String getPropertyStatus() {
		return propertyStatus;
	}

	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
	}

//	public Seller getSeller() {
//		return seller;
//	}
//
//	public void setSeller(Seller seller) {
//		this.seller = seller;
//	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
