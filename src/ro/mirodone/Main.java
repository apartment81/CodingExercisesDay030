package ro.mirodone;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ModulusAnimation m = new ModulusAnimation();
        m.animation();

            int repeats = 6;
            int steps_per_second = 5;

            for ( int i=0; i < repeats*10 ; i++ ) {
                if ( i%23 == 0 )
                    System.out.print(" D          \r");
                else if ( i%23 == 1 )
                    System.out.print(" RD         \r");
                else if ( i%23 == 2 )
                    System.out.print(" IRD        \r");
                else if ( i%23 == 3 )
                    System.out.print(" EIRD       \r");
                else if ( i%23 == 4 )
                    System.out.print(" WEIRD      \r");
                else if ( i%23 == 5 )
                    System.out.print("  WEIRD     \r");
                else if ( i%23 == 6 )
                    System.out.print(" S WEIRD    \r");
                else if ( i%23 == 7 )
                    System.out.print(" IS WEIRD   \r");
                else if ( i%23 == 8 )
                    System.out.print("  IS WEIRD  \r");
                else if ( i%23 == 9 )
                    System.out.print(" S IS WEIRD \r");
                else if ( i%23 == 10 )
                    System.out.print(" IS IS WEIRD\r");
                else if ( i%23 == 11 )
                    System.out.print(" HIS IS WEIR\r");
                else if ( i%23 == 12 )
                    System.out.print(" THIS IS WEI\r");
                else if ( i%23 == 13 )
                    System.out.print("  THIS IS WE\r");
                else if ( i%23 == 14 )
                    System.out.print("   THIS IS W\r");
                else if ( i%23 == 15 )
                    System.out.print("    THIS IS \r");
                else if ( i%23 == 16 )
                    System.out.print("     THIS IS\r");
                else if ( i%23 == 17 )
                    System.out.print("      THIS I\r");
                else if ( i%23 == 18 )
                    System.out.print("       THIS \r");
                else if ( i%23 == 19 )
                    System.out.print("        THIS\r");
                else if ( i%23 == 20 )
                    System.out.print("         THI\r");
                else if ( i%23 == 21 )
                    System.out.print("          TH\r");
                else if ( i%23 == 22 )
                    System.out.print("           T\r");
                else if ( i%23 == 23 )
                    System.out.print("            \r");

                Thread.sleep(1000/steps_per_second);
            }
    }
}
