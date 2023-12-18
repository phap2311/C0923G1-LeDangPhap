use quan_ly_sinh_vien;

SELECT 
    *
FROM
    subject_s
WHERE
    credit = (SELECT 
            MAX(credit)
        FROM
            subject_s);
SELECT 
    subject_s.*
FROM
    subject_s
        JOIN
    mark ON subject_s.sub_id = mark.sub_id
WHERE
    mark_s IN (SELECT 
            MAX(mark_s)
        FROM
            mark);

SELECT 
    student.*, AVG(mark_s) AS avg_mark
FROM
    student
        JOIN
    mark ON student.student_id = mark.student_id
GROUP BY student.student_id , student.student_name
ORDER BY avg_mark DESC;