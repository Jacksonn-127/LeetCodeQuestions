# Write your MySQL query statement below

SELECT Users.name, COALESCE(SUM(Rides.distance), 0) as travelled_distance
FROM Users LEFT JOIN Rides ON Users.id = Rides.user_id
GROUP BY Users.id, Users.name
ORDER BY travelled_distance DESC, Name ASC;
