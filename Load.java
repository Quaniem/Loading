package com.company;

public class Load {
        public Teacher teacher;
        public Subject subject;
        public Teacher getTeacher() {
            return teacher;
        }
        public void setTeacher(Teacher teacher) {
            this.teacher = teacher;
        }
        public Subject getSubject() {
            return subject;
        }
        public void setSubject(Subject route) {
            this.subject = subject;
        }
        public Load (Teacher teacher, Subject subject) {
            this.teacher = teacher;
            this.subject = subject;
        }
    }


