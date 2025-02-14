# Write your MySQL query statement below

select SP.name
FROM SalesPerson as SP 
WHERE SP.sales_id NOT IN(
    select O.sales_id
    FROM Orders O
    JOIN Company C ON O.com_id = C.com_id
    WHERE c.name = 'RED' 
);
