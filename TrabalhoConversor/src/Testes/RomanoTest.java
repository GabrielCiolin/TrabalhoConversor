package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Codigos.RomanoPraArabico;

class RomanoTest {


		@Test
		public void Coverter() {

			//Teste com uma unidade
	        String romanNumeralUnidade = "I";
	        int numeroArabicoEsperadoUni = 1;
	        int numeroArabicoAtualUnidade = RomanoPraArabico.convertRomanToArabic(romanNumeralUnidade);
	        Assert.assertEquals(numeroArabicoEsperadoUni, numeroArabicoAtualUnidade);
	        
	      //*Teste com um número de dezena
	        String romanNumeralDezena = "LXXIV";
	        int numeroArabicoEsperadoDezena = 74;
	        int numeroArabicoAtualDezena = RomanoPraArabico.convertRomanToArabic(romanNumeralDezena);
	        Assert.assertEquals(numeroArabicoEsperadoDezena, numeroArabicoAtualDezena);
	        
	        
	        //Teste com um numero de centena
	        String romanNumeralCentena = "DCXX";
	        int numeroArabicoEsperadoCentena = 620;
	        int numeroArabicoAtualCentena = RomanoPraArabico.convertRomanToArabic(romanNumeralCentena);
	        Assert.assertEquals(numeroArabicoEsperadoCentena, numeroArabicoAtualCentena);

	        
	        
	        //Teste com a milhar
	        String  romanNumeralMilhar = "M";
	        int numeroArabicoEsperadoMilhar = 1000;
	        int numeroArabicoAtualMilhar = RomanoPraArabico.convertRomanToArabic(romanNumeralMilhar);
	        Assert.assertEquals(numeroArabicoEsperadoMilhar, numeroArabicoAtualMilhar);

	        
	        
		  }
		

	}

