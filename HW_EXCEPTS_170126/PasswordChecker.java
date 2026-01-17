public class PasswordChecker {

    private Integer minLength;
    private Integer maxRepeats;

    protected void setMinLength(int minLength) {
        if (minLength < 0) {
            throw new IllegalArgumentException("Длина пароля не может быть отрицательной!");
        }
        this.minLength = minLength;
    }

    protected void setMaxRepeats(int maxRepeats) {
        if (maxRepeats <= 0) {
            throw new IllegalArgumentException("Максимальное количество повторов должно быть больше 0");
        }
        this.maxRepeats = maxRepeats;
    }

    public boolean verify(String password) {
        if (minLength == null || maxRepeats == null) {
            throw new IllegalStateException(
                    "Не заданы все настройки чекера");
        }

        if (password.length() < minLength) {
            return false;
        }

        int repeats = 1;

        for (int i = 1; i < password.length(); i++) {
            if (password.charAt(i) == password.charAt(i - 1)) {
                repeats++;
                if (repeats > maxRepeats) {
                    return false;
                }
            } else {
                repeats = 1;
            }
        }

        return true;
    }
}
