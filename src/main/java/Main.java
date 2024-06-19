/* Napisz program, który znajduje zduplikowane wartości całkowite w tablicy:
- Program powinien wczytać tablicę liczb całkowitych wprowadzoną przez użytkownika.
- Znaleźć zduplikowane wartości w tablicy.
- Wyświetlić wynik.*/
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
int Tab[];
    int ile;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj ilość elementów tablicy: ");
    ile = scanner.nextInt();
    Tab = new int[ile];
    
    System.out.println("Podaj elementy tablicy:");
            for (int i = 0; i < ile; i++) 
            {
                Tab[i] = scanner.nextInt();
            }

            Set<Integer> duplikaty = new HashSet<>();
            Set<Integer> widziano = new HashSet<>();
            for (int num : Tab) 
            {
                if (widziano.contains(num)) 
                {
                    duplikaty.add(num);
                } 
                else 
                {
                    widziano.add(num);
                }
            }

            if (duplikaty.isEmpty()) 
            {
                System.out.println("Brak duplikatów.");
            } 
            else 
            {
                System.out.println("Znalezione duplikaty:");
                    System.out.println(duplikaty);
            }
            

        }
}