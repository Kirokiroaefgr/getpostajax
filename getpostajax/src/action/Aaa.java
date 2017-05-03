package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.itemDao;
import dto.itemDTO;

public class Aaa extends ActionSupport {
	private itemDTO itemA;
	private String date;
	private String name;
	private int age;
	@Override
	public String execute() throws Exception {
		System.out.println("Process Date : "+getDate());
		System.out.println(name);
		System.out.println(age);
		itemDao aaa= new itemDao();
		itemA=aaa.select01(age);
		System.out.println(itemA.getItemName());
		return "success";
	}
	public itemDTO getItemA() {
		return itemA;
	}
	public void setItemA(itemDTO itemA) {
		this.itemA = itemA;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}






}