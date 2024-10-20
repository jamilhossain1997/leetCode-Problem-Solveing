UPDATE Salary
SET sex = REPLACE(REPLACE(sex, 'm', 'x'), 'f', 'm'),
            sex = REPLACE(sex, 'x', 'f');
