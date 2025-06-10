// SPDX-License-Identifier: BSD-3-Clause
package android.os;

public class Build {
  public static class VERSION {
    public static final int SDK_INT = getSdkInt();

    private static int getSdkInt() {
      try {
        Class<?> systemBuildVersion = Class.forName("android.os.Build$VERSION");
        return systemBuildVersion.getField("SDK_INT").getInt(null);
      } catch (Exception e) {
        return 30;
      }
    }
  }
}
