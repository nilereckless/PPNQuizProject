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
	(ID, FNAME, LNAME, PASSWORD, DEPARTMENT)
VALUES 
	(61130500054, 'THEERADON', 'JAROONCHON', '111', 'IT'),
	(61130500057, 'NAPHAN', 'KONGKAI', '222', 'CS');

--TEST LOGIN TEACHERS
INSERT INTO TEACHERS
	(ID, FNAME, LNAME, PASSWORD, OWNER_SUBJECT, FACULTY)
VALUES 
	(1505, 'PICHET', 'LIMVACHIRANAN', '1122', 'WEB PROGRAMMING', 'IT'),
        (1506, 'UMAPORN', 'SUPASITTIMETHEE', '2233', 'COM PROGRAMMING', 'IT');

--TEST SUBJECTS
INSERT INTO SUBJECTS
	(SUBJECT_ID, NAME)
VALUES 
	('INT303', 'WEB PROGRAMMING'),
        ('INT105', 'COM PROGRAMMING');