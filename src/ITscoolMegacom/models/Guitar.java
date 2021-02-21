package ITscoolMegacom.models;

import ITscoolMegacom.interfaces.tune;

public class Guitar implements tune {
    private String color;
    private int stringCount = 6;
    private int [] tensions = new int[stringCount];

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
        this.tensions = new int[stringCount];
    }

    public int[] getTensions() {
        return tensions;
    }

    @Override
    public void tune() {
        for (int i = 0; i< tensions.length; i++){
            tensions [i] = 5;
        }

    }

    @Override
    public void play() {
        System.out.println("Когда меня не станет — я буду петь голосами\n"+
                "Моих детей и голосами их детей\n"+
                "Нас просто меняют местами\n"+
                "Таков закон сансары, круговорот людей\n");
        unsettle();

    }
    private void unsettle(){
        for (int i = 0; i < tensions.length; i++){
            tensions [i] = (int) (Math.random() * 3);
        }
    }
}
