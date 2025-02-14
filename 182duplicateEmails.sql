/* Write your T-SQL query statement below */

SELECT DISTINCT Email FROM Person WHERE email IN ( select email from Person group by email having count(email) > 1)
