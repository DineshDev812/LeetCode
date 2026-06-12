select 
  case 
   when id%2<>0 and id!=(select maxno from(select max(id) as maxno from seat) as t) then id+1
   when id%2=0 then id-1
   else id
   end as id,student from seat order by (id);
