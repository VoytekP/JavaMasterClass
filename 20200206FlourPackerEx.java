    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        bigCount = bigCount * 5;

        if ((goal >= bigCount + smallCount) || ((bigCount == goal) || (bigCount == 0) || smallCount >= goal)) {
            return true;

        }
        if (bigCount > goal) {
            return false;
        }

        if (bigCount < goal && ((bigCount + smallCount) > goal)) {
            return true;
        }
        return false;
    }