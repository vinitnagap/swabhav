DELIMITER //
CREATE PROCEDURE increment_salary()
BEGIN 
UPDATE emp AS emp1,(SELECT deptno FROM emp WHERE ename = 'Smith') AS emp2
SET emp1.sal = sal * 110/100 WHERE emp1.deptno = emp2.deptno;
END //
DELIMITER;