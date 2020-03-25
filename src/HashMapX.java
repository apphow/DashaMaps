public interface HashMapX {

        void set(String key, Integer value);

        void delete(String key);

        Integer get(String key);

        Boolean isEmpty();

        Integer size();

        Integer bucketSize(String key);

    }

