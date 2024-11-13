/*******************************************************************************
 * MIT License
 *
 * Copyright (c) 2019 Softblue
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *******************************************************************************/
package logica.decisaoif;

import br.com.softblue.commons.io.Console;

public class Main2 {

	public static void main(String[] args) {

		System.out.println("Digite sua idade:");
		int idade = Console.readInt();

		if (idade >= 0 && idade <= 12) {
			System.out.println("Voc� � CRIAN�A");
		
		} else if (idade > 12 && idade <= 17) {
			System.out.println("Voc� � ADOLESCENTE");
		
		} else if (idade > 17 && idade <= 59) {
			System.out.println("Voc� � ADULTO");
		
		} else if (idade > 59) {
			System.out.println("Voc� � IDOSO");
		
		} else {
			System.out.println("Idade inv�lida");
		}
		
		System.out.println("Fim do programa!");
	}
}
