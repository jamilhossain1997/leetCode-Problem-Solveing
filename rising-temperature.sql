SELECT w1.id,
From Weather w1
JOIN Weather w2 ON 
DATEDIFF(w1.recordDate,w2.recordDate) =1
where w1.temperature > w2.temperature;