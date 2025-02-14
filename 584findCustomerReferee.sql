# Write your MySQL query statement below

select 
    name 
from 
    customer as c 
where
    c.referee_id != 2 OR c.referee_id is null
