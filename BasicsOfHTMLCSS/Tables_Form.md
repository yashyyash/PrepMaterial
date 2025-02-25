### **Understanding `<table>`, `<tr>`, `<td>`, `colspan`, `rowspan` in HTML**
The `<table>` tag in HTML is used to create a table, and within it, we use:
- `<tr>` → Table Row
- `<td>` → Table Data (cells)
- `<th>` → Table Header

---

### **When to Use `colspan` and `rowspan`**
| Attribute | Usage | Example |
|-----------|--------|---------|
| `colspan="x"` | Merges multiple columns into one | If you want a cell to span across 2 or more columns |
| `rowspan="x"` | Merges multiple rows into one | If you want a cell to span across 2 or more rows |

---

## **📌 Example: Table Using `colspan` & `rowspan`**
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Table Example</title>
    <style>
        table {
            width: 50%;
            border-collapse: collapse;
            margin: 20px auto;
        }
        th, td {
            border: 1px solid black;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

    <h2 align="center">Table Example with Colspan and Rowspan</h2>

    <table>
        <tr>
            <th>Day</th>
            <th colspan="2">Time</th>  <!-- Merging 2 columns -->
        </tr>
        <tr>
            <td rowspan="2">Monday</td>  <!-- Merging 2 rows -->
            <td>10 AM - 12 PM</td>
            <td>Math Class</td>
        </tr>
        <tr>
            <td>1 PM - 3 PM</td>
            <td>Physics Class</td>
        </tr>
        <tr>
            <td>Tuesday</td>
            <td colspan="2">Holiday</td>  <!-- Merging 2 columns -->
        </tr>
    </table>

</body>
</html>
```

🔹 **Key Takeaways:**
- `colspan="2"` → Merges two columns.
- `rowspan="2"` → Merges two rows.
- Used when you want to **group cells** for better readability.

---

## **📌 Forms in HTML**
A form in HTML allows users to enter data. It uses:
- `<form>` → Defines the form
- `<input>` → Takes user input (text, email, password, etc.)
- `<textarea>` → Multi-line text input
- `<select>` → Dropdown list
- `<button>` → Submit button
- `<label>` → Label for inputs

---

## **📌 Example: Simple Form**
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Basic Form</title>
</head>
<body>

    <h2>Contact Us</h2>
    
    <form action="submit.php" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <br><br>

        <label for="message">Message:</label>
        <textarea id="message" name="message" rows="4"></textarea>
        <br><br>

        <button type="submit">Submit</button>
    </form>

</body>
</html>
```

---

## **📌 Adding CAPTCHA in a Form**
CAPTCHA helps prevent spam by requiring human verification.

### **Google reCAPTCHA (Easiest Method)**
1. **Sign up on** [Google reCAPTCHA](https://www.google.com/recaptcha/)
2. **Get site key & secret key**
3. **Use this code in your form**

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form with CAPTCHA</title>
    <script src="https://www.google.com/recaptcha/api.js" async defer></script>
</head>
<body>

    <h2>Signup Form with reCAPTCHA</h2>
    
    <form action="submit.php" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required>
        <br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <br><br>

        <!-- CAPTCHA -->
        <div class="g-recaptcha" data-sitekey="YOUR_SITE_KEY_HERE"></div>
        <br>

        <button type="submit">Submit</button>
    </form>

</body>
</html>
```

---

## **📌 How CAPTCHA Works**
1. The form includes a CAPTCHA verification.
2. When submitted, Google verifies whether the user is a **human** or a **bot**.
3. If the CAPTCHA is **correct**, the form is processed.

---

## **📌 When to Use CAPTCHA?**
✅ **Login Forms** – Prevent brute force attacks.  
✅ **Signup Forms** – Stop fake registrations.  
✅ **Contact Forms** – Avoid spam messages.  
✅ **Polls & Surveys** – Ensure real responses.  

---

## **📌 Final Thoughts**
- **Tables** organize data.  
- Use `colspan` & `rowspan` to **merge cells** for better layout.  
- **Forms** collect user input.  
- **CAPTCHA** prevents spam and bots.  

---

Let me know if you need **more explanations or modifications!** 🚀🔥