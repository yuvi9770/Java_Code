package P_C_89_95;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            
            @Override
            public int compare(Student s, Student T){
                return s.getGrade()-T.getGrade();
            }  
        });

        queue.offer(new Student("Aman", 'A'));
        queue.offer(new Student("Ravi", 'B'));
        queue.offer(new Student("luv", 'C'));
        queue.offer(new Student("Rana", 'D'));
        queue.offer(new Student("Akku", 'E'));
        queue.offer(new Student("Rama", 'A'));

        System.out.printf("Queue is %s\n",queue);

        System.out.printf("Head is %s\n",queue.poll());
        System.out.printf("Head is %s\n",queue.poll());
        System.out.printf("Head is %s\n",queue.poll());
        System.out.printf("Head is %s\n",queue.poll());
        System.out.printf("Head is %s\n",queue.poll());
        System.out.printf("Head is %s\n",queue.poll());
    }

    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }
        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return "[name=" + name + ", grade=" + grade + "]";
        } 
    }
}