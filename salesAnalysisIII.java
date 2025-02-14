# Write your MySQL query statement below

WITH cte AS(
    SELECT product_id
    FROM Sales
    Where sale_date > '2019-03-31' or sale_date < '2019-01-01'
)

SELECT DISTINCT s.product_id, p.product_name
from Product p
JOIN Sales s 
on s.product_id = p.product_id
Where s.product_id NOT IN(
    select product_id
    from cte
)

