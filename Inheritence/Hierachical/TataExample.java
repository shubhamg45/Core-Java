// ---------------- Parent Class ----------------
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

// ---------------- Child 1: Automobile ----------------
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

// ---------------- Child 2: Lifestyle ----------------
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

// ---------------- Subclass of Automobile ----------------
class Jaguar extends Automobile {
    private String originCountry;
    private double topSpeed;

    Jaguar(String headOffice, String chairman, int foundedYear,
           String industryType, String mainProduct,
           String originCountry, double topSpeed) {
        super(headOffice, chairman, foundedYear, industryType, mainProduct);
        this.originCountry = originCountry;
        this.topSpeed = topSpeed;
    }

    public void getJaguarInfo() {
        System.out.println("\n--- Jaguar Details ---");
        getAutomobileInfo();
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}

// ---------------- Another subclass of Automobile ----------------
class TataMotors extends Automobile {
    private String ceo;
    private int totalModels;

    TataMotors(String headOffice, String chairman, int foundedYear,
               String industryType, String mainProduct,
               String ceo, int totalModels) {
        super(headOffice, chairman, foundedYear, industryType, mainProduct);
        this.ceo = ceo;
        this.totalModels = totalModels;
    }

    public void getTataMotorsInfo() {
        System.out.println("\n--- Tata Motors Details ---");
        getAutomobileInfo();
        System.out.println("CEO: " + ceo);
        System.out.println("Total Models: " + totalModels);
    }
}

// ---------------- Subclass of Lifestyle ----------------
class Zudio extends Lifestyle {
    private String category;
    private int stores;

    Zudio(String headOffice, String chairman, int foundedYear,
          String businessFocus, int totalBrands,
          String category, int stores) {
        super(headOffice, chairman, foundedYear, businessFocus, totalBrands);
        this.category = category;
        this.stores = stores;
    }

    public void getZudioInfo() {
        System.out.println("\n--- Zudio Details ---");
        getLifestyleInfo();
        System.out.println("Category: " + category);
        System.out.println("Stores: " + stores);
    }
}

// ---------------- Another subclass of Lifestyle ----------------
class Tanishq extends Lifestyle {
    private String productType;
    private int outlets;

    Tanishq(String headOffice, String chairman, int foundedYear,
            String businessFocus, int totalBrands,
            String productType, int outlets) {
        super(headOffice, chairman, foundedYear, businessFocus, totalBrands);
        this.productType = productType;
        this.outlets = outlets;
    }

    public void getTanishqInfo() {
        System.out.println("\n--- Tanishq Details ---");
        getLifestyleInfo();
        System.out.println("Product Type: " + productType);
        System.out.println("Outlets: " + outlets);
    }
}

class TataExample {
    public static void main(String[] args) {

        Jaguar j = new Jaguar("Mumbai", "N. Chandrasekaran", 1868,
                "Automobile", "Luxury Cars", "UK", 320.5);
        j.getJaguarInfo();

        TataMotors tm = new TataMotors("Mumbai", "N. Chandrasekaran", 1868,
                "Automobile", "Commercial & Passenger Vehicles",
                "Guenter Butschek", 35);
        tm.getTataMotorsInfo();

        Zudio z = new Zudio("Mumbai", "N. Chandrasekaran", 1868,
                "Fashion & Apparel", 2, "Casual Wear", 350);
        z.getZudioInfo();

        Tanishq t = new Tanishq("Mumbai", "N. Chandrasekaran", 1868,
                "Jewellery & Lifestyle", 3, "Gold & Diamond", 410);
        t.getTanishqInfo();
    }
}
