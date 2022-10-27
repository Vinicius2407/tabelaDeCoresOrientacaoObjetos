package atividade;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String arquiveHTML = "escrita.html";
        BufferedWriter writeArquive = new BufferedWriter(new FileWriter(arquiveHTML));

        String startHtml = "<html>" +
                "<head>" +
                "<title>Tabela de Cores HTML</title>" +
                "<meta http-equiv='Content-Type' content='text/html;' charset=UTF-8'>" +
                "<body>" +
                "<p>&nbsp;</p>" +
                "<h2 align='center'>Tabela de Cores HTML</h2>" +
                "<table width='400' align='center' border='1'>" +
                "<tr>" +
                "<th width='200' align='center'>Cor</th>" +
                "<th width='200' align='center'>Codigo Hexadecimal</th>" +
                "</tr>";
        writeArquive.write(startHtml);

        String[] rgb = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
        String tabela = null;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                for (int k = 0; k < 16; k++) {
                    if (tabela == null) {
                        tabela = "<tr>" +
                                "<td bgcolor='#" + rgb[i] + "0" + rgb[j] + "0" + rgb[k] + "0'></td>" +
                                "<td align='center'>'#" + rgb[i] + "0" + rgb[j] + "0" + rgb[k] + "0'</td>" +
                                "</tr>" +
                                "\n";
                    } else {
                        tabela += "<tr>" +
                                "<td bgcolor='#" + rgb[i] + "0" + rgb[j] + "0" + rgb[k] + "0'></td>" +
                                "<td align='center'>'#" + rgb[i] + "0" + rgb[j] + "0" + rgb[k] + "0'</td>" +
                                "</tr>" +
                                "\n";
                    }
                }
            }
        }
        writeArquive.write(tabela);

        String closed = "</table></body></html>";
        writeArquive.write(closed);
        writeArquive.close();

    }
}