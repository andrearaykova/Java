import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * Created by andrearaykova on 11/5/17.
 */
public class Trainers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        double techicalTrainersSum = 0;
        double theoreticalTrainersSum = 0;
        double practcalTrainersSum = 0;

        for (int i = 0; i < n ; i++) {

            int distance = Integer.parseInt(reader.readLine());
            double cargoTons = Double.parseDouble(reader.readLine());
            String team = reader.readLine();

            double fuel = 2.5;
            double litters = 0.7;
            int totalDis = distance * 1600;
            double totalCargo = cargoTons * 1000;
            double fuelExpenses = litters * totalDis * fuel;
            double cargoIncome = totalCargo * 1.5;
            double forTeam = cargoIncome - fuelExpenses;



            if (team.equals("Technical")) {

                techicalTrainersSum += forTeam;
            } else if (team.equals("Practical")) {


                practcalTrainersSum += forTeam;
            } else if (team.equals("Theoretical")) {

                theoreticalTrainersSum += forTeam;
            }
        }
            double win = Math.max(techicalTrainersSum,Math.max(theoreticalTrainersSum,practcalTrainersSum));

            if (win == theoreticalTrainersSum)
            {
                System.out.printf("The Theoretical Trainers win with $%.3f.",theoreticalTrainersSum);
            }
            else if (win == techicalTrainersSum)
            {
                System.out.printf("The Technical Trainers win with $%.3f.",techicalTrainersSum);
            }
            else if (win == practcalTrainersSum)
            {
                System.out.printf("The Practical Trainers win with $%.3f.",practcalTrainersSum);
            }
        }
    }

