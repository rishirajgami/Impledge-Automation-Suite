SELECT DISTINCT d.*
FROM doctors d
INNER JOIN admissions a ON d.doctor_id = a.attending_doctor_id;

SELECT d.*
FROM doctors d
LEFT JOIN admissions a ON d.doctor_id = a.attending_doctor_id
WHERE a.attending_doctor_id IS NULL;


SELECT p.*
FROM patients p
INNER JOIN admissions a ON p.patient_id = a.patient_id
WHERE a.attending_doctor_id IS NULL;





