package Day2.Level1;

public class PenDistribution {

        public static void main(String[] args) {
            int totalPens=14;
            int numberOfStudents=3;
            int penPerStudent=totalPens/numberOfStudents;
            int remainPens=totalPens%numberOfStudents;
            System.out.println("The Pen Per Student is "+penPerStudent+" and the remaining pen not distributed is "+remainPens);

    }

}
