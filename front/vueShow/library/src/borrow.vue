<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Borrow Books</title>
    <script src="https://cdn.jsdelivr.net/npm/vue@2.6.14/dist/vue.js"></script>
    <style>        
        .container {
            text-align: center;
            margin-top: 50px;
        }
        h1 {
            color: #007bff;
        }
        p {
            color: #555;
        }
        .book {
            margin-top: 20px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            width: 50%;
            margin-left: auto;
            margin-right: auto;
        }
        .book-info {
            font-size: 18px;
            margin-bottom: 10px;
        }
        .borrow-button {
            background-color: #28a745;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        .borrow-button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div id="app" class="container">
        <h1>Borrow Books</h1>
        <div v-for="(book, index) in books" :key="index" class="book">
            <p class="book-info">Book Name: {{ book.name }}</p>
            <p class="book-info">ISBN: {{ book.isbn }}</p>
            <p class="book-info">Author: {{ book.author }}</p>
            <p class="book-info">Quantity: {{ book.quantity }}</p>
            <button class="borrow-button" @click="borrowBook(index)">Borrow</button>
        </div>
    </div>

    <script>
        
        new Vue({
            el: '#app',
            data: {
                
                books: [
                    { name: 'Book A', id: '001', author: 'Author A', quantity: 5 },
                    { name: 'Book B', id: '002', author: 'Author B', quantity: 3 },
                    { name: 'Book C', id: '003', author: 'Author C', quantity: 2 }
                ]
            },
            methods: {
                
                borrowBook(index) {
                    
                    alert(`Borrowing ${this.books[index].name}`);
                }
            }
        });
    </script>
</body>
</html>