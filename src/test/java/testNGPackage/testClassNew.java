package testNGPackage;//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

public class testClassNew {




        @Test
        public void testNumber1(){
            System.out.println("Testing Number 1");

        }

        @BeforeEach
        public void testNumber2(){
            System.out.println("Testing Number 2 new line new commit")
            ;
            System.out.println("New Git commit");

        }

    }

