# Write your MySQL query statement below

select EmployeeUNI.unique_id, Employees.name
FROM EmployeeUNI right join Employees ON EmployeeUNI.id = Employees.id
