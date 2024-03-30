public class Park {
    public class Attractions {
        private String name;
        private String openingtime;
        private String closingtime;
        private int cost;
        public Attractions (String name, String openingtime, String closingtime, int cost) {
            this.name = name;
            this.openingtime = openingtime;
            this.closingtime = closingtime;
            this.cost = cost;
        }
        public void info_park () {
            System.out.println("Название аттракциона: " + name + "; время открытия: " + openingtime +
                    "; время закрытия: " + closingtime+ "; стоимость: " + cost);
        }
    }
}
