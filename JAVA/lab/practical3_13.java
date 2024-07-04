class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

class LicenseApplication {
    public void applyForLicense(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Your age must be grater or equal to 18 for application of license");
        } else {
            System.out.println("License application approved for age " + age);
        }
    }
}

public class practical3_13 {

    public static void main(String[] args) {
        LicenseApplication licenseApp = new LicenseApplication();
        int applicantAge = 19; 

        try {
            licenseApp.applyForLicense(applicantAge);
        } catch (InvalidAgeException e) {
            System.out.println("License application rejected: " + e.getMessage());
        }
    }
}
