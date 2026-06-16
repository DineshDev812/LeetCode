select  a.name
from Employee a
inner join Employee b
on a.id=b.managerId
where b.managerId is not null
group by b.managerId having count(b.managerId)>=5;