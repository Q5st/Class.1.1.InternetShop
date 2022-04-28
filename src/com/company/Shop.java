package com.company;

public class Shop {

        private int amount;
        private int prise;
        private String condition;
        private int weight;

        public Shop() {
        }

        public Shop(int amount, int prise, int weight, String condition) {
            this.amount=amount;
            this.prise=prise;
            this.weight=weight;
            this.condition=condition;
        }



        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }
        public int getPrise() {
            return prise;
        }

        public void setPrise(int prise) {
            this.prise = prise;
        }
        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }
        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }


    @Override
    public String toString() {
        return "Shop{" +
                "amount=" + amount +
                ", prise=" + prise +
                ", condition='" + condition + '\'' +
                ", weight=" + weight +
                '}';
    }



}

