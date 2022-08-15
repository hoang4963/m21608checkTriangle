public class CheckTrangle {
    double side1;
    double side2;
    double side3;

    CheckTrangle(){}

    public CheckTrangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public boolean checkRightTriangle(){
        return side1 * side1 == side2 * side2 + side3 * side3
                || side3 * side3 == side1 * side1 + side2 * side2
                || side2 * side2 == side1 * side1 + side3 * side3;
    }
    public boolean checkIsoscelesTriangle(){
        return (side1 == side2 || side2 == side3 || side1 == side3) && !checkEquilateralTriangle() ;
    }
    public boolean checkTriangle(){
        return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
    }
    public boolean checkEquilateralTriangle(){
        return side1 == side2 && side1 == side3;
    }
    public String showTriangleIs(){
        if (checkTriangle()){
            if (checkEquilateralTriangle())
                return "Tam giac deu";
            else if (checkRightTriangle() && !checkIsoscelesTriangle()) {
                return "Tam giac vuong";
            } else if (checkRightTriangle() && checkIsoscelesTriangle()) {
                return "Tam giac vuong can";
            } else if (checkIsoscelesTriangle() && !checkRightTriangle()) {
                return "Tam giac can";
            }
            else return "Tam giac thuong";
        }
        else return "Khong phai tam giac";
    }
}
