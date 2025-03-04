# Write your MySQL query statement below

select 
    -- get day
    activity_date as day, 
    -- get unique users from activity table
    COUNT(DISTINCT user_id) AS active_users
    from activity
    -- where activity was in last 30 days
Where activity_date between '2019-06-28' AND '2019-07-27'
group by activity_date
