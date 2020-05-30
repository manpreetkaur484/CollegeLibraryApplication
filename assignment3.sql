DROP DATABASE IF EXISTS assignment3;
CREATE DATABASE assignment3;
USE assignment3;
create table  brampton
(
  id        INT NOT NULL Primary Key AUTO_INCREMENT,
  title     VARCHAR(500),
  author    VARCHAR(200),
  price     VARCHAR(200),
 inventory  VARCHAR(200),
 courseList    VARCHAR(800)
) ;


create table mississauga
(
 id        INT NOT NULL Primary Key AUTO_INCREMENT,
  title     VARCHAR(500),
  author    VARCHAR(200),
  price     VARCHAR(200),
 inventory  VARCHAR(200),
 courseList    VARCHAR(800)
) ;


create table oakville
(
 id        INT NOT NULL Primary Key AUTO_INCREMENT,
  title     VARCHAR(500),
  author    VARCHAR(200),
  price     VARCHAR(200),
 inventory  VARCHAR(200),
 courseList    VARCHAR(800)
);
/*
INSERT INTO brampton(title, author, price, inventory, courses) VALUES 
	('3D IC Integration and Packaging', 'John H. Lau', 89, 5, 'Chemistry, City Studies'),
	('3D Printer Projects for Makerspaces', 'Lydia Sloan Cline',  199, 2, 'Classical Studies, Concurrent Teacher Education'),
	('Alternative Sewer Systems FD-12, Second Edition','Water Environment Federation', 250, 13, 'Introduction to Inorganic Chemistry, Organic Chemistry II'),
	('Alternative Water Sources and Wastewater Management','Bob Boulware', 240, 12, 'Organic Chemistry I and II, Environmental Chemistry'),
	('ALUMINIUM ROLLING: Processes, Principles & Applications','R. V. Singh', 230, 11, 'Introduction to Biochemistry, Analytical Instrumentation'),
	('Analog Filter and Circuit Design Handbook','Arthur B. Williams', 220, 10, 'Intermediate Physical Chemistry'),
    ('3D Printing and CNC Fabrication with SketchUp', 'Lydia Sloan Cline',  65, 2, 'Food Education, Curating Historical, ArtExhibiting Art'),
	('3D Printing with Autodesk 123D, Tinkercad, and MakerBot', 'Lydia Sloan Cline', 249, 1, 'Computer Science'),
	('15 Dangerously Mad Projects for the Evil Genius', 'Dr. Simon Monk',29, 15, 'English, Social Science, Biology'),
	('20 Makey Makey Projects for the Evil Genius, Colleen Graves', 'Aaron Graves', 159, 13, 'Diet Plan'),
	('30 Arduino Projects for the Evil Genius, Second Edition', 'Dr. Simon Monk',159, 30, 'History of Choclate'),
	('30 BeagleBone Black Projects for the Evil Genius', 'Christopher Rush',99, 45, 'History of Canada'),
	('2012 International Building Code Handbook, Douglas W. Thornburg, AIA', 'John R. Henry', 69, 25, 'Human Relations, Social Secience'),
    ('2015 International Building Code  Illustrated Handbook', 'John R. Henry', 49, 19, 'Human Resourses, Mechical Engineering, Foundations of City Studies'),
    ('Applied Machine Learning', 'M. Gopal', 249, 5, 'Fake Friends and Artificial Intelligence: the Human-Robot Relationship in Literature and Culture'),
	('Architectural Engineering Design: Mechanical Systems', 'Robert Brown Butler', 169, 4, 'Statistics and Finance I, Analysis of Big Data, Statistics Project'),
	('Arduino and Raspberry Pi Sensor Projects for the Evil Genius', 'Robert Chin', 159, 3, 'Regression Analysis, Probability Models'),
	('Arduino Robot Bonanza', 'Gordon McComb', 199, 29, 'Stochastic Processes, Statistical Inference, Applied Data Collection'),
	('Area Array Packaging Handbook: Manufacturing and Assembly', 'Ken Gilleo', 89, 16, 'Categorical Data Analysis, Data Collection'),
	('Biofilm Reactors - WEF MoP 35, The Water Environment Federation', 'Manpreet Grewal', 300, 5, 'Introduction to Applied Statistics'),
	('Biofuels Refining and Performance', 'Ahindra Nag', 79, 50, 'An Introduction to Statistics'),
	('Biomedical Applications of Light Scattering, Adam Wax', 'Vadim Backman', 145, 2, 'An Introduction to Probability'),
	('Eloquence Embodied : Nonverbal Communication Among French and Indigenous Peoples in the Americas','Carayon Céline', 55, 6, 'The Psychology of Emotion, Infancy'),
    ('Introduction to Security Consulting : A Lucrative Business Service','Blake William F', 88, 8, 'Judgment and Decision Making, Advanced Data Analysis in Psychology'),
    ('Biomedical Engineering and Design Handbook, Volume 1', 'Myer Kutz', 139, 55, 'Financial Derivatives,  Statistics II'),
    ('Cable-Suspended Roofs, Second Edition','Prem Krishna', 299, 1, 'Religion and Globalization: Continuities and Transformations'),
	('CAM Design Handbook','Harold A. Rothbart', 79, 29, 'Hinduism in South Asia and the Diaspora'),
    ('The Three Languages of Politics : Talking Across The Political Divides','Kling Arnold S', 75, 11, 'Methods in Psychological Science'),
    ('The Body of Work : John Rechy’s Sensual Poetics','Bucher Michael',189, 1, 'Psychology of Gender, Social Neuroscience'),
    ('Topics in Partial Differential Equations','Gupta Parmanand', 199, 2, 'Introduction to Physiological Psychology'),
    ('Arduino Robot Bonanza', 'Gordon McComb', 199, 29, 'Stochastic Processes, Statistical Inference, Applied Data Collection'),
	('Biomedical Engineering and Design Handbook  Volume 2', 'Myer Kutz', 99, 32, 'Introduction to Data Science, Topics in American Prose');


INSERT INTO mississauga(title, author, price, inventory, courses) VALUES
	('2018 International Building Code Illustrated Handbook','Douglas W. Thornburg',189, 18, 'Canadian Cities and Planning'),
	('Adhesion of Polymers, Roman A. Veselovsky','Vladimir Kestelman', 20, 40, 'Social Planning and Community Development'),
	('Advanced MEMS Packaging','John H. Lau', 8, 60, 'City Politics, Economy of Cities'),
    ('The Body of Work : John Rechy’s Sensual Poetics','Bucher Michael',189, 1, 'Psychology of Gender, Social Neuroscience'),
	('Aircraft Basic Science, Eighth Edition','Michael J. Kroes', 70, 35, 'Learning in Community Service, Real Estate and the City'),
	('Aircraft Electricity and Electronics, Seventh Edition','Thomas K. Eismin', 280, 20, 'Current Municipal and Planning Policy and Practice in Toronto'),
	('Aircraft Maintenance & Repair, Eighth Edition','Dr. Ronald Sterkenburg', 290, 19, 'Urban Social Policy, AirCraft Art'),
	('Alternative Sewer Systems FD-12, Second Edition','Water Environment Federation', 250, 13, 'Introduction to Inorganic Chemistry, Organic Chemistry II'),
	('Alternative Water Sources and Wastewater Management','Bob Boulware', 240, 12, 'Organic Chemistry I and II, Environmental Chemistry'),
	('ALUMINIUM ROLLING: Processes, Principles & Applications','R. V. Singh', 230, 11, 'Introduction to Biochemistry, Analytical Instrumentation'),
	('Analog Filter and Circuit Design Handbook','Arthur B. Williams', 220, 10, 'Intermediate Physical Chemistry'),
    ('Aircraft Materials and Analysis','Tariq Siddiqui',300, 18, ',Aircraft Diploma, Aircraft Basic Training'),
	('Aircraft Powerplants, Ninth Edition','Thomas W. Wild', 290, 17, 'Planning and Governing the Metropolis'),
	('Airport Ground Navigation Systems','Dr. Arjun Singh', 280, 16, 'Civic Engagement in Urban Politics, '),
	('Alternative Energy DeMYSTiFieD, Second Edition','Stan Gibilisco', 270, 15, 'Chemistry I: Structure and Bonding, Chemistry 1, Organic Chemistry I'),
    ('Bioreactors: Analysis and Design','Professor Tapobrata Panda', 29, 29, 'Topics in American Poetry, Topics in Canadian Literature'),
	('Biosolids Engineering','Michael J. McFarland', 179, 29, 'Literature, Politics, Revolution, Studies in Popular Genres'),
	('Biosystems Engineering','Ahindra Nag', 169, 24, 'Cinema: The Auteur Theory, Engeneering, Seminar in Religion'),
	('Bringing Out the Best in People','Aubrey C. Daniels', 159, 23, 'Supervised Readings in the Study of Religion'),
	('Budgeting for Managers','Sid Kemp', 149, 22, 'Studies in Major Canadian Writers'),
	('Building Design for Wind Forces','Rima Taher', 59, 21, 'Selected Topics in the Study of Religion II'),
	('Buried Pipe Design, Third Edition','A. P. Moser', 249, 17, 'Techniques in Analytical Chemistry'),
	('Applied Machine Learning', 'M. Gopal', 249, 5, 'Fake Friends and Artificial Intelligence: the Human-Robot Relationship in Literature and Culture'),
	('Architectural Engineering Design: Mechanical Systems', 'Robert Brown Butler', 169, 4, 'Statistics and Finance I, Analysis of Big Data, Statistics Project'),
	('Arduino and Raspberry Pi Sensor Projects for the Evil Genius', 'Robert Chin', 159, 3, 'Regression Analysis, Probability Models'),
	('Arduino Robot Bonanza', 'Gordon McComb', 199, 29, 'Stochastic Processes, Statistical Inference, Applied Data Collection'),
    ('Cable-Suspended Roofs, Second Edition','Prem Krishna', 299, 1, 'Religion and Globalization: Continuities and Transformations'),
	('CAM Design Handbook','Harold A. Rothbart', 79, 29, 'Hinduism in South Asia and the Diaspora'),
    ('Biomedical Engineering and Design Handbook  Volume 2', 'Myer Kutz', 99, 32, 'Introduction to Data Science, Topics in American Prose'),
    ('The Three Languages of Politics : Talking Across The Political Divides','Kling Arnold S', 75, 11, 'Methods in Psychological Science'),
    ('Topics in Partial Differential Equations','Gupta Parmanand', 199, 2, 'Introduction to Physiological Psychology'),
	('Capacitors, R. P. Deshpande','Sukh Grewal', 59, 19, 'Organic Chemistry I, Organic Chemistry  II');

INSERT INTO oakville (title, author, price, inventory, courses) VALUES
	('Alternative Energy Systems in Building Design','Peter Gevorkia', 260, 14, 'Introductory Chemistry II: Reactions and Mechanisms, Organic Chemistry I'),
	('Alternative Sewer Systems FD-12, Second Edition','Water Environment Federation', 250, 13, 'Introduction to Inorganic Chemistry, Organic Chemistry II'),
	('Alternative Water Sources and Wastewater Management','Bob Boulware', 240, 12, 'Organic Chemistry I and II, Environmental Chemistry'),
	('ALUMINIUM ROLLING: Processes, Principles & Applications','R. V. Singh', 230, 11, 'Introduction to Biochemistry, Analytical Instrumentation'),
	('Analog Filter and Circuit Design Handbook','Arthur B. Williams', 220, 10, 'Intermediate Physical Chemistry'),
	('Antenna Engineering Handbook, Fifth Edition','John L. Volakis', 210, 9, 'World Cinema'),
	('Antennas for Base Stations in Wireless Communications','Zhi Ning Chen', 199, 8, 'Rap Poetics, Studies in Major Victorian Writers'),
	('Applied Biofluid Mechanics, Second Edition','Lee Waite', 149, 7, 'Topics in Classical Myth and Literature, Film Theory'),
	('Applied Cell and Molecular Biology for Engineers','Gabi Nindle Waite', 189, 6, 'Topics in Contemporary Literary Theory, Rap Poetics'),
    ('Applied Fluid Mechanics for Engineers','Meinhard T. Schobeiri', 179, 5, 'Topics in Early Modern English Literature and Culture'),
	('Carrier-Grade VoIP',' Third EditionRichard Swale', 49, 25, 'Directed Research, Bio-Organic Chemistry, Quantum Chemistry'),
	('Cinematosophical Introduction to the Theory of Archaeology','Dzbynski Aleksander', 200, 10, 'Thesis in Psychology, Psychology of Gambling'),
	('Reason, Causation and Compatibility with Phenomena','Evangelidis Basil', 45, 2, 'Functional Magnetic Resonance Imaging Laboratory'),
	('Your New Feeling Is the Artifact of a Bygone Era','Bennett Chad', 100, 5, 'Current Topics in Visual Recognition, ‘Current Topics in Perception'),
	('The Internationalisation of Polish Industries in the Context of the New Institutional Economics','Mroczek-Dąbrowska Katarzyna', 150, 7, 'Socialization Processes'),
	('The Body of Work : John Rechy’s Sensual Poetics','Bucher Michael',189, 1, 'Psychology of Gender, Social Neuroscience'),
	('Sensational Things : Souvenirs, Keepsakes, and Mementos in Wilkie Collins’s Fiction','Fazli Sabina', 60, 9, 'Current Topics in Developmental Psychology, Perceptual and Motor Development'),
	('Geeky Pedagogy : A Guide for Intellectuals, Introverts, and Nerds Who Want to Be Effective Teachers','Neuhaus Jessamyn', 59, 2, 'Critical Analysis in Social Psychology, Psychology of Morality, Social Neuroscience'),
	('Divided Highways : Road Narrative and Nationhood in Canada','Macfarlane Heather', 129, 4, 'Psychology of Morality, Social Psychology of the Self'),
	('Topics in Leplace and Foutrier Transforms','Gupta Parmanand', 229, 1, 'Introduction to Clinical, Developmental, Personality and Social Psychology'),
    ('Antena Sewer Mechanics','Ramandeep Khokhar',60,19,'History of Choclate, Types of Choclate'),
   ('Applied Machine Learning', 'M. Gopal', 249, 5, 'Fake Friends and Artificial Intelligence: the Human-Robot Relationship in Literature and Culture'),
	('Architectural Engineering Design: Mechanical Systems', 'Robert Brown Butler', 169, 4, 'Statistics and Finance I, Analysis of Big Data, Statistics Project'),
	('Arduino and Raspberry Pi Sensor Projects for the Evil Genius', 'Robert Chin', 159, 3, 'Regression Analysis, Probability Models'),
    ('Biomedical Engineering and Design Handbook  Volume 2', 'Myer Kutz', 99, 32, 'Introduction to Data Science, Topics in American Prose'),
	('Arduino Robot Bonanza', 'Gordon McComb', 199, 29, 'Stochastic Processes, Statistical Inference, Applied Data Collection'),
    ('Cable-Suspended Roofs, Second Edition','Prem Krishna', 299, 1, 'Religion and Globalization: Continuities and Transformations'),
    ('Arduino Robot Bonanza', 'Gordon McComb', 199, 29, 'Stochastic Processes, Statistical Inference, Applied Data Collection'),
	('CAM Design Handbook','Harold A. Rothbart', 79, 29, 'Hinduism in South Asia and the Diaspora'),
    ('The Three Languages of Politics : Talking Across The Political Divides','Kling Arnold S', 75, 11, 'Methods in Psychological Science'),
    ('Topics in Partial Differential Equations','Gupta Parmanand', 199, 2, 'Introduction to Physiological Psychology'),
   ('Food Fights : How History Matters to Contemporary Food Debates','Ludington Charles', 155, 11, 'Infancy, The Psychology of Emotion, Adulthood and Aging');
   */
