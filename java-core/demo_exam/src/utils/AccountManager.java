package utils;

public class AccountManager {
    private static String USERNAME = "admin";
    private static String PASSWORD = "Admin@123";
    private static String EMAIL = "admin@example.com";

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static void setUSERNAME(String USERNAME) {
        AccountManager.USERNAME = USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        AccountManager.PASSWORD = PASSWORD;
    }

    public static String getEMAIL() {
        return EMAIL;
    }

    public static void setEMAIL(String EMAIL) {
        AccountManager.EMAIL = EMAIL;
    }
}
