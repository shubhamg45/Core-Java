
class Tata {
    private String headOffice;
    private String chairman;
    private int foundedYear;

    Tata(String headOffice, String chairman, int foundedYear) {
        this.headOffice = headOffice;
        this.chairman = chairman;
        this.foundedYear = foundedYear;
    }

    public void getTataInfo() {
        System.out.println("\n=== TATA Group ===");
        System.out.println("Head Office: " + headOffice);
        System.out.println("Chairman: " + chairman);
        System.out.println("Founded Year: " + foundedYear);
    }
}

class Automobile extends Tata {
    private String industryType;
    private String mainProduct;

    Automobile(String headOffice, String chairman, int foundedYear,
               String industryType, String mainProduct) {
        super(headOffice, chairman, foundedYear);
        this.industryType = industryType;
        this.mainProduct = mainProduct;
    }

    public void getAutomobileInfo() {
        getTataInfo();
        System.out.println("Industry Type: " + industryType);
        System.out.println("Main Product: " + mainProduct);
    }
}

class Lifestyle extends Tata {
    private String businessFocus;
    private int totalBrands;

    Lifestyle(String headOffice, String chairman, int foundedYear,
              String businessFocus, int totalBrands) {
        super(headOffice, chairman, foundedYear);
        this.businessFocus = businessFocus;
        this.totalBrands = totalBrands;
    }

    public void getLifestyleInfo() {
        getTataInfo();
        System.out.println("Business Focus: " + businessFocus);
        System.out.println("Total Brands: " + totalBrands);
    }
}

class TataExample1 {
    public static void main(String[] args) {

        Automobile auto = new Automobile("Mumbai", "N. Chandrasekaran", 1868,
                                         "Automobile", "Luxury & Commercial Cars");
        auto.getAutomobileInfo();

        Lifestyle life = new Lifestyle("Mumbai", "N. Chandrasekaran", 1868,
                                       "Fashion & Jewellery", 5);
        life.getLifestyleInfo();
    }
}
