//Пакети використовуються для запобігання конфліктам імен та для зручної організації коду. Визначає, до якого пакету належить файл.Наприклад, пакет com.example буде відповідати директорії com/example
package org.example;
//об'єкт
public class Automobile {
// поля класу(атрибут). Також називають перемінні об'єкта
       public String model;
       public String color;
       public int year;
//конструктор
       public Automobile (String model, int year) {
              this.model = model;
              this.year = year;
              // this.color = color;
       }
// методи об'єкта, також поведінка об'єкта
       public String getModel() {
              return model;
       }
       public int getYear() {
              return year;
       }
}
