select max(salary) as SecondHighestSalary 
from Employee WHERE salary <(select Max(salary) from Employee);