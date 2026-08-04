class LRUCache {
    class Node {
        int key;
        int value;

        Node next;
        Node prev;

        Node(int key, int val) {
            this.key = key;
            this.value = val;
        }
    }

    HashMap<Integer, Node> mpp;
    Node head;
    Node tail;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        mpp = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    private void insert(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    public int get(int key) {
        if(!mpp.containsKey(key)) {
            return -1;
        }
        Node node = mpp.get(key);
        remove(node);
        insert(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)) {
            remove(mpp.get(key));
        }   

        Node node = new Node(key, value);
        insert(node);
        mpp.put(key, node);
        if(mpp.size() > capacity) {
            Node lru = tail.prev;
            remove(lru);
            mpp.remove(lru.key);
        }
    }
}
