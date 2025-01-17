package P_C_51_52;

public class course {
    static int maxCapacity = 10;
    String courseName;
    int enrollment;

    String[] enroStudent;

    course(String courseName) {
        this.courseName = courseName;
        this.enrollment = 0;
        this.enroStudent = new String[maxCapacity];
    }

    static void setMaxcapacity(int maxCapacity) {
        course.maxCapacity = maxCapacity;
    }

    void enrolledStudent(String studentName) {
        if (enrollment < maxCapacity) {
            enroStudent[enrollment] = studentName;
            enrollment++;
            System.out.println(studentName + " enrolled in " + courseName);
        } else {
            System.out.println("Sorry, " + studentName + " ,course is full");
        }
    }

    void unenrolledStudent(String studentName) {
        for (int i = 0; i < enrollment; i++) {
            if (enroStudent[i].equals(studentName)) {
                enroStudent[i] = null;
                // Shift remaining elements
                for (int j = i; j < enrollment - 1; j++) {
                    enroStudent[j] = enroStudent[j + 1];
                }
                enroStudent[enrollment - 1] = null;
                enrollment--;
                System.out.println(studentName + " removed from " + courseName);
                return;
            }
        }
        System.out.println(studentName + " is not enrolled in " + courseName);
    }

    public static void main(String[] args) {
        course Branch = new course("mathematics");
        Branch.enrolledStudent("Aman");
        // Branch.unenrolledStudent("Aman");
        System.out.println("Max Capacity: " + course.maxCapacity);

        for (int i = 0; i < course.maxCapacity + 2; i++) {
            Branch.enrolledStudent("Student " + (i + 1));
        }

    }
}