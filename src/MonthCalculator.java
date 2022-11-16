public class MonthCalculator {
    // This class is used for calculating some data related to months

    /**
     *
     * @param user - current user
     * @return
     */


    public int getCurrentMonthOfLife (User user){
        return user.getAge()*12;
    }
}
