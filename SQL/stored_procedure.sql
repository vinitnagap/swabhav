DELIMITER //
CREATE PROCEDURE salary_increment() 
BEGIN
	update emp SET emp.SAL = emp.SAL*110/100 WHERE deptno = 10;
END //

DELIMITER ;
