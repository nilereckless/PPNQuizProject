/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  theeradonjaroonchon
 * Created: Nov 11, 2019
 */
--TEST LOGIN STUDENTS
INSERT INTO STUDENTS
	(ID, FULLNAME, PASSWORD, SYEAR,  DEPARTMENT, EMAIL)
VALUES 
	(61130500054, 'THEERADON JAROONCHON', '111', '2', 'Information Technology', 'threeradon1942@gmail.com'),
	(61130500057, 'NAPHAN KONGKAI', '222', '3', 'Computer Science' ,'ppnquiz@gmail.com');

--TEST LOGIN TEACHERS
INSERT INTO TEACHERS
	(ID, FULLNAME, PASSWORD, OWNER_SUBJECT, DEPARTMENT, EMAIL)
VALUES 
	(1505, 'PICHET LIMVACHIRANAN', '1122', 'WEB PROGRAMMING', 'Information Technology','pichet@sit.gmail.com'),
        (1506, 'UMAPORN SUPASITTIMETHEE', '2233', 'COM PROGRAMMING', 'Computer Science', 'umaporn@sit.gmail.com');

--TEST SUBJECTS
INSERT INTO SUBJECTS
	(SUBJECT_ID, NAME, T_ID, DETAILS)
VALUES 
	('INT303', 'WEB PROGRAMMING', '1505', 'THIS WEB PROGRAMMING QUIZ'),
        ('INT105', 'COM PROGRAMMING', '1506', 'THIS COM PROGRAMMING QUIZ');