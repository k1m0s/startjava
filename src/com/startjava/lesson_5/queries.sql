-- print the whole table
SELECT * FROM jaegers;

-- display only active jaegers
SELECT * FROM jaegers
    WHERE status = 'Active';

-- display jaegers Mark - 1 & Mark - 4
SELECT * FROM jaegers
    WHERE mark IN (1,4);

-- display all jaegers except Mark - 1 & Mark - 4
SELECT * FROM jaegers
    WHERE mark NOT IN (1,4);

-- sort the table in descending order "Mark"
SELECT * FROM jaegers
    ORDER BY mark DESC;

-- display old Jaeger
SELECT * FROM jaegers
    WHERE launch = (SELECT MAX(launch) FROM jaegers);

-- display the Jaeger that have more kills kaiju
SELECT * FROM jaegers
    WHERE kaijukill = (SELECT MAX(kaijukill) FROM jaegers);

-- display avg weight Jaegers
SELECT AVG(weight) FROM jaegers;

-- increase by one the number of kaijukill, by Jaegers that are still active
SELECT modelName, mark, height, weight, status, origin, launch, (kaijukill + 1)
    AS kaijukill
    FROM jaegers
    WHERE status = 'Active';

-- remove destroyed Jaegers
DELETE FROM jaegers WHERE status = 'Destroyed';







