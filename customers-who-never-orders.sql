select Customers.name AS Customers from Customers LEFT JOIN Orders ON Customers.ID = Orders.customerId where Orders.Id IS NULL ;