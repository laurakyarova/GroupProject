package class10GroupProject;

public class Number2 {
    public static void main(String[] args) {
        int [] numbers={11,21,4,8,7,25,33};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
