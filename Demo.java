class Demo {
    public static void main(String[] args) {
        double p = 10000, r = 12;
        int n = 100, t = 4;

        double ci = p * Math.pow(1 + r / 100 / n, n * t) - p;

        System.out.println(Math.ceil(ci));
    }
}
