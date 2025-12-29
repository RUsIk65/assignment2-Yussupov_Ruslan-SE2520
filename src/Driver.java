public class Driver{
    private String name;
    private String licenceNumber;
    private String professional;

    public Driver(String name, String licenceNumber, String professional)
    {
        this.name = name;
        this.licenceNumber = licenceNumber;
        this.professional = professional;
    }

    public String getProfessional() {
        return professional;
    }

    public void displayDriverInfo() {
        System.out.println("Driver: " + name + ", License: " + licenceNumber);
    }
}
