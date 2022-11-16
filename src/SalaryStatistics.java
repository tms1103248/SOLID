/**
 * this class is used for calculating same statistics for salary
 */
public class SalaryStatistics {

    /**
     *
     * @param user- user is selected for statistics
     * @return int value of year's salary
     */
    public int getSalaryStatistics (User user) {
        return user.getSalary()*12;
    }

    public long getSalaryStatistics (Company company) {
        long sum =0;
        for (User user: company.getUsers()){
                    sum+=getSalaryStatistics(user);}
        return sum;
    }
}
