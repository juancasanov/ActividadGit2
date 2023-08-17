package model;

//Esta es la rama Hotfix, tuvimos un problema y tuvimos que corregirlo.
//Espero que no se hayan causado muchos inconvenientes.
public class Recursive {

    public int sum(int n[], int i, int acc) {
        int out = 0;

        if (i >= 0) {
            out = sum(n, i-1, n[i] + acc);
        } else {
            out = acc;
        }

        return out;
    }

    public String rev(String msg, int i, String acc) {
        String out = "";

        if (i >= 0) {
            out = rev(msg, i - 1, acc + msg.charAt(i));
        } else {
            out = acc;
        }

        return out;
    }

    public double prom(int n[], int i, int acc) {
        double out = 0;

        if (i >= 0) {
            out = prom(n, i - 1, n[i] + acc);
        } else {
            out = acc;
        }

        return out;
    }

    public int pos(int num[], int n, int i) {
        int out = 0;

        if (num[i] == n) {
            out = i;
        } else {
            out = pos(num, n, i+1);
        }

        return out;
    }

    public int[] division(int n, int m, int r) {
        int[] out = new int[2];
        int div = 0;

        if ((n-m) < 0) {
            out[0] = r;
            out[1] = n;
        } else {
            out = division(n - m, m, r + 1);
        }

        return  out;
    }

    public int mcd(int n, int m, int acc) {
        int out = 0;

        if (m == 0) {
            out = n;
        } else  {
            out = mcd(m, n%m, acc + 1);
        }

        return out;
    }

    public int[] billetes(double target, int[] r, int i, int a, int acc) {

        int[] s = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50};

        if (i < s.length) {
            if ((acc + s[i]) <= target) {
                r[i] = a;
                r = billetes(target, r, i, a + 1, acc + s[i]);
            } else {
                r = billetes(target, r , i + 1, 0,acc);
            }
        }

        return r;
    }
}
