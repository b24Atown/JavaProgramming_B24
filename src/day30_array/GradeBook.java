package day30_array;

public class GradeBook {

    public static void main(String[] args) {

        /*
        student array will hold names of students  (string)
        grade values  will hold grades of students. (double)
        [james bond, ]
        [80,         ]
         */

        String [] names = {"James Bond","Jamie Fox","Luke Smith"};
        double [] grades ={90,80.5,100};

        for (int i = 0; i<names.length;i++){ // can also do grades since its same size
            System.out.println(names[i] + " -> " + grades[i]);
        }

    }
}
