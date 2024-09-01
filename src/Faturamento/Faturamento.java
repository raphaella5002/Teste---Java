package Faturamento;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Faturamento {
    
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        
        File inputFile = new File ("faturamento.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();

        NodeList dias = doc.getElementsByTagName("dia");
        

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int contDias = 0;

        for(int i = 0; i < dias.getLength(); i++ ){
            Element dia = (Element) dias.item(i);
            double valor = Double.parseDouble(dia.getAttribute("valor"));

        if (valor > 0) {
            if (valor < menorFaturamento) {
                menorFaturamento = valor;
            }
            if (valor > maiorFaturamento) {
                maiorFaturamento = valor;
            }

            somaFaturamento  += valor;
            contDias ++;
        }
    }

        double mediaFaturamento = (contDias > 0 ) ? somaFaturamento / contDias : 0;

        int diasAcimaMédia = 0;

        for(int i = 0; i < dias.getLength(); i ++){
            Element dia = (Element) dias.item(i);
            double valor = Double.parseDouble(dia.getAttribute("valor"));
            if (valor > mediaFaturamento) {
                diasAcimaMédia++;
            }
        }

            System.out.printf("Maior faturamento diário foi R$ %.2f%n" + maiorFaturamento);
            System.out.printf("Menor faturamento diário foi R$ %.2f%n" + menorFaturamento);
            System.out.println("Total de dias acima da média: " + diasAcimaMédia);
        
    }
}
