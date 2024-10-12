WITH cte AS (
    SELECT player_id, MIN(event_date) AS first_login
    FROM Activity
    GROUP BY player_id
)

SELECT ROUND(SUM(CASE 
                    WHEN DATEDIFF(a.event_date, cte.first_login) = 1 
                    THEN 1 
                    ELSE 0 
                 END) / COUNT(DISTINCT a.player_id), 2) AS fraction
FROM Activity AS a
JOIN cte ON a.player_id = cte.player_id;
