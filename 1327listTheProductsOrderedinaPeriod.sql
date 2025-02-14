/* Write your T-SQL query statement below */

select p.product_name, SUM(o.unit) as unit
from
    Products as p
    join Orders as o 
    on p.product_id = o.product_id
Where
    o.order_date > '2020-01-31' AND o.order_date < '2020-03-01'
group by 
    p.product_name
HAVING SUM(o.unit) >= 100
