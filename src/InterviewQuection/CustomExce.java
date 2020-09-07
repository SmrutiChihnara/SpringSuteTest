package InterviewQuection;

class MarkedException extends RuntimeException {
    String name;

    public MarkedException(String name) {
        super(name);
        this.name = name;
    }
}


public class CustomExce {
    public void getId(int mark)
    {
        if(mark>100)
        {
            throw new MarkedException("Mark greater then 100");

        }
    }
    public static void main(String[] args) {
        new CustomExce().getId(101);

    }
}
