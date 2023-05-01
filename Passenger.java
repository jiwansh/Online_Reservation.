public class Passenger {
    private String ag, ge, f, t, d, c, n, pnr;

    private String name;

    public Passenger(String name, String ag, String ge, String f, String t, String d, String c, String n, String pnr) {
        this.name = name;
        this.ag = ag;
        this.ge = ge;
        this.f = f;
        this.t = t;
        this.d = d;
        this.c = c;
        this.n = n;
        this.pnr = pnr;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return ag;
    }

    public String getGender() {
        return ge;
    }

    public String getFrom() {
        return f;
    }

    public String getTo() {
        return t;
    }

    public String getDate() {
        return d;
    }

    public String getClas() {
        return c;
    }

    public String getName2() {
        return n;
    }

    public String getPnr() {
        return pnr;
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.ag + ", Gender: " + this.ge + ", From: " + this.f + ", To: "
                + this.t + ", Date: " + this.d + ", Class: " + this.c + ", Train Number: " + this.n + ", PNR: " + this.pnr;
    }

}
