
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update User</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background: #f2f5f9;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .update-container {
            width: 400px;
            background: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.15);
        }

        .update-container h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }

        .form-group {
            margin-bottom: 18px;
        }

        .form-group label {
            display: block;
            margin-bottom: 7px;
            font-weight: bold;
            color: #444;
        }

        .form-group input {
            width: 100%;
            padding: 11px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 15px;
            outline: none;
        }

        .form-group input:focus {
            border-color: #007bff;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.25);
        }

        .update-btn {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 6px;
            background: #007bff;
            color: white;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
        }

        .update-btn:hover {
            background: #0056b3;
        }

        .id-box {
            background: #f1f1f1;
            color: #666;
        }
    </style>
</head>

<body>

    <div class="update-container">

        <h2>Update User</h2>

        <form action="${pageContext.request.contextPath}/update" method="post">

            <!-- ID -->
            <div class="form-group">
                <label>User ID</label>
                <input type="text"
                       name="id"
                       value="${user.id}"
                       class="id-box"
                       readonly>
            </div>

            <!-- Name -->
            <div class="form-group">
                <label>Name</label>
                <input type="text"
                       name="name"
                       value="${user.name}"
                       placeholder="Enter name"
                       required>
            </div>

            <!-- Gender -->
            <div class="form-group">
                <label>Gender</label>
                <input type="text"
                       name="gender"
                       value="${user.gender}"
                       placeholder="Enter gender"
                       required>
            </div>

            <!-- Address -->
            <div class="form-group">
                <label>Address</label>
                <input type="text"
                       name="address"
                       value="${user.address}"
                       placeholder="Enter address"
                       required>
            </div>

            <button type="submit" class="update-btn">
                Update User
            </button>

        </form>

    </div>

</body>
</html>
```
