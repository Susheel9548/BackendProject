```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>

    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            font-family: Arial, sans-serif;
            background: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .signup-container {
            width: 400px;
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
            color: #444;
        }

        input[type="text"],
        textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 18px;
            font-size: 15px;
        }

        textarea {
            resize: none;
            height: 90px;
        }

        .gender {
            margin-bottom: 20px;
        }

        .gender input {
            margin-right: 5px;
        }

        .gender label {
            display: inline;
            font-weight: normal;
            margin-right: 15px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background: #0056b3;
        }
    </style>
</head>

<body>

    <div class="signup-container">

        <h2>Sign Up</h2>

        <form action="${pageContext.request.contextPath}/sign-up" method="post">

            <label>Name</label>
            <input type="text" name="name" placeholder="Enter your name" required>

            <label>Gender</label>
            <div class="gender">
                <input type="radio" name="gender" value="Male" id="male">
                <label for="male">Male</label>

                <input type="radio" name="gender" value="Female" id="female">
                <label for="female">Female</label>
                
                <input type="radio" name="gender" value=Other" id="other">
                <label for="female">Other  </label>
            </div>

            <label>Address</label>
            <textarea name="address" placeholder="Enter your address" required></textarea>

            <input type="submit" value="Sign Up">

        </form>

    </div>

</body>
</html>
```
