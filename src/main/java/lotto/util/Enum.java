package lotto.util;

interface Displayable{
    void display();
}

enum MessageType implements Displayable {
    THREE {
        public void display(){
            System.out.println("3개 일치 (5000원)");
        }
    },
    FOUR {
        public void display(){
            System.out.println("4개 일치 (50,000원)");
        }
    },
    FIVE {
        public void display(){
            System.out.println("5개 일치 (1,500,000원)");
        }
    },
    FIVE_AND_ONE {
        public void display(){
            System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원)");
        }
    },
    SIX {
        public void display(){
            System.out.println("6개 일치 (2,000,000,000원)");
        }
    },
}