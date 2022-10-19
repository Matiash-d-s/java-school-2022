import java.util.Scanner;

public class Task1 {
    static class Point {
        double x;
        double y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Point a = new Point();
        System.out.print("Введите координату х вершины №1:");
        a.x = in.nextDouble();
        System.out.print("Ââåäèòå êîîðäèíàòó y âåðøèíû ¹1:");
        a.y = in.nextDouble();

        Point b = new Point();
        System.out.print("Ââåäèòå êîîðäèíàòó õ âåðøèíû ¹2:");
        b.x = in.nextDouble();
        System.out.print("Ââåäèòå êîîðäèíàòó y âåðøèíû ¹2:");
        b.y = in.nextDouble();

        Point c = new Point();
        System.out.print("Ââåäèòå êîîðäèíàòó õ âåðøèíû ¹3:");
        c.x = in.nextDouble();
        System.out.print("Ââåäèòå êîîðäèíàòó y âåðøèíû ¹3:");
        c.y = in.nextDouble();
        double ab = Math.sqrt((a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y));
        double ac = Math.sqrt((a.x - c.x)*(a.x - c.x) + (a.y - c.y)*(a.y - c.y));
        double bc = Math.sqrt((b.x - c.x)*(b.x - c.x) + (b.y - c.y)*(b.y - c.y));
        if (ab + ac <= bc || ab + bc <= ac || ac + bc <= ab)
            System.out.println("Òðåóãîëüíèê íå ñóùåñòâóåò");
        else
        {
            double p = (ab + ac + bc) / 2.0;
            double square = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
            System.out.println("Ïëîùàäü ïåðâûì ñïîñîáîì: " + String.format("%.1f",square));
            double square2 = 0.5 * Math.abs((b.x-a.x)*(c.y-a.y)-(c.x-a.x)*(b.y-a.y));
            System.out.println("Ïëîùàäü âòîðûì ñïîñîáîì: " + square2);
        }
        
    }

}
