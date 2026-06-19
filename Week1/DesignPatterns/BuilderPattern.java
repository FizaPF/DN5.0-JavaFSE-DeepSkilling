class Computer{
    private String CPU;
    private int RAM;
    private int Storage;
    Computer(String CPU,int RAM,int Storage)
    {
        this.CPU=CPU;
        this.RAM=RAM;
        this.Storage=Storage;

    }
    public String toString()
    {
        return "Cpu="+CPU+" "+"ram="+RAM+" "+"Storage="+Storage;
    }

    
}
class ComputerBuilder{
        private String CPU;
        private int RAM;
        private int Storage;


        public ComputerBuilder setCPU(String CPU)
        {
            this.CPU=CPU;
            return this;
        }
         public ComputerBuilder setRAM(int RAM)
        {
            this.RAM=RAM;
            return this;
        }
         public ComputerBuilder setStorage(int Storage)
        {
            this.Storage=Storage;
            return this;
        }

        public Computer getComp()
        {
            return new Computer(CPU,RAM,Storage);
        }

    }
class Test{
    public static void main(String [] args)
    {
        Computer c=new ComputerBuilder().setCPU("Intel Core").setRAM(4).setStorage(128).getComp();
        System.out.println(c);

    }
}