import java.util.Scanner;

/**
 * Created by andrearaykova on 1/17/17.
 */
public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        double m = 1.0;
        double mm = 1000.0;
        double cm = 100.0;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        double result = 0;


        if (input.equals("m")) {
            if (output.equals("mm")) {
                result = a * mm;
            } else if (output.equals("cm")) {
                result = a * cm;
            } else if (output.equals("mi")) {
                result = a * mi;
            } else if (output.equals("in")) {
                result = a * in;
            } else if (output.equals("km")) {
                result = a * km;
            } else if (output.equals("ft")) {
                result = a * ft;
            } else if (output.equals("yd")) {
                result = a * yd;
            } else if (output.equals("m")) {
                result = a;
            }
        } else if (input.equals("mm")) {
            a = a / mm;
            if (output.equals("m")) {
                result = a;
            } else if (output.equals("mm")) {
                result = a * mm;
            } else if (output.equals("cm")) {
                result = a * cm;
            } else if (output.equals("mi")) {
                result = a * mi;
            } else if (output.equals("in")) {
                result = a * in;
            } else if (output.equals("km")) {
                result = a * km;
            } else if (output.equals("ft")) {
                result = a * ft;
            } else if (output.equals("yd")) {
                result = a * yd;
            }
        } else if (input.equals("cm")) {
            a = a / cm;
            if (output.equals("m")) {
                result = a;
            } else if (output.equals("cm")) {
                result = a * cm;
            } else if (output.equals("mm")) {
                result = a * mm;
            } else if (output.equals("mi")) {
                result = a * mi;
            } else if (output.equals("in")) {
                result = a * in;
            } else if (output.equals("km")) {
                result = a * km;
            } else if (output.equals("ft")) {
                result = a * ft;
            } else if (output.equals("yd")) {
                result = a * yd;
            }
        } else if (input.equals("mi")) {
            a = a / mi;
            if (output.equals("m")) {
                result = a;
            } else if (output.equals("mi")) {
                result = a * mi;
            } else if (output.equals("cm")) {
                result = a * cm;
            } else if (output.equals("mm")) {
                result = a * mm;
            } else if (output.equals("in")) {
                result = a * in;
            } else if (output.equals("km")) {
                result = a * km;
            } else if (output.equals("ft")) {
                result = a * ft;
            } else if (output.equals("yd")) {
                result = a * yd;
            }
        } else if (input.equals("in")) {
            a = a / in;
            if (output.equals("m")) {
                result = a;
            } else if (output.equals("in")) {
                result = a * in;
            } else if (output.equals("cm")) {
                result = a * cm;
            } else if (output.equals("mi")) {
                result = a * mi;
            } else if (output.equals("mm")) {
                result = a * mm;
            } else if (output.equals("km")) {
                result = a * km;
            } else if (output.equals("ft")) {
                result = a * ft;
            } else if (output.equals("yd")) {
                result = a * yd;
            }
        } else if (input.equals("km")) {
            a = a / km;
            if (output.equals("m")) {
                result = a;
            } else if (output.equals("km")) {
                result = a * km;
            } else if (output.equals("cm")) {
                result = a * cm;
            } else if (output.equals("mi")) {
                result = a * mi;
            } else if (output.equals("in")) {
                result = a * in;
            } else if (output.equals("mm")) {
                result = a * mm;
            } else if (output.equals("ft")) {
                result = a * ft;
            } else if (output.equals("yd")) {
                result = a * yd;
            }
        } else if (input.equals("ft")) {
            a = a / ft;
            if (output.equals("m")) {
                result = a;
            } else if (output.equals("ft")) {
                result = a * ft;
            } else if (output.equals("cm")) {
                result = a * cm;
            } else if (output.equals("mi")) {
                result = a * mi;
            } else if (output.equals("in")) {
                result = a * in;
            } else if (output.equals("km")) {
                result = a * km;
            } else if (output.equals("mm")) {
                result = a * mm;
            } else if (output.equals("yd")) {
                result = a * yd;
            }
        } else if (input.equals("yd")) {
            a = a / yd;
            if (output.equals("m")) {
                result = a;
            } else if (output.equals("yd")) {
                result = a * yd;
            } else if (output.equals("cm")) {
                result = a * cm;
            } else if (output.equals("mi")) {
                result = a * mi;
            } else if (output.equals("in")) {
                result = a * in;
            } else if (output.equals("km")) {
                result = a * km;
            } else if (output.equals("ft")) {
                result = a * ft;
            } else if (output.equals("mm")) {
                result = a * mm;
            }
        }
        System.out.printf(result  + " " + output);
    }
}
