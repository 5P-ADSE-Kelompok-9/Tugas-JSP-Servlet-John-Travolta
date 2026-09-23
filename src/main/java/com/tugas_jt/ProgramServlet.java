package com.tugas_jt;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProgramServlet")
public class ProgramServlet extends HttpServlet {
    public double hitungGaji(double jamKerja, double rateGaji) {
        double pemasukan;

        if (jamKerja > 40) {
            double jamNormal = 40;
            double jamLembur = jamKerja - 40;
            pemasukan = (jamNormal * rateGaji) + (jamLembur * rateGaji * 1.5);
        } else {
            pemasukan = jamKerja * rateGaji;
        }
        return pemasukan;
    }

    public String bisaNabung (double pemasukan, double pengeluaran) {
        if (pemasukan > pengeluaran) {
            return "Bisa menabung";
        } else if (pemasukan == pengeluaran) {
            return "Tidak bisa menabung";
        } else {
            return "Cari tambahan";
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        double rateGaji = Double.parseDouble(request.getParameter("rateGaji"));
        double jamKerja = Double.parseDouble(request.getParameter("jamKerja"));
        double pengeluaran = Double.parseDouble(request.getParameter("pengeluaran"));

        double uang = hitungGaji(jamKerja, rateGaji);
        String statusMenabung = bisaNabung(uang, pengeluaran);

        out.println("<html><body>");
        out.println("<h3>Hasil Perhitungan Gaji</h3>");
        out.println("<p>Total Jam Kerja: " + jamKerja + " jam</p>");
        out.println("<p>Jam Kerja Normal: 40 jam</p>");
        out.println("<p>Total Gaji yang Diterima: Rp " + uang + "</p>");
        out.println("<p>Total Pengeluaran: Rp " + pengeluaran + "</p>");
        out.println("</body></html>");
        out.println("<p>Status Keuangan: <b>" + statusMenabung + "</b></p>");
        out.println("</body></html>");
    }
}