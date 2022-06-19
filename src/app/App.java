package app;

import java.io.InputStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite seu texto: ");
        InputStream inConsole = System.in; // fluxo de entrada pelo Console/Terminal
        Reader inStreamReader = new InputStreamReader(inConsole); // Leitor de Fluxo de Entrada
        BufferedReader inBuffer = new BufferedReader(inStreamReader); // Leitor de Buffer de Entrada
        String linha = inBuffer.readLine(); // Leitor de 1 Linha

        OutputStream outConsole = System.out; // Fluxo de saída pelo Console/Terminal
        Writer outStreamWriter = new OutputStreamWriter(outConsole); // Escritor de Fluxo de Saída
        BufferedWriter outBuffer = new BufferedWriter(outStreamWriter); // Escritor de Buffer de Saída

        while (linha != null && !linha.isEmpty()) { // enquanto a linha de entrada não for nula e não for vazia...
            outBuffer.write(linha); // receba a escrita da linha de entrada
            outBuffer.write(" "); // receba um espaço vazio
            linha = inBuffer.readLine(); // leia o Buffer de 1 linha e armazene em linha
            // a saída do laço ocorre quando usuário concede 2 enter seguidos,
            // primeiro é da entrada de dados e o segunda é das condições do while,
            // ou seja, onde a linha recebe nulo e fica vazia
        }

        System.out.println("Olá Mundo com java-vscode by marceloicampos with javaSE-17");
        System.out.println("");
        System.out.print("Hello World com texto no console/terminal: " + linha);

        inBuffer.close(); // fechando Buffer de entrada
        outBuffer.close(); // fechando Buffer de Saída
    }
}
