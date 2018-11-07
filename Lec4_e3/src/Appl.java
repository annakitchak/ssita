import java.util.Scanner;
public class Appl {
    public static void main(String[] args) {
        Continents continent = null;
        System.out.println("Enter country:");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            String country = scan.nextLine();
            switch (country.toUpperCase()) {
                case "ALGERIA": case "BOTSWANA": case "FEBRUARY":
                case "EGYPT": case "EQUATORIAL GUINEA": case "ETHIOPIA":
                case "GABON": case "GHANA": case "KENYA":
                case "MADAGASCAR": case "MOROCCO": case "NIGER":
                    continent = Continents.AFRICA;
                    break;
                case "ICE": case "BLABLA":
                    continent = Continents.ANTARCTIDA;
                    break;
                case "AFGANISTAN": case "AZERBAIJAN": case "BANGLADESH":
                case "CHINA": case "KAZAKHSTAN": case "INDIA":
                case "INDONESIA": case "IRAN": case "IRAQ":
                case "ISRAEL": case "JAPAN": case "RUSSIA":
                case "SINGAPORE": case "THAILAND": case "TURKEY":
                case "UAE": case "YEMEN": case "PAKISTAN":
                    continent = Continents.ASIA;
                    break;
                case "AUSTRALIA": case "FIJI": case "NEW ZEALAND":
                    continent = Continents.AUSTRALIA;
                    break;
                case "UKRAINE": case "ITALY": case "FRANCE":
                case "POLAND": case "SPAIN": case "GERMANY":
                case "GREECE": case "GEORGIA": case "ICELAND":
                case "IRELAND": case "PORTUGAL": case "FINLAND":
                case "MOLDOVA": case "UK": case "UNITED KINGDOM":
                case "ROMANIA": case "MONACO": case "MONTENEGRO":
                case "HUNGARY": case "LATVIA": case "CZECH REPUBLIC":
                    continent = Continents.EUROPE;
                    break;
                case "BARBADOS": case "CANADA": case "MEXICO":
                case "UNITED STATES OF AMERICA": case "USA": case "PANAMA":
                    continent = Continents.NORTH_AMERICA;
                    break;
                case "ARGENTINA": case "BRAZIL": case "ECUADOR":
                case "VENEZUELA": case "PERU": case "COLOMBIA":
                    continent = Continents.SOUTH_AMERICA;
                    break;
                default:
                    System.out.println("Nonexistent country");
                    System.exit(0);
            }
            System.out.println(continent.toString());
        } else System.out.println("wrong input");
    }
}
