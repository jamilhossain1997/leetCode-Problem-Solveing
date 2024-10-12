WITH cte AS ( 

    SELECT player_id,MIN(event_date) as first_login
    FROM Activity

    Group by player_id
)