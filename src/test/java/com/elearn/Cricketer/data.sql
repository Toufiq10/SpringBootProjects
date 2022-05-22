CREATE TABLE BATSMEN (
 name varchar(50),
 matches varchar(50),
 runs varchar(50),
 average varchar(50),
 best varchar(50)
);

INSERT INTO BATSMEN(name, matches, runs, average, best) values('Sachin', '200','18398','48.9','241');


CREATE TABLE ALLROUNDER (
 name varchar2(50),
 matches varchar2(50),
 runs varchar2(50),
 wickets varchar2(50),
 best varchar2(50)
);

INSERT INTO ALLROUNDER(name, matches, runs, wickets, best) values('Sachin', '200','18398','218','5 for 28');

CREATE TABLE BOWLERS (
 name varchar2(50),
 wickets varchar2(50),
 average varchar2(50),
 best varchar2(50),
 matches varchar2(50)
);

INSERT INTO BOWLERs(name, wickets, average, best, matches) values('Sachin', '218','26.76','5 for 28','200');
