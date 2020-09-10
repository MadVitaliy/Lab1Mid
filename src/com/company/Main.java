package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int[] numbers = {1,2,3,4,5,6,7,8,9};
       int height = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter piramida's height ");
        //add exeption
        try {
            height = in.nextInt();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            height = 0;
        }
        finally {
            if(height != 0) {
                int[][] piramidas = createPiramida( height);
                writePiramida(piramidas);
            }
        }
        in.close();
    }

    static int[][] createPiramida(int height){
        int[][] piramidas = new int[height][];
        for(int i=0; i < piramidas.length; i++){
            piramidas[i] = new  int[i*2+1];
        }
        for(int i=0; i < height; i++){
            for(int j=i; j < height; j++){
                piramidas[j][i] = (i+1)%10;
                piramidas[j][j*2-i] = (i+1)%10;
            }
        }
        return piramidas;
    }

    static void writePiramida(int[][] piramida){
        int height = piramida.length;;
        for(int i=0; i < height; i++){
            for(int j = 0; j<height-i; j++){
                System.out.print(' ');
            }
            for(int j=0; j < piramida[i].length; j++){
                System.out.print(piramida[i][j]);
            }
            System.out.println();
        }
    }
}
