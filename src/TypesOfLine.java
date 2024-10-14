
public class TypesOfLine {
    public void method(Line line1,Line line2){
        double determinant = line1.a * line2.b - line2.a * line1.b;

        if (determinant == 0) {
            if (line1.a * line2.с == line2.a * line1.с && line1.b * line2.с == line2.b * line1.с) {
                System.out.println();
                System.out.println("lines are merged");
            } else {
                System.out.println();
                System.out.println("lines are parallel");
            }
        } else {
            double x = (line1.b * line2.с - line2.b * line1.с) / determinant;
            double y = (line2.a * line1.с - line1.a * line2.с) / determinant;
            System.out.printf("lines intersect in point x: "+x+" y: "+ y);
        }
    }
}
