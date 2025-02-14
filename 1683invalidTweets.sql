/* Write your T-SQL query statement below */


select tweet_id 
from Tweets as t 
Where LEN(t.content) > 15
