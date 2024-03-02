<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration</title>
    <script src="https://cdn.jsdelivr.net/npm/vue@2.6.14/dist/vue.js"></script>
    <style>
        
        form {
            margin: auto;
            width: 300px;
        }
        input {
            margin-bottom: 10px;
            width: 100%;
            padding: 5px;
        }
        button {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div id="app">
        <form @submit.prevent="registerUser">
            <input type="text" v-model="phoneNumber" placeholder="Phone Number" required>
            <input type="password" v-model="password" placeholder="Password" required>
            <input type="text" v-model="username" placeholder="Username" required>
            <button type="submit">Register</button>
        </form>
    </div>

    <script>
        new Vue({
            el: '#app',
            data: {
                phoneNumber: '',
                password: '',
                username: ''
            },
            methods: {
                registerUser() {               
                
                    alert('Registration successful!');
                }
            }
        });
    </script>
</body>
</html>