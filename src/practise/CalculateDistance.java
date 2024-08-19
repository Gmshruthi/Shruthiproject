package Git.src.practise;

import java.util.Scanner;

public class CalculateDistance {
    int a = 1;
    int b = 3;
    int c = 5;
    int d = 7;
    int e = 9;

    public void distanceofPlace(int distance1, int distance2) {
        int distance = distance1 - distance2;
        if (distance < 0) {
            int OriginalDistance = distance * -1;
            System.out.println("Total Distnace:" + OriginalDistance);
        } else {
            System.out.println("Total distance:" + distance);
        }
    }

    public int placeSwitch(String name) {
        int distance1 = 0;
        switch (name) {
            case "a":
                distance1 = this.a;
                break;
            case "b":
                distance1 = this.b;
                break;
            case "c":
                distance1 = this.c;
                break;
            case "d":
                distance1 = this.d;
                break;
            case "e":
                distance1 = this.e;
                break;
            default:
                System.out.println("Invalid Input");

        }
        return distance1;
    }
        public static void main (String[]args) {
            CalculateDistance calculateDistance = new CalculateDistance();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter StartingPoint:");
            String nameOfPlace = scanner.next();
            System.out.println("Enter Destination: ");
            String destination = scanner.next();
            int distance1 = calculateDistance.placeSwitch(nameOfPlace);
            int distance2 = calculateDistance.placeSwitch(destination);
            if (distance1 != 0 && distance2 != 0) {
                calculateDistance.distanceofPlace(distance1, distance2);
            }
        }
    }

