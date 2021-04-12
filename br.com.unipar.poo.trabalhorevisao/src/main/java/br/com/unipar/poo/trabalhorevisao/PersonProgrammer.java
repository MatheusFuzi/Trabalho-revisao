
package br.com.unipar.poo.trabalhorevisao;


public class PersonProgrammer {
    String name, level, yearofformation,  programminglanguage, pos,certifications;
    Integer currentactingtime, currentlevel=0, levels;
   void start(){
       //Faz a verificação da nivel do profissional
      if(currentlevel == 4){
           master();
       }else{ currentactingtime =+1; training();  } //chama o metodo training
   } 
   void experience(){
       //faz a verificaçao do nivel do profissional para fazer a impressao na tela
       if((levels==1)){ junior();}
       if((levels==2)&&(pos.equals("yes"))){pleno();}
       if((levels==3)&&(pos.equals("yes"))){ senior();}         
   }
   
   void training() { 
       //Faz a verificacao de tempo de treino do profissional
        if (levels == null) {
            currentactingtime = 2;
            levels = 1;
            currentlevel = 1;
            experience();          
        }
        if (levels ==1 ) {
            currentactingtime = 4;
            levels = 2;
            currentlevel = 2;
            pos="yes";
            experience();
        }
        if (levels==2) {
            currentactingtime = 6;
            levels = 3; 
            currentlevel = 3;
            experience();
        }
        if ( levels ==3) { 
            currentactingtime = 10;
            levels = 4;
            currentlevel = 4;
            certifications= "yes";
            experience();
        }else{
            master();
        }
        
    }
   void junior(){ 
       
       level="Junior";  
       System.out.println("Tempo de atuacao: " + currentactingtime + " anos");
       System.out.println("Seu Nivel e: " + level);
       System.out.println("Nome: " + name);
       System.out.println("Ano de formacao: " + yearofformation);
       System.out.println("Linguagem de programacao: " + programminglanguage);
       System.out.println("Tem pos graduacao: " + pos);
       System.out.println("Tem certificacoes: " + certifications);
       System.out.println("\n");
       start();
           
   }
   void pleno(){
       level="Pleno";
       System.out.println("Tempo de atuacao: " + currentactingtime+ " anos");
       System.out.println("Seu Nivel e: " + level);
       System.out.println("Nome: " + name);
       System.out.println("Ano de formacao: " + yearofformation);
       System.out.println("Linguagem de programacao: " + programminglanguage);
       System.out.println("Tem pos graduacao: " + pos);
       System.out.println("Tem certificacoes: " + certifications);
       System.out.println("\n");
       start();
   }
   void senior(){
       level="Senior";
       System.out.println("Tempo de atuacao: " + currentactingtime+ " anos");
       System.out.println("Seu Nivel e: " + level);
       System.out.println("Nome: " + name);
       System.out.println("Ano de formacao: " + yearofformation);
       System.out.println("Linguagem de programacao: " + programminglanguage);
       System.out.println("Tem pos graduacao: " + pos);
       System.out.println("Tem certificacoes: " + certifications);
       System.out.println("\n");
       start();
   }
   void master(){
        level="Master";
       System.out.println("Tempo de atuacao: " + currentactingtime+ " anos");
       System.out.println("Seu Nivel e: " + level);
       System.out.println("Nome: " + name);
       System.out.println("Ano de formacao: " + yearofformation);
       System.out.println("Linguagem de programacao: " + programminglanguage);
       System.out.println("Tem pos graduacao: " + pos);
       System.out.println("Tem certificacoes: " + certifications);
       System.out.println("\n");
       System.exit(0);
   }
    public static void main(String[] args) {
       PersonProgrammer Person1 = new PersonProgrammer();
       // Dados ficticios
       Person1.name = "Matheus A. Fuzi";
       Person1.yearofformation = "2005";
       Person1.currentactingtime = 0;
       Person1.programminglanguage = "Delphi";
       Person1.pos = "no";
       Person1.certifications= "no";
       
       Person1.start(); //Chama o metodo start      
 
}
}
