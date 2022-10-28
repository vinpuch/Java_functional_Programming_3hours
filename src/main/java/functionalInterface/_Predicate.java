package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("without Predicate");

        System.out.println(isPhoneNumberValid("090000000"));
        System.out.println(isPhoneNumberValid("092738733"));
        System.out.println(isPhoneNumberValid("070058085"));

        System.out.println("with Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("090000000"));
        System.out.println(isPhoneNumberValidPredicate.test("092738733"));
        System.out.println(isPhoneNumberValidPredicate.test("070058085"));


        System.out.println("Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("090000003"));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    // with Predicate
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
