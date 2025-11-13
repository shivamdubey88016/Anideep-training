class Rectangle {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int area() {
        return length * width;
    }
}

public class RectangleComparison {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 8);
        Rectangle r2 = new Rectangle(6, 6);

        int a1 = r1.area();
        int a2 = r2.area();

        if(a1 > a2)
            System.out.println("Rectangle1 > Rectangle2");
        else if(a1 < a2)
            System.out.println("Rectangle1 < Rectangle2");
        else
            System.out.println("They are equal");

        System.out.println("Area of Rectangle1: " + a1);
        System.out.println("Area of Rectangle2: " + a2);
    }
}
