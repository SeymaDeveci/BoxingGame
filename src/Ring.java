public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;



    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public int randomFighter(){
        int selectFighter = (int) (Math.random() * 10);
        selectFighter = (selectFighter <= 5) ? 1 : 2;
        return selectFighter;
    }

    public boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(f2.name + " kazandı.");
            return true;
        }

        if (this.f2.health == 0){
            System.out.println(f1.name + " kazandı.");
            return true;
        }

        return false;
    }

    public void run(){
        if(isCheck()){

            while (this.f1.health > 0 && this.f2.health > 0){
                if (randomFighter() == 1){
                    System.out.println("====== YENİ ROUND ======");
                    System.out.println(f1.name + " Starting!");
                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f1.name +" savasçısının sağlığı: " + this.f1.health);
                    System.out.println(this.f2.name +" savasçısının sağlığı: " +this.f2.health);
                    if (isWin()){
                        break;
                    }
                } else {
                    System.out.println("====== YENİ ROUND ======");
                    System.out.println(f2.name + " Starting!");
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.name +" savasçısının sağlığı: " + this.f1.health);
                    System.out.println(this.f2.name +" savasçısının sağlığı: " +this.f2.health);
                    if (isWin()){
                        break;
                    }
                }
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    public boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
}
