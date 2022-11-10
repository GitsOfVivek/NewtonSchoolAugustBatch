static class Student
{
    //Enter your code here
    String name;
    int eng;
    int maths;
    int hindi;
}
static Student[] createStudentArray(int n)
    {
       //Enter your code here
       Student[] std = new Student[n];
       for(int i = 0; i < n; i++) {
           std[i] = new Student();
           std[i].name = sc.next();
           std[i].eng = sc.nextInt();
           std[i].maths = sc.nextInt();
           std[i].hindi = sc.nextInt();
       }
       return std;
    }

    static int engAverage(Student st[], int n)
    {
        //Enter your code here
        int sumEng = 0; 
        for(int i = 0; i < n; i++) {
            sumEng += st[i].eng;
        }
        return sumEng / n;
    }
    
    static int avgPercentageOfClass(Student st[], int n)
    {
        //Enter your code here
        int avg = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = 0;
            sum += st[i].eng + st[i].maths + st[i].hindi;
            avg += sum/3;
        }
        return avg/n;
    }
