public class UserLoginService {
    public boolean login(User user, String password) {
        int tries = user.getCountOfTries();

        if (user.UserIsBlocked()) {
            System.out.println("User is blocked");
            return false;
        }


        boolean isPassCorr = user.getPassword().equals(password);
        if (isPassCorr) {
            user.resetEnterTries();
        } else {
            tries = tries - 1;
            user.setCountOfTries(tries);
        }

        if (tries == 0) {
            user.setUserIsBlocked(true);
        }

        return isPassCorr;
    }
}
