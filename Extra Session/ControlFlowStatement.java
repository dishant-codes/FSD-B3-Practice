class ControlFlowStatement{

    public static void main(String[] args) {
        
        
        boolean isCETCompleted = false;


        if (isCETCompleted) {
            System.out.println("You can Apply for PG");
        }
        else{
            System.out.println("You need to CET examination");
        }


        // for(init; condition; increment/decrement)


        for(int step=0; step < 5; step++){
            System.out.println("Step "+step);
        }

    }

}