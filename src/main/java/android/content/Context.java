// SPDX-License-Identifier: BSD-3-Clause
package android.content;

public class Context {
  public <T> T getSystemService(Class<T> serviceClass) {
    throw new UnsupportedOperationException();
  }

  public <T> T getSystemService(String name) {
    throw new UnsupportedOperationException();
  }

  public static final String CONNECTIVITY_SERVICE = "connectivity";
}
