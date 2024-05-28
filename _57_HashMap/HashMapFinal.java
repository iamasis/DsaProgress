package DsaProgress._57_HashMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMapFinal<K, V> {
    ArrayList<LinkedList<Entity>> list;
    private class Entity{
        K key;
        V value;
        public Entity(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
    int size = 0;
    private float lf = 0.75f;
    public HashMapFinal(){
        list = new ArrayList<>();
        for(int i =0 ; i < 10; i++){
            list.add(new LinkedList<>());
        }
    }
    public void put(K key, V value){
        int hash = Math.abs(key.hashCode()% list.size());
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if(entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }

        if((float)(size) / list.size() >lf){
            rehash();
        }
        entities.add(new Entity(key, value));
        size++;
    }
    private void rehash(){
        System.out.println("We are rehashing");
        List<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        size=0;
        for (int i = 0; i < old.size()*2; i++) {
            list.add(new LinkedList<>());
        }
        for (LinkedList<Entity> entries : old){
            for (Entity entry : entries){
                put(entry.key, entry.value);
            }
        }
    }
    public void remove(K key){
        int hash = Math.abs(key.hashCode()% list.size());
        LinkedList<Entity> entities = list.get(hash);
        Entity target = null;
        for (Entity entry : entities){
            if (entry.key.equals(key)){
                target = entry;
                break;
            }
        }
        entities.remove(target);
        size--;
    }
    public V get(K key){
        int hash = Math.abs(key.hashCode()% list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entry : entities){
            if (entry.key.equals(key)){
                return entry.value;
            }
        }
        return null;
    }
    public boolean containsKey(K key){
        return get(key) != null;
    }

    @Override
    public String toString() {
       StringBuilder builder = new StringBuilder();
       builder.append("{");
       for (LinkedList<Entity> entities : list){
           for (Entity entry : entities){
               builder.append(entry.key);
               builder.append(" = ");
               builder.append(entry.value);
               builder.append(", ");
           }
       }
       builder.append("}");
       return builder.toString();
    }
}
class Main2{
    public static void main(String[] args) {
        HashMapFinal<String, String> map = new HashMapFinal<>();

        map.put("Mango", "King of fruits");
        map.put("Apple", "A sweet red fruit");
        map.put("Litchi", "Kunal's fav fruit");

        System.out.println(map);
    }
}
