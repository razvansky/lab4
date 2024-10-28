package p1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import p1.Copiator;
import p1.Echipamente;
import p1.Imprimanta;
import p1.calc;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Echipamente> echipamentes = new ArrayList<>();
        Scanner sc=new Scanner(new File("Echipamente.txt"));
        Scanner sc2 = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String line=sc.nextLine();
            String[] split=line.split(";");
            if(split[5].equals("imprimanta"))
            {
                echipamentes.add(new Imprimanta(split[0],Integer.valueOf(split[1]),Float.valueOf(split[2]),split[3],split[4],split[5],Integer.valueOf(split[6]),split[7],Integer.valueOf(split[8]),split[9]));
            }
            if(split[5].equals("copiator"))
            {

                echipamentes.add((new Copiator(split[0],Integer.valueOf(split[1]),Float.valueOf(split[2]),split[3],split[4],split[5],Integer.valueOf(split[6]),split[7])));
            }
            if(split[5].equals("sistem de calcul"))
            {

                echipamentes.add(new calc(split[0],Integer.valueOf(split[1]),Float.valueOf(split[2]),split[3],split[4],split[5],split[6],Float.valueOf(split[7]),Integer.valueOf(split[8]),split[9]));
            }


        }
        int n;
        while(true)
        {
            System.out.println("1.Afişarea tuturor echipamentelor\n");
            System.out.println("2.Afişarea imprimantelor\n");
            System.out.println("3.Afişarea copiatoarelor\n");
            System.out.println("4.Afişarea sistemelor de calcul\n");
            System.out.println("5.Modificarea stării în care se află un echipament\n");
            System.out.println("6.Setarea unui anumit mod de scriere pentru o imprimantă\n");
            System.out.println("7.Setarea unui format de copiere pentru copiatoare\n");
            System.out.println("8.Instalarea unui anumit sistem de operare pe un sistem de calcul \n");
            System.out.println("9.Afişarea echipamentelor vândute\n");
            System.out.println("10.Să se realizeze două metode statice pentru serializarea / deserializarea colecției de\n" +
                    "obiecte în fișierul echip.bin \n");
            System.out.println("\n");
            System.out.println("Optiunea dumneavoastra este: ");
            n=sc2.nextInt();
            int xn;
            switch (n)
            {
                case 1:
                    for (Echipamente echipamente : echipamentes)
                        System.out.println(echipamente.toString());
                    break;
                case 2:
                    for (Echipamente echipamente : echipamentes)
                    {
                        if(echipamente.getTip().equals("imprimanta"))
                        {
                            System.out.println(echipamente);
                        }
                    }
                    break;
                case 3:
                    for (Echipamente echipamente : echipamentes)
                    {
                        if(echipamente.getTip().equals("copiator"))
                        {
                            System.out.println(echipamente);
                        }
                    }
                    break;
                case 4:
                    for (Echipamente echipamente : echipamentes)
                    {
                        if(echipamente.getTip().equals("sistem de calcul"))
                        {
                            System.out.println(echipamente);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Alegeti un echipament dupa nr_inv");
                    int nx;
                    nx=sc2.nextInt();
                    for (Echipamente echipamente : echipamentes) {
                        if(echipamente.getNr_inv()==nx)
                        {
                            String staren = sc2.next();
                            echipamente.setStare(staren);
                        }

                    }
                    break;
                case 6:
                    for (Echipamente echipamente : echipamentes)
                    {
                        if(echipamente.getTip().equals("imprimanta"))
                        {
                            System.out.println(echipamente);
                        }
                    }
                    System.out.print("Alegeti un nr_inv pt o imprimante:");
                    xn=sc2.nextInt();
                    for (Echipamente echipamente : echipamentes) {
                        if (echipamente.getNr_inv() == xn) {
                            System.out.print("Mod de scriere");
                            String mod = sc2.next();
                            Imprimanta imprimanta = (Imprimanta) echipamente;
                            imprimanta.setColor(mod);
                            echipamente = imprimanta;
                        }
                    }
                    break;
                case 7:
                    for (Echipamente echipamente : echipamentes)
                    {
                        if(echipamente.getTip().equals("copiator"))
                        {
                            System.out.println(echipamente);
                        }
                    }
                    System.out.print("Alegeti un nr_inv pt un copiator:");
                    xn = sc2.nextInt();
                    for (Echipamente echipamente : echipamentes) {
                        if (echipamente.getNr_inv() == xn) {
                            System.out.print("Format copiere");
                            String mod = sc2.next();
                            Copiator copiator = (Copiator) echipamente;
                            copiator.setFormat(mod);
                            echipamente = copiator;
                        }
                    }
                    break;
                case 8:
                    for (Echipamente echipamente : echipamentes)
                    {
                        if(echipamente.getTip().equals("sistem de calcul"))
                        {
                            System.out.println(echipamente);
                        }
                    }
                    System.out.print("Alegeti un nr_inv pt un sistem de calcul:");
                    xn = sc2.nextInt();
                    for (Echipamente echipamente : echipamentes) {
                        if (echipamente.getNr_inv() == xn) {
                            System.out.print("Windows");
                            String mod = sc2.next();
                            calc cal =(calc) echipamente;
                            cal.setWindows(mod);
                            echipamente = cal;
                        }
                    }
                    break;
                case 9:
                    for (Echipamente echipamente : echipamentes) {
                        if (echipamente.getStare().equals("vandut")) {
                            System.out.println(echipamente);
                        }
                    }
                            break;
                case 10:
                    PrintStream f_out = new PrintStream(new File("echip.bin"));
                    for(Echipamente echipamente:echipamentes)
                        f_out.println(echipamente.toString());
                    break;


                default:break;
            }

        }
    }
}
