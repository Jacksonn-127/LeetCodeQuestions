# Write your MySQL query statement below
select Students.student_id, Students.student_name, Examinations.subject_name,  SUM(Examinations.subject_name) as attended_exams
from students
join Examinations on Students.student_id = Examinations.student_id
order by student_id
