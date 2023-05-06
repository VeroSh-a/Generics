import java.util.Random;
public class MagicBox <T> {
        T[] items;

        public MagicBox(int size) {
            items = (T[]) new Object[size];
        }

        public boolean add(T item) { //метод добавления объекта
            int i;
            for (i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    items[i] = item;
                    return true;
                }
            }
                return false;
        }

        public T pick() { //ищет пустую ячейку
            int i = 0;
           try {
               for (i = 0; i < items.length; i++) {
                   if (items[i] == null) {
                       throw new RuntimeException();
                   }
               }


            } catch(RuntimeException e) {
               System.out.println("The box is not full, it remains to fill the " + (items.length - i) + " cells");
           }
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        }
}

