-- A LIST OF ALL STUDENTS
select * from students;
-- A LIST OF ALL THE TRAINERS
select * from trainers;
-- A LIST OF ALL THE ASSIGNMENTS
select * from assignments;
-- A LIST OF ALL THE COURSES
select * from courses;

-- ALL THE -- STUDENTS PER COURSE
select `s`.`fname` as 'First Name', `s`.`lname`, courses.title
from `students` as `s`
inner join `enrollments`
on `s`.`id`=`enrollments`.`sid`
inner join `courses` on courses.id=enrollments.cid;

-- ALL THE TRAINERS PER COURSE
select `t`.`fname` as 'First Name', `t`.`lname`, courses.title
from `trainers` as `t`
inner join `enrollments_trainers` on `t`.`id`=`enrollments_trainers`.`Trainers_id`
inner join `courses` on courses.id=enrollments_trainers.cid;

-- ALL THE ASSIGNMENTS PER COURSE
select courses.title as 'COurse ',courses.type, assignments.title as 'Assignment title', assignments.subdate 
from `students` as s
join enrollments ON s.id=enrollments.sid
inner join `courses` on courses.id=enrollments.cid
join enrollmentsassignments on enrollments.id=enrollmentsassignments.eid
join `assignments` on enrollmentsassignments.aid=assignments.id;

-- ALL THE ASSIGNMENTS PER COURSE PER STUDENTS
select `s`.`fname` as ' Student First Name', `s`.`lname` as ' Student Last Name', courses.title as 'Course Title', assignments.title as `Assignment title`
from `students` as `s`
join enrollments ON s.id=enrollments.sid
inner join `courses` on courses.id=enrollments.cid
join enrollmentsassignments on enrollments.id=enrollmentsassignments.eid
join `assignments` on enrollmentsassignments.aid=assignments.id;

-- A LIST OF STUDENTS THAT BELONG TO MORE THAN ONE COURSES 
select distinct s.fname as 'Student First name', s.lname as 'Student last name'
from `students` as `s`
inner join `enrollments`
on `s`.`id`=`enrollments`.`sid`
inner join `courses` on courses.id=enrollments.cid
where enrollments.sid in(SELECT enrollments.sid from `enrollments` group by enrollments.sid having count(enrollments.sid)>1);


