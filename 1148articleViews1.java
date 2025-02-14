# Write your MySQL query statement below


SELECT DISTINCT V.author_id as id FROM Views as V
Where V.author_id = V.viewer_id
ORDER BY V.author_id ASC
