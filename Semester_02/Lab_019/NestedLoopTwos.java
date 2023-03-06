package Lab_019;

public interface NestedLoopTwos {
    public static void main(String[] args) {
        String output = "";
        
        for (int i = 0; i < 5; i++) { //rows
            for (int j = 0; j < 3; j++) { // columns
                output+="2";
                if (j != 2) {
                    output+=", ";
                }
            }
            output+="\n";
        }
        System.out.println(output);
    }
}
