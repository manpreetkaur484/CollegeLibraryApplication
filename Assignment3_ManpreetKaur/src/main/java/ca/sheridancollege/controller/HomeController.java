package ca.sheridancollege.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.bean.BramptonBook;

import ca.sheridancollege.bean.MississaugaBook;
import ca.sheridancollege.bean.OakvilleBook;

import ca.sheridancollege.database.DatabaseAccess;

@Controller
public class HomeController {

	@Autowired
	private DatabaseAccess da;

	@GetMapping("/")
	public String goHome() {
		return "selectStore.html";
	}

	@GetMapping("/selectStore")
	public String selectOakville(@RequestParam String store, Model model) {
		model.addAttribute("store", store);
		if (store.equalsIgnoreCase("Oakville")) {
			return "OakvilleStore.html";
		}
		if (store.equalsIgnoreCase("Brampton")) {
			return "BramptonStore.html";
		}
		if (store.equalsIgnoreCase("Mississauga")) {
			return "MississaugaStore.html";
		}
		return store;
	}

	@GetMapping("/view")
	public String view() {
		return "redirect:/viewBooks";
	}

	@GetMapping("/searchPage")
	public String searchPage() {
		return "searchBook.html";
	}

	@GetMapping("/addBooks")
	public String add(@RequestParam String location, Model model) {
		model.addAttribute("location", location);
		return "addBooks.html";
	}

	@GetMapping("/add")
	public String addBooks(Model model, @RequestParam(required = false) String title,
			@RequestParam(required = true) String author, @RequestParam(required = true) String price,
			@RequestParam(required = true) int inventory, @RequestParam(required = true) String course1,
			@RequestParam(required = false) String course2, @RequestParam(required = false) String course3,
			@RequestParam(required = false) String course4, @RequestParam(required = true) String location) {

		List<String> courseList = new ArrayList<String>();

		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		courseList.add(course4);

		model.addAttribute("location", location);
		if (location.equalsIgnoreCase("Brampton")) {
			BramptonBook Bbooks = new BramptonBook(title, author, price, inventory, courseList);

			da.addBramptonBooks(Bbooks);
		}
		if (location.equalsIgnoreCase("Mississauga")) {
			MississaugaBook Mbooks = new MississaugaBook(title, author, price, inventory, courseList);

			da.addMississaugaBooks(Mbooks);
		}
		if (location.equalsIgnoreCase("Oakville")) {
			OakvilleBook Obooks = new OakvilleBook(title, author, price, inventory, courseList);

			da.addOakvilleBooks(Obooks);
		}
		return "addBooks.html";
	}

	// ***************************GENERATE RECORDS****************************
	@GetMapping("/dummyRecords")
	public String dummyRecords() {
		da.createDummyRecords();
		return "displayMsg.html";
	}

	@GetMapping("/goBack")
	public String goBack() {
		return "selectStore.html";
	}

	// ***********************DISPLAY THE VIEW-BOOKS PAGE****************

	@GetMapping("/viewBooks")
	public String viewBooks(Model model) {
		List<BramptonBook> bramptonBooks = da.viewBrampton();
		model.addAttribute("bramptonBook", bramptonBooks);

		List<MississaugaBook> mississaugaBooks = da.viewMississauga();
		model.addAttribute("mississaugaBook", mississaugaBooks);

		List<OakvilleBook> oakvilleBooks = da.viewOakville();
		model.addAttribute("oakvilleBook", oakvilleBooks);
		return "viewBooks.html";
	}

	// ******************EDIT THE BOOKS*********************************

	// Brampton store
	@GetMapping("/edit/brampton/{id}")
	public String editBBook(@PathVariable int id, Model model) {
		BramptonBook b = da.getBookByIdBrampton(id);
		model.addAttribute("brampton", b);
		return "editBramptonBooks.html";
	}

	// Mississauga store
	@GetMapping("/edit/mississauga/{id}")
	public String editMBook(@PathVariable int id, Model model) {
		MississaugaBook m = da.getBookByIdMississauga(id);
		model.addAttribute("mississauga", m);
		return "editMississaugaBooks.html";
	}

	// Oakville store
	@GetMapping("/edit/oakville/{id}")
	public String editOBook(@PathVariable int id, Model model) {
		OakvilleBook o = da.getBookByIdOakville(id);
		model.addAttribute("oakville", o);
		return "editOakvilleBooks.html";
	}

	// MODIFY
	@GetMapping("/modify")
	public String editBookRecord(@RequestParam int id, @RequestParam(required = false) String title,
			@RequestParam(required = false) String author, @RequestParam(required = false) String price,
			@RequestParam(required = false) int inventory, @RequestParam(required = false) String courses,
			@RequestParam String location) {

		List<String> courseList = new ArrayList<String>();
		courseList.add(courses);

		if (location.equalsIgnoreCase("Brampton")) {
			BramptonBook b = new BramptonBook(id, title, author, price, inventory, courseList);
			da.editBramptonBook(b);
		}
		if (location.equalsIgnoreCase("Mississauga")) {
			MississaugaBook m = new MississaugaBook(id, title, author, price, inventory, courseList);
			da.editMississaugaBook(m);
		}
		if (location.equalsIgnoreCase("Oakville")) {
			OakvilleBook o = new OakvilleBook(id, title, author, price, inventory, courseList);
			da.editOakvilleBook(o);
		}
		return "redirect:/viewBooks";

	}

	// ********************DELETE THE BOOKS***********************

	@GetMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {

		BramptonBook b = da.getBookByIdBrampton(id);
		da.deleteBookByIdB(id);

		MississaugaBook m = da.getBookByIdMississauga(id);
		da.deleteBookByIdM(id);

		OakvilleBook o = da.getBookByIdOakville(id);
		da.deleteBookByIdO(id);

		return "redirect:/viewBooks";
	}

	// ****************************SEARCH BOOKS********************

	@GetMapping("/search")
	public String search() {
		return "searchBook.html";
	}

	@GetMapping("/idSearch")
	public String idSearch() {
		return "idSearch.html";
	}

	@GetMapping("/titleSearch")
	public String titleSearch() {
		return "titleSearch.html";
	}

	@GetMapping("/auhtorSearch")
	public String authorSearch() {
		return "authorSearch.html";
	}

	@GetMapping("/courseSearch")
	public String courseSearch() {
		return "courseSearch.html";
	}

	@GetMapping("/quantitySearch")
	public String quantitySearch() {
		return "quantitySearch.html";
	}

	@GetMapping("/author")
	public String viewauthor(@RequestParam String author, Model model) {
		ArrayList<BramptonBook> b = da.getBookByauthorB(author);
		model.addAttribute("bramptonauthor", b);

		ArrayList<MississaugaBook> m = da.getBookByauthorM(author);
		model.addAttribute("mississaugaauthor", m);

		ArrayList<OakvilleBook> o = da.getBookByauthorO(author);
		model.addAttribute("oakvilleauthor", o);

		return "authorSearch.html";
	}

	@GetMapping("/id")
	public String viewId(@RequestParam int id, Model model) {

		BramptonBook b = da.getBookByIdBrampton(id);

		model.addAttribute("bramptonId", b);

		MississaugaBook m = da.getBookByIdMississauga(id);
		model.addAttribute("mississaugaId", m);

		OakvilleBook o = da.getBookByIdOakville(id);
		model.addAttribute("oakvilleId", o);

		return "idSearch.html";
	}

	@GetMapping("/title")
	public String viewTitle(@RequestParam String title, Model model) {

		ArrayList<BramptonBook> b = da.getBookByTitleB(title);
		model.addAttribute("bramptonTitle", b);

		ArrayList<MississaugaBook> m = da.getBookByTitleM(title);
		model.addAttribute("mississaugaTitle", m);

		ArrayList<OakvilleBook> o = da.getBookByTitleO(title);
		model.addAttribute("oakvilleTitle", o);
		// return "viewBooks.html";
		return "titleSearch.html";
	}

	@GetMapping("/inventory")
	public String viewInventory(@RequestParam int inventory1, @RequestParam int inventory2, Model model) {

		ArrayList<BramptonBook> b = da.getBookByQuantityB(inventory1, inventory2);
		model.addAttribute("bramptonInventory", b);

		ArrayList<MississaugaBook> m = da.getBookByQuantityM(inventory1, inventory2);
		model.addAttribute("mississaugaInventory", m);

		ArrayList<OakvilleBook> o = da.getBookByQuantityO(inventory1, inventory2);
		model.addAttribute("oakvilleInventory", o);

		return "quantitySearch.html";
	}

	@GetMapping("/courseList")
	public String viewCourses(@RequestParam String courseList, Model model) {

		ArrayList<BramptonBook> b = da.getBookByCourseB(courseList);
		model.addAttribute("bramptonCourses", b);

		ArrayList<MississaugaBook> m = da.getBookByCourseM(courseList);
		model.addAttribute("mississaugaCourses", m);

		ArrayList<OakvilleBook> o = da.getBookByCourseO(courseList);
		model.addAttribute("oakvilleCourses", o);

		return "courseSearch.html";
	}

	// ****************************PURCHASE BOOKS**************************

	@GetMapping("/purchase/brampton/{id}")
	public String purchaseB(@PathVariable int id) {

		BramptonBook b = da.getBookByIdBrampton(id);
		da.purchaseBramptonBook(b);
		return "redirect:/viewBooks";
	}

	@GetMapping("/purchase/mississauga/{id}")
	public String purchaseM(@PathVariable int id) {
		MississaugaBook m = da.getBookByIdMississauga(id);
		da.purchaseMississaugaBook(m);
		return "redirect:/viewBooks";
	}

	@GetMapping("/purchase/oakville/{id}")
	public String purchaseO(@PathVariable int id) {
		OakvilleBook o = da.getBookByIdOakville(id);
		da.purchaseOakvilleBook(o);
		return "redirect:/viewBooks";
	}
	
}