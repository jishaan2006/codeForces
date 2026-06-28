package day18;

import java.util.Scanner;

public class Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            String s=sc.next();
            switch (s){
                case "Tetrahedron":count+=4;
                break;
                case "Cube":count+=6;
                break;
                case "Octahedron":count+=8;
                break;
                case "Dodecahedron":count+=12;
                break;
                case "Icosahedron":count+=20;
            }
        }
        System.out.println(count);
    }
}
