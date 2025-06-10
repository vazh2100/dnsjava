// SPDX-License-Identifier: BSD-3-Clause
package android.net;

public class ConnectivityManager {
  public Network getActiveNetwork() {
    throw new UnsupportedOperationException();
  }

  public LinkProperties getLinkProperties(Network network) {
    throw new UnsupportedOperationException();
  }

  public Network[] getAllNetworks() {
    throw new UnsupportedOperationException();
  }

  public NetworkInfo getNetworkInfo(Network network) {
    throw new UnsupportedOperationException();
  }
}
