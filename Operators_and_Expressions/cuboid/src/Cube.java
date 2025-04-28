record Cube(double side) {
    public String volume(){
        return String.format("%.2f", Math.pow(side, 3));
    }
}
