-- select  *
-- from ActorDirector a
-- left join ActorDirector d
-- on a.director_id=d.actor_id
-- group by a.director_id,d.actor_id having count(a.director_id)>=3;

select actor_id,director_id 
from ActorDirector group by actor_id,director_id having count(director_id)>=3;