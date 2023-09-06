import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.println("Todo Code\nIntroduce tu nombre:");

        name = scanner.nextLine();

        System.out.println("\nBienvenido " + name +
                ",\n¿Qué ejercicio deseas realizar?\n" +
                "1) Intercambio de Valores\n" +
                "2) Integrador de Condicionales\n" +
                "3) Límite\n" +
                "4) Control\n" +
                "5) Maratón del Inmigrante\n" +
                "6) Árbol de Navidad\n" +
                "7) Contador de tres\n" +
                "8) Alumnos\n" +
                "9) Temperaturas\n" +
                "10) Vuelos\n" +
                "------------------------------\n" +
                "Selecciona una opción:");

        int option = scanner.nextInt();

        switch (option) {
            case 1:

                ejercicio1();

                break;

            case 2:

                ejercicio2();

                break;

            case 3:

                ejercicio3();

                break;

            case 4:

                ejercicio4();

                break;

            case 5:

                ejercicio5();

                break;

            case 6:

                ejercicio6();

                break;

            case 7:

                ejercicio7();

                break;

            case 8:

                ejercicio8();

                break;

            case 9:

                ejercicio9();

                break;

            case 10:

                ejercicio10();

                break;

            default:
                System.out.println("Error 404: Opción no encontrada");

                break;
        }
    }

    public static void ejercicio1(){
        Scanner scanner = new Scanner(System.in);

        int x, y, z;

        System.out.println("\nIntercambio de Valores\n-------------------------------\n" +
                "Introduce el primer valor:");

        x = scanner.nextInt();

        System.out.println("Introduce el segundo valor:");

        y = scanner.nextInt();

        System.out.println("\nLos valores que ingresaste son:\n" +
                "1° Valor: " + x + "\n" +
                "2° Valor: " + y + "\n" +
                "Los cuales cambiaran de variable a continuación...\n");

        z = x;
        x = y;
        y = z;

        System.out.println("1° Valor: " + x + "\n" +
                "2° Valor: " + y );
    }

    public static void ejercicio2(){
        Scanner scanner = new Scanner(System.in);

        int tipoDeEmpleado;

        double salary;

        System.out.println("\nIntegrador de Condicionales\n-------------------------------\n" +
                "Pequeña Tienda\nCalcule el sueldo de sus empleados, indicando el tipo de empleado:\n" +
                "1° Repositor\n" +
                "2° Cajero\n" +
                "3° Supervisor\n" +
                "Introduzca una opción:");

        tipoDeEmpleado = scanner.nextInt();

        switch (tipoDeEmpleado) {
            case 1:
                salary = 15890;

                salary = salary + (salary * 0.1);

                System.out.println("\nSeleccionaste el repositor, su sueldo es de:\n" +
                        "$" + salary);

                break;

            case 2:
                salary = 25630.89;

                System.out.println("\nSeleccionaste el cajero, su sueldo es de:\n" +
                        "$" + salary);

                break;

            case 3:
                salary = 33560.20;

                salary = salary - (salary * 0.11);

                System.out.println("\nSeleccionaste el supervisor, su sueldo es de:\n" +
                        "$" + salary);

                break;

            default:
                System.out.println("\nError 404: No existe ese tipo de empleado");
        }
    }

    public static void ejercicio3(){
        Scanner scanner = new Scanner(System.in);

        int limit;

        System.out.println("\nLímite\n-------------------------------\n" +
                "Indique el número límite hasta el cual quiere contar:");

        limit = scanner.nextInt();

        for (int i = 0; i <= limit; i++) {
            System.out.println("\n" + i);
        }
    }

    public static void ejercicio4(){
        Scanner scanner = new Scanner(System.in);

        String word;

        System.out.println("\nControl\n-------------------------------\n" +
                "Ingresa la palabra que deseas mostrar en pantalla, recuerda colocar 'salir' para finalizar.");

        do {

            System.out.println("\nPalabra a ingresar:");

            word = scanner.nextLine();

            System.out.println("\nPalabra ingresada: " + word);

        } while (!word.equals("salir"));
    }

    public static void ejercicio5(){
        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);

        String fullName;

        int dni, age;

        System.out.println("\nMaratón del Inmigrante\n-------------------------------\n" +
                "En la ciudad de Oberá, Misiones se realiza año a año la 'Maratón del Inmigrante' en el marco de la " +
                "Fiesta Nacional del Inmigrante. El evento cuenta con un día de inscripciones el día anterior a la " +
                "carrera, por lo que se desconoce la cantidad exacta de inscritos que puede llegar a haber. Desde la " +
                "Federación de Colectividades (Organismo que organiza), manifestaron que se solicitan los siguientes " +
                "datos de cada paticipante:\nDNI, Nombre y Edad.\n\nEn cuanto a las categorías posibles para una " +
                "inscripción, se manejan las siguientes:\n" +
                "-> Menores A (6 - 10 años)\n" +
                "-> Menores B (11 - 17 años)\n" +
                "-> Juveniles (18 - 30 años)\n" +
                "-> Adultos (31 - 50 años)\n" +
                "-> Adultos mayores (+50 años)\n\n" +
                "A continuación, ingresa los datos de cada participante y para finalizar los registros, se debe " +
                "colocar en el DNI = 0 y el Nombre = fin...\n");

        do {
            System.out.println("\n-------------------------------------------------\n\nDNI:");
            dni = intScanner.nextInt();

            System.out.println("\nNombre Completo:");
            fullName = stringScanner.nextLine();

            System.out.println("\nEdad:");
            age = intScanner.nextInt();

            if (age >= 6) {
                if (age >= 11) {
                    if (age >= 18) {
                        if (age >= 31) {
                            if (age > 50) {
                                System.out.println("\n" + fullName + " (DNI: " + dni + "), al tener " + age + " años, está " +
                                        "en la categoría Adultos mayores");
                            } else {
                                System.out.println("\n" + fullName + " (DNI: " + dni + "), al tener " + age + " años, está " +
                                        "en la categoría Adultos");
                            }
                        } else {
                            System.out.println("\n" + fullName + " (DNI: " + dni + "), al tener " + age + " años, está " +
                                    "en la categoría Juveniles");
                        }
                    } else {
                        System.out.println("\n" + fullName + " (DNI: " + dni + "), al tener " + age + " años, está " +
                                "en la categoría Menores B");
                    }
                } else {
                    System.out.println("\n" + fullName + " (DNI: " + dni + "), al tener " + age + " años, está " +
                            "en la categoría Menores A");
                }
            } else {
                System.out.println("\n" + fullName + ", no tiene suficiente edad para competir en ninguna categoría");
            }

        } while (dni != 0 || !fullName.equalsIgnoreCase("fin"));
    }

    public static void ejercicio6() {
        Scanner scanner = new Scanner(System.in);

        int height, width = 1;

        System.out.println("\nÁrbol de Navidad\n-------------------------------\n" +
                "Ingresa el alto de tu árbolito (min. 1):");

        height = scanner.nextInt();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < (height-y-1); x++) {
                System.out.print(" ");
            }
            for (int a = 0; a < (y*2)+1; a++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int b = 0; b < width; b++) {
            for (int s = 0; s < (height-2); s++) {
                System.out.print(" ");
            }
            for (int t = 0; t < 3; t++) {
                System.out.print("|");
            }
            System.out.println("");
        }

    }

    public static void ejercicio7(){
        Scanner scanner = new Scanner(System.in);

        int vector[] = new int[15],
                contador = 0;

        System.out.println("\nContador de tres\n-------------------------------\n" +
                "A continuación, ingresa 15 números...");

        for (int i = 0; i < 15; i++) {

            System.out.println("\n" + i + ".- Ingrese el número #" + i + ":");

            vector[i] = scanner.nextInt();

            if (vector[i] == 3) {
                contador++;
            }
        }

        System.out.println("\nSe ingresó el número 3 una cantidad de " + contador + " veces");
    }

    public static void ejercicio8(){
        Scanner scanner = new Scanner(System.in);

        double calificaciones[][] = new double[4][4];

        System.out.println("\nAlumnos\n-------------------------------\n" +
                "A continuación, ingresa las calificaciones de tus alumnos...");

        for (int f = 0; f < 4; f++) {
            System.out.println("\nAlumno\n---------------------------");

            for (int c = 0; c < 4; c++) {
                if (c != 3) {
                    System.out.println("\nCalificación: ");

                    calificaciones[f][c] = scanner.nextDouble();

                    calificaciones[f][3] += calificaciones[f][c];
                } else {
                    calificaciones[f][3] /= 3;
                }
            }
        }

        System.out.print("\nTabla:\n" +
                "\n       |Nota 1    |Nota 2    |Nota 3    |Promedio    |\n" +
                "       -------------------------------------------------");

        for (int f = 0; f < 4; f++) {
            System.out.print("\nAlumno  |");
            for (int c = 0; c < 4; c++) {
                System.out.print(calificaciones[f][c] + "    |");
            }
        }
    }

    public static void ejercicio9(){
        Scanner scannerStrings = new Scanner(System.in),
                scannerDoubles = new Scanner(System.in);

        String cities[] = new String[5],
                minCity = "",
                maxCity = "";

        double minTemps[] = new double[5],
                min = 1_000_000,
                maxTemps[] = new double[5],
                max = 0;

        System.out.println("\nTemperaturas\n-------------------------------\n" +
                "A continuación, ingresa los campos correspondientes de las ciudades a medir...");

        for (int n = 0; n < 5; n++){

            System.out.println("\nNombre de la ciudad:");
            cities[n] = scannerStrings.nextLine();

            System.out.println("\nMínima temperatura:");
            minTemps[n] = scannerDoubles.nextDouble();

            if (minTemps[n] < min) {
                min = minTemps[n];
                minCity = cities[n];
            }

            System.out.println("\nMáxima temperatura:");
            maxTemps[n] = scannerDoubles.nextDouble();

            if (maxTemps[n] > max) {
                max = maxTemps[n];
                maxCity = cities[n];
            }

        }

        System.out.println("\nLa ciudad con la menor temperatura fue: " + minCity + " con " + min + "°" +
                "\nLa ciudad con la mayor temperatura fue: " + maxCity + " con " + max + "°");
    }

    public static void ejercicio10(){
        Scanner scanner = new Scanner(System.in),
                scannerWord = new Scanner(System.in);

        String cities[] = {"Río de Janeiro", "Cancún", "Madrid", "Roma", "Milán", "Iguarú"},
                times[] = {"Mañana", "Mediodia", "Noche"},
                ward = "";

        int seats[][] = new int[6][3],
            place = -1,
            time = -1,
            passenger;

        System.out.println("\nVuelos\n-------------------------------\n" +
                "A continuación, ingresa la cantidad de asientos de cada vuelo...");

        for (int v = 0; v < cities.length; v++) {
            System.out.println("\n" + cities[v]);

            for (int h = 0; h < times.length; h++) {
                System.out.println("\n" + times[h] + "\n-------------------------\n");

                System.out.println("\nNúm. de asientos: ");
                seats[v][h] = scanner.nextInt();

            }
        }

        System.out.println("\n\n\n--------------------------------------------------------\n" +
                "        B I E N V E N I D O        " +
                "\n--------------------------------------------------------\n");

        do {
            // Destinos
            System.out.println("¿Cuál es su destino?\n");

            for (int d = 0; d < cities.length; d++) {
                System.out.println(d + ") " + cities[d]);
            }

            System.out.println("\nIngresa el número de tu destino:");
            place = scanner.nextInt();

            if (place < 0 || place > cities.length) {
                System.out.println("\nNo existe ese destino..");
                continue;
            }


            // Asientos
            System.out.println("¿Cuál es su vuelo?\n");

            for (int t = 0; t < times.length; t++) {
                System.out.println(t + ") " + times[t]);
            }

            System.out.println("\nIngresa el número de tu vuelo:");
            time = scanner.nextInt();

            if (time < 0 || time > times.length) {
                System.out.println("\nNo existe ese vuelo..");
                continue;
            }


            // Vuelos
            System.out.println("¿Cuántos asientos requiere?\n");
            passenger = scanner.nextInt();

            if (seats[place][time] >= passenger) {

                seats[place][time] -= passenger;

                System.out.println("\nSu reserva fue realizada con éxito.\n" +
                        "Cantidad de asientos seleccionados: " + passenger + "\n" +
                        "Cantidad de asientos diponibles: " + seats[place][time]);

            } else {
                System.out.println("\nDisculpe, no se pudo completar su operación dado que no hay asientos disponibles");
            }

            System.out.println("\nSi desea salir, introduzca 'finish':");
            ward = scannerWord.nextLine();


        } while (!ward.equalsIgnoreCase("finish"));

    }
}