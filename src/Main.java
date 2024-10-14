//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1 , 1, 1);
        Line line2 = new Line(1,1,1);
        Line line3 = new Line(2 , -5, 3);
        Line line4 = new Line(1,-4,7);
        Line line5 = new Line(2 , 3, -5);
        Line line6 = new Line(2,3,6);



        TypesOfLine typesOfLine = new TypesOfLine();

        typesOfLine.method(line1,line2);

        typesOfLine.method(line3,line4);

        typesOfLine.method(line5,line6);

    }
}