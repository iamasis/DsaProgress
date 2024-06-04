package DsaProgress._57_HashMap;

public class CstHashNotOP {
    private Entity[] entities;

    public CstHashNotOP(){
        entities = new Entity[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value); // overriding
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
class Main{
    public static void main(String[] args) {
        CstHashNotOP has1 = new CstHashNotOP();
        has1.put("Rahul", "100");
        has1.put("Akash", "90");
        has1.put("Akshay", "95");
        has1.put("Vishal", "98");
        System.out.println(has1.get("Rahul"));
    }
}