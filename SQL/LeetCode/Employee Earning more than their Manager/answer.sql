select employee.Name as Employee
from employee
    inner join employee as Manager on employee.managerid = Manager.id
where employee.Salary > Manager.Salary
    
# {"headers": ["employeeName", "employeeSalary", "managerName", "managerSalary"], 
# "values": [["Joe", 70000, "Sam", 60000], 
#            ["Henry", 80000, "Max", 90000]]}