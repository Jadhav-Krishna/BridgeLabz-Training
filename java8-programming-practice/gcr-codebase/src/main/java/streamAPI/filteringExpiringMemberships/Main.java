package streamAPI.filteringExpiringMemberships;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Amit", LocalDate.now().plusDays(10)),
                new Member("Rohit", LocalDate.now().plusDays(45)),
                new Member("Sneha", LocalDate.now().plusDays(25)),
                new Member("Pooja", LocalDate.now().plusDays(5)),
                new Member("Karan", LocalDate.now().minusDays(2))
        );

        MembershipService service = new MembershipService();

        service.getMembersExpiringInNext30Days(members).forEach(System.out::println);
    }
}
