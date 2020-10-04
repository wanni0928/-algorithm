select today.id
from Weather as today
    inner join weather as yesterday on date_add(yesterday.recordDate, interval 1 day) = today.recordDate
where today.temperature > yesterday.temperature