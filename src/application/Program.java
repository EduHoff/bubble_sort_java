package application;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import sort.BubbleSort;
import utils.ConsoleUtils;

public class Program {

    public static void main(String[] args) {

        ConsoleUtils.clear();
        Scanner sc = new Scanner(System.in);
        int array_size = 0;

        while (true) {
            try{
                System.out.println("Digite o tamanho do vetor.");
                System.out.print("||");
                array_size = sc.nextInt();

                if(array_size <= 0){
                    throw new IllegalArgumentException("Cannot be lower then zero");
                }

                ConsoleUtils.clear();
                break;     
            }catch(InputMismatchException e){
                ConsoleUtils.clear();
                System.out.println("Digite apenas números inteiros!\n");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                ConsoleUtils.clear();
                System.out.println("Digite números maiores que zero!\n");
                sc.nextLine();
            }catch(Exception e){
                ConsoleUtils.clear();
                e.printStackTrace();
            }
        }

        Integer[] array = new Integer[array_size];

        int last_int = 0;
        for(int i=last_int; i<array.length; i++){
            try{
                System.out.println("Digite o "+(i+1)+"º número inteiro.");
                System.out.print("||");
                int num = sc.nextInt();

                if(num < 0){
                    throw new IllegalArgumentException("Cannot be lower then zero");
                }

                array[i] = num;
                last_int = i + 1;
                ConsoleUtils.clear();
            }catch(InputMismatchException e){
                ConsoleUtils.clear();
                System.out.println("Digite apenas números inteiros!\n");
                sc.nextLine();
                i--;
            }catch(IllegalArgumentException e){
                ConsoleUtils.clear();
                System.out.println("Digite números maiores ou igual a zero!\n");
                sc.nextLine();
                i--;
            }catch(Exception e){
                ConsoleUtils.clear();
                e.printStackTrace();
                i--;
            }

        }

        System.out.println("Vetor original: " + Arrays.toString(array));
        System.out.println("Vetor ordenado: " + Arrays.toString(BubbleSort.bubbleSort(array)));

        sc.close();
    }
}