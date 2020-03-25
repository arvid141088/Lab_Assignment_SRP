package ie.gmit.single;
/**
 * Arvids Ceceruks
 * Group A
 * Single responsibility principle Lab-assignment
 * 23/03/2019
 * ****User storing****
 */
public class UserStoring {
    private Store store = new Store();

    public void storeUser(User user){

        store.store(user);
    }
}
