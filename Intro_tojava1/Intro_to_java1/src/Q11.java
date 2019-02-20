abstract class Q11 {
    int total_branches;
    double rate_of_interest;
    String IFSC_code;

    abstract void getDetails();

}
class SBI extends Q11 {
    SBI() {
        total_branches = 25;
        rate_of_interest = 6.2;
        IFSC_code="SBI88535495";
    }
    @Override
    void getDetails() {
        System.out.println("No of branches of SBI are : "+total_branches);
        System.out.println("Rate of interest : "+rate_of_interest);
        System.out.println("IFSC code: "+IFSC_code);
    }
}
class BOI extends Q11 {
    BOI() {
        total_branches = 16;
        rate_of_interest = 8.6;
        IFSC_code="BOI8884345";
    }
    @Override
    void getDetails() {
        System.out.println("No of branches of BOI are: "+total_branches);
        System.out.println("Rate of interest : "+ rate_of_interest);
        System.out.println("IFSC code: "+IFSC_code);

    }
}
class ICICI extends Q11 {
    ICICI() {
        total_branches = 12;
        rate_of_interest = 6.7;
        IFSC_code="ICICI88535495";
    }
    @Override
    void getDetails() {
        System.out.println("No of branches of ICICI are: "+total_branches);
        System.out.println("Rate of interest: "+rate_of_interest);
        System.out.println("IFSC code: "+IFSC_code);

    }

}
