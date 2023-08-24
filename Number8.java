package class10GroupProject;

public class Number8 {
    public static void main(String[] args) {

        int [] numbers={10,41,2,8,6,13};
        int maximumNumber=numbers[0];
        int minimumNumber=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>maximumNumber){
                maximumNumber=numbers[i];
            }
                if(numbers[i]<minimumNumber){
                    minimumNumber=numbers[i];}}

                    System.out.println("The minimum number is "+minimumNumber);
                    System.out.println("The maximum number is "+maximumNumber);

            }
}
