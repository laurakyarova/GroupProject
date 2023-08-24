package class10GroupProject;

public class Number10 {
    public static void main(String[] args) {


    String[] elements = {"Apple", "Car", "Dog", "Cat", "Apple", "Sun"};

        for (int i = 0; i < elements.length; i++) {
            for (int j =i+1; j < elements.length ; j++) {
                if(elements[i]==elements[j]){
                    System.out.println("Duplicate element is "+elements[i]);
                }
            }}
}
}
