# Write your MySQL query statement below
select project_id, 
ROUND(AVG(Employee.experience_years), 2)  as average_years
FROM Project 
JOIN Employee on Project.employee_id = Employee.employee_id   
GROUP BY project_id
