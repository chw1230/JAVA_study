package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        // UserB 는 전부다 적어 줘야함
        pack.b.User userB = new pack.b.User();
    }
}
