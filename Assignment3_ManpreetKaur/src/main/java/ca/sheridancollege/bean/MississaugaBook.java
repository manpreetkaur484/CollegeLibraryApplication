package ca.sheridancollege.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MississaugaBook implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String title;
	private String author;
	private String price;
	private int inventory;
	private List<String> courseList = new ArrayList<String>();

	public MississaugaBook(String title, String author, String price, int inventory, List<String> courseList) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.inventory = inventory;
		this.courseList = courseList;
	}
}
