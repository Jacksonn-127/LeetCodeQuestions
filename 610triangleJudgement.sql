/* Write your T-SQL query statement below */

SELECT T.*,
    CASE
        WHEN T.x <= 0 OR T.y <= 0 OR T.z <= 0 THEN 'No' 
        WHEN T.x + T.y > T.z AND T.x + T.z > T.y AND T.y + T.z > T.x THEN 'Yes' 
        ELSE 'No'
    END AS triangle
FROM Triangle AS T;
