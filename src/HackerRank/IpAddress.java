package HackerRank;

public class IpAddress {
    public static void getData(String address) {
        String split[] = address.split("\\.");
        boolean ip = true;
        try {
            for (int i = 0; i < split.length; i++) {


                if (Integer.parseInt(split[i]) > 255 || split[i].length() > 3 || split[i].startsWith("\\.")) {
                    ip = false;
                    break;

                }
            }
        }
        catch (Exception ex)
        {
            ip=false;
        }
        if(ip)
        {
            System.out.println("Adress is corret"+address);
        }
    }

    public static void main(String[] args) {
getData("I.Am.not.an.ip");
    }
}
