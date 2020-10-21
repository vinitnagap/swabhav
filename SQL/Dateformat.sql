DELIMITER $$

CREATE FUNCTION changeformat(inputdate DATE) RETURNS VARCHAR(20) DETERMINISTIC
BEGIN 
RETURN DATE_FORMAT(inputdate,"%d %M %y");
END

$$
DELIMITER;