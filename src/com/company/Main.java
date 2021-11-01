package com.company;

public class Main {

    public static void main(String[] args) {
        // man benutzt meistens if aber selten switch
        //  Zum Code Formating sollt man gleichzeitig strg+shift+alt+l drücken.
        int grade = '8';

        switch (grade) {
            case '1':
                System.out.println("Sehr gut");
                break;
            case '2':
                System.out.println("Gutt");
                break;
            case '3':
                System.out.println("Befriedigend");
                break;
            case '4':
                System.out.println("Ausreichend");
                break;
            case '5':
                System.out.println("Mangelhaft");
                break;
            case '6':
                System.out.println("Ungenügend");
                break;
            default:
                System.out.println("Falsche Eingabe");
        }
    }
}
