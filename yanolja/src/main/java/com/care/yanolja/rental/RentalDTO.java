package com.care.yanolja.rental;

/*
CREATE TABLE Rental(
   host_name VARCHAR(20), //참조키 설정해주기
   room_name VARCHAR(40),
   room_img VARCHAR(200),
   region VARCHAR(50),
   min_people VARCHAR(50),
   max_people VARCHAR(50),
   room_pay VARCHAR(20),
   room_num VARCHAR(20),
   address VARCHAR(60),
   info VARCHAR(60),
   service VARCHAR(150),
   Rental_type VARCHAR(20),
   deadline_C VARCHAR(20),
   sleep_type VARCHAR(20),
   startTime VARCHAR(20), 
   endTime VARCHAR(20), 
   useTime VARCHAR(20),
   Representative_photo VARCHAR(150),
   admin_id VARCHAR(20),
   admin_name VARCHAR(20)
)CHARSET=UTF8;
*/

public class RentalDTO {
	
	
	private String min_people;
	
	private String max_people;
	private String host_name;
	private String room_name;
	private String roo_img;
	private String region;
	private String admin_Id;
	private String room_pay;
	private String room_num;
	private String address;
	private String info;
	private String service;
	private String lod_type;
	private String deadline_C;
	private String Num;
	private String Representative_photo;
	
	public String getRepresentative_photo() {
		return Representative_photo;
	}
	public void setRepresentative_photo(String representative_photo) {
		Representative_photo = representative_photo;
	}
	
	public String getNum() {
		return Num;
	}
	public void setNum(String num) {
		Num = num;
	}
	public String getMin_people() {
		return min_people;
	}
	public void setMin_people(String min_people) {
		this.min_people = min_people;
	}
	public String getMax_people() {
		return max_people;
	}
	public void setMax_people(String max_people) {
		this.max_people = max_people;
	}
	public String getHost_name() {
		return host_name;
	}
	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	public String getRoo_img() {
		return roo_img;
	}
	public void setRoo_img(String roo_img) {
		this.roo_img = roo_img;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAdmin_Id() {
		return admin_Id;
	}
	public void setAdmin_Id(String admin_Id) {
		this.admin_Id = admin_Id;
	}

	public String getRoom_pay() {
		return room_pay;
	}
	public void setRoom_pay(String room_pay) {
		this.room_pay = room_pay;
	}
	public String getRoom_num() {
		return room_num;
	}
	public void setRoom_num(String room_num) {
		this.room_num = room_num;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getLod_type() {
		return lod_type;
	}
	public void setLod_type(String lod_type) {
		this.lod_type = lod_type;
	}
	public String getDeadline_C() {
		return deadline_C;
	}
	public void setDeadline_C(String deadline_C) {
		this.deadline_C = deadline_C;
	}
	
	
}
	
