class Book {
    private String id;
    private String judul;
    private String penulis;
    private String kategori;
    private int stock;

    public Book() {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.stock = stock;
    }

    public Book(String id, String judul, String penulis, String kategori, int stock) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.stock = stock;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return judul;
    }

    public void setTitle(String title) {
        this.judul = title;
    }

    public String getAuthor() {
        return penulis;
    }

    public void setAuthor(String penulis) {
        this.penulis = penulis;
    }

    public String getCategory() {
        return kategori;
    }

    public void setCategory(String category) {
        this.kategori = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}