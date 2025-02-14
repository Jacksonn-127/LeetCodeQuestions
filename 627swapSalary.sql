/* Write your T-SQL query statement below */

update salary set sex =
    CASE
        WHEN salary.sex = 'f' THEN 'm'
        WHEN salary.sex = 'm' THEN 'f'
    END;

 
