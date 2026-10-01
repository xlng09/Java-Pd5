class Main {

    public static void main(String[] args) {
        (new Main()).init();
    }

    void init() {
        print("Hello!");
        System.out.println(FtoC(212));            
        System.out.println(sphereVolume(3));      
        System.out.println(coneVolume(3, 4));      
        System.out.println(distance(0, 0, 3, 4));  
    }


    void print(String text) {
        System.out.println(text);
    }

  
    double FtoC(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }


    double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }


    double coneVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height / 3.0;
    }


    double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2)
                       + Math.pow(y2 - y1, 2));
    }
}