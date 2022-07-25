package polimorfismo.herencia.asignacion;

class House implements Buyable
{
    @Override
    public void buy()
    {
    }
}

class Truck extends Vehicle implements Buyable
{
    @Override
    public void start()
    {
    }

    @Override
    public void buy()
    {
    }
}

class Run {
    public static void main(String args[])
    {
        Buyable a = new House();
        a = new Truck();
    }
}