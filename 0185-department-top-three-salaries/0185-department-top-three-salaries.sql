SELECT Department, Employee, Salary 
FROM (
    SELECT d.name AS Department,
           e.name AS Employee,
           e.salary AS Salary,
           
           MAX(e.salary) OVER(PARTITION BY d.id) AS max_salary,
           dense_Rank() over(partition by d.id order by e.salary desc) as dense_rnk
           
    FROM Employee e
    INNER JOIN Department d
    ON e.departmentId = d.id
)x
where x. dense_rnk < 4;