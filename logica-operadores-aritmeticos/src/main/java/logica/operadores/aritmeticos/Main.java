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
package logica.operadores.aritmeticos;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
		// CONCATENA��O -------------------------------------------
		String texto1;
		String texto2;
		
		System.out.println("Digite o texto 1: ");
		texto1 = Console.readString();
		
		System.out.println("Digite o texto 2: ");
		texto2 = Console.readString();
		
		String textoJunto = texto1 + texto2;
		System.out.println("Texto final: " + textoJunto);
		// --------------------------------------------------------
		
		// EQ. DO 2o GRAU------------------------------------------
		System.out.println("a:");
		int a = Console.readInt();
		
		System.out.println("b:");
		int b = Console.readInt();
		
		System.out.println("c:");
		int c = Console.readInt();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		// --------------------------------------------------------
		
		// PER�METRO E �REA DO HEX�GONO ---------------------------
		int lado = Console.readInt();
		int p = 6 * lado;
		double area = (3 * lado * Math.sqrt(3)) / 2;
		
		System.out.println("P = " + p);
		System.out.println("A = " + area);
		// --------------------------------------------------------
		
		// RESTO DA DIVIS�O ---------------------------------------
		int resto = 10 % 3;
		System.out.println(resto);
		// --------------------------------------------------------
	}
}
