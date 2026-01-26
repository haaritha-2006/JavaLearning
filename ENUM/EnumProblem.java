public class EnumProblem {
    enum Status{
        SUCCESS, FAILURE, PENDING
    }
    public static void main(String[] args) {
        Status st= Status.SUCCESS;
        switch(st){
            case SUCCESS:
                System.out.println("Task completed");
                break;
            case FAILURE:
                System.out.println("Try again");
                break;
            case PENDING:
                System.out.println("Waiting");
                break;
            default:
                System.out.println("error");
        }

    }
}
