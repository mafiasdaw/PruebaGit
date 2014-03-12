/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enraya;

/**
 *
 * @author Max
 */
public class Tablero {
    

public Tablero(){
    
    private char[][] fichas = new char[3][3];

	public Tablero(){
		for(int i=0; i<fichas.length; i++){
			for(int j=0; j<fichas[0].length; j++){
				fichas[i][j] = ' ';
			}
		}
	}
	
	public void mostrar(){
		for(int i=0; i<fichas.length; i++){
			for(int j=0; j<fichas[0].length; j++){
				System.out.print(fichas[i][j]);
			}
			System.out.println();
		}
	}
	
	public boolean hayTresEnRaya(){
		
		//Mirar en las filas
		for(int i=0; i<fichas.length; i++){		
			if(fichas[i][0] != ' ' && 
				fichas[i][0] == fichas[i][1] && 
				fichas[i][1] == fichas[i][2]){
				return true;			
			}
		}
		
		//Mirar en las columnas
		for(int i=0; i<fichas.length; i++){		
			if(fichas[0][i] != ' ' && 
				fichas[0][i] == fichas[1][i] && 
				fichas[1][i] == fichas[2][i]){
				return true;			
			}
		}
		
		return fichas[0][0] != ' ' 
			&& fichas[0][0] == fichas[1][1] 
			&& fichas[1][1] == fichas[2][2] ||
			fichas[0][2] != ' ' 
			&& fichas[0][2] == fichas[1][1] 
			&& fichas[1][1] == fichas[2][0];	
	}
	
	public void ponFicha(char tipoFicha, Coordenada c){
		fichas[c.fila()][c.columna()] = tipoFicha;	
	}
	
	public boolean hayFicha(char tipoFicha, Coordenada c){
		return fichas[c.fila()][c.columna()] == tipoFicha;
	}
	
	public boolean estaVacia(Coordenada c){
		return fichas[c.fila()][c.columna()] == ' ';
	}
	
	public void quitarFicha(Coordenada c){
		fichas[c.fila()][c.columna()] = ' ';
	}
}
