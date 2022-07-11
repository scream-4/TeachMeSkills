package les8.Task3;

public class Cosmodrome {
    public void start(IStart start){
        if(!start.preSystemCheck()){
            System.out.println("Предстартовая проверка провалена!");
        }else{
            start.engineStart();
            for (int i = 0; i < 10; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(10-i);
            }
            start.start();
        }
    }
}
