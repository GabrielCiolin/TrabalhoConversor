package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Codigos.ArabicoPraRomano;

class ArabicoTest {

	@Test
	public void Coverter() {

		//Teste com uma unidade
        int arabicNumeralUnidade = 1;
        String numeroRomanoEsperadoUni = "I";
        String numeroRomanoAtualUnidade = ArabicoPraRomano.convertArabicToRoman(arabicNumeralUnidade);
        Assert.assertEquals(numeroRomanoEsperadoUni, numeroRomanoAtualUnidade);
        

        //Teste com um número de dezena
        int arabicNumeralDezena = 40;
        String numeroRomanoEsperadoDezena = "XL";
        String numeroRomanoAtualDezena = ArabicoPraRomano.convertArabicToRoman(arabicNumeralDezena);
        Assert.assertEquals(numeroRomanoEsperadoDezena,numeroRomanoAtualDezena);
        
        
        //Teste com um numero de centena
        int arabicNumeralCentena = 400;
        String numeroRomanoEsperadoCentena = "CD";
        String numeroRomanoAtualCentena = ArabicoPraRomano.convertArabicToRoman(arabicNumeralCentena);
        Assert.assertEquals(numeroRomanoEsperadoCentena, numeroRomanoAtualCentena);

        
        
        //Teste com a milhar
        int arabicNumeralMilhar = 1000;
        String numeroRomanoEsperadoMilhar = "M";
        String numeroRomanoAtualMilhar = ArabicoPraRomano.convertArabicToRoman(arabicNumeralMilhar);
        Assert.assertEquals(numeroRomanoEsperadoMilhar, numeroRomanoAtualMilhar);

        
	  };
	

}


