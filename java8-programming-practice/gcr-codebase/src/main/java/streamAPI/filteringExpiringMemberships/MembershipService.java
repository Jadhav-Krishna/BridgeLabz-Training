package streamAPI.filteringExpiringMemberships;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class MembershipService {

    public List<Member> getMembersExpiringInNext30Days(List<Member> members) {

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        return members.stream().filter(member ->!member.getExpiryDate().isBefore(today) && member.getExpiryDate().isBefore(next30Days)).collect(Collectors.toList());
    }
}
