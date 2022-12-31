package com.sltc.soa.client;

import com.sltc.soa.client.stub.DemoWS;
import com.sltc.soa.client.stub.DemoWSService;

import java.net.URL;
import java.util.Scanner;

public class Main
{

    public static void main( String[] args )
    {
//         URL url = new URL("http://demowebservice.com:8080/currencyservice?wsdl");
//        DemoWSService = new DemoWSService(url);

        boolean menu=true;

        do
        {
            System.out.println(" 1) Currency conversion\n 2) Exit");
            float result=readInputFloat();
            if      (result==1) {convert();}
            else if (result==2) {menu=false;}
            else {System.out.println( "Invalid input:(" );}

            System.out.println( "" );

        }while(menu==true);

    }

    private static float readInputFloat()
    {
        float inputInt = 0;
        boolean numberFound = false;
        Scanner scan = new Scanner( System.in );
        do
        {
            System.out.println( "Please input value" );
            String inputStr = scan.next();
            try
            {
                inputInt = Float.valueOf( inputStr );
                numberFound = true;
            }
            catch( Exception e )
            {
                System.out.println( "Invalid input:( " + inputStr + ". Please input a number" );
            }

        } while( !numberFound );
        return inputInt;
    }

    private static String readInputIntStr()
    {
        Scanner scan = new Scanner( System.in );
        String inputStr = scan.next();
        return inputStr;
    }

    private static int convert()
    {
        DemoWSService demoWSService = new DemoWSService();
        DemoWS demoWSPort = demoWSService.getDemoWSPort();


        System.out.println( "Please input code of source Currency" );
        String sourceCurrency = readInputIntStr();

        System.out.println( "Please input code of target Currency" );
        String targetCurrency = readInputIntStr();

        System.out.println( "Amount to convert:" );
        float amountInSourceCurrency = readInputFloat();

        float result = demoWSPort.convert( amountInSourceCurrency, sourceCurrency , targetCurrency);

        if(result==-1){System.out.println( "Invalid input:(");}
        else {System.out.println( "Currency Conversion is done:)\n Result is: " + result );}

        return 0;
    }
}

