<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
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
        .search-bar {
            margin-top: 20px;
            margin-bottom: 20px;
            width: 50%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }
        .logout-button {
            margin-top: 20px;
            background-color: #dc3545;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        .logout-button:hover {
            background-color: #c82333;
        }
        .cart-icon {
            margin-top: 20px;
            font-size: 24px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    
    <div id="app" class="container">
        <h1>Welcome to Our Library</h1>
        <p>Please log in or register to access our services.</p>
        
        <input type="text" class="search-bar" placeholder="Search books...">
        
        <button class="logout-button">Logout</button>
        
        <span class="cart-icon">&#128722;</span>
    </div>

    <script>
        
        new Vue({
            el: '#app',
            data: {
            }
        });
    </script>
</body>
</html>