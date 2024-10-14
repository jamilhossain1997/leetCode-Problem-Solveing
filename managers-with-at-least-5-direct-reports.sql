SELECT name 
FROM Employee 
WHERE id IN(
    SELECT managerId
    FROM Employee
    GROUP BY managerId 
    HAVING Count(id)>=5;
) 
