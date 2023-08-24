package class10GroupProject;

public class Number1 { public static void main(String[] args) {
        int [] temps={90,91,82,87,85,89};
        int highestTemp=temps[0];
        int lowestTemp=temps[0];

        for (int i = 0; i < temps.length; i++) {
            if(temps[i]>highestTemp){
                highestTemp=temps[i];
              }if(temps[i]<lowestTemp){
                lowestTemp=temps[i];}}
                System.out.println("The lowest temperature is "+lowestTemp);
                System.out.println("The highest temperature is "+highestTemp);
}}
