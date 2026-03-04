import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@AllArgsConstructor


public class Person {
    @NonNull
    int id;
    @NonNull
    String name;
    @NonNull
        String email;
        String password;
        String phone;
        String address;
        String city;
        String country;
        String zip;


}
