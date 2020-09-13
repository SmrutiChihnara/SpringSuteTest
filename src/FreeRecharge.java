interface Network {
    public int getRate();
}

class VodaPhone implements Network {
    public int getRate() {
        return 101;
    }
}

class AirTel implements Network {
    public int getRate() {
        return 199;
    }
}

class Jio implements Network {
    public int getRate() {
        return 99;
    }
}

class Factory {
    public int selectNetWork(String name) {
        if (name.equalsIgnoreCase ("Voda")) {
            return new VodaPhone ().getRate ();
        } else if (name.equalsIgnoreCase ("AirTel")) {
            return new AirTel ().getRate ();
        } else return new Jio ().getRate ();

    }
}

public class FreeRecharge {
    public static void main(String[] args) {
        Factory factory= new Factory ();
        System.out.println (factory.selectNetWork ("voda"));
    }
}
