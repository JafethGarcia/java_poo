package polimorfismo.sobrecarga;

class String {
    public String(char[] data) {
    }

    public String(char[] data, int offset, int count) {
    }

    public static java.lang.String valueOf(Object obj)
    {
        if (obj == null) {
            return "null";
        }
        return obj.toString();
    }

    public static String valueOf(char data[]) 
    {
        return new String(data);
    }

    public static String valueOf(char data[], int offset, int count) 
    {
        return new String(data, offset, count);
    }
}