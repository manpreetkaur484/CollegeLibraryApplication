package ca.sheridancollege.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import ca.sheridancollege.bean.BramptonBook;
import ca.sheridancollege.bean.MississaugaBook;
import ca.sheridancollege.bean.OakvilleBook;

@Repository
public class DatabaseAccess {

	@Autowired
	protected NamedParameterJdbcTemplate jdbc;

	// **********************ADD BOOKS************************

	// add books in brampton store
	public void addBramptonBooks(BramptonBook bramptonBook) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();

		ArrayList<String> list = new ArrayList<String>();
		list.addAll(bramptonBook.getCourseList());
		// convert ArrayList to one String
		String string = "";
		for (int i = 0; i < list.size(); i++) {
			string += list.get(i) + ",";
		}
		String query = "INSERT INTO brampton (title, author, price, inventory, courseList) VALUES"
				+ "(:title, :author, :price, :inventory, :courseList)";
		parameters.addValue("title", bramptonBook.getTitle());
		parameters.addValue("author", bramptonBook.getAuthor());
		parameters.addValue("price", bramptonBook.getPrice());
		parameters.addValue("inventory", bramptonBook.getInventory());
		parameters.addValue("courseList", string);
		jdbc.update(query, parameters);
	}

	// add books in Mississauga store
	public void addMississaugaBooks(MississaugaBook mississaugaBook) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();

		ArrayList<String> list = new ArrayList<String>();
		list.addAll(mississaugaBook.getCourseList());
		// convert ArrayList to one String
		String string = "";
		for (int i = 0; i < list.size(); i++) {
			string += list.get(i) + ",";
		}
		String query = "INSERT INTO mississauga (title, author, price, inventory, courseList) VALUES"
				+ "(:title, :author, :price, :inventory, :courseList)";
		parameters.addValue("title", mississaugaBook.getTitle());
		parameters.addValue("author", mississaugaBook.getAuthor());
		parameters.addValue("price", mississaugaBook.getPrice());
		parameters.addValue("inventory", mississaugaBook.getInventory());
		parameters.addValue("courseList", string);
		jdbc.update(query, parameters);
	}

	// add books in Oakville store
	public void addOakvilleBooks(OakvilleBook oakvilleBook) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();

		ArrayList<String> list = new ArrayList<String>();
		list.addAll(oakvilleBook.getCourseList());
		// convert ArrayList to one String
		String string = "";
		for (int i = 0; i < list.size(); i++) {
			string += list.get(i) + ",";
		}
		String query = "INSERT INTO oakville (title, author, price, inventory, courseList) VALUES"
				+ "(:title, :author, :price, :inventory, :courseList)";
		parameters.addValue("title", oakvilleBook.getTitle());
		parameters.addValue("author", oakvilleBook.getAuthor());
		parameters.addValue("price", oakvilleBook.getPrice());
		parameters.addValue("inventory", oakvilleBook.getInventory());
		parameters.addValue("courseList", string);
		jdbc.update(query, parameters);
	}

	// *********************GENERATE BOOKS*****************************************

	public void createDummyRecords() {
		String query = "INSERT INTO brampton(title, author, price, inventory, courseList) VALUES"

				+ " ('3D IC Integration and Packaging', 'John H. Lau', 89, 5, 'Chemistry, City Studies'),\r\n"
				+ "	('3D Printer Projects for Makerspaces', 'Lydia Sloan Cline',  199, 2, 'Classical Studies, Concurrent Teacher Education'),\r\n"
				+ "	('Alternative Sewer Systems FD-12, Second Edition','Water Environment Federation', 250, 13, 'Introduction to Inorganic Chemistry, Organic Chemistry II'),\r\n"
				+ "	('Alternative Water Sources and Wastewater Management','Bob Boulware', 240, 12, 'Organic Chemistry I and II, Environmental Chemistry'),\r\n"
				+ "	('ALUMINIUM ROLLING: Processes, Principles & Applications','R. V. Singh', 230, 11, 'Introduction to Biochemistry, Analytical Instrumentation'),\r\n"
				+ "	('Analog Filter and Circuit Design Handbook','Arthur B. Williams', 220, 10, 'Intermediate Physical Chemistry'),\r\n"
				+ " ('3D Printing and CNC Fabrication with SketchUp', 'Lydia Sloan Cline',  65, 2, 'Food Education, Curating Historical, ArtExhibiting Art'),\r\n"
				+ "	('3D Printing with Autodesk 123D, Tinkercad, and MakerBot', 'Lydia Sloan Cline', 249, 1, 'Computer Science'),\r\n"
				+ "	('15 Dangerously Mad Projects for the Evil Genius', 'Dr. Simon Monk',29, 15, 'English, Social Science, Biology'),\r\n"
				+ "	('20 Makey Makey Projects for the Evil Genius, Colleen Graves', 'Aaron Graves', 159, 13, 'Diet Plan'),\r\n"
				+ "	('30 Arduino Projects for the Evil Genius, Second Edition', 'Dr. Simon Monk',159, 30, 'History of Choclate'),\r\n"
				+ "	('30 BeagleBone Black Projects for the Evil Genius', 'Christopher Rush',99, 45, 'History of Canada'),\r\n"
				+ "	('2012 International Building Code Handbook', 'John R. Henry', 69, 25, 'Human Relations, Social Secience'),\r\n"
				+ " ('2015 International Building Code  Illustrated Handbook', 'John R. Henry', 49, 19, 'Human Resourses, Mechical Engineering, Foundations of City Studies'),\r\n"
				+ " ('Applied Machine Learning', 'M. Gopal', 249, 5, 'Fake Friends and Artificial Intelligence: the Human-Robot Relationship'),\r\n"
				+ "	('Architectural Engineering Design: Mechanical Systems', 'Robert Brown Butler', 169, 4, 'Statistics and Finance I, Analysis of Big Data, Statistics Project'),\r\n"
				+ "	('Arduino and Raspberry Pi Sensor Projects for the Evil Genius', 'Robert Chin', 159, 3, 'Regression Analysis, Probability Models'),\r\n"
				+ "	('Arduino Robot Bonanza', 'Gordon McComb', 199, 29, 'Stochastic Processes, Statistical Inference, Applied Data Collection'),\r\n"
				+ "	('Area Array Packaging Handbook: Manufacturing and Assembly', 'Ken Gilleo', 89, 16, 'Categorical Data Analysis, Data Collection'),\r\n"
				+ "	('Biofilm Reactors - WEF MoP 35, The Water Environment Federation', 'Manpreet Grewal', 300, 5, 'Introduction to Applied Statistics'),\r\n"
				+ "	('Biofuels Refining and Performance', 'Ahindra Nag', 79, 50, 'An Introduction to Statistics'),\r\n"
				+ "	('Biomedical Applications of Light Scattering, Adam Wax', 'Vadim Backman', 145, 2, 'An Introduction to Probability'),\r\n"
				+ "	('Eloquence Embodied : Nonverbal Communication Among French','Carayon Céline', 55, 6, 'The Psychology of Emotion, Infancy'),\r\n"
				+ " ('Introduction to Security Consulting : A Lucrative Business Service','Blake William F', 88, 8, 'Judgment and Decision Making, Advanced Psychology'),\r\n"
				+ " ('Biomedical Engineering and Design Handbook, Volume 1', 'Myer Kutz', 139, 55, 'Financial Derivatives,  Statistics II'),\r\n"
				+ " ('Cable-Suspended Roofs, Second Edition','Prem Krishna', 299, 1, 'Religion and Globalization: Continuities and Transformations'),\r\n"
				+ "	('CAM Design Handbook','Harold A. Rothbart', 79, 29, 'Hinduism in South Asia and the Diaspora'),\r\n"
				+ " ('The Three Languages of Politics : Political Divides','Kling Arnold S', 75, 11, 'Methods in Psychological Science'),\r\n"
				+ " ('The Body of Work : John Rechy’s Sensual Poetics','Bucher Michael',189, 1, 'Psychology of Gender, Social Neuroscience'),\r\n"
				+ " ('Topics in Partial Differential Equations','Gupta Parmanand', 199, 2, 'Introduction to Physiological Psychology'),\r\n"
				+ " ('Arduino Robot Bonanza', 'Gordon McComb', 199, 29, 'Stochastic Processes, Statistical Inference, Applied Data Collection'),\r\n"
				+ "	('Biomedical Engineering and Design Handbook  Volume 2', 'Myer Kutz', 99, 32, 'Introduction to Data Science, Topics in American Prose')";

		String query1 = "INSERT INTO mississauga (title, author, price, inventory, courseList) VALUES "

				+ " ('2018 International Building Code Illustrated Handbook','Douglas W. Thornburg',189, 18, 'Canadian Cities and Planning'),\r\n"
				+ " ('Adhesion of Polymers, Roman A. Veselovsky','Vladimir Kestelman', 20, 40, 'Social Planning and Community Development'),\r\n"
				+ "	('Advanced MEMS Packaging','John H. Lau', 8, 60, 'City Politics, Economy of Cities'),\r\n"
				+ " ('The Body of Work : John Rechy’s Sensual Poetics','Bucher Michael',189, 1, 'Psychology of Gender, Social Neuroscience'),\r\n"
				+ "	('Aircraft Basic Science, Eighth Edition','Michael J. Kroes', 70, 35, 'Learning in Community Service, Real Estate and the City'),\r\n"
				+ "	('Aircraft Electricity and Electronics, Seventh Edition','Thomas K. Eismin', 280, 20, 'Current Municipal and Planning Policy and Practice in Toronto'),\r\n"
				+ "	('Aircraft Maintenance & Repair, Eighth Edition','Dr. Ronald Sterkenburg', 290, 19, 'Urban Social Policy, AirCraft Art'),\r\n"
				+ "	('Alternative Sewer Systems FD-12, Second Edition','Water Environment Federation', 250, 13, 'Introduction to Inorganic Chemistry, Organic Chemistry II'),\r\n"
				+ "	('Alternative Water Sources and Wastewater Management','Bob Boulware', 240, 12, 'Organic Chemistry I and II, Environmental Chemistry'),\r\n"
				+ "	('ALUMINIUM ROLLING: Processes, Principles & Applications','R. V. Singh', 230, 11, 'Introduction to Biochemistry, Analytical Instrumentation'),\r\n"
				+ "	('Analog Filter and Circuit Design Handbook','Arthur B. Williams', 220, 10, 'Intermediate Physical Chemistry'),\r\n"
				+ " ('Aircraft Materials and Analysis','Tariq Siddiqui',300, 18, ',Aircraft Diploma, Aircraft Basic Training'),\r\n"
				+ "	('Aircraft Powerplants, Ninth Edition','Thomas W. Wild', 290, 17, 'Planning and Governing the Metropolis'),\r\n"
				+ "	('Airport Ground Navigation Systems','Dr. Arjun Singh', 280, 16, 'Civic Engagement in Urban Politics, '),\r\n"
				+ "	('Alternative Energy DeMYSTiFieD, Second Edition','Stan Gibilisco', 270, 15, 'Chemistry I: Structure and Bonding, Chemistry 1, Organic Chemistry I'),\r\n"
				+ " ('Bioreactors: Analysis and Design','Professor Tapobrata Panda', 29, 29, 'Topics in American Poetry, Topics in Canadian Literature'),\r\n"
				+ "	('Biosolids Engineering','Michael J. McFarland', 179, 29, 'Literature, Politics, Revolution, Studies in Popular Genres'),\r\n"
				+ "	('Biosystems Engineering','Ahindra Nag', 169, 24, 'Cinema: The Auteur Theory, Engeneering, Seminar in Religion'),\r\n"
				+ "	('Bringing Out the Best in People','Aubrey C. Daniels', 159, 23, 'Supervised Readings in the Study of Religion'),\r\n"
				+ "	('Budgeting for Managers','Sid Kemp', 149, 22, 'Studies in Major Canadian Writers'),\r\n"
				+ "	('Building Design for Wind Forces','Rima Taher', 59, 21, 'Selected Topics in the Study of Religion II'),\r\n"
				+ "	('Buried Pipe Design, Third Edition','A. P. Moser', 249, 17, 'Techniques in Analytical Chemistry'),\r\n"
				+ "	('Applied Machine Learning', 'M. Gopal', 249, 5, 'Fake Friends and Artificial Intelligence: the Human-Robot Relationship'),\r\n"
				+ "	('Architectural Engineering Design: Mechanical Systems', 'Robert Brown Butler', 169, 4, 'Statistics and Finance I, Analysis of Big Data, Statistics Project'),\r\n"
				+ "	('Arduino and Raspberry Pi Sensor Projects for the Evil Genius', 'Robert Chin', 159, 3, 'Regression Analysis, Probability Models'),\r\n"
				+ "	('Arduino Robot Bonanza', 'Gordon McComb', 199, 29, 'Stochastic Processes, Statistical Inference, Applied Data Collection'),\r\n"
				+ " ('Cable-Suspended Roofs, Second Edition','Prem Krishna', 299, 1, 'Religion and Globalization: Continuities and Transformations'),\r\n"
				+ "	('CAM Design Handbook','Harold A. Rothbart', 79, 29, 'Hinduism in South Asia and the Diaspora'),\r\n"
				+ " ('Biomedical Engineering and Design Handbook  Volume 2', 'Myer Kutz', 99, 32, 'Introduction to Data Science, Topics in American Prose'),\r\n"
				+ " ('The Three Languages of Politics : Talking Across The Political','Kling Arnold S', 75, 11, 'Methods in Psychological Science'),\r\n"
				+ " ('Topics in Partial Differential Equations','Gupta Parmanand', 199, 2, 'Introduction to Physiological Psychology'),\r\n"
				+ "	('Capacitors, R. P. Deshpande','Sukh Grewal', 59, 19, 'Organic Chemistry I, Organic Chemistry  II')";

		String query2 = "INSERT INTO oakville (title, author, price, inventory, courseList) VALUES "

				+ "('Alternative Energy Systems in Building Design','Peter Gevorkia', 260, 14, 'Introductory Chemistry II: Reactions, Organic Chemistry I'),\r\n"
				+ "	('Alternative Sewer Systems FD-12, Second Edition','Water Environment Federation', 250, 13, 'Introduction to Inorganic Chemistry, Organic Chemistry II'),\r\n"
				+ "	('Alternative Water Sources and Wastewater Management','Bob Boulware', 240, 12, 'Organic Chemistry I and II, Environmental Chemistry'),\r\n"
				+ "	('ALUMINIUM ROLLING: Processes, Principles & Applications','R. V. Singh', 230, 11, 'Introduction to Biochemistry, Analytical Instrumentation'),\r\n"
				+ "	('Analog Filter and Circuit Design Handbook','Arthur B. Williams', 220, 10, 'Intermediate Physical Chemistry'),\r\n"
				+ "	('Antenna Engineering Handbook, Fifth Edition','John L. Volakis', 210, 9, 'World Cinema'),\r\n"
				+ "	('Antennas for Base Stations in Wireless Communications','Zhi Ning Chen', 199, 8, 'Rap Poetics, Studies in Major Victorian Writers'),\r\n"
				+ "	('Applied Biofluid Mechanics, Second Edition','Lee Waite', 149, 7, 'Topics in Classical Myth and Literature, Film Theory'),\r\n"
				+ "	('Applied Cell and Molecular Biology for Engineers','Gabi Nindle Waite', 189, 6, 'Topics in Contemporary Literary Theory, Rap Poetics'),\r\n"
				+ " ('Applied Fluid Mechanics for Engineers','Meinhard T. Schobeiri', 179, 5, 'Topics in Early Modern English Literature and Culture'),\r\n"
				+ "	('Carrier-Grade VoIP',' Third EditionRichard Swale', 49, 25, 'Directed Research, Bio-Organic Chemistry, Quantum Chemistry'),\r\n"
				+ "	('Cinematosophical Introduction to the Theory of Archaeology','Dzbynski Aleksander', 200, 10, 'Thesis in Psychology, Psychology of Gambling'),\r\n"
				+ "	('Reason, Causation and Compatibility with Phenomena','Evangelidis Basil', 45, 2, 'Functional Magnetic Resonance Imaging Laboratory'),\r\n"
				+ "	('Your New Feeling Is the Artifact of a Bygone Era','Bennett Chad', 100, 5, 'Current Topics in Visual Recognition, ‘Current Topics in Perception'),\r\n"
				+ "	('The Internationalisation of Polish Industries','Mroczek-Dąbrowska Katarzyna', 150, 7, 'Socialization Processes'),\r\n"
				+ "	('The Body of Work : John Rechy’s Sensual Poetics','Bucher Michael',189, 1, 'Psychology of Gender, Social Neuroscience'),\r\n"
				+ "	('Sensational Things : Souvenirs, Keepsakes, and Mementos','Fazli Sabina', 60, 9, 'Current Topics in Developmental Psychology'),\r\n"
				+ "	('Geeky Pedagogy : A Guide for Intellectuals, Introverts, and Nerds','Neuhaus Jessamyn', 59, 2, 'Critical Analysis in Social Psychology, Psychology of Morality'),\r\n"
				+ "	('Divided Highways : Road Narrative and Nationhood in Canada','Macfarlane Heather', 129, 4, 'Psychology of Morality, Social Psychology of the Self'),\r\n"
				+ "	('Topics in Leplace and Foutrier Transforms','Gupta Parmanand', 229, 1, 'Introduction to Clinical, Developmental, Social Psychology'),\r\n"
				+ " ('Antena Sewer Mechanics','Ramandeep Khokhar',60,19,'History of Choclate, Types of Choclate'),\r\n"
				+ " ('Applied Machine Learning', 'M. Gopal', 249, 5, 'Fake Friends and Artificial Intelligence:the Human-Robot Relationship'),\r\n"
				+ "	('Architectural Engineering Design: Mechanical Systems', 'Robert Brown Butler', 169, 4, 'Statistics and Finance I, Analysis of Big Data, Statistics Project'),\r\n"
				+ "	('Arduino and Raspberry Pi Sensor Projects for the Evil Genius', 'Robert Chin', 159, 3, 'Regression Analysis, Probability Models'),\r\n"
				+ " ('Biomedical Engineering and Design Handbook  Volume 2', 'Myer Kutz', 99, 32, 'Introduction to Data Science, Topics in American Prose'),\r\n"
				+ "	('Arduino Robot Bonanza', 'Gordon McComb', 199, 29, 'Stochastic Processes, Statistical Inference, Applied Data Collection'),\r\n"
				+ " ('Cable-Suspended Roofs, Second Edition','Prem Krishna', 299, 1, 'Religion and Globalization: Continuities and Transformations'),\r\n"
				+ " ('Arduino Robot Bonanza', 'Gordon McComb', 199, 29, 'Stochastic Processes, Statistical Inference, Applied Data Collection'),\r\n"
				+ "	('CAM Design Handbook','Harold A. Rothbart', 79, 29, 'Hinduism in South Asia and the Diaspora'),\r\n"
				+ " ('The Three Languages of Politics:Talking Across The Political Divides','Kling Arnold S', 75, 11, 'Methods in Psychological Science'),\r\n"
				+ " ('Topics in Partial Differential Equations','Gupta Parmanand', 199, 2, 'Introduction to Physiological Psychology'),\r\n"
				+ " ('Food Fights:How History Matters to Contemporary Food Debates','Ludington Charles', 155, 11, 'Infancy, The Psychology of Emotion, Adulthood and Aging')";

		jdbc.update(query, new HashMap());
		jdbc.update(query1, new HashMap());
		jdbc.update(query2, new HashMap());

	}

	// ***************************VIEW BOOKS**********************************

	// VIEW(GET) BOOKS from BRAMPTON store
	public ArrayList<BramptonBook> viewBrampton() {
		String q = "SELECT * FROM brampton";
		ArrayList<BramptonBook> bbooks = (ArrayList<BramptonBook>) jdbc.query(q,
				new BeanPropertyRowMapper<BramptonBook>(BramptonBook.class));
		return bbooks;
	}

	// VIEW(GET) BOOKS from MISSISSAUGA store
	public ArrayList<MississaugaBook> viewMississauga() {
		String q1 = "SELECT * FROM mississauga";
		ArrayList<MississaugaBook> booksm = (ArrayList<MississaugaBook>) jdbc.query(q1,
				new BeanPropertyRowMapper<MississaugaBook>(MississaugaBook.class));
		return booksm;
	}

	// VIEW(GET) BOOKS from OAKVILLE store
	public ArrayList<OakvilleBook> viewOakville() {
		String q2 = "SELECT * FROM oakville";
		ArrayList<OakvilleBook> bookso = (ArrayList<OakvilleBook>) jdbc.query(q2,
				new BeanPropertyRowMapper<OakvilleBook>(OakvilleBook.class));
		return bookso;
	}

	// *****************GET BOOKS BY ID***************************************

	// GET BOOK BY ID from BRAMPTON STORE
	public BramptonBook getBookByIdBrampton(int id) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "SELECT * FROM brampton where id=:id";
		parameters.addValue("id", id);
		ArrayList<BramptonBook> books = (ArrayList<BramptonBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<BramptonBook>(BramptonBook.class));

		if (books.size() > 0)
			return books.get(0);
		else
			return null;
	}

	// GET BOOK BY ID from MISSISSAUGA STORE
	public MississaugaBook getBookByIdMississauga(int id) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "SELECT * FROM mississauga where id=:id";
		parameters.addValue("id", id);
		ArrayList<MississaugaBook> books = (ArrayList<MississaugaBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<MississaugaBook>(MississaugaBook.class));

		if (books.size() > 0)
			return books.get(0);
		else
			return null;
	}

	// GET BOOK BY ID from OAKVILLE STORE
	public OakvilleBook getBookByIdOakville(int id) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "SELECT * FROM oakville where id=:id";
		parameters.addValue("id", id);
		ArrayList<OakvilleBook> books = (ArrayList<OakvilleBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<OakvilleBook>(OakvilleBook.class));

		if (books.size() > 0)
			return books.get(0);
		else
			return null;
	}

	// *****************************EDIT BOOKS*************************************

	// EDIT BRAMPTON BOOKS
	public void editBramptonBook(BramptonBook bramptonBook) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();

		ArrayList<String> list = new ArrayList<String>();
		list.addAll(bramptonBook.getCourseList());
		// convert ArrayList to one String
		String string = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.size() != 0) {
				string += list.get(i) + ",";
			} else {
				string += list.get(i);
			}
		}
		String q = "UPDATE brampton SET title =:title WHERE id=:id";
		String q1 = "UPDATE brampton SET author =:author WHERE id=:id";
		String q2 = "UPDATE brampton SET price =:price WHERE id=:id";
		String q3 = "UPDATE brampton SET inventory =:inventory WHERE id=:id";
		String q4 = "UPDATE brampton SET courseList =:courseList WHERE id=:id";

		parameters.addValue("id", bramptonBook.getId());
		parameters.addValue("title", bramptonBook.getTitle());
		parameters.addValue("author", bramptonBook.getAuthor());
		parameters.addValue("price", bramptonBook.getPrice());
		parameters.addValue("inventory", bramptonBook.getInventory());
		parameters.addValue("courseList", string);

		jdbc.update(q, parameters);
		jdbc.update(q1, parameters);
		jdbc.update(q2, parameters);
		jdbc.update(q3, parameters);
		jdbc.update(q4, parameters);
	}

	// EDIT Mississuaga BOOKS
	public void editMississaugaBook(MississaugaBook mississaugaBook) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();

		ArrayList<String> list = new ArrayList<String>();
		list.addAll(mississaugaBook.getCourseList());
		// convert ArrayList to one String
		String string = "";
		for (int i = 0; i < list.size(); i++) {
			string += list.get(i) + ",";
		}

		String q = "UPDATE mississauga SET title =:title WHERE id=:id";
		String q1 = "UPDATE mississauga SET author =:author WHERE id=:id";
		String q2 = "UPDATE mississauga SET price =:price WHERE id=:id";
		String q3 = "UPDATE mississauga SET inventory =:inventory WHERE id=:id";
		String q4 = "UPDATE mississauga SET courseList =:courseList WHERE id=:id";

		parameters.addValue("id", mississaugaBook.getId());
		parameters.addValue("title", mississaugaBook.getTitle());
		parameters.addValue("author", mississaugaBook.getAuthor());
		parameters.addValue("price", mississaugaBook.getPrice());
		parameters.addValue("inventory", mississaugaBook.getInventory());
		parameters.addValue("courseList", string);

		jdbc.update(q, parameters);
		jdbc.update(q1, parameters);
		jdbc.update(q2, parameters);
		jdbc.update(q3, parameters);
		jdbc.update(q4, parameters);
	}

	// EDIT Oakville BOOKS
	public void editOakvilleBook(OakvilleBook oakvilleBook) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();

		ArrayList<String> list = new ArrayList<String>();
		list.addAll(oakvilleBook.getCourseList());
		// convert ArrayList to one String
		String string = "";
		for (int i = 0; i < list.size(); i++) {
			string += list.get(i) + ",";
		}

		String q = "UPDATE oakville SET title =:title WHERE id=:id";
		String q1 = "UPDATE oakville SET author =:author WHERE id=:id";
		String q2 = "UPDATE oakville SET price =:price WHERE id=:id";
		String q3 = "UPDATE oakville SET inventory =:inventory WHERE id=:id";
		String q4 = "UPDATE oakville SET courseList =:courseList WHERE id=:id";

		parameters.addValue("id", oakvilleBook.getId());
		parameters.addValue("title", oakvilleBook.getTitle());
		parameters.addValue("author", oakvilleBook.getAuthor());
		parameters.addValue("price", oakvilleBook.getPrice());
		parameters.addValue("inventory", oakvilleBook.getInventory());
		parameters.addValue("courseList", string);

		jdbc.update(q, parameters);
		jdbc.update(q1, parameters);
		jdbc.update(q2, parameters);
		jdbc.update(q3, parameters);
		jdbc.update(q4, parameters);
	}

	// *****************************DELETE BOOKS*******************************

	// DELETE BOOK FROM BRAMPTON STORE
	public void deleteBookByIdB(int id) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "DELETE from brampton WHERE id=:id";
		parameters.addValue("id", id);
		jdbc.update(q, parameters);
	}

	// DELETE BOOK FROM MISSISSAUGA STORE
	public void deleteBookByIdM(int id) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "DELETE from mississauga WHERE id=:id";
		parameters.addValue("id", id);
		jdbc.update(q, parameters);
	}

	// DELETE BOOK FROM OAKVILLE STORE
	public void deleteBookByIdO(int id) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "DELETE from oakville WHERE id=:id";
		parameters.addValue("id", id);
		jdbc.update(q, parameters);
	}

	// *************************SEARCH BOOKS BY AUTHOR*******************************

	// search with author IN BRAMPTON STORE
	public ArrayList<BramptonBook> getBookByauthorB(String auhtor) {
		String string = auhtor;
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "SELECT * FROM brampton where author LIKE '%" + string + "%'";
		parameters.addValue("author", auhtor);
		ArrayList<BramptonBook> books = (ArrayList<BramptonBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<BramptonBook>(BramptonBook.class));
		return books;
	}

	// search with author IN MISSISSAUGA STORE
	public ArrayList<MississaugaBook> getBookByauthorM(String auhtor) {
		String string = auhtor;
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "SELECT * FROM mississauga where author LIKE '%" + string + "%'";
		parameters.addValue("author", auhtor);
		ArrayList<MississaugaBook> books = (ArrayList<MississaugaBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<MississaugaBook>(MississaugaBook.class));
		return books;
	}

	// search with author IN Oakville STORE
	public ArrayList<OakvilleBook> getBookByauthorO(String auhtor) {
		String string = auhtor;
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "SELECT * FROM oakville where author LIKE '%" + string + "%'";
		parameters.addValue("author", auhtor);
		ArrayList<OakvilleBook> books = (ArrayList<OakvilleBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<OakvilleBook>(OakvilleBook.class));
		return books;
	}

	// *************************SEARCH BOOKS BY TITLE*******************************

	// search with author IN BRAMPTON STORE
	public ArrayList<BramptonBook> getBookByTitleB(String title) {
		String string = title;
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "SELECT * FROM brampton where title LIKE '%" + string + "%'";
		parameters.addValue("title", title);
		ArrayList<BramptonBook> books = (ArrayList<BramptonBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<BramptonBook>(BramptonBook.class));
		return books;
	}

	// search with author IN MISSISSAUGA STORE
	public ArrayList<MississaugaBook> getBookByTitleM(String title) {
		String string = title;
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "SELECT * FROM mississauga where title LIKE '%" + string + "%'";
		parameters.addValue("title", title);
		ArrayList<MississaugaBook> books = (ArrayList<MississaugaBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<MississaugaBook>(MississaugaBook.class));
		return books;
	}

	// search with author IN Oakville STORE
	public ArrayList<OakvilleBook> getBookByTitleO(String title) {
		String string = title;
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "SELECT * FROM oakville where title LIKE '%" + string + "%'";
		parameters.addValue("title", title);
		ArrayList<OakvilleBook> books = (ArrayList<OakvilleBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<OakvilleBook>(OakvilleBook.class));
		return books;
	}

	// *************************SEARCH BOOKS BY QUANTITY RANGE*******************************

	// search with quantity IN BRAMPTON STORE
	public ArrayList<BramptonBook> getBookByQuantityB(int inventory1, int inventory2) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();

		String q = "SELECT * FROM brampton  where inventory > :inventory1 and inventory < :inventory2";
		BramptonBook bramptonBook = new BramptonBook();
		parameters.addValue("inventory1", inventory1 - 1);
		parameters.addValue("inventory2", inventory2 + 1);
		// ResultSet result = da.executeQuery(q);
		ArrayList<BramptonBook> books = (ArrayList<BramptonBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<BramptonBook>(BramptonBook.class));
		return books;
	}

	// search with quantity IN MISSISSAUGA STORE
	public ArrayList<MississaugaBook> getBookByQuantityM(int inventory1, int inventory2) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();

		String q = "SELECT * FROM mississauga where  inventory > :inventory1  and  inventory < :inventory2";
		parameters.addValue("inventory1", inventory1 - 1);
		parameters.addValue("inventory2", inventory2 + 1);
		ArrayList<MississaugaBook> books = (ArrayList<MississaugaBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<MississaugaBook>(MississaugaBook.class));
		return books;
	}

	// search with quantity IN OAKVILLE STORE
	public ArrayList<OakvilleBook> getBookByQuantityO(int inventory1, int inventory2) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();

		String q = "SELECT * FROM oakville where  inventory > :inventory1  and  inventory < :inventory2";
		parameters.addValue("inventory1", inventory1 - 1);
		parameters.addValue("inventory2", inventory2 + 1);
		ArrayList<OakvilleBook> books = (ArrayList<OakvilleBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<OakvilleBook>(OakvilleBook.class));
		return books;
	}

	// *************************SEARCH BOOKS BY COURSES*******************************

	// search with courseList IN BRAMPTON STORE
	public ArrayList<BramptonBook> getBookByCourseB(String courseList) {

		String bramString = "";
		bramString = courseList;
		MapSqlParameterSource parameters = new MapSqlParameterSource();

		String q = "SELECT * FROM brampton where courseList LIKE '%" + bramString + "%'";
		parameters.addValue("courseList", bramString);

		ArrayList<BramptonBook> books = (ArrayList<BramptonBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<BramptonBook>(BramptonBook.class));
		return books;
	}

	// search with courseList IN MISSISSAUGA STORE
	public ArrayList<MississaugaBook> getBookByCourseM(String courseList) {
		String misString = "";
		misString = courseList;
		MapSqlParameterSource parameters = new MapSqlParameterSource();

		String q = "SELECT * FROM mississauga where  courseList LIKE '%" + misString + "%'";
		parameters.addValue("courseList", misString);

		ArrayList<MississaugaBook> books = (ArrayList<MississaugaBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<MississaugaBook>(MississaugaBook.class));
		return books;
	}

	// search with courseList IN OAKVILLE STORE
	public ArrayList<OakvilleBook> getBookByCourseO(String courseList) {
		String oakvilleString = "";
		oakvilleString = courseList;
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "SELECT * FROM oakville WHERE courseList LIKE '%" + oakvilleString + "%'";

		parameters.addValue("courseList", oakvilleString);

		ArrayList<OakvilleBook> books = (ArrayList<OakvilleBook>) jdbc.query(q, parameters,
				new BeanPropertyRowMapper<OakvilleBook>(OakvilleBook.class));

		return books;
	}

	// ****************************PURCHASE BOOKS**************************

	public void purchaseBramptonBook(BramptonBook bramptonBook) {

		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "Update brampton SET inventory = :inventory where id=:id";
		parameters.addValue("id", bramptonBook.getId());
		if (bramptonBook.getInventory() != 0) {
			bramptonBook.setInventory(bramptonBook.getInventory() - 1);
		}
		parameters.addValue("inventory", bramptonBook.getInventory());
		jdbc.update(q, parameters);
	}

	public void purchaseMississaugaBook(MississaugaBook mississaugaBook) {

		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "Update mississauga SET inventory = :inventory where id=:id";
		parameters.addValue("id", mississaugaBook.getId());
		if (mississaugaBook.getInventory() != 0){
			mississaugaBook.setInventory(mississaugaBook.getInventory() - 1);
		}
		parameters.addValue("inventory", mississaugaBook.getInventory());
		jdbc.update(q, parameters);
	}

	public void purchaseOakvilleBook(OakvilleBook oakvilleBook) {

		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String q = "Update oakville SET inventory = :inventory where id=:id";
		parameters.addValue("id", oakvilleBook.getId());
		if (oakvilleBook.getInventory() != 0) {
			oakvilleBook.setInventory(oakvilleBook.getInventory() - 1);
		}
		parameters.addValue("inventory", oakvilleBook.getInventory());
		jdbc.update(q, parameters);
	}
}