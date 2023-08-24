package class10GroupProject;

public class Number9 {
    public static void main(String[] args) {
        int [] numbers={90,14,82,21,65,8,10};
        int largestNumber=0;
        int secondLargest=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largestNumber){
                secondLargest=largestNumber;
                largestNumber=numbers[i];
            }else if(numbers[i]>secondLargest){
                secondLargest=numbers[i];
            }
        }
        System.out.println(secondLargest);


        }
    }

