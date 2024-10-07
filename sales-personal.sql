select sp.name from SalesPerson sp 
Left Join Orders o No sp.sales_id=o.sales_id  
Left Join Company c No  o.com_id = c.com_id AND c.name='RED'
WHERE c.com_id IS NULL;


