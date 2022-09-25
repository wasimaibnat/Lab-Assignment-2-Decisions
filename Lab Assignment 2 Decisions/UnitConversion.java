import java.util.Scanner;

public class UnitConversion {
    final double Fluid_ounce_to_liter = 0.029586;
    final double Gallon_to_liter = 3.758;
    final double Ounce_to_gram = 28.3495;
    final double Pound_to_gram = 453.6;
    final double Inch_to_meter = 0.00254;
    final double Foot_to_meter = 0.305;
    final double Mile_to_meter = 1609.0;

    public void Calculation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Convert from (fl.oz, gal, oz, lb, in, ft, mi): ");
        String convert_from = input.next();
        System.out.print("Convert to (ml, l, g, kg, mm, cm, m, km): ");
        String convert_to = input.next();
        System.out.print("Enter value: ");
        double value = input.nextDouble();
        input.close();

        double c_factor = 0.0;
        if (convert_from.equals("fl.oz")) {
            if (convert_to.equals("ml")) {
                c_factor = Fluid_ounce_to_liter * 1000;
            } else if (convert_to.equals("l")) {
                c_factor = Fluid_ounce_to_liter;
            }
        } else if (convert_from.equals("gal")) {
            if (convert_to.equals("ml")) {
                c_factor = Gallon_to_liter * 1000;
            } else if (convert_to.equals("l")) {
                c_factor = Gallon_to_liter;
            }
        } else if (convert_from.equals("oz")) {
            if (convert_to.equals("g")) {
                c_factor = Ounce_to_gram;
            } else if (convert_to.equals("kg")) {
                c_factor = Ounce_to_gram / 1000;
            }
        } else if (convert_from.equals("lb")) {
            if (convert_to.equals("g")) {
                c_factor = Pound_to_gram;
            } else if (convert_to.equals("kg")) {
                c_factor = Pound_to_gram / 1000;
            }
        } else if (convert_from.equals("in")) {
            if (convert_to.equals("mm")) {
                c_factor = Inch_to_meter * 1000;
            } else if (convert_to.equals("cm")) {
                c_factor = Inch_to_meter * 100;
            } else if (convert_to.equals("m")) {
                c_factor = Inch_to_meter;
            } else if (convert_to.equals("km")) {
                c_factor = Inch_to_meter / 1000;
            }
        } else if (convert_from.equals("ft")) {
            if (convert_to.equals("mm")) {
                c_factor = Foot_to_meter * 1000;
            } else if (convert_to.equals("cm")) {
                c_factor = Foot_to_meter * 100;
            } else if (convert_to.equals("m")) {
                c_factor = Foot_to_meter;
            } else if (convert_to.equals("km")) {
                c_factor = Foot_to_meter / 1000;
            }
        } else if (convert_from.equals("ml")) {
            if (convert_to.equals("mm")) {
                c_factor = Mile_to_meter * 1000;
            } else if (convert_to.equals("cm")) {
                c_factor = Mile_to_meter * 100;
            } else if (convert_to.equals("m")) {
                c_factor = Mile_to_meter;
            } else if (convert_to.equals("km")) {
                c_factor = Mile_to_meter / 1000;
            }
        }

        if (c_factor == 0.0) {
            System.out.println("Conversion is unavailable.");
        } else {
            double converted = value * c_factor;
            System.out.printf("%.4f %s = %.4f %s", value, convert_from, converted, convert_to);
        }
    }

}
