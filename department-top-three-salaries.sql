WITH RankSerial AS  (
    SELECT e.name AS Employee ,
    e.salary ,
    d.name AS Department 
    DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.Salary DESC) AS `Rank`
    FROM 
        Employee e
    JOIN 
        Department d ON e.DepartmentId = d.Id
)


SELECT Employee,
salary,
Department 
From 
RankSerial WHERE `Rank` <= 3;