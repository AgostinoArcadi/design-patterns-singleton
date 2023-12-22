public class Main {

    private static User user;

    public static User getUser() {
        if(user == null) {
            user = new User();
        }
        return user;
    }
    public static void main(String[] args) {

        User utente1 = getUser();
        System.out.println("utente1: " + utente1);

        User utente2 = getUser();
        utente2.setNome("Mario");
        utente2.setEta(21);

        System.out.println("utente2: " + utente2);

    }
}
