# Write your MySQL query statement below

SELECT product_id, 'store1' as store, store1 as PRICE
FROM Products
WHERE store1 is not null 
union
select product_id, 'store2' as store, store2 as price 
FROM Products 
WHERE store2 is not null 
UNION
SELECT product_id, 'store3' as store, store3 as PRICE
FROM Products
WHERE store3 is not null
order by product_id asc
