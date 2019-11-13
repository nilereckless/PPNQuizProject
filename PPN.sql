/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  theeradonjaroonchon
 * Created: Nov 11, 2019
 */

DROP TABLE STUDENTS;
DROP TABLE TEACHERS;
DROP TABLE SUBJECTS;


CREATE TABLE STUDENTS
(ID BIGINT NOT NULL,
FULLNAME VARCHAR(50) not null,
PASSWORD VARCHAR(25) not null,
SYEAR VARCHAR(25) not null,
DEPARTMENT VARCHAR(25) not null,
EMAIL VARCHAR(25),
PRIMARY KEY (ID));

CREATE TABLE TEACHERS
(ID BIGINT NOT NULL,
FULLNAME VARCHAR(50) not null,
PASSWORD VARCHAR(25) not null,
OWNER_SUBJECT VARCHAR(25) not null,
DEPARTMENT VARCHAR(25) not null,
EMAIL VARCHAR(25) not null,
PRIMARY KEY (ID));

CREATE TABLE SUBJECTS
(SUBJECT_ID VARCHAR(20) NOT NULL,
NAME VARCHAR(25) NOT NULL,
PRIMARY KEY (SUBJECT_ID));