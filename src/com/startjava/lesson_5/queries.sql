SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE Status != 'Destroyed';
SELECT * FROM Jaegers WHERE Mark = 'Mark-1' OR Mark = 'Mark-6';
SELECT * FROM Jaegers ORDER BY Mark DESC;
SELECT * FROM Jaegers WHERE Launch = (SELECT MIN(Launch) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers)
                        OR kaijuKill = (SELECT MIN(kaijuKill) FROM Jaegers);
SELECT AVG(weight) AS weightAvg FROM Jaegers;
UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status != 'Destroyed';
DELETE FROM jaegers WHERE status = 'Destroyed/Deceased';