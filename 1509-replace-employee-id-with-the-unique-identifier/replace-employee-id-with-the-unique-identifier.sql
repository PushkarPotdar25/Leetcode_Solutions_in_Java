SELECT e.unique_id,f.name
FROM Employees f
LEFT OUTER JOIN EmployeeUNI e
ON f.id=e.id;