package DogDemo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DogDemo {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        Dog dog1 = new Dog("Шарик","Серый",3);
        System.out.println("Моя кличка : "+ dog1.getName());
        System.out.println("Мой возраст : "+ dog1.getAge());
        System.out.println("Мой окрас : "+ dog1.getDogColor());
        dog1.voice();
        dog1.eat();
        dog1.voice();
        dog1.sleep();
        System.out.println("---------------------------------------------------");
        Dog dog2 = new Dog("Рекс","Рыжий",4);
        System.out.println("Моя кличка : "+ dog2.getName());
        System.out.println("Мой возраст : "+ dog2.getAge());
        System.out.println("Мой окрас : "+ dog2.getDogColor());
        dog2.voice();
        dog2.eat();
        dog2.voice();
        dog2.sleep();
        System.out.println("---------------------------------------------------");
        Dog dog3 = new Dog("Шарик","Белый",7);
        System.out.println("Моя кличка : "+ dog3.getName());
        System.out.println("Мой возраст : "+ dog3.getAge());
        System.out.println("Мой окрас : "+ dog3.getDogColor());
   
