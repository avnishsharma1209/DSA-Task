class Solution {
  public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);

    int i = 0;
    for (int j = 0; j < s.length; j++) {
    int cookie = s[j];
    if (i < g.length && g[i] <= cookie)
        ++i;
}

    return i;
  }
}