CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  DECLARE offset INT;

  -- Return NULL if N is less than or equal to 0 (invalid N)
  IF N <= 0 THEN
    RETURN NULL;
  END IF;

  -- Set offset for LIMIT
  SET offset = N - 1;

  -- Return the Nth highest salary or NULL if it doesn't exist
  RETURN (
      SELECT IFNULL((
          SELECT DISTINCT salary
          FROM Employee
          ORDER BY salary DESC
          LIMIT offset, 1
      ), NULL)
  );
END;
