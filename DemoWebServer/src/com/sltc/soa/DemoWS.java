package com.sltc.soa;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;
import java.util.*;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class DemoWS
{

    @WebMethod
    public float convert(float amountInSourceCurrency,String sourceCurrency,String targetCurrency)
    {
        if(0==database(sourceCurrency) || 0==database(targetCurrency))
        {
            System.out.println("Invalid request");
            return -1;
        }
        else
        {
            float result=(amountInSourceCurrency/database(sourceCurrency))*(database(targetCurrency));
            System.out.println(amountInSourceCurrency+" "+sourceCurrency+" = "+(amountInSourceCurrency/database(sourceCurrency))+
                    " USD = " + result +" "+targetCurrency);

            return result;
        }
    };

    public float database(String currency)
    {
        Map<String, String> map = new HashMap<>();
        map.put("AED","3.6732");
        map.put("AFN","77.050008");
        map.put("ALL","103.68506");
        map.put("AMD","481.616228");
        map.put("ANG","1.795336");
        map.put("AOA","654.817");
        map.put("ARS","81.308621");
        map.put("AUD","1.35885");
        map.put("AWG","1.8");
        map.put("AZN","1.7025");
        map.put("BAM","1.63183");
        map.put("BBD","2");
        map.put("BDT","84.820901");
        map.put("BGN","1.638754");
        map.put("BHD","0.377047");
        map.put("BIF","1942.067684");
        map.put("BMD","1");
        map.put("BND","1.337283");
        map.put("BOB","6.896333");
        map.put("BRL","5.3326");
        map.put("BSD","1");
        map.put("BTC","0.000050883602");
        map.put("BTN","73.955366");
        map.put("BWP","11.045764");
        map.put("BYN","2.590297");
        map.put("BZD","2.016103");
        map.put("CAD","1.299149");
        map.put("CDF","1967.998483");
        map.put("CHF","0.908343");
        map.put("CLF","0.027612");
        map.put("CLP","761.901298");
        map.put("CNH","6.579093");
        map.put("CNY","6.5789");
        map.put("COP","3622.097235");
        map.put("CRC","603.954355");
        map.put("CUC","1.000209");
        map.put("CUP","25.75");
        map.put("CVE","92.25");
        map.put("CZK","22.0117");
        map.put("DJF","178.04543");
        map.put("DKK","6.235367");
        map.put("DOP","58.126556");
        map.put("DZD","129.204088");
        map.put("EGP","15.6547");
        map.put("ERN","14.999872");
        map.put("ETB","38.159345");
        map.put("EUR","0.8377");
        map.put("FJD","2.07515");
        map.put("FKP","0.749906");
        map.put("GBP","0.749906");
        map.put("GEL","3.335");
        map.put("GGP","0.749906");
        map.put("GHS","5.861083");
        map.put("GIP","0.749906");
        map.put("GMD","51.8");
        map.put("GNF","9835.268744");
        map.put("GTQ","7.818948");
        map.put("GYD","209.569954");
        map.put("HKD","7.75142");
        map.put("HNL","24.261522");
        map.put("HRK","6.3283");
        map.put("HTG","66.179967");
        map.put("HUF","300.77");
        map.put("IDR","14105.403438");
        map.put("ILS","3.305165");
        map.put("IMP","0.749906");
        map.put("INR","74.000545");
        map.put("IQD","1192.820675");
        map.put("IRR","42105");
        map.put("ISK","133.03");
        map.put("JEP","0.749906");
        map.put("JMD","146.642194");
        map.put("JOD","0.709");
        map.put("JPY","104.307");
        map.put("KES","110.1");
        map.put("KGS","84.7986");
        map.put("KHR","4061.970289");
        map.put("KMF","412.250037");
        map.put("KPW","900");
        map.put("KRW","1110.01");
        map.put("KWD","0.305399");
        map.put("KYD","0.833507");
        map.put("KZT","425.772953");
        map.put("LAK","9275.558309");
        map.put("LBP","1515.335981");
        map.put("LKR","185.834886");
        map.put("LRD","157.499967");
        map.put("LSL","15.389181");
        map.put("LYD","1.355");
        map.put("MAD","9.083784");
        map.put("MDL","17.195519");
        map.put("MGA","3783.43811");
        map.put("MKD","51.645807");
        map.put("MMK","1315.248254");
        map.put("MNT","2854.831181");
        map.put("MOP","7.985649");
        map.put("MRO","357");
        map.put("MRU","37.16");
        map.put("MUR","39.849215");
        map.put("MVR","15.41");
        map.put("MWK","763.604016");
        map.put("MXN","20.163212");
        map.put("MYR","4.074");
        map.put("MZN","74.231998");
        map.put("NAD","15.43");
        map.put("NGN","383.278728");
        map.put("NIO","34.853771");
        map.put("NOK","8.8847");
        map.put("NPR","118.328789");
        map.put("NZD","1.424685");
        map.put("OMR","0.38501");
        map.put("PAB","1");
        map.put("PEN","3.60376");
        map.put("PGK","3.520701");
        map.put("PHP","48.109536");
        map.put("PKR","159.457928");
        map.put("PLN","3.752342");
        map.put("PYG","7050.860811");
        map.put("QAR","3.64075");
        map.put("RON","4.0835");
        map.put("RSD","98.49");
        map.put("RUB","76.44");
        map.put("RWF","988.881865");
        map.put("SAR","3.750733");
        map.put("SBD","8.066615");
        map.put("SCR","20.810052");
        map.put("SDG","55.325");
        map.put("SEK","8.5735");
        map.put("SGD","1.33976");
        map.put("SHP","0.749906");
        map.put("SLL","10131.136388");
        map.put("SOS","580.369719");
        map.put("SRD","14.154");
        map.put("SSP","130.26");
        map.put("STD","20900.544238");
        map.put("STN","20.67");
        map.put("SVC","8.752242");
        map.put("SYP","512.847186");
        map.put("SZL","15.281883");
        map.put("THB","30.27");
        map.put("TJS","11.329606");
        map.put("TMT","3.51");
        map.put("TND","2.734");
        map.put("TOP","2.287117");
        map.put("TRY","7.8277");
        map.put("TTD","6.794794");
        map.put("TWD","28.533199");
        map.put("TZS","2319.433675");
        map.put("UAH","28.500356");
        map.put("UGX","3703.733059");
        map.put("USD","1");
        map.put("UYU","42.640694");
        map.put("UZS","10389.69954");
        map.put("VEF","248487.642241");
        map.put("VES","915980.365");
        map.put("VND","23239.023071");
        map.put("VUV","111.887732");
        map.put("WST","2.571605");
        map.put("XAF","549.495179");
        map.put("XAG","0.04412479");
        map.put("XAU","0.00056218");
        map.put("XCD","2.70255");
        map.put("XDR","0.70051");
        map.put("XOF","549.495179");
        map.put("XPD","0.00042075");
        map.put("XPF","99.9642");
        map.put("XPT","0.00102984");
        map.put("YER","250.349961");
        map.put("ZAR","15.441171");
        map.put("ZMW","21.003963");
        map.put("ZWL","322");


        Set<Map.Entry<String ,String> > set = map.entrySet();
        List<Map.Entry<String ,String>> list=new ArrayList<>(set);


        for (int i = 0; i < list.size(); i++)
        {
            if(currency.equals(list.get(i).getKey()))
            {
                return Float.valueOf(list.get(i).getValue());
            }
        }

        return 0;
    };

    public static void main(String[] args){
        Endpoint.publish("http://localhost:8888/DemoWebService", new DemoWS());
        System.out.println("Currency_Conversion Server Starts:)");
    }
}
