(select employee_id from Salaries
except
select employee_id from Employees
)
union

(select employee_id from Employees
except
select employee_id from salaries) order by employee_id;

