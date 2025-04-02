package testcases;
import java.util.Arrays;
import main.Main;

public class MainTest {
   public MainTest() {
   }

   public static void runTestCase(int[] var0, int var1, int[] var2, int[] var3) {
      int var10002 = var3[0]++;
      int var4 = Main.longestMountain(var0);
      System.out.print("\nTest Case " + var3[0] + ": ");
      if (var4 == var1) {
         var10002 = var2[0]++;
         System.out.println("\n✅ Test Passed!");
      } else {
         int[] var5 = var0;
         int var6 = var0.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var5[var7];
            System.out.print("" + var8 + " ");
         }

         System.out.println("\n❌ Test Failed");
         System.out.println("   Expected: " + var1);
         System.out.println("   Actual  : " + var4);
      }

   }

   public static void main(String[] var0) {
      int[] var1 = new int[1];
      int[] var2 = new int[1];
      runTestCase(new int[]{2, 1, 4, 7, 3, 2, 5}, 5, var1, var2);
      runTestCase(new int[]{1, 3, 5, 3, 4, 2, 0, 8, 10, 7, 6, 5, 4, 3, 1}, 9, var1, var2);
      runTestCase(new int[]{2, 1, 3, 2, 1, 5, 6, 5, 2, 1}, 6, var1, var2);
      runTestCase(new int[]{2, 2, 2}, 0, var1, var2);
      runTestCase(new int[]{1}, 0, var1, var2);
      runTestCase(new int[]{1, 2}, 0, var1, var2);
      runTestCase(new int[]{1, 2, 3}, 0, var1, var2);
      runTestCase(new int[]{0, 1, 0}, 3, var1, var2);
      runTestCase(new int[]{5, 4, 3, 2, 1}, 0, var1, var2);
      runTestCase(new int[]{1, 3, 2, 4, 3, 2, 1}, 5, var1, var2);
      runTestCase(new int[]{1, 2, 1, 2, 1}, 3, var1, var2);
      runTestCase(new int[]{2, 1, 2}, 0, var1, var2);
      runTestCase(new int[]{0, 0, 1, 0, 0}, 3, var1, var2);
      runTestCase(new int[]{1, 2, 3, 2, 1, 2, 3, 2, 1}, 5, var1, var2);
      runTestCase(new int[]{1, 2, 2, 2, 1}, 0, var1, var2);
      runTestCase(new int[]{1, 2, 3, 3, 2, 1}, 0, var1, var2);
      runTestCase(new int[]{1, 3, 5, 3, 1, 2, 4, 6, 7}, 5, var1, var2);
      runTestCase(new int[]{1, 2, 3, 2, 1, 2, 3, 4, 3, 1, 5, 6, 5, 2, 1}, 6, var1, var2);
      int[] var3 = new int[10000];
      Arrays.fill(var3, 0, 4999, 5);
      var3[4999] = 10;
      var3[5000] = 5;
      Arrays.fill(var3, 5001, 10000, 5);
      runTestCase(var3, 3, var1, var2);
      int[] var4 = new int[999];

      int var5;
      for(var5 = 1; var5 <= 500; var4[var5 - 1] = var5++) {
      }

      var5 = 499;

      for(int var6 = 500; var5 >= 1; ++var6) {
         var4[var6] = var5--;
      }

      runTestCase(var4, 999, var1, var2);
      System.out.printf("\n\n✅ Passed %d / %d test cases!\n", var1[0], var2[0]);
      if (var1[0] != var2[0]) {
         throw new AssertionError("Some test cases failed.");
      }
   }
}