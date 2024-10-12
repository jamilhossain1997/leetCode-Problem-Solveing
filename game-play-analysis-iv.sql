WITH cte AS ( 

    SELECT player_id,MIN(event_date) as first_login
    FROM Activity

    Group by player_id
)

SELECT ROUND (SUM(

    CASE 
    WHEN DATEDIFF(event_date,first_login)=1
    THEN 1
    ELSE 0

    END 
) /COUNT(DISTINCT player_id),2
) AS fraction

FROM Activity AS a

JOIN cte ON a.player_id = cte.player_id;