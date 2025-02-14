# Write your MySQL query statement below
select person.firstName, person.lastName, address.city, address.state FROM PERSON LEFT JOIN ADDRESS ON person.personId = address.personId; 
