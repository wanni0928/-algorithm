delete from person
where Id not in(
    select sub.min_id
    from (
        select Email, min(Id) as min_id
        from Person
        group by Email
    ) sub
)