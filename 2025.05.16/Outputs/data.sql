INSERT INTO DEPARTMENT VALUES (145,'1995-01-25','Software Engineering');
INSERT INTO DEPARTMENT VALUES (175,'1998-06-02','Qulity Testing');
INSERT INTO DEPARTMENT VALUES (201,'2000-08-15','Human Resource Management');

 select * From Department;
+---------+-------------+---------------------------+
| dept_id | established | name                      |
+---------+-------------+---------------------------+
|     145 | 1995-01-25  | Software Engineering      |
|     175 | 1998-06-02  | Qulity Testing            |
|     201 | 2000-08-15  | Human Resource Management |
+---------+-------------+---------------------------+
3 rows in set (0.001 sec)

/** After Add **/
MariaDB [employee]> select * From Department;
+---------+-------------+---------------------------+
| dept_id | established | name                      |
+---------+-------------+---------------------------+
|      12 | 2011-08-15  | DevOps                    |
|     145 | 1995-01-25  | Software Engineering      |
|     175 | 1998-06-02  | Qulity Testing            |
|     201 | 2000-08-15  | Human Resource Management |
+---------+-------------+---------------------------+
4 rows in set (0.001 sec)

/** After Update **/
 select * From Department;
+---------+-------------+-------------------------------+
| dept_id | established | name                          |
+---------+-------------+-------------------------------+
|      12 | 2011-08-15  | DevOps and network management |
|     145 | 1995-01-25  | Software Engineering          |
|     175 | 1998-06-02  | Qulity Testing                |
|     201 | 2000-08-15  | Human Resource Management     |
+---------+-------------+-------------------------------+
4 rows in set (0.000 sec)

/** After Delete **/
select * From Department;
+---------+-------------+---------------------------+
| dept_id | established | name                      |
+---------+-------------+---------------------------+
|     145 | 1995-01-25  | Software Engineering      |
|     175 | 1998-06-02  | Qulity Testing            |
|     201 | 2000-08-15  | Human Resource Management |
+---------+-------------+---------------------------+
3 rows in set (0.001 sec)