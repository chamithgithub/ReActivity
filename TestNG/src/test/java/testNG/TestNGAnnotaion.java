package testNG;

import org.testng.annotations.Test;

public class TestNGAnnotaion {
    public static void main(String[] args) {
        System.out.println("this is a testNg 01 ");
        TestNGAnnotaion testNGAnnotaion01 =new TestNGAnnotaion() ;
        testNGAnnotaion01.notATestNGTestTwo();
    }
    public void notATestNGTestTwo(){
        System.out.println("this is a teatng 02");

    }

    @Test
    public void test(){
        System.out.println("test one");
    }
}
