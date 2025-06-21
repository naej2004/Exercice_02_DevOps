import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        int nombreAleatoire = (int) ((Math.random() * 100) + 1);
        for(int i=1; i <=10; i++){
            System.out.println("DEVINER LE NOMBRE ALEATOIRE ! (" + i + "e essaie sur 10)");
            System.out.print("Essayez de deviner le nombre (Entrez un nombre) : ");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            if(userNumber != nombreAleatoire){
                if(userNumber > nombreAleatoire){
                    System.out.println("Le nombre aléatoire est inferieur a " + userNumber);
                }
                else{
                    System.out.println("Le nombre aléatoire est superieur a " + userNumber);
                }

                if(i == 10){
                    System.out.println("Vous avez perdu !");
                    System.out.println("Le nombre aleatoire est : " + nombreAleatoire);
                }
            }
            else{
                System.out.println("Mes Felicitations !\nVous avez trouvez le nombre aleatoire !");
                break;
            }
           scanner.close();
        }
    }
}
