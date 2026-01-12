class ThrowsExample {
    static void checkAge(int age) throws IllegalAccessException {
        if(age < 18){
            throw new IllegalAccessException("Too young!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch(IllegalAccessException e){
            System.out.println(e.getMessage());
        }
    }
}
