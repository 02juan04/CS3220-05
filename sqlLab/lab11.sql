
-- 1. Find the names of the students who are not in any group.
select name from students where group_id is null

-- 2. Find the names of the students who are in the group Minnows.
select s.name from students s, student_groups sg
    where s.group_id = sg.id and sg.name = 'Minnows'
-- or 
select s.name from students s
    inner join student_groups sg on s.group_id = sg.id
    where sg.name = 'Minnows'

-- 3. List the name, age, parent name, and parent email of the students. The column names of the results should be Name, Age, Parent, and Email. Note that age is calculated as (current year - birth year).
select name as Name, 2023-birth_year as Age, 
    parent_name as Parent, 
    parent_email as Email from students

-- 4. List the names of the students and the name of the group each student is in. The column names of the results should be Student Name and Group Name. If a student is not in a group, the group name column should show NULL.
select s.name as 'Student Name', sg.name as 'Group Name' from students s
    left outer join student_groups sg on s.group_id = sg.id

-- 5. List the names of the groups and the number of students in each group. The result should show 0 for groups that do not have any students.
select sg.name as 'Group Name', count(s.name) as 'Number of Students' from student_groups sg
    left outer join students s on s.group_id = sg.id 
    group by sg.name

-- 6. Find the names of the groups that are not full. A group is not full if the number of students in the group is less than its max size.
--       HINT: first write a query to get the group name, max size, and the number of students in each group, then use this query as a subquery and select the groups whose max size is greater than the number of students.

select name as 'Group Name'
    from (select sg.name, sg.max_size, count(s.name) as num_students from student_groups sg
        left outer join students s on s.group_id = sg.id
        group by sg.name) as new_table
where max_size > num_students