SELECT t.request_at AS Day,
ROUND(SUM(CASE 
            WHEN t.status = 'cancelled_by_driver' OR t.status = 'cancelled_by_client' 
            THEN 1 ELSE 0 
          END) / COUNT(*), 2) AS `Cancellation Rate`
FROM Trips t
LEFT JOIN Users u1 ON t.driver_id = u1.users_id
LEFT JOIN Users u2 ON t.client_id = u2.users_id
WHERE u1.banned = 'No'
  AND u2.banned = 'No'
  AND t.request_at BETWEEN '2013-10-01' AND '2013-10-03'
GROUP BY t.request_at
ORDER BY t.request_at;

