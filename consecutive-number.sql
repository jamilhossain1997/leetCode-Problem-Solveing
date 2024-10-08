Select l1.num AS ConsecutiveNums from
Logs l1,Logs l2,Logs l3 
WHERE 
l1.num=l2.num
AND l1.id=l2.id-1
AND l2.id=l3.id-1;



-- 2nd type  this Acept and working


WITH ConsecutiveNums AS(
    SELECT num,
    LAG(num,1) OVER (ORDER by id) AS pre_num,
    LAG(num,2) OVER (ORDER by id ) AS pre_num2
    FROM Logs
)

SELECT DISTINCT num AS ConsecutiveNums
FROM ConsecutiveNums
WHERE num=pre_num AND num=pre_num2;