<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Hitung Gaji & Tabungan</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
            background-color: #f4f7f6;
        }
        .container {
            max-width: 500px;
            background: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 15px rgba(0,0,0,0.1);
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
            color: #555;
        }
        input[type="number"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        button {
            background-color: #28a745;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            font-size: 16px;
        }
        button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Form Simulasi Keuangan</h2>
    <!-- Atribut action harus diarahkan ke URL @WebServlet milik Servlet Anda -->
    <form action="ProgramServlet" method="POST">
        
        <div class="form-group">
            <label for="rateGaji">Rate Gaji per Jam (Rp):</label>
            <input type="number" id="rateGaji" name="rateGaji" value="15000" required>
        </div>

        <div class="form-group">
            <label for="jamKerja">Total Jam Kerja:</label>
            <input type="number" id="jamKerja" name="jamKerja" value="52" required>
        </div>

        <div class="form-group">
            <label for="pengeluaran">Total Pengeluaran (Rp):</label>
            <input type="number" id="pengeluaran" name="pengeluaran" value="600000" required>
        </div>

        <button type="submit">Hitung Gaji & Status</button>
    </form>
</div>

</body>
</html>
