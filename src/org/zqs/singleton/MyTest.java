package org.zqs.singleton;

import java.util.HashMap;

public class MyTest {
    private static class Person{
        int idCard;
        String name;

        public Person(int idCard, String name) {
            this.idCard = idCard;
            this.name = name;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()){
                return false;
            }
            Person person = (Person) o;
            //���������Ƿ��ֵ��ͨ��idCard��ȷ��
            return this.idCard == person.idCard;
        }

    }
    public static void main(String []args){
        HashMap<Person,String> map = new HashMap<Person, String>();
        Person person = new Person(1234,"�Ƿ�");
        //put��hashmap��ȥ
        map.put(person,"�����˲�");
        //getȡ�������߼��Ͻ�Ӧ��������������˲���
        System.out.println("���:"+map.get(new Person(1234,"�Ƿ�")));
    }
}